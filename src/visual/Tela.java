package visual;

import conexao.JDBconexao;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alucarde
 */
public class Tela extends javax.swing.JFrame implements interfaces.IVisual{

    /**
     * Creates new form Tela
     */
    private static boolean logado;
    
    public Tela() {
        initComponents();
        this.logado = true;
    }
    
    // geters
    public boolean getLogado(){
        return logado;
    }
    
    // seters
    public void setLogado(boolean valor){
        logado = valor;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraBotoes = new javax.swing.JToolBar();
        botaoInicio = new javax.swing.JButton();
        botaoCadastro = new javax.swing.JButton();
        botaoPesquisa = new javax.swing.JButton();
        botaoReserva = new javax.swing.JButton();
        botaoAdmin = new javax.swing.JButton();
        botaoAjuda = new javax.swing.JButton();
        botaoEmpresa = new javax.swing.JButton();
        painelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(91, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));

        barraBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barraBotoes.setFloatable(false);
        barraBotoes.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraBotoes.setRollover(true);
        barraBotoes.setPreferredSize(new java.awt.Dimension(91, 700));

        botaoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home.png"))); // NOI18N
        botaoInicio.setText("Inicio");
        botaoInicio.setFocusable(false);
        botaoInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoInicio.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicioActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoInicio);

        botaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastro.png"))); // NOI18N
        botaoCadastro.setText("Cadastro");
        botaoCadastro.setFocusable(false);
        botaoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastro.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoCadastro);

        botaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        botaoPesquisa.setText("Pesquisa");
        botaoPesquisa.setFocusable(false);
        botaoPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPesquisa.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoPesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoPesquisa);

        botaoReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/reserva.png"))); // NOI18N
        botaoReserva.setText("Reserva");
        botaoReserva.setFocusable(false);
        botaoReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoReserva.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReservaActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoReserva);

        botaoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adm.png"))); // NOI18N
        botaoAdmin.setText("Adminstração");
        botaoAdmin.setFocusable(false);
        botaoAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAdmin.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdminActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoAdmin);

        botaoAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda.png"))); // NOI18N
        botaoAjuda.setText("Ajuda");
        botaoAjuda.setFocusable(false);
        botaoAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAjuda.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoAjuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoAjuda);

        botaoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/empresa.png"))); // NOI18N
        botaoEmpresa.setText("Empresa");
        botaoEmpresa.setFocusable(false);
        botaoEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEmpresa.setPreferredSize(new java.awt.Dimension(87, 104));
        botaoEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmpresaActionPerformed(evt);
            }
        });
        barraBotoes.add(botaoEmpresa);

        getContentPane().add(barraBotoes, java.awt.BorderLayout.LINE_START);

        painelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelPrincipal.setPreferredSize(new java.awt.Dimension(969, 700));

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        getContentPane().add(painelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
        exibirInicio();
    }//GEN-LAST:event_botaoInicioActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        exibirCadastro();
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        exibirPesquisa();
        
    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void botaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaActionPerformed
        exibirAjuda();
    }//GEN-LAST:event_botaoAjudaActionPerformed

    private void botaoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmpresaActionPerformed
        exibirEmpresa();
    }//GEN-LAST:event_botaoEmpresaActionPerformed

    private void botaoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReservaActionPerformed
        try {
            exibirReserva();
        } catch (ParseException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoReservaActionPerformed

    private void botaoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdminActionPerformed
        exibirAdmin();
    }//GEN-LAST:event_botaoAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        // Identicação do sistema para modificação dos botões
        UIManager.setLookAndFeel(
        UIManager.getSystemLookAndFeelClassName());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>
        Tela tela = new Tela();
        JDBconexao conexao = new JDBconexao();
        
        conexao.conectar();
        tela.setVisible(true);
        
        // logar no sistema
        
        
        logado = false;
        
        if(logado == false){
            tela.exibirLogin();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
        
        
    } // fim do metodo principal 'main'
    
    private void exibirLogin(){
        getContentPane().remove(this.painelPrincipal);
        painelPrincipal = new Login();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirInicio(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Inicio();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirCadastro(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Cadastro();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirPesquisa(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Pesquisa();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    private void exibirReserva() throws ParseException{
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new ReservaTela();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirAjuda(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Ajuda();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirEmpresa(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Empresa();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    private void exibirAdmin(){
        getContentPane().remove(this.painelPrincipal);
        this.painelPrincipal = new Administracao();
        getContentPane().add(this.painelPrincipal);
        this.painelPrincipal.revalidate();
    }
    
    public void setPainelPrincipal(JPanel painel){
        this.painelPrincipal = painel;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraBotoes;
    private javax.swing.JButton botaoAdmin;
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoEmpresa;
    private javax.swing.JButton botaoInicio;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton botaoReserva;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void exibir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
