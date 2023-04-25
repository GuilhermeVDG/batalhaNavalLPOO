package Tabuleiro;

import Jogador.Jogador;
import Navios.*;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;

import Excecao.Excecao;

import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class JFrameTabuleiro extends JFrame{
	
	private int choice;
	private Tabuleiro tabuleiroJogador1;
	private Tabuleiro tabuleiroJogador2;
	private DoisCanos doisCanos;
    private PortaAvioes portaAvioes;
    private QuatroCanos quatroCanos;
    private UmCano umCano;
    private TresCanos tresCanos;
    private int tamanho;


	public JFrameTabuleiro() {
		Jogador primeiroJogador = new Jogador(1);
		Jogador segundoJogador = new Jogador(2);
		this.tabuleiroJogador1 = primeiroJogador.getTabuleiro();
		this.tabuleiroJogador2 = segundoJogador.getTabuleiro();
		this.umCano = new UmCano(primeiroJogador);
		this.doisCanos = new DoisCanos(primeiroJogador);
		this.tresCanos = new TresCanos(primeiroJogador);
		this.portaAvioes = new PortaAvioes(primeiroJogador);
		
		
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
		
		panel.add(btnCustom);
		panel.add(btnBatalha);
		
		

		
		btnBatalha.addActionListener(new java.awt.event.ActionListener() {
			
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	jogarBatalha(btnBatalha, btnCustom, panel);
            }
        });
		
		btnCustom.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jogarCustom(btnBatalha, btnCustom, panel);
			}
		});
	}
	
	public void jogarBatalha(JButton btnBatalha, JButton btnCustom, JPanel panel) {
		
		this.remove(btnBatalha);
		this.remove(btnCustom);
		this.remove(panel);
		this.dispose();
		
		setChoice(1);

		JPanel panelBatalha = new JPanel(new BorderLayout());
		
		JPanel matrizPanel = new JPanel(new GridLayout(10, 10));
		
		this.setTitle("Batalha Naval");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 500);
		this.setResizable(false);
		getContentPane().add(panelBatalha);
		
        JPanel naviosPanel = new JPanel(new GridLayout(1, 4));

        JButton navio1Button = new JButton("Navio de 1 cano");
        JButton navio2Button = new JButton("2 canos");
        JButton navio3Button = new JButton("3 canos");
        JButton portaAviaoButton = new JButton("Porta-aviões");
        

        naviosPanel.add(navio1Button);
        naviosPanel.add(navio2Button);
        naviosPanel.add(navio3Button);
        naviosPanel.add(portaAviaoButton);
        
		navio1Button.addActionListener(new java.awt.event.ActionListener() {
					

					public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	
		            	JOptionPane.showMessageDialog(null, "Posicione 4 navios de um cano");
		            	tamanho = umCano.getTamanho();

		            }
		        });
        
		

		JButton[][] botoes = new JButton[10][10];

		for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
						if(tabuleiroJogador1.getMatriz()[i][j] == 0){
							botoes[i][j] = new JButton();
			                botoes[i][j].putClientProperty("posicao_i", i); 
			                botoes[i][j].putClientProperty("posicao_j", j); // salva as posicoes do botao
			                
			                botoes[i][j].addActionListener(new java.awt.event.ActionListener() {
			                    public void actionPerformed(java.awt.event.ActionEvent evt) {
			                    	
			                    	JButton botaoClicado = (JButton) evt.getSource();
			                       // System.out.println("Clicou");
			                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
			                        int j = (int) botaoClicado.getClientProperty("posicao_j"); // recupera as posicoes
			                        System.out.print(i);
			                        System.out.print(j);
			                        
			                        tabuleiroJogador1.setPositions(i, j); //excecao do setpositions n tratada
			                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
										
							
			                        //JOptionPane.showMessageDialog(null, "Posicione os navios de um cano");
			                }
        			});
							matrizPanel.add(botoes[i][j]);
						}
				}
		}
		
		panelBatalha.add(matrizPanel, BorderLayout.CENTER);
		panelBatalha.add(naviosPanel, BorderLayout.NORTH);

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
		getContentPane().add(panelBatalha);
		
		
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public int getChoice() {
		return choice;
	}
	

		
}

