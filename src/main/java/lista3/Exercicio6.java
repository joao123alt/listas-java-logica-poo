package lista3;

 import java.util.Scanner;
public class Exercicio6 {
    public static void resolucao3()throws InterruptedException{
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de andares desejado:");
    
    int andar = scanner.nextInt();
     for (int i = 1; i <= andar; i++) {
         
        for (int a = 0; a < andar - i; a++) {
            System.out.print(" ");
        }

       
        for (int b = 0; b < (2 * i - 1); b++) {
            System.out.print("*");
        }

        System.out.println();
    }

    scanner.close();
}
}