public class exercicio10 {
    public static void main(String[] args) {
        String palavra = "radar";
        int tamanho = palavra.length();
        int metade = tamanho / 2;

        boolean palindromo = true;

        for(int i=0; i < metade; i++){
            if(palavra.charAt(i) != palavra.charAt(tamanho - i - 1)){
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo);
    }
}
