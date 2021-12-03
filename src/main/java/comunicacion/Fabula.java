package comunicacion;

public class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	public
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public
	String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		return getOrigen() +"\n"+ getTitulo() +"\n"+ getAutor() +"\n"+ getPaginas() +"\n"+ getEnsenanza();
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
