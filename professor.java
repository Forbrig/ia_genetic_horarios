class professor {
	String nome_prof;
	int	qt_horarios; //quantidade de horarios que o professor n quer
	int[] horarios_nquer; //int horarios_nquer[qt_horarios]; //horarios que o professor n quer
	
	public void set_nome_prof (String nome) {
		this.nome_prof = nome;
	}

	public String get_nome_prof () {
		return this.nome_prof;
	}

	public void set_qt_hnquer (int qt_horarios) {
		this.qt_horarios = qt_horarios;
	}

	public int get_qt_hnquer () {
		return this.qt_horarios;
	}

	public void set_hnquer (int[] aux) {
		this.horarios_nquer = new int[get_qt_hnquer()];
		for (int i = 0; i < this.get_qt_hnquer(); i++) {
			this.horarios_nquer[i] = aux[i];
		}
	}

	public int[] get_hnquer () {
		return horarios_nquer;
	}
}