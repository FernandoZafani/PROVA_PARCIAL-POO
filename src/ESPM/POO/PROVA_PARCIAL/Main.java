package ESPM.POO.PROVA_PARCIAL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int exit = 0;
        Scanner scan = new Scanner(System.in);

        while (exit != 0) {

            menu();
        
            System.out.print("> ");
            exit = scan.nextInt();

            switch (exit) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Essa opção não existe");
                    break;
            }
        }

        System.out.println("Bye Bye!");
        scan.close();
    }


    private static void menu() {
        System.out.println("CANTINA DO HUMBERTO");
        System.out.println("-----------------------");
        System.out.println("1 -> Reservar Mesa");
        System.out.println("2 -> Pesquisar Reserva Existente");
        System.out.println("3 -> Imprimir Reservas");
        System.out.println("4 -> Imprimir Listas de Espera");
        System.out.println("5 -> Cancelar Reserva");
        System.out.println("6 -> Finalizar");
        System.out.println();
    }
    
}