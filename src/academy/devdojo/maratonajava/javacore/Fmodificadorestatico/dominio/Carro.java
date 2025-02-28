package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private  double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------------------");
        System.out.println("nome do carro: "+this.nome);
        System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite da via: "+Carro.velocidadeLimite);
        if (this.velocidadeMaxima > Carro.velocidadeLimite){
            System.out.println("O carro está acima do limite de velocidade!");
        }else if(this.velocidadeMaxima == Carro.velocidadeLimite) {
            System.out.println("Tome cuidado! O carro está no limite máximo de velocidade!");
        }else{
            System.out.println("O carro está dentro do limite de velocidade!");
        }
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
