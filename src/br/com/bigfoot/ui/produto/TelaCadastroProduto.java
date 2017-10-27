/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bigfoot.ui.produto;

/**
 *
 * @author rodri
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
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

        jPanelCadastroProduto = new javax.swing.JPanel();
        jLabelCadastroModelo = new javax.swing.JLabel();
        jLabelCadastroTipo = new javax.swing.JLabel();
        jLabelCadastroTamanho = new javax.swing.JLabel();
        jLabelCadastroQuantidade = new javax.swing.JLabel();
        jLabelCadastroMarca = new javax.swing.JLabel();
        jLabelCadastroPreco = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        TextFieldCadastroPreco = new javax.swing.JFormattedTextField();
        jTextFieldCadastroModelo = new javax.swing.JTextField();
        jTextFieldCadastroTipo = new javax.swing.JTextField();
        jTextFieldCadastroTamanho = new javax.swing.JTextField();
        jTextFieldCadastroMarca = new javax.swing.JTextField();
        TextFieldCadastroQuantidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jPanelCadastroProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadastroModelo.setText("Modelo:");

        jLabelCadastroTipo.setText("Tipo:");

        jLabelCadastroTamanho.setText("Tamanho:");

        jLabelCadastroQuantidade.setText("Quantidade:");

        jLabelCadastroMarca.setText("Marca:");

        jLabelCadastroPreco.setText("Preço:");

        jButtonCadastrar.setText("Cadastrar");

        jButtonCancelar.setText("Cancelar");

        TextFieldCadastroPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));

        TextFieldCadastroQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanelCadastroProdutoLayout = new javax.swing.GroupLayout(jPanelCadastroProduto);
        jPanelCadastroProduto.setLayout(jPanelCadastroProdutoLayout);
        jPanelCadastroProdutoLayout.setHorizontalGroup(
            jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar))
                    .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelCadastroTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadastroTamanho))
                    .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelCadastroPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldCadastroPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCadastroQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCadastroQuantidade))
                    .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelCadastroMarca)
                        .addGap(9, 9, 9)
                        .addComponent(jTextFieldCadastroMarca))
                    .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastroTipo)
                            .addComponent(jLabelCadastroModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCadastroModelo)
                            .addComponent(jTextFieldCadastroTipo))))
                .addContainerGap())
        );
        jPanelCadastroProdutoLayout.setVerticalGroup(
            jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroModelo)
                    .addComponent(jTextFieldCadastroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroTipo)
                    .addComponent(jTextFieldCadastroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroTamanho)
                    .addComponent(jTextFieldCadastroTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroMarca)
                    .addComponent(jTextFieldCadastroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroPreco)
                    .addComponent(TextFieldCadastroPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadastroQuantidade)
                    .addComponent(TextFieldCadastroQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TextFieldCadastroPreco;
    private javax.swing.JFormattedTextField TextFieldCadastroQuantidade;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCadastroMarca;
    private javax.swing.JLabel jLabelCadastroModelo;
    private javax.swing.JLabel jLabelCadastroPreco;
    private javax.swing.JLabel jLabelCadastroQuantidade;
    private javax.swing.JLabel jLabelCadastroTamanho;
    private javax.swing.JLabel jLabelCadastroTipo;
    private javax.swing.JPanel jPanelCadastroProduto;
    private javax.swing.JTextField jTextFieldCadastroMarca;
    private javax.swing.JTextField jTextFieldCadastroModelo;
    private javax.swing.JTextField jTextFieldCadastroTamanho;
    private javax.swing.JTextField jTextFieldCadastroTipo;
    // End of variables declaration//GEN-END:variables
}