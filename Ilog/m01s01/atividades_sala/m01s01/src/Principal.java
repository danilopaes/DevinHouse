public class Principal {
    public static void main(String[] args) {
        Gato gatoObjeto = new Gato();
        gatoObjeto.nome = "Garfield";
        gatoObjeto.idade = 5;

        System.out.println("O nome do Gato é : " + gatoObjeto.nome);
        System.out.println("A idade do Gato é : " + gatoObjeto.idade);
        System.out.println(gatoObjeto.miar());
        System.out.println(gatoObjeto.andar());

        System.out.println(gatoObjeto);
    }
    
}
