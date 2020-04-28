/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import Business.ProMedical;

/**
 *
 * @author dell
 */
public class ViewMedicalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedicalJPanel
     */
    public ViewMedicalJPanel(ProMedical proMedical) {
        initComponents();
        displayProduct(proMedical);
    }
    
    private void displayProduct(ProMedical proMedical)
    {
        String productmedicalrecordnumber = proMedical.getMedicalRecordNumber();
        medicalrecordTextField.setText(productmedicalrecordnumber);
        
        String productalergy1 = proMedical.getAlergy1();
        alergy1TextField.setText(productalergy1);
        
        String productalergy2 = proMedical.getAlergy2();
        alergy2TextField.setText(productalergy2);
        
        String productalergy3 = proMedical.getAlergy3();
        alergy3TextField.setText(productalergy3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medicalrecordTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        alergy1TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alergy2TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        alergy3TextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("View Medical Record");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Medical Record Number :");

        medicalrecordTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        medicalrecordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalrecordTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Alergy1 :");

        alergy1TextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Alergy2 :");

        alergy2TextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Alergy3 :");

        alergy3TextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alergy3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy3TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jLabel1)
                            .addGap(67, 67, 67))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(medicalrecordTextField)
                                .addComponent(alergy1TextField)
                                .addComponent(alergy2TextField)
                                .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel1)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(medicalrecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalrecordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalrecordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalrecordTextFieldActionPerformed

    private void alergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TextFieldActionPerformed

    private void alergy3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy3TextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergy1TextField;
    private javax.swing.JTextField alergy2TextField;
    private javax.swing.JTextField alergy3TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField medicalrecordTextField;
    // End of variables declaration//GEN-END:variables
}