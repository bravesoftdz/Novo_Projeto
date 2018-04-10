package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableProduto extends AbstractTableModel{
	
	private List<Produto> prods;
	private String[] colunas;
	
	public ModeloJTableProduto(List<Produto> prods) {
		
		this.prods = new ArrayList<Produto>(prods);
	}
	
	public int getRowCount() {
		 //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return prods.size();
    }
    public int getColumnCount() {
    	//Quantidade de Colunas da tabela, no caso aqui são 4.
        return 4;
    }
    public String getColumnName(int columnIndex) {
    	 //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Descrição", "Tipo", "Categ"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
    	//Retornar o valor da coluna column e da linha row da JTable.
        Produto prod = prods.get(row);
        if (column == 0) return prod.getCodigo();
        else if (column == 1) return prod.getNome();
        else if (column == 2) return prod.getTipo();
        else return prod.getCateg();
    }

}
