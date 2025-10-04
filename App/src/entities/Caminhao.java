package entities;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String placa, double preco, double capacidadeCarga) {
        super(marca, placa, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void mostrarDados(boolean mostrarCapacidadeCargaT) {
        super.mostrarDados();
        if (mostrarCapacidadeCargaT){
            System.out.printf("\nCapacidade de carga: %.2f t", capacidadeCarga/1000);
        } else {
            System.out.printf("\nCapacidade de carga: %.2f kg", capacidadeCarga);
        }
    }
}
