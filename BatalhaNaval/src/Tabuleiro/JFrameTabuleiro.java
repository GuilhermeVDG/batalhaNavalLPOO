package Tabuleiro;

import Jogador.Jogador;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class JFrameTabuleiro extends JFrame{
	
	private Tabuleiro tabuleiro;
	private int choice;


	public JFrameTabuleiro() {
		
		menu();
		
	}

	
	private void menu() {
		
		
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new GridLayout(0,1,80,80));
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		this.setTitle("Batalha Naval");
		
		
		JButton btnBatalha = new JButton("1 - Batalha Naval");
		btnBatalha.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnBatalha.setBounds(136, 160, 205, 29);
		btnBatalha.setBackground(Color.WHITE);
		
		
		JButton btnCustom = new JButton("2 - Batalha Naval Custom");
		btnCustom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnCustom.setBounds(136, 236, 205, 29);
		btnCustom.setBackground(Color.WHITE);

		
		panel.add(btnBatalha);
		panel.add(btnCustom);

		
		btnBatalha.addActionListener(new java.awt.event.ActionListener() {
			
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	jogarBatalha(btnBatalha, btnCustom, panel);
            }
        });
		
		btnCustom.addActionListener(new java.awt.event.ActionListener() {
			
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	jogarBatalha(btnBatalha, btnCustom, panel);
            }
        });
	}
	
	public void jogarBatalha(JButton btnBatalha, JButton btnCustom, JPanel panel) {
		
		this.remove(btnBatalha);
		this.remove(btnCustom);
		this.remove(panel);
		this.dispose();
		
		setChoice(1);

		JPanel panelBatalha = new JPanel();
		
		this.setTitle("Batalha Naval");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 500);
		this.setResizable(false);
		this.add(panelBatalha);
		
        panelBatalha.setLayout(new GridLayout(10, 10));

        JButton[][] botoes = new JButton[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                botoes[i][j] = new JButton();
                panelBatalha.add(botoes[i][j]);
            }
        }
		
	}
	
	public void jogarCustom(JButton btnBatalha, JButton btnCustom, JPanel panel ) {
		
		this.remove(btnBatalha);
		this.remove(btnCustom);
		this.remove(panel);
		this.dispose();
		
		setChoice(2);

		JPanel panelBatalha = new JPanel();
		
		this.setTitle("Batalha Naval");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 500);
		this.setResizable(false);
		this.add(panelBatalha);
		
		
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public int getChoice() {
		return choice;
	}
	

		
}

