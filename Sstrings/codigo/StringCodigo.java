package JavaA.Sstrings.codigo;

public class StringCodigo {
    public static void main(String[] args) {
        String nome="pedro"; // so faz a 1 é a 3
        nome = nome.concat("henrique"); //nome += henrique
        String nome2 = new String ("joao");//1 variavel de referencia 2 um objeto do tipo string 3 uma string no pool de string

        String teste = "Goku";
        String teste2 = "123456789";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o','a'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste2.substring(0,2));
        System.out.println(teste2.trim());  // é bom usa no banco de dados

    }
}
