package models;

import java.util.ArrayList;
import java.util.Collections;

import interfaces.Mostrable;

public class SuperBarrio implements Mostrable {

	private ArrayList<Producto> productos;

	public SuperBarrio() {
		this.productos = new ArrayList<Producto>();

	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);

	}

	private Producto buscarProdMasCaro() {

		return Collections.max(productos);
	}

	private Producto buscarProdMasBarato() {
		return Collections.min(productos);
	}

	@Override
	public void mostrar() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		System.out.println("=============================");
		System.out.println("Producto más caro: " + buscarProdMasCaro());
		System.out.println("Producto más barato: " + buscarProdMasBarato());

	}

}