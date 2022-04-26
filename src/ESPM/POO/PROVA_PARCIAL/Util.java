package ESPM.POO.PROVA_PARCIAL;
import static javax.swing.JOptionPane.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Util {
    static ArrayList<Reserva> reserva= new ArrayList<>();
    static ArrayList<Reserva> espera= new ArrayList<>();

    public static void reservar() {
        String nome, cpf, cnpj, tpPessoa, pagamento;

        nome=JOptionPane.showInputDialog("Insira o nome:");
        tpPessoa=JOptionPane.showInputDialog("Qual o tipo de cliente?[F|J]").toLowerCase();
        if(tpPessoa.equals("f")){
            cpf=showInputDialog("Insira seu CPF:");
            PessoaFisica pf=new PessoaFisica();
            pf.setNome(nome);
            pf.setCpf(cpf);
            
            if(reserva.contains(cpf)==true){
                showMessageDialog(null, "Esse CPF já foi usado");

            }else{
                pagamento=showInputDialog("Escolha o método de pagamento: \n"+
                                                                    "V: pagamento à vista \n"+
                                                                    "P: pagamento parcelado").toLowerCase();
                
                    if(pagamento.equals("v")){
                        Reserva reserva1= new Reserva(pf, true);
                        reserva.add(reserva1);
                    }else if(pagamento.equals("p")){
                        Reserva reserva1= new Reserva(pf, false);
                        reserva.add(reserva1);
                    }else{
                        showMessageDialog(null, "Resposta inválida");
                    }
            }

        }else if(tpPessoa.equals("j")){
            cnpj=showInputDialog("Insira seu CNPJ:");
            PessoaJuridica pj= new PessoaJuridica();
            pj.setNome(nome);
            pj.setCnpj(cnpj);

            if(reserva.contains(cnpj)==true){
                showMessageDialog(null, "Esse CNPJ já foi usado");
            }else{
                pagamento=showInputDialog("Escolha o método de pagamento: \n"+
                "V: pagamento à vista \n"+
                "P: pagamento parcelado").toLowerCase();
                if(pagamento.equals("v")){
                    Reserva reserva1= new Reserva(pj, true);
                    reserva.add(reserva1);
                }else if(pagamento.equals("p")){
                    Reserva reserva1= new Reserva(pj, false);
                    reserva.add(reserva1);
                }else{
                    showMessageDialog(null, "Resposta inválida");
                }



            }

        }
        
    }

    public static void pesquisar() {
    }

    public static void imprimirReserva() {
    }

    public static void imprimirEspera() {
    }

    public static void cancelar() {
    }

    
    
}
