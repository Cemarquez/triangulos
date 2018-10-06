package Mundo;

public class Triangulo {
	
/**
 * Base del tri�ngulo.
 */
private double base;

/**
 * Altura del tri�gulo.
 */
private double altura;

public Triangulo()
{
	super();
}
/**
 * Crear un triangulo.
 * @param base
 * @param altura
 */
public Triangulo(double base, double altura)
{
	this.base = base;
	this.altura = altura;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

/**
 * M�todo para calcular el area de un tri�ngulo.
 * @return Area de un tri�ngulo.
 */
public double calcularArea() {
	double area=(base*altura)/2;
	return area;
}


}
