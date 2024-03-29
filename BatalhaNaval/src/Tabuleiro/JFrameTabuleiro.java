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
    private int orientacao;
    private int direcao;
    private Jogador primeiroJogador;
    private Jogador segundoJogador;
    private Jogador jogadorDaVez;
    private boolean isAtaque;
    private int quantidadeAtaque;


	public JFrameTabuleiro() {
		this.primeiroJogador = new Jogador(1);
		this.segundoJogador = new Jogador(2);
		this.jogadorDaVez = this.primeiroJogador;
		this.umCano = new UmCano(jogadorDaVez);
		this.doisCanos = new DoisCanos(jogadorDaVez);
		this.tresCanos = new TresCanos(jogadorDaVez);
		this.quatroCanos = new QuatroCanos(jogadorDaVez);
		this.portaAvioes = new PortaAvioes(jogadorDaVez);
		this.quantidadeUmCano = this.umCano.getQuantidadeDeNavios();
		this.quantidadeDoisCanos = this.doisCanos.getQuantidadeDeNavios();
		this.quantidadeTresCanos = this.tresCanos.getQuantidadeDeNavios();
		this.quantidadeQuatroCanos = this.quatroCanos.getQuantidadeDeNavios();
		this.quantidadePortaAvioes = this.portaAvioes.getQuantidadeDeNavios();
		this.tamanho = 1;
		this.orientacao = 1;
		this.direcao = 1;
		this.isAtaque = false;
		
		
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
		
		
		JButton btnSair = new JButton("2 - Sair");
		btnSair.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnSair.setBounds(136, 236, 205, 29);
		btnSair.setBackground(Color.WHITE);
		
		panel.add(btnSair);
		panel.add(btnBatalha);
		
		

		
		btnBatalha.addActionListener(new java.awt.event.ActionListener() {
			
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	jogarBatalha(btnBatalha, btnSair, panel);
            }
        });
		
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
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
		
		this.setTitle("Jogador " + jogadorDaVez.getNumero());
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
        
        JPanel direcaoPanel = new JPanel(new GridLayout(1, 4));
        
        JButton paraBaixoButton = new JButton("v");
        JButton paraCimaButton = new JButton("^");
        JButton paraDireitaButton = new JButton(">");
        JButton paraEsquerdaButton = new JButton("<");
        
        direcaoPanel.add(paraEsquerdaButton);
        direcaoPanel.add(paraDireitaButton);
        direcaoPanel.add(paraCimaButton);
        direcaoPanel.add(paraBaixoButton);
        
        paraBaixoButton.addActionListener(new java.awt.event.ActionListener() {
    		public void actionPerformed(java.awt.event.ActionEvent evt) {
	    			orientacao = 1;
	        		direcao = 1;
                }
    		});
        
        paraCimaButton.addActionListener(new java.awt.event.ActionListener() {
    		public void actionPerformed(java.awt.event.ActionEvent evt) {
	    			orientacao = 1;
	        		direcao = 2;
                }
    		});
        
        paraDireitaButton.addActionListener(new java.awt.event.ActionListener() {
    		public void actionPerformed(java.awt.event.ActionEvent evt) {
	    			orientacao = 2;
	        		direcao = 2;
                }
    		});
        
        paraEsquerdaButton.addActionListener(new java.awt.event.ActionListener() {
    		public void actionPerformed(java.awt.event.ActionEvent evt) {
            		orientacao = 2;
            		direcao = 1;
                }
    		});
        
        
        
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
		panelBatalha.add(direcaoPanel, BorderLayout.SOUTH);

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
		System.out.println(isAtaque);
		for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
						if(jogadorDaVez.getTabuleiro().getMatriz()[i][j] == 0){
							botoes[i][j] = new JButton();
			                botoes[i][j].putClientProperty("posicao_i", i); 
			                botoes[i][j].putClientProperty("posicao_j", j); // salva as posicoes do botao
			                botoes[i][j].setBackground(Color.white);
			                botoes[i][j].addActionListener(new java.awt.event.ActionListener() {
			                    public void actionPerformed(java.awt.event.ActionEvent evt) {
			          
			                    	JButton botaoClicado = (JButton) evt.getSource();

			                    	if(tamanho == 1 && quantidadeUmCano > 0) {			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        jogadorDaVez.getTabuleiro().setPositions(i, j); 
				                        jogadorDaVez.getTabuleiro().setPosicaoNavios(tamanho,orientacao,direcao);
				                        quantidadeUmCano--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	} else
			                    	if(tamanho == 2 && quantidadeDoisCanos > 0) {			              

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        jogadorDaVez.getTabuleiro().setPositions(i, j); 
				                        jogadorDaVez.getTabuleiro().setPosicaoNavios(tamanho,orientacao,direcao);
				                        quantidadeDoisCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	} else
			                    	if(tamanho == 3 && quantidadeTresCanos > 0) {
			                 
				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        jogadorDaVez.getTabuleiro().setPositions(i, j); 
				                        jogadorDaVez.getTabuleiro().setPosicaoNavios(tamanho,orientacao,direcao);
				                        quantidadeTresCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	} else
			                    	if(tamanho == 4 && quantidadeQuatroCanos > 0) {
			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        jogadorDaVez.getTabuleiro().setPositions(i, j); 
				                        jogadorDaVez.getTabuleiro().setPosicaoNavios(tamanho,orientacao,direcao);
				                        quantidadeQuatroCanos--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	} else
			                    	if(tamanho == 5 && quantidadePortaAvioes > 0) {			                    		

				                        int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j"); 
				                        
				                        jogadorDaVez.getTabuleiro().setPositions(i, j); 
				                        jogadorDaVez.getTabuleiro().setPosicaoNavios(tamanho,orientacao,direcao);
				                        quantidadePortaAvioes--;
				                        trocarBotoes(matrizPanel, botoes);
			                    	} else if(quantidadeUmCano == 0 && quantidadeDoisCanos == 0 && quantidadeTresCanos == 0 && quantidadeQuatroCanos == 0 && quantidadePortaAvioes == 0 && jogadorDaVez.getNumero() == 1 && !isAtaque){
			                    		jogadorDaVez = segundoJogador;
			                    		resetBotoes(matrizPanel, botoes);
			                    		
			                    		quantidadeUmCano = 4;
			                    		quantidadeDoisCanos = 3;
			                    		quantidadeTresCanos = 2;
			                    		quantidadeQuatroCanos = 1;
			                    		quantidadePortaAvioes = 1;
			                    	} else if (quantidadeUmCano == 0 && quantidadeDoisCanos == 0 && quantidadeTresCanos == 0 && quantidadeQuatroCanos == 0 && quantidadePortaAvioes == 0 && jogadorDaVez.getNumero() == 2 && !isAtaque){
			                    		jogadorDaVez = primeiroJogador;
			                    		resetBotoes(matrizPanel, botoes);
			                    		isAtaque = true;
			                    		quantidadeAtaque = 3;
			                    	} else if (quantidadeUmCano == 0 && quantidadeDoisCanos == 0 && quantidadeTresCanos == 0 && quantidadeQuatroCanos == 0 && quantidadePortaAvioes == 0 && jogadorDaVez.getNumero() == 1 && !isAtaque){
			                    		jogadorDaVez = segundoJogador;
			                    		resetBotoes(matrizPanel, botoes);
			                    		isAtaque = true;
			                    		quantidadeAtaque = 3;
			                    	} else if(isAtaque && jogadorDaVez.equals(primeiroJogador) && quantidadeAtaque > 0){
			                    		int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j");
				                        System.out.print("jaoijdaiodnakdnkadnm");
				                        
				                        jogadorDaVez.ataqueNavios(segundoJogador.getTabuleiro(), i, j);
				                        trocarBotoes(matrizPanel, botoes);
				                        quantidadeAtaque--;
			                    	} else if(isAtaque && jogadorDaVez.equals(segundoJogador) && quantidadeAtaque > 0){
			                    		int i = (int) botaoClicado.getClientProperty("posicao_i"); 
				                        int j = (int) botaoClicado.getClientProperty("posicao_j");
				                        
				                        jogadorDaVez.ataqueNavios(primeiroJogador.getTabuleiro(), i, j);
				                        
				                        quantidadeAtaque--;
				                        trocarBotoes(matrizPanel, botoes);
				                    }else if(isAtaque && quantidadeAtaque <= 0 && jogadorDaVez.getNumero() == 1){
			                    		jogadorDaVez = segundoJogador;
			                    		resetBotoes(matrizPanel, botoes);
			                    		quantidadeAtaque = 3;
			                    	} else if(isAtaque && quantidadeAtaque <= 0 && jogadorDaVez.getNumero() == 2){
			                    		jogadorDaVez = primeiroJogador;
			                    		resetBotoes(matrizPanel, botoes);
			                    		quantidadeAtaque = 3;
			                    	} else {
			                    		JOptionPane.showMessageDialog(null, "Sem navios dessa categoria disponiveis");
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
				if(jogadorDaVez.getTabuleiro().getMatriz()[i][j] == 1 && !isAtaque) {
					botoes[i][j].setBackground(Color.black);
					
				}else if(jogadorDaVez.equals(primeiroJogador) && segundoJogador.getTabuleiro().getMatriz()[i][j] == 2) {
					botoes[i][j].setBackground(Color.red);
				} else if(jogadorDaVez.equals(segundoJogador) && primeiroJogador.getTabuleiro().getMatriz()[i][j] == 2) {
					botoes[i][j].setBackground(Color.red);
				}
				matrizPanel.add(botoes[i][j]);
			}
		}
	}
	
	public void resetBotoes(JPanel matrizPanel, JButton[][] botoes) {
		
		this.setTitle("Jogador " + jogadorDaVez.getNumero());
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				botoes[i][j].setBackground(Color.white);
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

