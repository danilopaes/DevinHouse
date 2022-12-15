import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate aniversario = LocalDate.of(1993, 02, 25);
        System.out.println(aniversario);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime horario = LocalDateTime.of(1990, 05, 5, 11, 12, 10);
        System.out.println(agora);
        System.out.println(horario);
    }
    
}
