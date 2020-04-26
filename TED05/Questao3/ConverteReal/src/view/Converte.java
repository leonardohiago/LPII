/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;

/**
 *
 * @author Samsung
 */
public class Converte extends javax.swing.JFrame {

    /**
     * Creates new form Converte
     */
    public Converte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        lblMensagem2 = new javax.swing.JLabel();
        checkEuro = new javax.swing.JCheckBox();
        checkDolar = new javax.swing.JCheckBox();
        checkPeso = new javax.swing.JCheckBox();
        lblMensagem3 = new javax.swing.JLabel();
        btnConverter = new javax.swing.JButton();
        lblValorDolar = new javax.swing.JLabel();
        lblValorEuro = new javax.swing.JLabel();
        lblValorPeso = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblReais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMensagem.setText("Conversão de Reais em outras moedas");

        inputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorActionPerformed(evt);
            }
        });

        lblMensagem2.setText("Digite o valor para conversão");

        checkEuro.setText("Euro");
        checkEuro.setToolTipText("");
        checkEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEuroActionPerformed(evt);
            }
        });

        checkDolar.setText("Dolar");

        checkPeso.setText("Peso");
        checkPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPesoActionPerformed(evt);
            }
        });

        lblMensagem3.setText("Converter em");

        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblReais.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorDolar)
                    .addComponent(lblValorEuro)
                    .addComponent(lblMensagem3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(checkDolar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkPeso))
                    .addComponent(lblMensagem2)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblReais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblValorPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblMensagem)
                .addGap(62, 62, 62)
                .addComponent(lblMensagem2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReais))
                .addGap(22, 22, 22)
                .addComponent(lblMensagem3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEuro)
                    .addComponent(checkDolar)
                    .addComponent(checkPeso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConverter)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(lblValorDolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorEuro)
                .addGap(12, 12, 12)
                .addComponent(lblValorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorActionPerformed
        
    }//GEN-LAST:event_inputValorActionPerformed

    private void checkEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEuroActionPerformed

    private void checkPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPesoActionPerformed

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        
        double valor = Double.parseDouble(inputValor.getText());
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        if (checkEuro.isSelected() == true) {
            lblValorEuro.setText("O valor em Euro é £" + formatador.format(valor * 0.17));
        }
        
        if (checkDolar.isSelected() == true) {
            lblValorDolar.setText("O valor em Dolar é $" + formatador.format(valor * 0.18));
        }
        if (checkPeso.isSelected() == true) {
            lblValorPeso.setText("O valor em Peso é $" + formatador.format(valor * 11.87));
        }
    }//GEN-LAST:event_btnConverterActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        lblValorEuro.setText("");
        lblValorDolar.setText("");
        lblValorPeso.setText("");
        
        checkEuro.setSelected(false);
        checkDolar.setSelected(false);
        checkPeso.setSelected(false);
        
        inputValor.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox checkDolar;
    private javax.swing.JCheckBox checkEuro;
    private javax.swing.JCheckBox checkPeso;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblMensagem2;
    private javax.swing.JLabel lblMensagem3;
    private javax.swing.JLabel lblReais;
    private javax.swing.JLabel lblValorDolar;
    private javax.swing.JLabel lblValorEuro;
    private javax.swing.JLabel lblValorPeso;
    // End of variables declaration//GEN-END:variables
}
