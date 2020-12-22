package packagePrueba;

public class Prueba {
	
	private final String titulo;

	
	public Prueba(){
		this.titulo = "Curso Prfesional de java";
	}
	
	protected String getTitulo() {
		return this.titulo;
	}
	
	public int suma(int numero1,int numero2) {
		return numero1 + numero2;
	}
	
}
