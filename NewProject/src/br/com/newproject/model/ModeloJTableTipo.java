package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableTipo extends AbstractTableModel{
	
	private List<Tipo> tipos;
	private String[] colunas;
	
	public ModeloJTableTipo(List<Tipo> tipos) {
		
		this.tipos = new ArrayList<Tipo>(tipos);
	}
	
	public int getRowCount() {
		 //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return tipos.size();
    }
    public int getColumnCount() {
    	//Quantidade de Colunas da tabela, no caso aqui são 2.
        return 2;
    }
    public String getColumnName(int columnIndex) {
    	 //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Tipo"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
    	//Retornar o valor da coluna column e da linha row da JTable.
        Tipo tipo = tipos.get(row);
        if (column == 0) return tipo.getCodigo();
        else return tipo.getNome();
    }

}
