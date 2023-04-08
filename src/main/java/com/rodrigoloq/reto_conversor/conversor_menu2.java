/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rodrigoloq.reto_conversor;

/**
 *
 * @author RL123
 */
public class conversor_menu2 extends javax.swing.JFrame {
    
    String cboSeleccion;
    
    /**
     * Creates new form conversor_menu2
     */
    public conversor_menu2() {
        initComponents();        
    }
    
    public conversor_menu2(String cboseleccion) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(cboseleccion == "Conversor de monedas"){
            cboOpciones.addItem("De Sol Peruano a Dolar");
            cboOpciones.addItem("De Sol Peruano a Euro");
            cboOpciones.addItem("De Sol Peruano a Libra Esterlina");
            cboOpciones.addItem("De Sol Peruano a Yen Japonés");
            cboOpciones.addItem("De Sol Peruano a Won sul-coreano");
            cboOpciones.addItem("De Dolar a Sol Peruano");
            cboOpciones.addItem("De Euro a Sol Peruano");
            cboOpciones.addItem("De Libra Esterlina a Sol Peruano");
            cboOpciones.addItem("De Yen Japonés a Sol Peruano");
            cboOpciones.addItem("De Won sul-coreano a Sol Peruano");
            lblDesc.setText("Seleccion el tipo de moneda");
        }
        else if(cboseleccion == "Conversor de temperaturas"){
            cboOpciones.addItem("De Grado Celsius a Grado Fahrenheit");
            cboOpciones.addItem("De Grado Celsius a Kelvin");
            cboOpciones.addItem("De Grado Fahrenheit a Kelvin");
            cboOpciones.addItem("De Grado Fahrenheit a Grado Celsius");
            cboOpciones.addItem("De Kelvin a Grado Celsius");
            cboOpciones.addItem("De Kelvin a Grado Fahrenheit");
            lblDesc.setText("Seleccion el tipo de temperatura");
        }
        
        cboSeleccion = cboseleccion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboOpciones = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cboOpciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnOk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboOpciones, 0, 308, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(cboOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        String seleccion = cboOpciones.getSelectedItem().toString();
        
        conversor_menu3 menu3 = new conversor_menu3(seleccion,cboSeleccion);
        
        menu3.setVisible(rootPaneCheckingEnabled);
        
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conversor_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversor_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversor_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversor_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversor_menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cboOpciones;
    private javax.swing.JLabel lblDesc;
    // End of variables declaration//GEN-END:variables
}
