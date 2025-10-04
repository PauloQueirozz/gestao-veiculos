package entities;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String placa, double preco, double capacidadeCarga) {
        super(marca, placa, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void mostrarDados(boolean mostrarCapacidadeCarga) {
        super.mostrarDados();
        if (mostrarCapacidadeCarga){
            System.out.printf("\nCapacidade de carga: %.2f kg", capacidadeCarga);
        }
    }
}
