public class Libro extends Item {
    private final String autor;
    private final String editorial;

    public Libro(int num, String titulo, String materia, int cantidad, String estado, String autor, String editorial) {
        super(num, titulo, materia, cantidad, estado);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Número de identificación: " + num + "\nTítulo: " + titulo + "\nMateria: " + materia + "\nCantidad: " + cantidad
                + "\nEstado: " + estado + "\nAutor: " + autor + "\nEditorial: " + editorial;
    }
}
