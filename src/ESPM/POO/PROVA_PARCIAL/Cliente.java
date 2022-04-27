package ESPM.POO.PROVA_PARCIAL;

public abstract class Cliente {

    private String nome;

    public Cliente(String nome) {
       this.nome=nome;
    }
    
   public void setNome(String nome) {
       this.nome = nome;
   }

    public String getNome() {
        return nome;
    }

  
    @Override
    public String toString() {
        
        return nome;
    }
    
}
