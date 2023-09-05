package tablero1.Swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import tablero1.model.StatusType;

public class Table extends JTable
{
    public Table()
    {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Table_Header header = new Table_Header(value + "");
                
                if(column == 4)
                {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(column!= 4)
                {
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    
                    if(isSelected)
                    {
                        com.setForeground(new Color(15, 89, 140));
                    }
                    else
                    {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                    
                }
                else
                {
                    StatusType type = (StatusType) value;
                    Cell_Status cell = new Cell_Status(type);
                    return cell;
                }
            }
        });
    }
    
    public void addRow(Object[] row)
    {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
        
    }
    
    
}
