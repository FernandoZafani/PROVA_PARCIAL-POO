package ESPM.POO.PROVA_PARCIAL;

public abstract class Cliente {

    private String nome;

    public Cliente(String nome) {
        nome=this.nome;
    }
    
   public void setNome(String nome) {
       this.nome = nome;
   }

    public String getNome() {
        return nome;
    }

  
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
