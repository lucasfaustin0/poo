public class Carro {
    private String marca;
    private String cor;
    private int ano;
    private int velocidade;

    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.ano = 0;
        this.velocidade = 0;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        this.velocidade -= 10;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
    }

    public boolean Seminovo() {
        return this.ano > 2020;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getVelocidade() { return velocidade; }
    public void setVelocidade(int velocidade) { this.velocidade = velocidade; }

    public void status() {
        System.out.println("Informações do carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("Seminovo? " + this.Seminovo());
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Azul", 2022);
        Carro c2 = new Carro("Ferrari", "Vermelha", 2019);

        c1.status();
        c2.status();

        c1.acelerar();
        c2.acelerar();
        c2.pintar("Preto Fosco");

        System.out.println("\nDepois de alterações");
        c1.status();
        c2.status();
    }
}
