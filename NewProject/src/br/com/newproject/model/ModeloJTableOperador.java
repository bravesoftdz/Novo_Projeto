package br.com.newproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloJTableOperador extends AbstractTableModel{
	
	private List<Operador> operadores;
	private String[] colunas;
	
	public ModeloJTableOperador(List<Operador> operadores) {
		
		this.operadores = new ArrayList<Operador>(operadores);
	}
	
	public int getRowCount() {
        //Quantidade de linhas da tabela, aqui as linhas vão ser do tamanho da lista(List).
        return operadores.size();
    }
    public int getColumnCount() {
        //Quantidade de Colunas da tabela, no caso aqui são 3.
        return 2;
    }
    public String getColumnName(int columnIndex) {
        //Nome das colunas da JTable
        String colunas[] = {"Codigo", "Operador"};
        return colunas[columnIndex];
    }
    public Object getValueAt(int row, int column) {
        //Retornar o valor da coluna column e da linha row da JTable.
    	Operador operador = operadores.get(row);
        if (column == 0) return operador.getId();
        else return operador.getNome();
    }

}
