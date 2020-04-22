package JavaA.Uexpressoesregulares.codigo;

public class TokenCodigo {
    public static void main(String[] args) {
        String str = " pedro, maria, joao, camila, Matheus";
        String[] tokens = str.split(",");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }


    }
}
