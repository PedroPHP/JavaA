package JavaA.Sstrings.codigo;

public class StringBuilderCodigo {
    public static void main(String[] args) {
        String s = "uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("123456789");

        System.out.println(sb.reverse());
    }
}
