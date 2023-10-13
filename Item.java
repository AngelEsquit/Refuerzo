public class Item {
    protected final int num;
    protected final String titulo;
    protected final String materia;
    protected final int cantidad;
    protected String estado;

    public Item(int num, String titulo, String materia, int cantidad, String estado) {
        this.num = num;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getNum() {
        return num;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Número de identificación: " + num + "\nTítulo: " + titulo + "\nMateria: " + materia + "\nCantidad: " + cantidad
                + "\nEstado: " + estado;
    }
}
