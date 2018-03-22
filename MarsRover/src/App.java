import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Leitor a = new Leitor();

		List<String> b = a.le("oi.txt");

		for(String c : b) System.out.print(c);

	}

}
