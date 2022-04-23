package ESPM.POO.PROVA_PARCIAL;

public class PessoaFisica extends Cliente{
    String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "{Nome: " + getNome() + ", cpf: " + getCpf() + "}";
    }

    
}
