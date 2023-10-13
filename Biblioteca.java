import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salir = 1;
        int opcion = 0;
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();
        int num;
        String titulo;
        String materia;
        int cantidad;
        String estado = "Disponible";
        String autor;
        String editorial;
        int anio;
        Item itemb;
        int contador = 0;

        while (salir != 0) {
            printMenu1();

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Ingrese un número.");
                scanner.nextLine();
            }

            switch (opcion) {
                case 1:
                    opcion = 0;
                    printMenu2();

                    try {
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("");
                        System.out.println("Ingrese un número.");
                        scanner.nextLine();
                    }

                    switch (opcion) {
                        case 1:
                            opcion = 0;

                            System.out.println("Ingrese el número del libro:");
                            num = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el título del libro:");
                            titulo = scanner.nextLine();
                    
                            System.out.println("Ingrese la materia del libro:");
                            materia = scanner.nextLine();
                    
                            System.out.println("Ingrese la cantidad de libros:");
                            cantidad = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el autor del libro:");
                            autor = scanner.nextLine();
                    
                            System.out.println("Ingrese la editorial del libro:");
                            editorial = scanner.nextLine();

                            items.add(new Libro(num, titulo, materia, cantidad, estado, autor, editorial));

                        case 2:
                            System.out.println("Ingrese el número de la revista:");
                            num = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el título de la revista:");
                            titulo = scanner.nextLine();
                    
                            System.out.println("Ingrese la materia de la revista:");
                            materia = scanner.nextLine();
                    
                            System.out.println("Ingrese la cantidad de revistas:");
                            cantidad = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el estado de la revista:");
                            estado = scanner.nextLine();
                    
                            System.out.println("Ingrese el año de la revista:");
                            anio = scanner.nextInt();
                            scanner.nextLine();

                            items.add(new Revista(num, titulo, materia, cantidad, estado, anio));

                        case 3:
                            System.out.println("Ingrese el número del artículo:");
                            num = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el título del artículo:");
                            titulo = scanner.nextLine();
                    
                            System.out.println("Ingrese la materia del artículo:");
                            materia = scanner.nextLine();
                    
                            System.out.println("Ingrese la cantidad de artículos:");
                            cantidad = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.println("Ingrese el estado del artículo:");
                            estado = scanner.nextLine();
                    
                            System.out.println("Ingrese el autor del artículo:");
                            autor = scanner.nextLine();

                            items.add(new Articulo(num, titulo, materia, cantidad, estado, autor));
                    }

                    break;
                case 2:
                    opcion = 0;

                    System.out.println("Ingrese el número del ítem:");
                    num = scanner.nextInt();
                    scanner.nextLine();

                    for (Item item : items) {
                        if (num == item.getNum()) {
                            itemb = item;
                            itemb.toString();
                            break;
                        }
                    }

                    break;
                case 3:
                    opcion = 0;
                    contador = 0;

                    System.out.println("Ingrese la materia:");
                    materia = scanner.nextLine();

                    for (Item item : items) {
                        if (materia == item.getMateria()) {
                            contador += 1;
                        }
                    }

                    System.out.println("La cantidad de ítems de la materia " + materia + " son: " + contador);

                    break;

                case 4:
                    opcion = 0;
                    contador = 0;

                    System.out.println("Ingrese la materia:");
                    materia = scanner.nextLine();

                    for (Item item : items) {
                        if (item instanceof Revista) {
                            if (materia == item.getMateria()) {
                                contador += 1;
                            }
                        }
                    }

                    System.out.println("La cantidad de revistas de la materia " + materia + " son: " + contador);

                    break;

                case 5:
                    opcion = 0;

                    for (Item item : items) {
                        if (item instanceof Libro) {
                            System.out.println("");
                            item.toString();
                            System.out.println("");
                        }
                    }

                    break;

                case 6:
                    opcion = 0;
                    contador = 1;

                    System.out.println("");
                    System.out.println("Ingrese la opción que desee.");

                    for (Item item : items) {
                        System.out.println(contador + ": " + item.getTitulo());
                        contador += 1;
                    }

                    opcion = scanner.nextInt();
                    items.get(opcion).setEstado("Agotado");

                    break;

                case 7:
                    salir = 0;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Número inválido. Intente nuevamente.");
                    break;
            }

            opcion = 0;
            estado = "Disponible";
        }
    }

    public static void verificarCliente (int num, ArrayList<Cliente> clientes) {
        int control = 0;

        for (Cliente cliente : clientes) {
            if (cliente.getNum() == num) {
                control = 1;
                break;
            }

            else {
                continue;
            }
        }

        if (control == 0) {
            System.out.println("");
            System.out.println("");
            System.out.println("El número de identificación de esa persona no está registrado.");
            System.out.println("");
            System.out.println("");
        }
    }

    public static void printMenu1() {
        System.out.println("");
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("                Menú");
        System.out.println("*************************************");
        System.out.println("Ingrese la opción que desee:");
        System.out.println("1: Ingresar nuevo ítem.");
        System.out.println("2: Buscar una publicación por # de identificación.");
        System.out.println("3: Cantidad de ítems de una materia.");
        System.out.println("4: Cantidad de revistas de una materia.");
        System.out.println("5: Mostrar información de libros.");
        System.out.println("6: Registrar préstamo.");
        System.out.println("7: Salir");
        System.out.println("");
        System.out.println("");
    }

    public static void printMenu2() {
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese la opción que desee:");
        System.out.println("1: Libro");
        System.out.println("2: Revista");
        System.out.println("3: Artículo");
        System.out.println("");
        System.out.println("");
    }
}
