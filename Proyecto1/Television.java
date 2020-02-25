package Proyecto1;

public class Television extends Electrodomestico {

	// ATRIBUTOS
	private int resolucion;
	private boolean sintonizadorTDT;

	// DECLARACION DE CONSTANTE
	private final static int RESOLUCION = 20;

	// METODOS

	public int precioFinal() {
		int mas = super.precioFinal();
		if (resolucion > 40) {
			mas += precioBase * 0.3;
		}
		if (sintonizadorTDT) {
			mas += 50;
		}
		return mas;
	}

	// CONSTRUCTOR

	public Television() {
		this(PRECIO, PESO, CONSUMO, COLOR, RESOLUCION, false);

	}
	
	public Television(int precioBase, int peso) {
		this(precioBase, peso, CONSUMO, COLOR, RESOLUCION, false);
	}
	
	public Television(int precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
		
	}

	// GETTERS Y SETTERS
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public static int getRESOLUTION() {
		return RESOLUCION;
	}
	// TOSTRING
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TELEVISION\n");
		builder.append("\nPrecio Base:       \t" +getPrecioBase()+" €");
		builder.append("\nColor:             \t"+getColor());
		builder.append("\nConsumo energetico \t" +getConsumoEnergetico());
		builder.append("\nPeso:              \t"+getPeso()+" kg");
		builder.append("\nResolucion:        \t"+getResolucion()+" in");
		builder.append("\nSintonizador TDT   \t"+comprobadorTDT(isSintonizadorTDT()));
		builder.append("\nSuma item:         \t"+precioFinal()+" €");
		builder.append("\n*****************************");
		return builder.toString();
		
	}
	
	public String comprobadorTDT(boolean sintonizadorTDT) {
		if (sintonizadorTDT) {
			return "SI";
		} else {
			return "NO";
		}
	}
}