package br.univel.structurral;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFlyweight extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFlyweight frame = new TelaFlyweight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFlyweight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		MeuRenderer m = new MeuRenderer();
		
		table = new JTable() {

			@Override
			public TableCellRenderer getCellRenderer(int row, int column) {
				
				return m;
				//return new MeuRenderer();
			}
			
			
		};
		scrollPane.setViewportView(table);
		
		JButton btnNorte = new JButton("Norte");
		btnNorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ModeloExemplo model = new ModeloExemplo();
				table.setModel(model);
			}
		});
		contentPane.add(btnNorte, BorderLayout.NORTH);
	}

}
