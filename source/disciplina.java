class disciplina {
	String nome_disc, cod_semestre, nome_prof; //nome da disciplina / nome do semestre = nome_sem em semestre.java /
	// nome do professor que ministra = nome_prof em professor.java
	int	qt_periodos;
	
	public void set_nome_disc (String nome_disc) {
		this.nome_disc = nome_disc;
	}

	public String get_nome_disc () {
		return this.nome_disc;
	}

	public void set_cod_sem (String cod_sem) {
		this.cod_semestre = cod_sem;
	}

	public String get_cod_sem () {
		return this.cod_semestre;
	}

	public void set_nome_prof (String nome_prof) {
		this.nome_prof = nome_prof;
	}

	public String get_nome_prof () {
		return this.nome_prof;
	}

	public void set_qt_periodos (int qt_periodos) {
		this.qt_periodos = qt_periodos;
	}

	public int get_qt_periodos () {
		return this.qt_periodos;
	}
}