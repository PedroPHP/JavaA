package JavaA.Fmodificadorestatico.codigo;

import JavaA.Fmodificadorestatico.classes.Carro;

public class CarroCodigo {
    public static void main(String[] args) {

        Carro c1 = new Carro("msg",280);
        Carro c2 = new Carro("audi",275);
        Carro c3 = new Carro("lanborgni",290);


        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("###################");
        Carro.setVelocidadeLimite(200);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
