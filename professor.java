class professor {
	String nome;
	int	qt_horarios;
	int horarios_nquer[]; //int horarios_nquer[qt_horarios];
	
	public void set_nome (String nome) {
		this.nome = nome;
	}

	public void set_qt_horarios (int qt_horarios) {
		this.qt_horarios = qt_horarios;
	}

	public int get_qt_horarios () {
		return this.qt_horarios;
	}

	public void set_horarios_nquer () {
		for (int i = 0; i < this.get_qt_horarios(); i++) {
			//this.horarios_nquer[i];
		} 
	}

}