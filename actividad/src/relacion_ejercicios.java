
import java.time.LocalTime;

public class relacion_ejercicios {
    public static void main(String[] args) {
        LocalTime clock = LocalTime.now();
        int hora=clock.getHour();
        if (hora>=6 && hora<=12){
            System.out.println("Buenos dias");
        }else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        }
    }
}
