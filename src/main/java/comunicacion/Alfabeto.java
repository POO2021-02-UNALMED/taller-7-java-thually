package comunicacion;

public class Alfabeto extends Pictograma{
	String[] letras;
	String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String re = "";
		for (int i = 0; i < letras.length-1; i++) {
			String letra = letras[i];
			re += letra + ", ";
		}
		re += letras[letras.length-1];
		return re;
	}
	
	public
	int cantidadLetras() {
		return letras.length;
	}

}
