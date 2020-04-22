package JavaA.Jmodificadorfinal.codigo;

import JavaA.Jmodificadorfinal.classes.Carro;

public class CarroCodigo {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("pde");
        System.out.println(c.getComprador());
    }
}
