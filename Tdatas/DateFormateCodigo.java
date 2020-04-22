package JavaA.Tdatas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormateCodigo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa= new DateFormat[6];
        dfa[0]=DateFormat.getInstance();
        dfa[1]=DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[2]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[3]=DateFormat.getDateInstance(DateFormat.LONG);
        dfa[4]=DateFormat.getDateInstance(DateFormat.FULL);
        dfa[5]=DateFormat.getDateInstance();

        for(DateFormat df : dfa){
            System.out.println(df.format(c.getTime()));
        }


    }
}
