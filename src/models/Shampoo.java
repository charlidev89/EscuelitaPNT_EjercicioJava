package models;
public class Shampoo extends Producto {
	
	private int miliLitro;

	public Shampoo(String nombreProducto, int miliLitro, int precio) {
		super(nombreProducto, precio);
		this.miliLitro = miliLitro;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombreProducto() + " /// Contenido: " + this.miliLitro + "ml /// Precio: $" + getPrecio();
	}
}
