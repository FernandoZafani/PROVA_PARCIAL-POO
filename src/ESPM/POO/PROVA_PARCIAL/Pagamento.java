package ESPM.POO.PROVA_PARCIAL;

public interface Pagamento {

    public static double calcularPagamento(boolean getPagamento){
        double valor=3200;
        if(getPagamento==true){
            valor=0.9*3200;
        }

        return valor;
    }

    
}
