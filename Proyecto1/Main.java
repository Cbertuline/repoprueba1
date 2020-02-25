package Proyecto1;

public class Main {

	public static void main(String[] args) {
		
		// ATRIBUTOS DE SUMA
		int sumaElectro = 0;
		int sumaTele = 0;
		int sumaLava = 0;
		
		// Electrodomestico: PRECIO, PESO, CONSUMO, COLOR
		// Lavadora: PRECIO, PESO, CONSUMO, COLOR, CARGA
		// Television PRECIO, PESO, CONSUMO, COLOR, RESOLUCION, false

		Electrodomestico lineaBlanca[] = new Electrodomestico[10];
		lineaBlanca[0] = new Electrodomestico(130, 20);
		lineaBlanca[1] = new Lavadora(140, 30, 'D', "Gris", 20);
		lineaBlanca[2] = new Television(500, 80,'A',"Negro",30,true);
		lineaBlanca[3] = new Electrodomestico(210,20);
		lineaBlanca[4] = new Electrodomestico(100, 80, 'Z', "verde");
		lineaBlanca[5] = new Lavadora(1200, 40, 'Z', "Azul", 60);
		lineaBlanca[6] = new Television(250, 70, 'B', "Rojo", 52, false);
		lineaBlanca[7] = new Lavadora(430, 80, 'C', "Naranjo", 20);
		lineaBlanca[8] = new Television(100, 77, 'D', "Rosado", 32, true);
		lineaBlanca[9] = new Electrodomestico(40, 12);

		// PROCESO PRECIO FINAL
		for (int i = 0; i < lineaBlanca.length; i++) {
			if (lineaBlanca[i] instanceof Electrodomestico) {
				sumaElectro += lineaBlanca[i].precioFinal();
			}
			if (lineaBlanca[i] instanceof Lavadora) {
				sumaLava += lineaBlanca[i].precioFinal();
			}
			if (lineaBlanca[i] instanceof Television) {
				sumaTele += lineaBlanca[i].precioFinal();
			}
		}

		// IMPRESION DE ARRAY
		for (Electrodomestico electrodomestico : lineaBlanca) {
			System.out.println(electrodomestico);
		}

		// IMPRESION TOTALES
		System.out.println("*****************************");
		System.out.println("TOTAL\n");
		System.out.println("Suma Televisores:       " + sumaTele);
		System.out.println("Suma Lavadoras:         " + sumaLava);
		System.out.println("Suma TOTAL:             " + sumaElectro);
		System.out.println("*****************************");
	}
}