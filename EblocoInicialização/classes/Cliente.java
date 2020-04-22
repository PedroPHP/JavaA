package JavaA.EblocoInicialização.classes;

public class Cliente {
    public int[] getParcelas;
    //1-Alocar espaço na memoria para o objeto que sera criado
    //2-Cada atributo de classe é criado e inicialidado com seus valores default ou valores explicitos
    //3-Bloco de inicialização é executado
    //4-O construtor é executado
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicialização");
        for (int i=1;i<=100;i++){
            parcelas[i=1]= i;
    }
    }

    public Cliente(){}

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}