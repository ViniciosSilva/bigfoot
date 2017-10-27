/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bigfoot.ui.principal;

import br.com.bigfoot.ui.cliente.TelaCadastrarCliente;
import br.com.bigfoot.ui.cliente.TelaConsultarCliente;
import br.com.bigfoot.ui.produto.TelaCadastroProduto;
import br.com.bigfoot.ui.produto.TelaConsultarProduto;
import br.com.bigfoot.ui.produto.TelaEditarProduto;
import br.com.bigfoot.ui.relatorio.TelaRelatorioVenda;
import br.com.bigfoot.ui.venda.TelaVenda;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author rodri
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemFazerVenda = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItemConsultaCliente = new javax.swing.JMenuItem();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatorioVenda = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenu();
        jMenuItemCadastrarProduto = new javax.swing.JMenuItem();
        jMenuItemConsultarProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Bigfoot.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuVenda.setText("Venda");

        jMenuItemFazerVenda.setText("Fazer venda");
        jMenuItemFazerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFazerVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemFazerVenda);

        jMenuBar1.add(jMenuVenda);

        jMenuCliente.setText("Cliente");

        jMenuItemConsultaCliente.setText("Consultar Cliente");
        jMenuItemConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemConsultaCliente);

        jMenuItemCadastrarCliente.setText("Cadastrar Cliente");
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCadastrarCliente);

        jMenuBar1.add(jMenuCliente);

        jMenuRelatorios.setText("Relatorios");

        jMenuItemRelatorioVenda.setText("Relatorio Vendas");
        jMenuItemRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioVendaActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatorioVenda);

        jMenuBar1.add(jMenuRelatorios);

        jMenuProduto.setText("Produto");

        jMenuItemCadastrarProduto.setText("Cadastrar Produto");
        jMenuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuProduto.add(jMenuItemCadastrarProduto);

        jMenuItemConsultarProduto.setText("Consultar Produto");
        jMenuItemConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarProdutoActionPerformed(evt);
            }
        });
        jMenuProduto.add(jMenuItemConsultarProduto);

        jMenuBar1.add(jMenuProduto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    TelaVenda tconv = null;
    TelaCadastroProduto tconpN = null;
    TelaConsultarProduto tconpC = null;
    TelaCadastrarCliente tconc = null;
    TelaConsultarCliente tconcC = null;
    TelaRelatorioVenda tconrV = null;
    
    
    
    private void jMenuItemFazerVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFazerVendaActionPerformed
        if (tconv == null || !tconv.isDisplayable()) {
            tconv = new TelaVenda();
            tconv.pack();
            tconv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconv.setLocationRelativeTo(null);
            tconv.setVisible(true);
        }
        tconv.toFront(); 
    }//GEN-LAST:event_jMenuItemFazerVendaActionPerformed

    private void jMenuItemConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaClienteActionPerformed
        if (tconcC == null || !tconcC.isDisplayable()) {
            tconcC = new TelaConsultarCliente();
            tconcC.pack();
            tconcC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconcC.setLocationRelativeTo(null);
            tconcC.setVisible(true);
        }
        tconcC.toFront(); 
    }//GEN-LAST:event_jMenuItemConsultaClienteActionPerformed

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed
        if (tconc == null || !tconc.isDisplayable()) {
            tconc = new TelaCadastrarCliente();
            tconc.pack();
            tconc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconc.setLocationRelativeTo(null);
            tconc.setVisible(true);
        }
        tconc.toFront(); 
    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jMenuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarProdutoActionPerformed
       if (tconpN == null || !tconpN.isDisplayable()) {
            tconpN = new TelaCadastroProduto();
            tconpN.pack();
            tconpN.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconpN.setLocationRelativeTo(null);
            tconpN.setVisible(true);
        }
        tconpN.toFront(); 
    }//GEN-LAST:event_jMenuItemCadastrarProdutoActionPerformed

    private void jMenuItemConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarProdutoActionPerformed
        if (tconpC == null || !tconpC.isDisplayable()) {
            tconpC = new TelaConsultarProduto();
            tconpC.pack();
            tconpC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconpC.setLocationRelativeTo(null);
            tconpC.setVisible(true);
        }
        tconpC.toFront(); 
    }//GEN-LAST:event_jMenuItemConsultarProdutoActionPerformed

    private void jMenuItemRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioVendaActionPerformed
        if (tconrV == null || !tconrV.isDisplayable()) {
            tconrV = new TelaRelatorioVenda();
            tconrV.pack();
            tconrV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tconrV.setLocationRelativeTo(null);
            tconrV.setVisible(true);
        }
        tconpC.toFront();
    }//GEN-LAST:event_jMenuItemRelatorioVendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarProduto;
    private javax.swing.JMenuItem jMenuItemConsultaCliente;
    private javax.swing.JMenuItem jMenuItemConsultarProduto;
    private javax.swing.JMenuItem jMenuItemFazerVenda;
    private javax.swing.JMenuItem jMenuItemRelatorioVenda;
    private javax.swing.JMenu jMenuProduto;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables
}
