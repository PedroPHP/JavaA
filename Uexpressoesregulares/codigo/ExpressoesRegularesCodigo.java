package JavaA.Uexpressoesregulares.codigo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesCodigo {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - todos q nao for digitos
        // \s - espaços em branco \t \n \f \r
        // \S - que nao é branco
        // \w - caracteres palavras a-z A-Z digitos e _
        // \W - tudo o que na for caractere de palavra
        // [] - procura apenas palavras que se referi [abc]
        // ? - zero ou um
        // * - zero ou mais
        // + - um ou mais
        //{n,m} - de n ate m
        // () - agrupa um expreção
        // | -  coloca "ou"
        // $ - fim da linha
        // o(v|c)o - ovo, oco
        // maca(rr|c)ão - macarrão, macacão
        // . - é um coringa 1.3 = 1.23,1.33,1.34
        //^ [^abc] - caracter de negação


//        String regex = "0[xX]([10])+(\\s|$)";
//        String texto = "0xc 0x10 0xad 0x123 0xcae";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//"([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
//        String texto = "fulano@gmail.com, 123pedro@gmail.com.br, juca1223@gmail.com, xablau@gmail.br, xaco@gmail";
//        String regex = "\\d(2)/\\d(2)/\\d(2,4)";
//        String texto = "05/10/2010 05/5/2015 1/1/01 1/05/95 ";//dd/MM/yyyy
        String regex = "pro([^,])*";
        String texto = "pro1.bkp, pro1.java, pro1.class, pro1final.java, pro2.bkp";//dd/MM/yyyy

//        System.out.println("email valido? "+ "xablau@gmail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789 " );
        System.out.println("expresao: "+matcher.pattern());
        System.out.println("posiçoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " "+matcher.group());
        }

    }
}
