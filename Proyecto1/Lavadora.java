package Proyecto1;

public class Lavadora extends Electrodomestico {

	// ATRIBUTOS
	private int carga;

	// CONSTANTE
	private final static int CARGA = 5;

	// CONSTRUCTOR

	public Lavadora() {
		this (PRECIO, PESO, CONSUMO, COLOR, CARGA);
	}
	
public Lavadora(int precioBase, int peso) {
	this(precioBase, peso, CONSUMO, COLOR, CARGA);
}

public Lavadora(int precioBase, int peso, char consumoEnergetico, String color, int carga) {
super(precioBase, peso, consumoEnergetico, color);
this.carga=carga;
}
	// GETTERS Y SETTERS
	public int getCarga() {
		return carga;
	}

	public int precioFinal() {
		int mas = super.precioFinal();
		if (carga > 30) {
			mas += 50;
		}
		return mas;
	}
	// TOSTRING
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LAVADORA\n");
		builder.append("\nPrecio Base:       \t" +getPrecioBase()+" €");
		builder.append("\nColor:             \t"+getColor());
		builder.append("\nConsumo energetico \t" +getConsumoEnergetico());
		builder.append("\nPeso:              \t"+getPeso()+" kg");
		builder.append("\nCarga:             \t"+getCarga()+" kg");
		builder.append("\nSuma item:         \t"+precioFinal()+" €");
		builder.append("\n*****************************");
		return builder.toString();
		
	}
}

