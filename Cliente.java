import java.util.ArrayList;

public class Cliente {
    private int num;
    private String nombre;
    private String direccion;
    private int prestamos;
    private ArrayList<Item> prestamosh;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }

    public void setPrestamosh(ArrayList<Item> prestamosh) {
        this.prestamosh = prestamosh;
    }

    public ArrayList<Item> getPrestamosh() {
        return prestamosh;
    }
}
