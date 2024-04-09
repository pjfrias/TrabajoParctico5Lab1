
package trabajoparctico5lab1.objeto;

public class Producto {
    private String nombre;
    private String categoria;
    private Double precio;

    public Producto(String nombre, String categoria, Double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("nombre=").append(nombre);
        sb.append(", categoria=").append(categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
