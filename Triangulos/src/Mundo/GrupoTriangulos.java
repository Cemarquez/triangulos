package Mundo;
/**
 * Clase de triangulos.
 */
public class GrupoTriangulos {

	/**
	 * Tringulo n�mero uno.
	 */
	private Triangulo miT1;
	
	/**
	 * Tri�ngulo n�mero dos.
	 */
	private Triangulo miT2;

	/**
	 * M�todo que construye el tri�ngulo uno.
	 * @param base Base del tri�ngulo.
	 * @param altura Altura del tri�ngulo.
	 */
	public void setTriangulo1(double base, double altura) {

		miT1 = new Triangulo();
		miT1.setBase(base);
		miT1.setAltura(altura);
	}

	/**
	 * M�todo que construye el tri�ngulo dos.
	 * @param base Base del tri�ngulo.
	 * @param altura Altura del tri�ngulo.
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
     * M�todo para calcular el area promedio de los dos triangulos.
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
