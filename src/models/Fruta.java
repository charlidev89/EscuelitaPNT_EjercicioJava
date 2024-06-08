package models;
public class Fruta extends Producto {

	private String unidadDeVenta;

	public Fruta(String nombreProducto, int precio, String unidadVenta) {
		super(nombreProducto, precio);
		this.unidadDeVenta = unidadVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombreProducto() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: "
				+ unidadDeVenta;
	}
}
