import entities.Carro;
import entities.Moto;
import entities.Caminhao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
            }

            if (opcao == 2){
                System.out.println("Cilindradas: ");
                int cilindradas = input.nextInt();
            }

            if (opcao == 3){
                System.out.println("Capacidade de carga: ");
                double numPortas = input.nextDouble();
            }

            System.out.println("\n\nContinuar? (S/N) ");
            String continuar = input.next();
            if (continuar.equals("n")){
                break;
            }
        }
    }
}