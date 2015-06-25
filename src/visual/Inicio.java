package visual;

import conexao.Conexao;
import conexao.Teste;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import modelo.ModeloTabela;

/**
 *
 * @author Cloud
 */
public class Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        labelUltReservas = new javax.swing.JLabel();
        labelLabDisponiveis = new javax.swing.JLabel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        botaoAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaReserva = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaLaboratorios = new javax.swing.JTextArea();

        labelUltReservas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelUltReservas.setText("Ultimas reservas realizadas:");

        labelLabDisponiveis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelLabDisponiveis.setText("Laboratórios disponíveis:");

        painelTitulo.setPreferredSize(new java.awt.Dimension(571, 90));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Tela Principal");

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

        botaoAtualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRodapeLayout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(botaoAtualizar)
                .addGap(394, 394, 394))
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRodapeLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(botaoAtualizar)
                .addGap(27, 27, 27))
        );

        tabelaReserva.setColumns(20);
        tabelaReserva.setRows(5);
        jScrollPane1.setViewportView(tabelaReserva);

        tabelaLaboratorios.setColumns(20);
        tabelaLaboratorios.setRows(5);
        jScrollPane2.setViewportView(tabelaLaboratorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLabDisponiveis)
                    .addComponent(labelUltReservas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelUltReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(labelLabDisponiveis)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        Teste t = new Teste();

		t.setConexao(new Conexao());
        try {
            t.getConexao().conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try { // pesquisar reservas no banco
            t.getConexao().retornarReserva();
            ArrayList<modelo.Reserva> dados = t.getConexao().retornarReserva();
            ModeloTabela modelo = new ModeloTabela(dados);
            
            int i = 5;
            ArrayList<String> dadosReserva = new ArrayList();
            
            while(i > 0){
                
                dadosReserva.add("    " + dados.get(i).getLaboratorio() + "    ");
                dadosReserva.add(dados.get(i).getNome());
                dadosReserva.add(dados.get(i).getHoraInicial());
                dadosReserva.add(dados.get(i).getHoraFinal());
                dadosReserva.add(dados.get(i).getData() + "\n");
                
                i--;
            }
            this.tabelaReserva.setText("Laboratório: Nome: Hora Inicial:  Hora Final:  Data:  \n\n" + dadosReserva);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        } // fim da pesquisa de reservas
    }//GEN-LAST:event_botaoAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelLabDisponiveis;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUltReservas;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTextArea tabelaLaboratorios;
    private javax.swing.JTextArea tabelaReserva;
    // End of variables declaration//GEN-END:variables
    
    /*
    // geters dos componentes
    public JTable getTablaUltReservas(){
        return tableUltReservas;
    }
    public JTable getTableLabDisponiveis(){
        return tableLabDisponiveis;
    }
    
    // seters dos componentes
    public void setTableUltReservas(JTable tabela){
        this.tableUltReservas = tabela;
    }
    */
}