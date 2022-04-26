package ESPM.POO.PROVA_PARCIAL;

public class Reserva implements Pagamento {

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

    @Override
    public double calcularPagamento(){
        double valor=3200;
        if(pagamentoAVista==true){
            valor=0.9*3200;
        }

        return valor;
    }

}
