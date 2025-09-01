public class CarroEsportivo extends Carro {
    private boolean modoEsportivo;

    public CarroEsportivo(String marca, String cor, int ano) {
        super(marca, cor, ano);
        this.modoEsportivo = false;
    }

    public void ativarModoEsportivo() {
        if (!modoEsportivo) {
            this.modoEsportivo = true;
            this.setVelocidade(this.getVelocidade() + 100);
            System.out.println("modo esportivo ativado! velocidade: " + this.getVelocidade());
        }
    }

    public boolean isModoEsportivo() {
        return modoEsportivo;
    }
    public static void main(String[] args){
        CarroEsportivo c4 = new CarroEsportivo("Porsche", "Azul", 2023);
        c4.status();
        c4.ativarModoEsportivo();
        c4.acelerar();
        c4.status();

    }
}
