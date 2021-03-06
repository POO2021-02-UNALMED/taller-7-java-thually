package comunicacion;

public class Tesis extends Escrito {
	String idea;
	String argumentos[];
	String conclusion;
	String referencias;
	String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	public
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return getPaginas()*palabrasPagina*5;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public
	String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getOrigen() +"\n"+ getTitulo() +"\n"+ getAutor() +"\n"+ getPaginas() +"\n"+
				getIdea() +"\n"+ getArgumentos().length +"\n"+ getConclusion() +"\n"+ getReferencias();
	}

}
