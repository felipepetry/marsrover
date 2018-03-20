
public class Rover {

	public Rover() {
		String direcao;
		Int[] posicao;

		Rover(){
			direcao = "n";
			posicao = [0,0];
		}

		public String getDirecao(){
			return direcao;
		}

		public Int[] getPosicao(){
			return posicao;
		}

		public void setDirecao(String direcao){
			this.direcao = direcao;
		}

		public void setPosicao(int x, int y){
			this.posicao[0] = x;
			this.posicao[1] = y;
		}
	}

}
