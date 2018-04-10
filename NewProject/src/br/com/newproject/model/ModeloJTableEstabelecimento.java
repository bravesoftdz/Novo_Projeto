package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableEstabelecimento extends AbstractTableModel{
	
	private List<Estabelecimento> estabs;
	private String[] colunas;
	
	public ModeloJTableEstabelecimento(List<Estabelecimento> estabs) {
		
		this.estabs = new ArrayList<Estabelecimento>(estabs);
	}
	
	public int getRowCount() {
        //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return estabs.size();
    }
    public int getColumnCount() {
        //Quantidade de Colunas da tabela, no caso aqui são 2.
        return 2;
    }
    public String getColumnName(int columnIndex) {
        //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Estabelecimento"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
        //Retornar o valor da coluna column e da linha row da JTable.
    	Estabelecimento estab = estabs.get(row);
        if (column == 0) return estab.getCodigo();
        else return estab.getNome();
    }

}
