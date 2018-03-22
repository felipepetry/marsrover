import java.util.List;
import java.util.ArrayList;

public class Rover {
	
	private int direcao;
	private String instrucoes;
	private int[] posicao;

	public Rover(int direcao, String instrucoes, int x, int y) {
		this.direcao = direcao;
		this.instrucoes = instrucoes;
		this.posicao = new int[] {x, y};
	}

	public String getDirecao() {
		switch(this.direcao) {

			case 0: return "N";
			case 1: return "E";
			case 2: return "S";
			case 3: return "W";

		}
		
		return "";
	}

	private void updateDirecao(int direcao) {
		this.direcao += direcao;
		
		if(this.direcao == -1) this.direcao = 3;
		else if(this.direcao == 4) this.direcao = 0;
	}

	public int[] getPosicao() {
		return this.posicao;
	}

	private void updatePosicao(int eixo, int direcao) {
		this.posicao[eixo] += direcao;
	}

	private void andar() {
		switch(this.direcao) {

			// Norte
			case 0: updatePosicao(1, 1); break;

			// Leste
			case 1: updatePosicao(0, 1); break;

			// Sul
			case 2: updatePosicao(1, -1); break;

			// Oeste
			case 3: updatePosicao(0, -1); break;

		}
	}
	
	public void executar() {

		for(int i = 0; i < this.instrucoes.length(); i++) {

			switch(this.instrucoes.charAt(i)) {

				case 'M': andar(); break;
				case 'L': updateDirecao(-1); break;
				case 'R': updateDirecao(1); break;

			}

		}
	}
}
