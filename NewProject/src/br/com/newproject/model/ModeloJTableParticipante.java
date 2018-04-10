package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableParticipante extends AbstractTableModel{
	
	private List<Participante> participantes;
	private String[] colunas;
	
	public ModeloJTableParticipante(List<Participante> participantes) {
		
		this.participantes = new ArrayList<Participante>(participantes);
	}
	
	public int getRowCount() {
        //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return participantes.size();
    }
    public int getColumnCount() {
        //Quantidade de Colunas da tabela, no caso aqui são 2.
        return 2;
    }
    public String getColumnName(int columnIndex) {
        //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Nome"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
        //Retornar o valor da coluna column e da linha row da JTable.
    	Participante participante = participantes.get(row);
        if (column == 0) return participante.getCodigo();
        else return participante.getNome();
    }

}
