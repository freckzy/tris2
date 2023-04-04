package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Game.GFG.Move;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TrisGrafico extends GFG{

	private JFrame frame;
	private JButton btn00;
	private JButton btn01;
	private JButton btn02;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	protected int profondita = 2;
	private char[][] tris = new char[3][3];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrisGrafico window = new TrisGrafico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrisGrafico() {
		initialize();
		matrice();
	}
	/*
	 * Algoritmo di risposta.
	 */

	private void matrice() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tris[i][j] = '_';
			}
		}
	}

	private void risposta() {
		int[] mossa = new int[2];
		mossa = AI(tris);
		
		if(mossa[0] == 0 && mossa[1] == 0) {
			btn00.setText("O");
			btn00.setEnabled(false);
			tris[0][0] = 'o';
		}else if (mossa[0] == 0 && mossa[1] == 1) {
			btn01.setText("O");
			btn01.setEnabled(false);
			tris[0][1] = 'o';
		}else if(mossa[0] == 0 && mossa[1] == 2) { 
			btn02.setText("O");
			btn02.setEnabled(false);
			tris[0][2] = 'o';
		}else if(mossa[0] == 1 && mossa[1] == 0) {
			btn10.setText("O");
			btn10.setEnabled(false);
			tris[1][0] = 'o';
		}else if(mossa[0] == 1 && mossa[1] == 1) {
			btn11.setText("O");
			btn11.setEnabled(false);
			tris[1][1] = 'o';
		}else if(mossa[0] == 1 && mossa[1] == 2) {
			btn12.setText("O");
			btn12.setEnabled(false);
			tris[1][2] = 'o';
		}else if(mossa[0] == 2 && mossa[1] == 0) {
			btn20.setText("O");
			btn20.setEnabled(false);
			tris[2][0] = 'o';
		}else if(mossa[0] == 2 && mossa[1] == 1) {
			btn21.setText("O");
			btn21.setEnabled(false);
			tris[2][1] = 'o';
		}else if(mossa[0] == 2 && mossa[1] == 2) {
			btn22.setText("O");
			btn22.setEnabled(false);
			tris[2][2] = 'o';
		}
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 64));
		frame.setMaximumSize(new Dimension(450, 650));
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btn00 = new JButton("");
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn00.setForeground(new Color(255, 0, 0));
				btn00.setText("X");
				btn00.setEnabled(false);
				tris[0][0] = 'x';
				risposta();

			}
		});
		btn00.setBounds(106, 189, 70, 70);
		frame.getContentPane().add(btn00);

		btn01 = new JButton("");
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn01.setForeground(new Color(255, 0, 0));
				btn01.setText("X");
				btn01.setEnabled(false);
				tris[0][1] = 'x';
				risposta();

			}
		});
		btn01.setBounds(186, 189, 70, 70);
		frame.getContentPane().add(btn01);

		btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn10.setForeground(new Color(255, 0, 0));
				btn10.setText("X");
				btn10.setEnabled(false);
				tris[1][0] = 'x';
				risposta();

			}
		});
		btn10.setBounds(106, 269, 70, 70);
		frame.getContentPane().add(btn10);

		btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn11.setForeground(new Color(255, 0, 0));
				btn11.setText("X");
				btn11.setEnabled(false);
				tris[1][1] = 'x';
				risposta();

			}
		});
		btn11.setBounds(186, 269, 70, 70);
		frame.getContentPane().add(btn11);

		btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn20.setForeground(new Color(255, 0, 0));
				btn20.setText("X");
				btn20.setEnabled(false);
				tris[2][0] = 'x';
				risposta();

			}
		});
		btn20.setBounds(106, 349, 70, 70);
		frame.getContentPane().add(btn20);

		btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn21.setForeground(new Color(255, 0, 0));
				btn21.setText("X");
				btn21.setEnabled(false);
				tris[2][1] = 'x';
				risposta();

			}
		});
		btn21.setBounds(186, 349, 70, 70);
		frame.getContentPane().add(btn21);

		btn02 = new JButton("");
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn02.setForeground(new Color(255, 0, 0));
				btn02.setText("X");
				btn02.setEnabled(false);
				tris[0][2] = 'x';
				risposta();

			}
		});
		btn02.setBounds(266, 189, 70, 70);
		frame.getContentPane().add(btn02);

		btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn12.setForeground(new Color(255, 0, 0));
				btn12.setText("X");
				btn12.setEnabled(false);
				tris[1][2] = 'x';
				risposta();

			}
		});
		btn12.setBounds(266, 269, 70, 70);
		frame.getContentPane().add(btn12);

		btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn22.setForeground(new Color(255, 0, 0));
				btn22.setText("X");
				btn22.setEnabled(false);
				tris[2][2] = 'x';
				risposta();

			}
		});
		btn22.setBounds(266, 349, 70, 70);
		frame.getContentPane().add(btn22);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						tris[i][j] = '_';
					}
				}

				btn00.setEnabled(true);
				btn00.setText("");

				btn01.setEnabled(true);
				btn01.setText("");

				btn02.setEnabled(true);
				btn02.setText("");

				btn10.setEnabled(true);
				btn10.setText("");

				btn11.setEnabled(true);
				btn11.setText("");

				btn12.setEnabled(true);
				btn12.setText("");

				btn20.setEnabled(true);
				btn20.setText("");

				btn21.setEnabled(true);
				btn21.setText("");

				btn22.setEnabled(true);
				btn22.setText("");
			}
		});
		btnNewButton.setBounds(106, 139, 230, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
