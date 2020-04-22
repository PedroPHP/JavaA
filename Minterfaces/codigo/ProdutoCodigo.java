package JavaA.Minterfaces.codigo;

import JavaA.Minterfaces.classes.Produto;

public class ProdutoCodigo {
    public static void main(String[] args) {
        Produto p = new Produto("notebook",4,3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
