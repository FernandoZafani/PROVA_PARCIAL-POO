package ESPM.POO.PROVA_PARCIAL;

public abstract class Cliente {

    private String nome;

    public Cliente() {

    }
    
    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
