package models;

public abstract class Producto implements Comparable<Producto> {
	private String nombreProducto;
	private int precio;

	public Producto(String nombreProducto, int precio) {

		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public int getPrecio() {
		return precio;
	}

	

	@Override
	 public int compareTo(Producto val) {
        return Integer.compare(this.precio, val.precio);
    }

	@Override
	public String toString() {
		return "Nombre: " + this.nombreProducto + " /// Precio: $" + precio;
	}

}
