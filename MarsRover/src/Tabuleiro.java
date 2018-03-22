import java.util.List;
import java.util.ArrayList;

public class Tabuleiro {

	private List<Rover> rovers;
	private int[] limite;

	public Tabuleiro(int l1, int l2) {
		this.rovers = new ArrayList<Rover>();
		this.limite = new int[] {l1, l2};
	}

	public List<Rover> getRovers() {
		return new ArrayList<Rover>(this.rovers);
	}

	public void addRover(Rover rover) {
		this.rovers.add(rover);
	}

	public int[] getLimite() {
		return this.limite;
	}

}
