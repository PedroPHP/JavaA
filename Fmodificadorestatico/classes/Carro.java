package JavaA.Fmodificadorestatico.classes;

public class Carro {
    // velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;


    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double setVelocidadeLimite(){
        return velocidadeLimite;
    }

    public void imprime() {
        System.out.println("------------------------------");
        System.out.println("nome " + this.nome);
        System.out.println("velocidade maxima " + this.velocidadeMaxima);
        System.out.println("velocidade limite " + velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
