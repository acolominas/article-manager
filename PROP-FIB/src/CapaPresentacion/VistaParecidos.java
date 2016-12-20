/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaPresentacion;

/**
 *
 * @author Casa
 */
public class VistaParecidos extends javax.swing.JDialog {

    /**
     * Creates new form VistaP
     */
    private boolean aceptar;
    private String metodo;
    
    public VistaParecidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        aceptar = false;
        metodo = null;
    }
    
    public boolean getAceptar(){
        return aceptar;
    }
    
    public String getId(){
        return textID.getText();
    }
    
    public String getK(){
        return textK.getText();
    }
    
    public String getMetodo(){
        return metodo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMetodo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textK = new javax.swing.JTextField();
        radioTF = new javax.swing.JRadioButton();
        radioTFIDF = new javax.swing.JRadioButton();
        radioOkapi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        buttonAceptar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Documentos Parecidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 440, -1));

        jLabel2.setText("Identificador Documento ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 64, 341, -1));

        jLabel3.setText("Número de Documentos más parecidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 102, 248, -1));

        textID.setText("Introduce un id...");
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });
        getContentPane().add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 170, -1));

        textK.setText("Introduce un número...");
        getContentPane().add(textK, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        groupMetodo.add(radioTF);
        radioTF.setText("TF");
        radioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTFActionPerformed(evt);
            }
        });
        getContentPane().add(radioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        groupMetodo.add(radioTFIDF);
        radioTFIDF.setText("TF-IDF");
        radioTFIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTFIDFActionPerformed(evt);
            }
        });
        getContentPane().add(radioTFIDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        groupMetodo.add(radioOkapi);
        radioOkapi.setText("OkapiBm25");
        radioOkapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOkapiActionPerformed(evt);
            }
        });
        getContentPane().add(radioOkapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel4.setText("Metodo a usar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 130, -1, -1));

        buttonAceptar.setText("Aceptar");
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 236, -1, -1));

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTFIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTFIDFActionPerformed
        metodo = "TF_IDF";
    }//GEN-LAST:event_radioTFIDFActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        aceptar = true;
        dispose();
    }//GEN-LAST:event_buttonAceptarActionPerformed

    private void radioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTFActionPerformed
        metodo = "TF";
    }//GEN-LAST:event_radioTFActionPerformed

    private void radioOkapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOkapiActionPerformed
        metodo = "OKAPI";
    }//GEN-LAST:event_radioOkapiActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup groupMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton radioOkapi;
    private javax.swing.JRadioButton radioTF;
    private javax.swing.JRadioButton radioTFIDF;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textK;
    // End of variables declaration//GEN-END:variables
}
