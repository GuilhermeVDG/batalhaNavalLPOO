package Navios;

public abstract class QuatroCanos implements Navios {
		
	private int TamanhoLinha = 4;
	private int TamanhoColuna = 0;
		
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
