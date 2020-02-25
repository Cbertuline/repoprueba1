package Proyecto1;

public class Electrodomestico {

	// ATRIBUTOS
	protected int precioBase, peso;
	protected String color;
	private char consumoEnergetico;
	// se podran heredar

	// CONSTANTES
	protected final static int PRECIO = 100;
	protected final static String COLOR = "Blanco";
	protected final static char CONSUMO = 'F';
	protected final static int PESO = 5;

	// GETTERS Y SETTERS

	public int getPrecioBase() {
		return precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	// METODO CONSUMO
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO;
		}
	}

	// METODO COLOR
	private void comprobarColor(String color) {
		String Colores[] = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
		boolean este = false;

		for (int i = 0; i < Colores.length && !este; i++) {
			if (Colores[i].equals(color)) {
				este = true;
			}
			if (este) {
				this.color = color;
			} else {
				this.color = COLOR;
			}
		}
	}

	// METODO PRECIO FINAL
	public int precioFinal() {
		int mas = 0;
		switch (consumoEnergetico) {
		case 'A':
			mas += 100;
			break;
		case 'B':
			mas += 80;
			break;
		case 'C':
			mas += 60;
			break;
		case 'D':
			mas += 50;
			break;
		case 'E':
			mas += 30;
			break;
		case 'F':
			mas += 10;
			break;
		}
		if (peso >= 0 && peso < 19) {
			mas += 10;
		} else if (peso >= 20 && peso < 49) {
			mas += 50;
		} else if (peso >= 50 && peso < 79) {
			mas += 80;
		} else if (peso >= 80) {
			mas += 100;
		}
		return precioBase + mas;
	}

	// CONSTRUCTOR CONSTANTES

	public Electrodomestico() {
		this(PRECIO, PESO, CONSUMO, COLOR);
	}

	public Electrodomestico(int precioBase, int peso) {
		this(precioBase, peso, CONSUMO, COLOR);
	}

	public Electrodomestico(int precioBase, int peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	// TOSTRING
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ELECTRODOMESTICO\n");
		builder.append("\nPrecio Base:       \t" +getPrecioBase()+" €");
		builder.append("\nColor:             \t"+getColor());
		builder.append("\nConsumo energetico \t" +getConsumoEnergetico());
		builder.append("\nPeso:              \t"+getPeso()+" kg");
		builder.append("\nSuma item:         \t"+precioFinal()+" €");
		builder.append("\n*****************************");
		
		return builder.toString();
		
	}
}
