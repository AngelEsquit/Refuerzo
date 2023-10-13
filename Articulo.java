public class Articulo extends Item {
    private final String autor;

    public Articulo(int num, String titulo, String materia, int cantidad, String estado, String autor) {
        super(num, titulo, materia, cantidad, estado);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Número de identificación: " + num + "\nTítulo: " + titulo + "\nMateria: " + materia + "\nCantidad: " + cantidad
                + "\nEstado: " + estado +"\nAutor: " + autor;
    }
}
