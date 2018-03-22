import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o arquivo a ser avaliado: ");
		String arquivo = scanner.next();
		
		Leitor leitor = new Leitor();
		List<String> linhas = leitor.le(arquivo);

		String[] limites = linhas.get(0).split(" ");

		Tabuleiro tabuleiro = new Tabuleiro(Integer.parseInt(limites[0]), Integer.parseInt(limites[1]));
		linhas.remove(0);

		for(int i = 0; i < linhas.size(); i += 2) {

			String[] posicao = linhas.get(i).split(" ");
			String instrucoes = linhas.get(i + 1);

			int direcao = 0;
			int x = Integer.parseInt(posicao[0]);
			int y = Integer.parseInt(posicao[1]);

			switch(posicao[2]) {

				case "N": direcao = 0; break;
				case "E": direcao = 1; break;
				case "S": direcao = 2; break;
				case "W": direcao = 3; break;

			}

			tabuleiro.addRover(new Rover(direcao, instrucoes, x, y));

		}

		int[] limite = tabuleiro.getLimite();

		for(Rover rover : tabuleiro.getRovers()) {

			rover.executar();
			
			int[] posicao = rover.getPosicao();

			if(posicao[0] < 0 || posicao[1] < 1) System.out.println("Rover em posição inválida");
			else if(posicao[0] > limite[0] || posicao[1] > limite[1]) System.out.println("Rover em posição inválida");

			else System.out.println(posicao[0] + " " + posicao[1] + " " + rover.getDirecao());

		}

	}

}
