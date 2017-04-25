class semestre {
	String nome_sem;
	int	num_sala, qt_horarios_sem; //numero da sala / quantidade de horarios que o semestre tem
	int[] horarios_sem; //int horarios_sem[qt_horarios_sem];
	
	public void set_nome_sem (String nome_sem) {
		this.nome_sem = nome_sem;
	}

	public String get_nome_sem () {
		return this.nome_sem;
	}

	public void set_num_sala (int num_sala) {
		this.num_sala = num_sala;
	}

	public int get_num_sala () {
		return this.num_sala;
	}

	public void set_qt_horarios_sem (int qt_horarios_sem) {
		this.qt_horarios_sem = qt_horarios_sem;
	}

	public int get_qt_horarios_sem () {
		return this.qt_horarios_sem;
	}

	public void set_horarios_sem (int[] aux) {
		this.horarios_sem = new int[get_qt_horarios_sem()];
		for (int i = 0; i < this.get_qt_horarios_sem(); i++) {
			this.horarios_sem[i] = aux[i];
		}
	}

	public int[] get_horarios_sem () {
		return horarios_sem;
	}
}