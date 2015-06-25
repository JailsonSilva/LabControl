package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jailson
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList<Reserva> linhas;
    private String[] colunas = new String[]{"Laboratório:", "Hora Inicial:", "Hora Final:", "Data:"};
    
    public ModeloTabela(){
        linhas = new ArrayList<Reserva>();
    }
    
    public ModeloTabela(ArrayList<Reserva> tabela){
        linhas = new ArrayList<Reserva>(tabela);
    }
    
    // geters
    public ArrayList getLinhas(){
        return linhas;
    }
    public String[] getColunas(){
        return colunas;
    }
    
    /*
        Sobrescrita de metodos erdados de AbstractTableModel.00
    */
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obtem a linha, que é uma String []  
        String[] linha = (String[]) getLinhas().get(rowIndex);  
        // Retorna o objeto que esta na coluna  
        return linha[columnIndex]; 
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Reserva getReserva(int indiceLinha) {
        if (indiceLinha < linhas.size()) {
            return linhas.get(indiceLinha);
        }
        return null;
    }

    public void addReserva(Reserva reserva) {
        linhas.add(reserva);

        int ultimoIndice = getRowCount() - 1;

        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeReserva(int indiceLinha) {
        if (indiceLinha < linhas.size()) {
            linhas.remove(indiceLinha);
            fireTableRowsDeleted(indiceLinha, indiceLinha);
        }
    }

    public void addListaDeReserva(ArrayList<Reserva> Reserva) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(Reserva);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public Object getObject(int index) {
        return linhas.get(index);
    }
}
