
import javax.swing.JLabel;

public class PainelDeJogo extends javax.swing.JPanel {

    public PainelDeJogo() {
        initComponents();
    }

    public JLabel getAsfalto1() {
        return asfalto1;
    }

    public JLabel getAsfalto2() {
        return asfalto2;
    }

    public JLabel getAsfalto3() {
        return asfalto3;
    }

    JLabel getAsfalto4() {
        return asfalto4;
    }

    public JLabel getCalcada1() {
        return calcada1;
    }

    public JLabel getCalcada2() {
        return calcada2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel3 = new javax.swing.JLabel();
        calcada2 = new javax.swing.JLabel();
        asfalto4 = new javax.swing.JLabel();
        asfalto3 = new javax.swing.JLabel();
        asfalto2 = new javax.swing.JLabel();
        asfalto1 = new javax.swing.JLabel();
        calcada1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setLayout(new java.awt.GridBagLayout());

        calcada2.setBackground(new java.awt.Color(51, 51, 255));
        calcada2.setText("calcada2");
        calcada2.setToolTipText("");
        calcada2.setAlignmentY(0.0F);
        calcada2.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(calcada2, gridBagConstraints);

        asfalto4.setText("asfalto4");
        asfalto4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        asfalto4.setMaximumSize(new java.awt.Dimension(640, 75));
        asfalto4.setPreferredSize(new java.awt.Dimension(640, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(asfalto4, gridBagConstraints);

        asfalto3.setText("asfalto3");
        asfalto3.setMaximumSize(new java.awt.Dimension(680, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(asfalto3, gridBagConstraints);

        asfalto2.setText("asfalto2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(asfalto2, gridBagConstraints);

        asfalto1.setText("asfalto1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(asfalto1, gridBagConstraints);

        calcada1.setText("calcada1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 640;
        gridBagConstraints.ipady = 75;
        add(calcada1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asfalto1;
    private javax.swing.JLabel asfalto2;
    private javax.swing.JLabel asfalto3;
    private javax.swing.JLabel asfalto4;
    private javax.swing.JLabel calcada1;
    private javax.swing.JLabel calcada2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
