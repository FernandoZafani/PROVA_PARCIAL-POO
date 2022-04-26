package ESPM.POO.PROVA_PARCIAL;

public class Reserva {

    private Cliente cliente;
    private boolean pagamentoAVista;

    public Reserva(Cliente cliente, boolean PagamentoAVista) {
        
    }
    
    public void setPagamento(boolean pagamentoAVista) {
        this.pagamentoAVista = pagamentoAVista;
    }
    public boolean getPagamento(boolean pagamentoAVista) {
        return pagamentoAVista;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "";
    }
}
