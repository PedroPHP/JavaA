package JavaA.Sstrings.codigo;

public class StringPerformaceCodigo {
    public static void main(String[] args) {
    long inicio = System.currentTimeMillis();
    concatString(100);
    long fim = System.currentTimeMillis();
        System.out.println("tempo contado: "+(fim - inicio));

        inicio = System.currentTimeMillis();
        concatString(100);
         fim = System.currentTimeMillis();
        System.out.println("tempo contado String Builder: "+(fim - inicio));

        inicio = System.currentTimeMillis();
        concatString(100);
        fim = System.currentTimeMillis();
        System.out.println("tempo contado String buffer: "+(fim - inicio));
    }

    private static void concatString(int tam){
        String string= " ";
        for(int i=0;i<tam;i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder ab= new StringBuilder(tam);
        for(int i=0;i<tam;i++){
            ab.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer as= new StringBuffer(tam);
        for(int i=0;i<tam;i++){
            as.append(i);
        }
    }
}
