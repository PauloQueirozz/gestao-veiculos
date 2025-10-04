package entities;

public class Veiculo {
    protected String marca, placa;
    protected double preco;

    public Veiculo(String marca, String placa, double preco) {
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.printf("\nMarca: %s", marca);
        System.out.printf("\nPlaca: %s", placa);
        System.out.printf("\nPreço: R$ %.2f", preco);
    }

}
