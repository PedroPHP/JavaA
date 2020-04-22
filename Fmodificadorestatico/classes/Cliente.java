package JavaA.Fmodificadorestatico.classes;

public class Cliente {
    //0-Bloco de inicialização estatico é executado quando a jvm carregar a classes (executadi apenas 1 vez)
    //1-Alocar espaço na memoria para o objeto que sera criado
    //2-Cada atributo de classe é criado e inicialidado com seus valores default ou valores explicitos
    //3-Bloco de inicialização é executado
    //4-O construtor é executado
    private static int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicialização");
        for (int i=1;i<=100;i++){
            parcelas[i=1]= i;
        }
    }

    public Cliente(){}

    public static int[] getParcelas() {
        return parcelas;
    }

}