import java.util.*;
import java.io.*;
//import java.lang.*;

class leitor_arq {
	private int qt_prof, qt_sem, qt_disc;
	private String token;
	private Scanner ler;
	private professor[] prof;
	private semestre[] sem;
	private disciplina[] disc;
	private int[] aux, aux2;

	public leitor_arq () throws FileNotFoundException {
		//cria um scanner padrão com a entrada "curso.dat" e uma expressão regular com delimitadores \n (ou |) " " (espaço)
		try {
			//this.ler = new Scanner (new FileReader("curso.dat")).useDelimiter("\\n|\\ ");
    		//String linhas[] = new String[2000];
    		File arquivo = new File("curso.dat");
			ler = new Scanner(arquivo); //.useDelimiter("\\n| ");	
			
			/* 
			while(ler.hasNext()) { //printa tudo debug
				System.out.println(ler.next());
			}
			*/
    		
    		alimenta();	
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("arquivo não encontrado\n");
    	}
	}

	//alimenta as instancias das classes
	public void alimenta () {
		/* LEUTURA DOS PROFESSORES */
		qt_prof = ler.nextInt();
		prof = new professor[qt_prof];
		//System.out.println(n_prof);
		for (int i = 0; i < qt_prof; i++) { //alimentação dos professores
			prof[i] = new professor(); //reserva memoria
			//preenche o nome do individuo
			prof[i].set_nome_prof(ler.next()); 
			//System.out.println(prof[i].get_nome_prof());
			//quantidade de horarios que ele nao gostaria de ministrar
			prof[i].set_qt_hnquer(ler.nextInt());
			//System.out.println(prof[i].get_qt_hnquer());
			//horarios que ele nao gostaria de ministrar
			aux = new int[prof[i].get_qt_hnquer()]; // para mandar o vetor de horarios pra classe professor tenho que alimentar um vetor qualquer
			for (int j = 0; j < prof[i].get_qt_hnquer(); j++) {
				//System.out.println(ler.nextInt());
				aux[j] = ler.nextInt();
			}
			prof[i].set_hnquer(aux);
			/*
			aux2 = new int[prof[i].get_qt_hnquer()];
			aux2 = prof[i].get_hnquer();
			for (int k = 0; k < prof[i].get_qt_hnquer(); k++) {
				System.out.println(aux2[k]);
			}
			*/
		}
		/* LEUTURA DOS SEMESTRES */
		qt_sem = ler.nextInt();
		sem = new semestre[qt_sem];
		for (int j = 0; j < qt_sem; j++) {
			sem[j] = new semestre(); //reserva memoria para aquele semestre
			//preenche o nome do semestre
			sem[j].set_nome_sem(ler.next());
			//System.out.println(sem[j].get_nome_sem());
			sem[j].set_num_sala(ler.nextInt());
			//System.out.println(sem[j].get_num_sala());
			sem[j].set_qt_horarios_sem(ler.nextInt()); //quantidade de horarios do semestre
			//System.out.println(sem[j].get_qt_horarios_sem());
			aux = new int[sem[j].get_qt_horarios_sem()];
			for (int i = 0; i < sem[j].get_qt_horarios_sem(); i++) {
				//System.out.println(ler.nextInt());
				aux[i] = ler.nextInt();
			}
			sem[j].set_horarios_sem(aux);
			/*
			aux2 = new int[sem[j].get_qt_horarios_sem()];
			aux2 = sem[j].get_horarios_sem();
			for (int k = 0; k < sem[j].get_qt_horarios_sem(); k++) {
				System.out.println(aux2[k]);
			}
			*/
		}
		/* LEUTURA DAS DISCIPLINAS */
		qt_disc = ler.nextInt();
		disc = new disciplina[qt_disc]; //reserva memoria para o vetor de semestres
		for (int j = 0; j < qt_disc; j++) {
			disc[j] = new disciplina(); //reserva memoria para aquele semestre
			//preenche o nome do semestre
			disc[j].set_nome_disc(ler.next());
			//System.out.println(disc[j].get_nome_disc());
			disc[j].set_qt_periodos(ler.nextInt());
			//System.out.println(disc[j].get_qt_periodos());
			disc[j].set_cod_sem(ler.next());
			//System.out.println(disc[j].get_cod_sem());
			disc[j].set_nome_prof(ler.next());
			//System.out.println(disc[j].get_nome_prof());
		}
	}
}