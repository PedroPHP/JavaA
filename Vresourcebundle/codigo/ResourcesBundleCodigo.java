package JavaA.Vresourcebundle.codigo;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleCodigo {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
    ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","us"));
        System.out.println(rb.getString("hello"));
//        System.out.println(rb.getString("Good morning"));
        rb = ResourceBundle.getBundle("messages", new Locale("pt","br"));
        System.out.println(rb.getString("show"));
        //Locale locale = Locale("fr","ca");
        // ResourcesBundle.getBundle("messages,locale");

        //messages_fr_ca.properties
        //messages_fr.properties
        //messages_en_us.properties
        //messages_en.properties
        //messages.properties


    }
}
