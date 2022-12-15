public class Gato {
    String nome;
    Integer idade;

    public String miar(){
        return "Miau";
    }
    
    public String andar(){
        return "Andando";
    }

    public String toString(){
        return "O gato é : " + nome + " e tem " + idade + " anos";
    }
}
