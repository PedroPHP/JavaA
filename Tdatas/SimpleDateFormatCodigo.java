package JavaA.Tdatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatCodigo {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss A";
        SimpleDateFormat formatador = new SimpleDateFormat();
        System.out.println(formatador.format(c.getTime()));
    }
}
