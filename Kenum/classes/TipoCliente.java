package JavaA.Kenum.classes;

public enum TipoCliente {
    //constant specific class body
    //corpo de classes especifio constante
    PESSOA_FISICA(1, "pessoa fisica"), PESSOA_JURIDICA(2, "pessoa juridica"){
        public String getId(){
            return "B";
        }
    };

    private  int tipo;
    private String nome;
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //constant specific class body
    //corpo de classes especifio constante

    public String getId(){
        return"A";
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
