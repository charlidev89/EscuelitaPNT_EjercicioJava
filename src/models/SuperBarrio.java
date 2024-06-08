package models;
import java.util.ArrayList;

import interfaces.Mostrable;

public class SuperBarrio implements Mostrable {

	private ArrayList<Producto> productos;

	public SuperBarrio() {
		this.productos = new ArrayList<Producto>();

	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);

	}

	private String buscarProdMasCaro() {

		Producto producto = productos.get(0);

		for (Producto aux : productos) {
			if (aux.getPrecio() > producto.getPrecio()) {
				producto = aux;
			}
		}
		return producto.getNombreProducto();
	}

	private String buscarProdMasBarato() {
		Producto producto = productos.get(0);

		for (Producto aux : productos) {
			if (aux.getPrecio() < producto.getPrecio()) {
				producto = aux;
			}
		}
		return producto.getNombreProducto();
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