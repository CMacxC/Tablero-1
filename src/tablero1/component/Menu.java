package tablero1.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import tablero1.event.EventMenuSelected;
import tablero1.model.Model_Menu;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event)
    {
        this.event = event;
        list_Menu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        list_Menu1.setOpaque(false);
        init();
    }
    
    private void init()
    {
        list_Menu1.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("2", "UI Elements", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("3", "Comonents", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("4", "Forms Stuff", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("5", "Date Table", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        list_Menu1.addItem(new Model_Menu("", "My Data", Model_Menu.MenuType.TITLE));
        list_Menu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        list_Menu1.addItem(new Model_Menu("6", "Icons", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("7", "Sample Page", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("8", "Extra", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("9", "More", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("10", "Logout", Model_Menu.MenuType.MENU));
        list_Menu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list_Menu1 = new tablero1.Swing.List_Menu<>();

        panelMoving.setOpaque(false);
        panelMoving.setPreferredSize(new java.awt.Dimension(215, 63));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tablero1/img/logo.png"))); // NOI18N
        jLabel1.setText("Application");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(list_Menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(list_Menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int x;
    private int y;
    
    public void initMoving(JFrame frm)
    {
        panelMoving.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        
        panelMoving.addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent e) {
                frm.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private tablero1.Swing.List_Menu<String> list_Menu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
