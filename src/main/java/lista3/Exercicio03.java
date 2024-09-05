package lista3;

import java.util.Scanner;

public class Exercicio03 {
    public static void resolucao(){
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite dois números e receberá todos os pares contidos entre eles:");
        System.out.print("Digite o primeiro: ");
        int numero1;
        numero1 = leia.nextInt();

        System.out.print("Digite o segundo: ");
        int numero2;
        numero2 = leia.nextInt();      

        if(numero1<numero2){
            System.out.println("Todos os números pares entre "+numero1+" e "+numero2+" são");
            
            for(int pares=numero1; pares<numero2; pares++){
                if (pares%2==0){
                    System.out.println(pares);
                }
            }
        }
        else if (numero2<numero1){
            System.out.println("Todos os números pares entre "+numero2+" e "+numero1+" são");
            for(int pares=numero2; pares<numero1; pares++){
                if (pares%2==0){
                    System.out.println(pares);
                }
            }
        }
        else if (numero1==numero2){System.out.println("Os números digitados são iguais. \nValor1 = "+numero1+" e Valor 2 = "+numero2);}
        leia.close();
    }
}