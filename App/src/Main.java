import entities.Veiculo;
import entities.Carro;
import entities.Moto;
import entities.Caminhao;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        while (true){
            System.out.println("\n====================SISTEMA DE GESTÃO VEICULAR====================");

            System.out.println("1 - Cadastrar carro \n2 - Cadastrar moto \n3 - Cadastrar caminhão");
            int opcao = input.nextInt();
            input.nextLine();

            System.out.println("Marca: ");
            String marca = input.nextLine();

            System.out.println("Placa: ");
            String placa = input.nextLine();

            System.out.println("Preço: ");
            double preco = input.nextDouble();

            if (opcao == 1){
                System.out.println("Número de portas: ");
                int numPortas = input.nextInt();

                Carro carro = new Carro(marca, placa, preco, numPortas);
                listaVeiculos.add(carro);
            }

            else if (opcao == 2){
                System.out.println("Cilindradas: ");
                int cilindradas = input.nextInt();

                Moto moto = new Moto(marca, placa, preco, cilindradas);
                listaVeiculos.add(moto);
            }

            else if (opcao == 3){
                System.out.println("Capacidade de carga (kg): ");
                double capacidadeCarga = input.nextDouble();

                Caminhao caminhao = new Caminhao(marca, placa, preco, capacidadeCarga);
                listaVeiculos.add(caminhao);
            }

            System.out.println("\nContinuar? (S/N) ");
            String continuar = input.next();
            if (continuar.equals("n")){
                System.out.println("==========Veículos Cadastrados==========");
                for  (Veiculo veiculo : listaVeiculos) {
                    veiculo.mostrarDados();
                }
                break;
            }
        }
    }
}