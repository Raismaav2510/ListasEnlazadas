import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();
        int opc = 0;
        int cuenta = 0;

        do {

            cuenta = lista.getcuentaNodos();
            Scanner scanner = new Scanner(System.in);

            System.out.print("\n");
            System.out.println("Lista simple");
            System.out.println("Existen " + cuenta + " nodos" + " en la lista");
            System.out.println("1.- Insertar al inicio");
            System.out.println("2.- Insertar al final");
            System.out.println("3.- Insertar al centro");
            System.out.println("4.- Mostrar lista de nodos");
            System.out.println("5.- Buscar el valor de un nodo");
            System.out.println("6.- Eliminar al inicio");
            System.out.println("7.- Eliminar al final");
            System.out.println("8.- Salir del programa");

            opc = scanner.nextInt();

            System.out.print("\n");

            switch(opc)
            {

                case 1: {

                    System.out.print("Ingresa el valor del nodo: ");
                    lista.insertarInicio(scanner.nextInt());
                    break;
                }

                case 2: {

                    System.out.print("Ingresa el valor del nodo: ");
                    lista.insertarFinal(scanner.nextInt());
                    break;
                }

                case 3: {

                    if(cuenta < 2) {System.out.print("Deben existir 2 nodos en la lista");}

                    else {

                        System.out.print("Ingresa el valor del nodo: ");
                        lista.insertarCentro(scanner.nextInt());
                    }
                    break;
                }

                case 4: {

                    System.out.print("La lista es: \n");
                    lista.mostrar();
                    break;
                }
                case 5: {

                    int dato;

                    System.out.print("Ingresa el valor del nodo: ");
                    dato = scanner.nextInt();

                    if (lista.buscar(dato))
                        System.out.print("Se  encontro el nodo");

                    else
                        System.out.print("No existe este valor en la lista");

                    break;
                }

                case 6:
                    lista.eliminarInicio();
                    break;

                case 7:
                    lista.eliminarFinal();
                    break;

                case 8:
                    System.out.println("Cerrando programa");
                    break;

                default:
                    System.out.println("No existe esa opción");

            }
        }while (opc != 8);
    }
}
