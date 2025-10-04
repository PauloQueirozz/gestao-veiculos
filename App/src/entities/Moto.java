package entities;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String placa, double preco, int cilindradas) {
        super(marca, placa, preco);
        this.cilindradas = cilindradas;
    }

    public void mostrarDados(boolean mostrarCilindradas) {
        super.mostrarDados();
        if (mostrarCilindradas){
            System.out.printf("\nCilindradas: %d", cilindradas);
        }
    }
}
