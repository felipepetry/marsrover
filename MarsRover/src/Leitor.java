import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Leitor {

	private BufferedReader leitor;

	public Leitor() {
		this.leitor = null;
	}

	public List<String> le(String arquivo) {
		List<String> retorno = new ArrayList<String>();

		try {

        	leitor = new BufferedReader(new FileReader(arquivo));		

			String linha = leitor.readLine();

			while (linha != null) {
				retorno.add(linha);
				linha = leitor.readLine();
			}

		}

		catch(IOException e) { e.printStackTrace(); } 

    	finally { 
			
		    try { if (leitor != null) leitor.close(); }
			catch(IOException e) { e.printStackTrace(); }
			
		}

		return retorno;
	}

}