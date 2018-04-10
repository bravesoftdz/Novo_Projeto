package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableCategoria extends AbstractTableModel{
	
	private List<Categoria> categs;
	private String[] colunas;
	
	public ModeloJTableCategoria(List<Categoria> categs) {
		
		this.categs = new ArrayList<Categoria>(categs);
	}
	
	public int getRowCount() {
        //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return categs.size();
    }
    public int getColumnCount() {
        //Quantidade de Colunas da tabela, no caso aqui são 3.
        return 3;
    }
    public String getColumnName(int columnIndex) {
        //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Categoria", "Tipo"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
        //Retornar o valor da coluna column e da linha row da JTable.
    	Categoria categ = categs.get(row);
        if (column == 0) return categ.getCodigo();
        else if(column == 1) return categ.getNome();
        else return categ.getTipo();
    }

}
