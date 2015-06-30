package visual;

import conexao.Conexao;
import conexao.Teste;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloTabela;

/**
 *
 * @author Cloud
 */
public class TelaAdministracao extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public TelaAdministracao() {
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

        buttonEscolha = new javax.swing.ButtonGroup();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        botaoPesquisarPessoa = new javax.swing.JButton();
        labelPessoasCadastrdas = new javax.swing.JLabel();
        labelPessoasCadastrdas1 = new javax.swing.JLabel();
        botaoPesquisarLab = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldPessoa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldLaboratorio = new javax.swing.JTextArea();

        painelTitulo.setPreferredSize(new java.awt.Dimension(571, 90));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Administração");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(labelTitulo))
        );

        painelRodape.setPreferredSize(new java.awt.Dimension(0, 90));

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        botaoPesquisarPessoa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botaoPesquisarPessoa.setText("Pesquisar");
        botaoPesquisarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarPessoaActionPerformed(evt);
            }
        });

        labelPessoasCadastrdas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPessoasCadastrdas.setText("Pessoas cadastradas:");

        labelPessoasCadastrdas1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPessoasCadastrdas1.setText("Laboratórios Cadastrados:");

        botaoPesquisarLab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botaoPesquisarLab.setText("Pesquisar");
        botaoPesquisarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarLabActionPerformed(evt);
            }
        });

        fieldPessoa.setColumns(20);
        fieldPessoa.setRows(5);
        jScrollPane1.setViewportView(fieldPessoa);

        fieldLaboratorio.setColumns(20);
        fieldLaboratorio.setRows(5);
        jScrollPane2.setViewportView(fieldLaboratorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPessoasCadastrdas1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoPesquisarLab))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPessoasCadastrdas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoPesquisarPessoa)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPesquisarPessoa)
                    .addComponent(labelPessoasCadastrdas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPesquisarLab)
                    .addComponent(labelPessoasCadastrdas1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarPessoaActionPerformed
        Teste t = new Teste();

		t.setConexao(new Conexao());
        try {
            t.getConexao().conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try { // pesquisar pessoas no banco
            t.getConexao().retornarDadosPessoa();
            ArrayList<String> dados = t.getConexao().retornarDadosPessoa();
            
            this.fieldPessoa.setText("Nome: CPF:        \n\n" + dados);
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } // fim da pesquisa de pessoas cadastradas
    }//GEN-LAST:event_botaoPesquisarPessoaActionPerformed

    private void botaoPesquisarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarLabActionPerformed
        Teste t = new Teste();

		t.setConexao(new Conexao());
        try {
            t.getConexao().conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try { // pesquisar pessoas no banco
                        
            t.getConexao().retornarLabDisponivel();
            ArrayList<String> dadosLab = t.getConexao().retornarLabDisponivel();
            
            this.fieldLaboratorio.setText("Laboratorio:\n\n" + dadosLab);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } // fim da pesquisa de pessoas cadastradas
    }//GEN-LAST:event_botaoPesquisarLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisarLab;
    private javax.swing.JButton botaoPesquisarPessoa;
    private javax.swing.ButtonGroup buttonEscolha;
    private javax.swing.JTextArea fieldLaboratorio;
    private javax.swing.JTextArea fieldPessoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPessoasCadastrdas;
    private javax.swing.JLabel labelPessoasCadastrdas1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables

    
}