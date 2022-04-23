package ESPM.POO.PROVA_PARCIAL;

public class PessoaJuridica extends Cliente{
    String cnpj;
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "{Nome: " + getNome() + ", cpf: " + getCnpj() + "}";
    }
}
