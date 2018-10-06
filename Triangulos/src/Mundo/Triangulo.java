package Mundo;

public class Triangulo {
	
/**
 * Base del triángulo.
 */
private double base;

/**
 * Altura del triágulo.
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
 * Método para calcular el area de un triángulo.
 * @return Area de un triángulo.
 */
public double calcularArea() {
	double area=(base*altura)/2;
	return area;
}


}
