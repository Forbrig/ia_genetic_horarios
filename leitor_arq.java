import java.util.*;

class leitor_arq {
		private int n_prof;
		private String lines[];
		private Scanner ler;

		private leitor_arq () {
			//cria um scanner padrão com a entrada "curso.dat" e uma expressão regular com delimitadores \n (ou |) " " (espaço)
			this.ler = new Scanner (("curso.dat")).useDelimiter("\\n|\\ ");
		}

	//recebe a entrada.txt
	public void alimenta_profs (String linhas[]) {
		this.n_prof = ler.nextInt(); //numero de professores, primeira coisa
		System.out.println(this.n_prof +"\n");
		for (int i = 0; i < this.n_prof; i++) {

		}
	}
}