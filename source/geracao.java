// esta classe será a que armazenará as tabelas com os horários do semestre

//a geração será um vetor desses indivíduos
class horario { //é o indivíduo
	int[] sala;
	String[] semestre;
	String[] professor;
	int aptidao;
	//fitness, inicialmente começa com 0.
	//se depois da atribuição da aptdao no geneticador.aptidao() a fitness continuar 0 o individuo não atende os requisitos mínimos (ou restrições)
	//são 30 horários da manhã a tarde com 6 por dia. 6*5 = 30
	void class horario () {
		sala = new int[30];
		semestre = new String[30];
		professor = new String[30];
	}

}