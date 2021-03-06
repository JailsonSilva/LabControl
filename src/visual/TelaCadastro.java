package visual;

import conexao.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Classe ara criação da tela de cadastro
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da aplicação
 */
public class TelaCadastro extends javax.swing.JPanel {
    
    /**
     * Construtos da classe TelaCadastro
     */
    public TelaCadastro() {
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

        categoriaPessoa = new javax.swing.ButtonGroup();
        fieldNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        fieldCpf = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelConfSenha = new javax.swing.JLabel();
        labelEscolha = new javax.swing.JLabel();
        fieldSenha = new javax.swing.JPasswordField();
        fieldConfSenha = new javax.swing.JPasswordField();
        radioButtonAluno = new javax.swing.JRadioButton();
        radioButtonFuncionario = new javax.swing.JRadioButton();
        labelCurso = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        fieldCurso = new javax.swing.JTextField();
        fieldCargo = new javax.swing.JTextField();
        painelRodape = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();

        fieldNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNome.setText("Nome:");

        fieldCpf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        labelCpf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCpf.setText("CPF:");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSenha.setText("Senha:");

        labelConfSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConfSenha.setText("Confirmar senha:");

        labelEscolha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEscolha.setText("Você é aluno(a) ou funcionario(a)");

        fieldSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        fieldConfSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        categoriaPessoa.add(radioButtonAluno);
        radioButtonAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioButtonAluno.setText("Aluno");

        categoriaPessoa.add(radioButtonFuncionario);
        radioButtonFuncionario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioButtonFuncionario.setText("Funcionario");

        labelCurso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCurso.setText("Curso:");

        labelCargo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCargo.setText("Cargo:");

        fieldCurso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        fieldCargo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        painelRodape.setPreferredSize(new java.awt.Dimension(0, 90));

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addGap(388, 388, 388))
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRodapeLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addGap(26, 26, 26))
        );

        painelTitulo.setPreferredSize(new java.awt.Dimension(571, 90));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Cadastro");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(labelTitulo))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelEscolha)
                        .addComponent(labelSenha)
                        .addComponent(labelCpf)
                        .addComponent(labelNome)
                        .addComponent(labelConfSenha)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radioButtonAluno)
                                .addComponent(labelCurso)
                                .addComponent(fieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radioButtonFuncionario)
                                .addComponent(labelCargo)
                                .addComponent(fieldCargo)))
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addComponent(painelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonAluno)
                    .addComponent(radioButtonFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCurso)
                    .addComponent(labelCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Teste t = new Teste(); // instancia Teste paara fazer a conexao

		t.setConexao(new Conexao()); // seta os valores para conexão
        try {
            t.getConexao().conectar(); // conecta ao banco
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try { // inserir pessoa no banco
            
            t.getConexao().inserirPessoa(this.getFieldNome().getText(), this.getFieldCpf().getText(), new String(getFieldSenha().getPassword()));
            
            if(this.getRadioButtonAluno().isSelected()){ // inserir curso
                t.getConexao().inserirCurso(this.getFieldCurso().getText());
            } // fim inserir curso
            
            else if(this.getRadioButtonFuncionario().isSelected()){ // inserir cargo
                t.getConexao().inserirCargo(this.getFieldCargo().getText());
            } // fim inserir cargo
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O cpf informado ja esta cadastrado!");
        } // fim de inserir pessoa
    }//GEN-LAST:event_botaoCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.ButtonGroup categoriaPessoa;
    private javax.swing.JTextField fieldCargo;
    private javax.swing.JPasswordField fieldConfSenha;
    private javax.swing.JTextField fieldCpf;
    private javax.swing.JTextField fieldCurso;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelConfSenha;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelEscolha;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JRadioButton radioButtonAluno;
    private javax.swing.JRadioButton radioButtonFuncionario;
    // End of variables declaration//GEN-END:variables
    
    /**
     * método para captura do componente categoriaPessoa
     * @author Jailson José dos Santos Silva
     * @return ButtonGroup - retorna o componente categoriaPessoa
     */
    public ButtonGroup getCategoriaPessoa(){
        return categoriaPessoa;
    }
    
    /**
     * método para captura do componente fieldCargo
     * @author Jailson José dos Santos Silva
     * @return JTextField - retorna o componente fieldCargo
     */
    public JTextField getFieldCargo(){
        return fieldCargo;
    }
    
    /**
     * método para captura do componente fieldCpf
     * @author Jailson José dos Santos Silva
     * @return JTextField - retorna o componente fieldCpf
     */
    public JTextField getFieldCpf(){
        return fieldCpf;
    }
    
    /**
     * método para captura do componente fieldCurso
     * @author Jailson José dos Santos Silva
     * @return JTextField - retorna o componente fieldCurso
     */
    public JTextField getFieldCurso(){
        return fieldCurso;
    }
    
    /**
     * método para captura do componente fieldNome
     * @author Jailson José dos Santos Silva
     * @return JTextField - retorna o componente fieldNome
     */
    public JTextField getFieldNome(){
        return fieldNome;
    }
    
    /**
     * método para captura do componente fieldConfSenha
     * @author Jailson José dos Santos Silva
     * @return JPasswordField - retorna o componente fieldConfSenha
     */
    public JPasswordField getFieldConfSenha(){
        return fieldConfSenha;
    }
    
    /**
     * método para captura do componente fieldSenha
     * @author Jailson José dos Santos Silva
     * @return JPasswordField - retorna o componente fieldSenha
     */
    public JPasswordField getFieldSenha(){
        return fieldSenha;
    }
    
    /**
     * método para captura do componente radioButtonAluno
     * @author Jailson José dos Santos Silva
     * @return JRadioButton - retorna o componente radioButtonAluno
     */
    public JRadioButton getRadioButtonAluno(){
        return radioButtonAluno;
    }
    
    /**
     * método para captura do componente radioButtonFuncionario
     * @author Jailson José dos Santos Silva
     * @return JRadioButton - retorna o componente radioButtonFuncionario
     */
    public JRadioButton getRadioButtonFuncionario(){
        return radioButtonFuncionario;
    }
}
