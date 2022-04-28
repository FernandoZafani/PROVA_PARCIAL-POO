package ESPM.POO.PROVA_PARCIAL;

import static javax.swing.JOptionPane.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {
    static ArrayList<Reserva> reserva = new ArrayList<>();

    public static void reservar() {
        String nome, cpf, cnpj, tpPessoa, pagamento;
        Cliente cliente = null;

        nome = JOptionPane.showInputDialog("Insira o nome:");
        tpPessoa = JOptionPane.showInputDialog("Qual o tipo de cliente?[F|J]").toLowerCase();
        if (tpPessoa.equals("f")) {
            cpf = showInputDialog("Insira seu CPF:");

            PessoaFisica pf = new PessoaFisica(nome, cpf);
            cliente = pf;
            pagamento = showInputDialog("Escolha o método de pagamento: \n" +
                    "V: pagamento à vista \n" +
                    "P: pagamento parcelado").toLowerCase();

            if (pagamento.equals("v")) {
                Reserva reserva1 = new Reserva(cliente, true);
                reserva.add(reserva1);
            } else if (pagamento.equals("p")) {
                Reserva reserva1 = new Reserva(cliente, false);
                reserva.add(reserva1);
            } else {
                showMessageDialog(null, "Resposta inválida");
            }

        } else if (tpPessoa.equals("j")) {
            cnpj = showInputDialog("Insira seu CNPJ:");
            PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
            cliente = pj;
            pagamento = showInputDialog("Escolha o método de pagamento: \n" +
                    "V: pagamento à vista \n" +
                    "P: pagamento parcelado").toLowerCase();
            if (pagamento.equals("v")) {
                Reserva reserva1 = new Reserva(cliente, true);
                reserva.add(reserva1);
            } else if (pagamento.equals("p")) {
                Reserva reserva1 = new Reserva(cliente, false);
                reserva.add(reserva1);
            } else {
                showMessageDialog(null, "Resposta inválida");
            }
        } else {
            showMessageDialog(null, "Por favor, insira uma resposta válida");
        }

        if (reserva.size() <= 6) {
            showMessageDialog(null, "Sua mesa foi reservada!");
        } else {
            showMessageDialog(null, "Você está na lista de espera.");
        }

    }

    public static void pesquisar() {
        String aux;
        boolean achou = false;

        if (reserva.size() == 0) {
            showMessageDialog(null, "Ainda não há reservas");
        } else {
            aux = showInputDialog(null, "Insira seu CPF ou CNPJ:");
            for (int i = 0; i < reserva.size(); i++) {
                if (reserva.get(i).getCliente() instanceof PessoaFisica) {
                    Cliente cliente = reserva.get(i).getCliente();
                    PessoaFisica pf = (PessoaFisica) (cliente);
                    if (pf.getCpf().equals(aux)) {
                        achou = true;
                        showMessageDialog(null, "Você possui reserva para o jantar");
                        break;
                    }
                }
                if (reserva.get(i).getCliente() instanceof PessoaJuridica) {
                    Cliente cliente = reserva.get(i).getCliente();
                    PessoaJuridica pj = (PessoaJuridica) (cliente);
                    if (pj.getCnpj().equals(aux)) {
                        achou = true;
                        showMessageDialog(null, "Você possui reserva para o jantar");
                        break;
                    }

                }

            }
            if (achou == false) {
                showMessageDialog(null, "Nenhuma reserva foi encontrada");
            }

        }

    }

    public static void imprimirReserva() {
        if (reserva.size() == 0) {
            showMessageDialog(null, "Não há reservas");
        } else {
            for (int i = 0; i < reserva.size(); i++) {
                if (i < 6) {
                    reserva.get(i).getCliente().toString();
                }
            }
        }
    }

    

    public static void imprimirEspera() {
    }

    public static void cancelar() {
    }

}
