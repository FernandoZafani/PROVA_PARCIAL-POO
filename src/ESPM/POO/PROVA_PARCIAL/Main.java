package ESPM.POO.PROVA_PARCIAL;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        int exit;
        

        do {
            exit=parseInt(JOptionPane.showInputDialog(menu()));
        
            switch (exit) {
                case 1:
                    Util.reservar();
                    break;
                case 2:
                    Util.pesquisar();
                    break;
                case 3:
                 Util.imprimirReserva();
                    break;
                case 4:
                  Util.imprimirEspera();
                    break;
                case 5:
                  Util.cancelar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Bye Bye!");
                    break;
                default:
                   JOptionPane.showMessageDialog(null,"Essa opção não existe");
                    break;
            }
        }while (exit != 6);

        
       
    }


    public static String menu() {
		String aux = "Restaurante CANTINA DO HUMBERTO :\n";
		aux += "1.Reservar mesa\n";
		aux += "2.Pesquisar reserva \n";
		aux += "3.Imprimir reservas \n";
		aux += "4.Imprimir lista de espera\n";
		aux += "5.Cancelar reserva\n";
		aux += "6.Finalizar";
		return aux;

	}
    
}