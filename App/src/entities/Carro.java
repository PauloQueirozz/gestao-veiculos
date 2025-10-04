package entities;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String placa, double preco, int numPortas) {
        super(marca, placa, preco);
        this.numPortas = numPortas;
    }

    public void mostrarDados(boolean mostrarNumPortas) {
        super.mostrarDados();
        if (mostrarNumPortas){
            System.out.printf("\nNúmero de portas: %d", numPortas);
        }
    }
}
