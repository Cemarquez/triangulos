package Mundo;
/**
 * Clase de triangulos.
 */
public class GrupoTriangulos {

	/**
	 * Tringulo número uno.
	 */
	private Triangulo miT1;
	
	/**
	 * Triángulo número dos.
	 */
	private Triangulo miT2;

	/**
	 * Método que construye el triángulo uno.
	 * @param base Base del triángulo.
	 * @param altura Altura del triángulo.
	 */
	public void setTriangulo1(double base, double altura) {

		miT1 = new Triangulo();
		miT1.setBase(base);
		miT1.setAltura(altura);
	}

	/**
	 * Método que construye el triángulo dos.
	 * @param base Base del triángulo.
	 * @param altura Altura del triángulo.
	 */
	public void setTriangulo2(double base, double altura) {

		miT2 = new Triangulo();
		miT2.setBase(base);
		miT2.setAltura(altura);
	}

	public void setMiT1(Triangulo miT1) {
		this.miT1 = miT1;

	}

	public void setMiT2(Triangulo miT2) {
		this.miT2 = miT2;
	}
	
    /**
     * Método para calcular el area promedio de los dos triangulos.
     * @return promedio de sus areas.
     */
	public double calcularAreaPromedio() {
		double areaProm = (miT1.calcularArea() + miT2.calcularArea()) / 2;

		return areaProm;
	}

	public Triangulo getMiT1() {
		return miT1;
	}

	public Triangulo getMiT2() {
		return miT2;
	}

}
