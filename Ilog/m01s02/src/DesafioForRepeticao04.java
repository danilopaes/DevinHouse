import java.util.List;

public class DesafioForRepeticao04 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 7, 6, 5, 2, 3, 4, 2, 3, 1, 0, 6 };

        List<Interger> unicos = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            boolean repetido = false;
            int numero = arr[i];

            for(int j = 0; j < arr.length; j++){
                if ( j == i){
                    continue;
                }
                if (numero == arr[j]){
                    repetido = true;
                    break;
                }
            }
            if (repetido == false){
                unicos.add(numero);
            }
        }
        System.out.println(unicos);
    }
    
}
