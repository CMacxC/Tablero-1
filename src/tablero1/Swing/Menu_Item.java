package tablero1.Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import tablero1.model.Model_Menu;

public class Menu_Item extends javax.swing.JPanel {

    private boolean selected;

    public Menu_Item(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType() == Model_Menu.MenuType.MENU) 
        {
            lbl_Icon.setIcon(data.toIcon());
            lbl_Name.setText(data.getName());
        } 
        else if (data.getType() == Model_Menu.MenuType.TITLE) 
        {
            lbl_Icon.setText(data.getName());
            lbl_Icon.setFont(new Font("sansserif", 1, 12));
            lbl_Name.setVisible(false);
        }
        else 
        {
            lbl_Name.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Icon = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();

        lbl_Icon.setForeground(new java.awt.Color(255, 255, 255));

        lbl_Name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Name.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Icon)
                .addGap(18, 18, 18)
                .addComponent(lbl_Name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) 
    {
        if (selected) 
        {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Icon;
    private javax.swing.JLabel lbl_Name;
    // End of variables declaration//GEN-END:variables
}
