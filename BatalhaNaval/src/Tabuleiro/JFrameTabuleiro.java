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
    private int quantidadeUmCano;
    private int quantidadeDoisCanos;
    private int quantidadeTresCanos;
    private int quantidadeQuatroCanos;
    private int quantidadePortaAvioes;


	public JFrameTabuleiro() {
		Jogador primeiroJogador = new Jogador(1);
		Jogador segundoJogador = new Jogador(2);
		this.tabuleiroJogador1 = primeiroJogador.getTabuleiro();
		this.tabuleiroJogador2 = segundoJogador.getTabuleiro();
		this.umCano = new UmCano(primeiroJogador);
		this.doisCanos = new DoisCanos(primeiroJogador);
		this.tresCanos = new TresCanos(primeiroJogador);
		this.quatroCanos = new QuatroCanos(primeiroJogador);
		this.portaAvioes = new PortaAvioes(primeiroJogador);
		this.quantidadeUmCano = this.umCano.getQuantidadeDeNavios();
		this.quantidadeDoisCanos = this.doisCanos.getQuantidadeDeNavios();
		this.quantidadeTresCanos = this.tresCanos.getQuantidadeDeNavios();
		this.quantidadeQuatroCanos = this.quatroCanos.getQuantidadeDeNavios();
		this.quantidadePortaAvioes = this.portaAvioes.getQuantidadeDeNavios();
		
		
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
		
        JPanel naviosPanel = new JPanel(new GridLayout(1, 5));

        JButton navio1Button = new JButton("1 cano");
        JButton navio2Button = new JButton("2 canos");
        JButton navio3Button = new JButton("3 canos");
        JButton navio4Button = new JButton("4 canos");
        JButton portaAviaoButton = new JButton("P. Avioes");
        

        naviosPanel.add(navio1Button);
        naviosPanel.add(navio2Button);
        naviosPanel.add(navio3Button);
        naviosPanel.add(navio4Button);
        naviosPanel.add(portaAviaoButton);
        
		navio1Button.addActionListener(new java.awt.event.ActionListener() {
					

		public void actionPerformed(java.awt.event.ActionEvent evt) {
        	JOptionPane.showMessageDialog(null, quantidadeUmCano + " navios de um cano restantes");
            	tamanho = umCano.getTamanho();

            }
		});
		
		navio2Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JOptionPane.showMessageDialog(null, quantidadeDoisCanos + " navios de dois canos restantes");
            	tamanho = doisCanos.getTamanho();

            }
		});
		
		navio3Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JOptionPane.showMessageDialog(null, quantidadeTresCanos + " navios de tres canos restantes");
            	tamanho = tresCanos.getTamanho();

            }
		});
		
		navio4Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JOptionPane.showMessageDialog(null, quantidadeQuatroCanos + " navios de quatro canos restantes");
            	tamanho = quatroCanos.getTamanho();

            }
		});
		
		portaAviaoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JOptionPane.showMessageDialog(null, quantidadePortaAvioes + " porta avioes restantes");
            	tamanho = portaAvioes.getTamanho();

            }
		});
        
		
		JButton[][] botoes = new JButton[10][10];
		carregarBotoes(matrizPanel, botoes);
		
		
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
	
	public void carregarBotoes(JPanel matrizPanel, JButton[][] botoes) {
		for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
						if(tabuleiroJogador1.getMatriz()[i][j] == 0){
							botoes[i][j] = new JButton();
			                botoes[i][j].putClientProperty("posicao_i", i); 
			                botoes[i][j].putClientProperty("posicao_j", j); // salva as posicoes do botao
			                
			                botoes[i][j].addActionListener(new java.awt.event.ActionListener() {
			                    public void actionPerformed(java.awt.event.ActionEvent evt) {
			          
			                    	JButton botaoClicado = (JButton) evt.getSource();

			                    	if(tamanho == 1 && quantidadeUmCano > 0) {			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        tabuleiroJogador1.setPositions(i, j); 
				                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
				                        quantidadeUmCano--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	}
			                    	if(tamanho == 2 && quantidadeDoisCanos > 0) {			              

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        tabuleiroJogador1.setPositions(i, j); 
				                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
				                        quantidadeDoisCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	}
			                    	if(tamanho == 3 && quantidadeTresCanos > 0) {
			                 
				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        tabuleiroJogador1.setPositions(i, j); 
				                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
				                        quantidadeTresCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	}
			                    	if(tamanho == 4 && quantidadeQuatroCanos > 0) {
			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        tabuleiroJogador1.setPositions(i, j); 
				                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
				                        quantidadeQuatroCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	}
			                    	if(tamanho == 5 && quantidadePortaAvioes > 0) {			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        tabuleiroJogador1.setPositions(i, j); 
				                        tabuleiroJogador1.setPosicaoNavios(tamanho,1,1);
				                        quantidadePortaAvioes--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	}
			                    	
																	
			                    }
			                });
			                
						} 
						matrizPanel.add(botoes[i][j]);
				}
		}
	}
	
	public void trocarBotoes(JPanel matrizPanel, JButton[][] botoes) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(tabuleiroJogador1.getMatriz()[i][j] == 1) {
					botoes[i][j].setBackground(Color.green);
					
				}
				matrizPanel.add(botoes[i][j]);
			}
		}
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public int getChoice() {
		return choice;
	}
	

		
}

