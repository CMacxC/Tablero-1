package tablero1.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import tablero1.model.Model_Card;

public class Card extends javax.swing.JPanel {

    private Color color1;
    private Color color2;   

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Card data)
    {
        lbl_Icon.setIcon(data.getIcon());
        lbl_Title.setText(data.getTitle());
        lbl_Values.setText(data.getValues());
        lbl_Description.setText(data.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Icon = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_Values = new javax.swing.JLabel();
        lbl_Description = new javax.swing.JLabel();

        lbl_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tablero1/img/stock.png"))); // NOI18N

        lbl_Title.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setText("Title");

        lbl_Values.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbl_Values.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Values.setText("Values");

        lbl_Description.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Description.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Description)
                    .addComponent(lbl_Values)
                    .addComponent(lbl_Title)
                    .addComponent(lbl_Icon))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_Icon)
                .addGap(18, 18, 18)
                .addComponent(lbl_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Values)
                .addGap(18, 18, 18)
                .addComponent(lbl_Description)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Description;
    private javax.swing.JLabel lbl_Icon;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Values;
    // End of variables declaration//GEN-END:variables
}
