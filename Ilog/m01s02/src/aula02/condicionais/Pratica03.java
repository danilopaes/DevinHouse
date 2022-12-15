package aula02.condicionais;

public class Pratica03 {
    public static void main(String[] args) {
        String cor = "Verde";
        String resultado;

        switch (cor) {
            case "vermelho":
                resultado = "Deve parar o carro";
                break;
            case "Amarelo":
                resultado = "Deve finalizar a travessia";
                break;
            case "Verde":
                resultado = "Pode atravessar";
                break;
            default:
                resultado = "Quebrado";

        }
        System.out.println(resultado);

    }
}
