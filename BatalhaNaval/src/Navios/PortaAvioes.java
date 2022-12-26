package Navios;

public abstract class PortaAvioes implements Navios {
	
	private int TamanhoLinha = 3;
	private int TamanhoColuna = 3;
	
	@Override
	public int getTamanhoLinha() {
		// TODO Auto-generated method stub
		return this.TamanhoLinha;
	}
	@Override
	public int getTamanhoColuna() {
		// TODO Auto-generated method stub
		return this.TamanhoColuna;
	}
}	