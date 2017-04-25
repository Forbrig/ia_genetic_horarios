//algoritmo genético em si
class geneticador {
	int numero_geracao; //contador de geração

	//o construtor seta a primeira geração
	void geneticador () {
		numero_geracao = 1;

	}
	
	//aqui serão atribuidas notas para a geração (fitness)
	public void aptidao () {
	}

	//os individuos mais aptos (maior fitness) serao selecionados para a reproducao
	public void selecao () {}	

	//cruzamento entre os bons individuos selecionados, obs primeira geração
	public void reproducao () {}

	//a mutacao é essencial para obtermos super individuos
	public void mutacao () {}

}