package main;

import models.Fruta;
import models.Gaseosa;
import models.Shampoo;
import models.SuperBarrio;

public class EscuelitaPnt_CarlosArteaga {
//	
//	Ejercicio Escuelita Somos PNT
//
//
//	Imaginemos un supermercado de barrio.
//
//
//	Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:
//
//
//
//	Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
//
//	Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
//
//	Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
//
//	Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
//
//	=============================
//
//	Producto más caro: Frutillas
//
//	Producto más barato: Coca-Cola
//
//
//	La solución debe cumplir con los siguientes requisitos:
//
//	Diseñar una solución orientada a objetos.
//	La salida es por consola y exactamente como se requiere.
//	Usar solamente las clases provistas por Java 8..
//	Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
//	El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
//	Para mostrar el mayor / menor, utilizar la interfaz Comparable.
//	Para imprimir por pantalla, sobrescribir el método toString()

	public static void main(String[] args) {
		SuperBarrio superBarrio = new SuperBarrio();
		iniciarPrograma(superBarrio);
		mostrarProductos(superBarrio);

	}

	private static void mostrarProductos(SuperBarrio superBarrio) {
		superBarrio.mostrar();

	}

	private static void iniciarPrograma(SuperBarrio superBarrio) {

		superBarrio.agregarProducto(new Gaseosa("Coca-Cola Zero", 1.5, 20));
		superBarrio.agregarProducto(new Gaseosa("Coca-Cola", 1.5, 18));
		superBarrio.agregarProducto(new Shampoo("Shampoo Sedal", 500, 19));
		superBarrio.agregarProducto(new Fruta("Frutillas", 64, "kilo"));

	}

}
