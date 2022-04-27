package ESPM.POO.PROVA_PARCIAL;

public class Reserva implements Pagamento {

    private Cliente cliente;
    private boolean pagamentoAVista;

    public Reserva(Cliente cliente, boolean pagamentoAVista) {
       this.cliente=cliente;
       this.pagamentoAVista=pagamentoAVista;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
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
