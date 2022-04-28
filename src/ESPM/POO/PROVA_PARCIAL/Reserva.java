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
            String aux="";
        if(cliente instanceof PessoaFisica){
            aux+="Pessoa Física\n";
        }else{
            aux+="Pessoa Jurídica\n";
        }
            aux+=cliente.getNome();

        if(pagamentoAVista==true){
            aux+="\nPagamento à vista";
        }else{
            aux+="\nPagamento parcelado";
        }
        return aux ;
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
