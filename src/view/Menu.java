package view;

public class Menu extends javax.swing.JFrame {
    CadastroProprietario telaProprietario;
    CadastroFuncionario telaFuncionario;
    CadastroPreco telaPreco;
    CadastroVeiculo telaVeiculo;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagemdeFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastroProprietarios = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarios = new javax.swing.JMenuItem();
        jMenuItemCadastroVeiculos = new javax.swing.JMenuItem();
        jMenuItemCadastroPrecos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu principal");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelImagemdeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Fundo menu principal 01.png"))); // NOI18N
        getContentPane().add(jLabelImagemdeFundo);
        jLabelImagemdeFundo.setBounds(0, 0, 990, 560);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadastroProprietarios.setText("Proprietários");
        jMenuItemCadastroProprietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProprietariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroProprietarios);

        jMenuItemCadastroFuncionarios.setText("Funcionários");
        jMenuItemCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroFuncionarios);

        jMenuItemCadastroVeiculos.setText("Veículos");
        jMenuItemCadastroVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVeiculosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroVeiculos);

        jMenuItemCadastroPrecos.setText("Preços");
        jMenuItemCadastroPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroPrecosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroPrecos);

        jMenuBar1.add(jMenuCadastros);
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Estadia");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(993, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroProprietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProprietariosActionPerformed
        if(telaProprietario == null){
            telaProprietario = new CadastroProprietario();
            telaProprietario.setVisible(true);
        } else{
            telaProprietario.setVisible(true);
            telaProprietario.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadastroProprietariosActionPerformed

    private void jMenuItemCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionariosActionPerformed
        if(telaFuncionario == null){
            telaFuncionario = new CadastroFuncionario();
            telaFuncionario.setVisible(true);
        } else{
            telaFuncionario.setVisible(true);
            telaFuncionario.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadastroFuncionariosActionPerformed

    private void jMenuItemCadastroPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPrecosActionPerformed
        if(telaPreco == null){
            telaPreco = new CadastroPreco();
            telaPreco.setVisible(true);
        } else{
            telaPreco.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemCadastroPrecosActionPerformed

    private void jMenuItemCadastroVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVeiculosActionPerformed
        if(telaVeiculo == null){
            telaVeiculo = new CadastroVeiculo();
            telaVeiculo.setVisible(true);
        } else{
            telaVeiculo.setVisible(true);
            telaVeiculo.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadastroVeiculosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImagemdeFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadastroPrecos;
    private javax.swing.JMenuItem jMenuItemCadastroProprietarios;
    private javax.swing.JMenuItem jMenuItemCadastroVeiculos;
    // End of variables declaration//GEN-END:variables
}
