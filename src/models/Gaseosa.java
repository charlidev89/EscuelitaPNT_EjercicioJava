package models;
public class Gaseosa extends Producto {

	private double litros;

	public Gaseosa(String nombreProducto, double litros, int precio) {
		super(nombreProducto, precio);
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombreProducto() + " /// Litros: " + litros + " /// Precio: $" + getPrecio();
	}

}
