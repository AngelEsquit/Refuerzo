public class Revista extends Item {
    private final int anio;

    public Revista(int num, String titulo, String materia, int cantidad, String estado, int anio) {
        super(num, titulo, materia, cantidad, estado);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Número de identificación: " + num + "\nTítulo: " + titulo + "\nMateria: " + materia + "\nCantidad: " + cantidad
                + "\nEstado: " + estado + "\nAño: " + anio;
    }
}
