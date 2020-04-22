package JavaA.DsobrecargacoConstrutores.codigo;

import JavaA.DsobrecargacoConstrutores.classes.Estudante;

public class EstudanteCodigo {
    public static void main(String[] args) {
        Estudante est = new Estudante("1212","joao", new double[]{5,7,9}, "02/09/2019");
        est.imprime();
    }
}
