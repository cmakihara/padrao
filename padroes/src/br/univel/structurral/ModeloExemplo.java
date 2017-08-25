package br.univel.structurral;

import javax.swing.table.AbstractTableModel;

public class ModeloExemplo extends AbstractTableModel{

	@Override
	public int getColumnCount() {
		
		return 20;
	}

	@Override
	public int getRowCount() {
		
		return 1000;
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		return row + "," + col;
	}

}
