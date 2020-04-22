package JavaA.Wio.Codigo;

import java.io.Console;

public class ConsoleCodigo {
    public static void main(String[] args) {
        Console c = (System.console());
        char[] pw = c.readPassword("%s", "pw: ");
        for(char pass : pw){
            c.format("%c",pass);
        }
        c.format("\n");
        String texto;
        while (true){
        texto = c.readLine("%s", "digite: ");
        c.format(" esse texto %s foi digitado", retorno(texto));
        }
    }

    public static String retorno(String args){
        return args;
    }
}
