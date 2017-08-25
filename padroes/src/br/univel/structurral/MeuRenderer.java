package br.univel.structurral;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class MeuRenderer extends JLabel implements TableCellRenderer{
	
	private int contador = 0;

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		super.setText(String.valueOf(value));
		
		System.out.println(contador++);
		return this;
	}

}
