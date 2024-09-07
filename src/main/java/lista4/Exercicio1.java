package lista4;

import java.util.Scanner;

public class Exercicio1 {
        
    public static void resolucao4()throws InterruptedException {
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Número de vendas do dia: ");
            int numeroVendas = scanner.nextInt();
    
            double vendas[] = new double [numeroVendas];
            double totalVendas = 0;
    
            for (int i = 0; i < numeroVendas; i++) {
                System.out.println("Digite o valor da venda " + (i + 1) + ":");
                vendas[i] = scanner.nextDouble();
            }
            
            for (double venda : vendas) {
                totalVendas += venda;
            }
            System.out.println("Total das vendas do dia: R$" + totalVendas);

            scanner.close();
        }
}