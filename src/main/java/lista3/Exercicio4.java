package lista3;

 
import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
      

        @SuppressWarnings("resource")
        Scanner leia = new Scanner(System.in);
        int numeroSecreto;
        System.out.print("\nDiga o número que a outra pessoa deverá adivinhar: ");
        numeroSecreto = leia.nextInt();

        System.out.println("\n\n\n\n\n\nMuito bem, agora a outra pessoa pode tentar adivinhá-lo!");
        int tentativa;
        int contador=1;

        System.out.print("Dê o seu "+contador+"º palpite: ");
        tentativa = leia.nextInt();

        if (tentativa==numeroSecreto){
            System.out.println("UAU! De primeira! Você acertou, era mesmo "+tentativa);
            leia.close();//close caso acerte de primeira     
        }else{//Indicador e proximidade antes do for para o primeiro palpite dado
            if ((numeroSecreto<tentativa) && (tentativa-numeroSecreto)>10){
                System.out.println("Muito alto! Está longe");
            }
            else if((numeroSecreto<tentativa) && (tentativa-numeroSecreto)<=10){
                System.out.println("Um pouco alto, mas está próximo!");
            }

            else if ((numeroSecreto>tentativa) && (numeroSecreto-tentativa)>10){
                System.out.println("Muito baixo! Está longe");
            }
            else if((numeroSecreto>tentativa) && (numeroSecreto-tentativa)<=10){
                System.out.println("Um pouco abaixo, mas está próximo!");
            }
            //Repetidor:
            for (contador=2; tentativa!=numeroSecreto; contador++){            
                System.out.print("Dê o seu "+contador+"º palpite: ");
                tentativa = leia.nextInt();
                
                // Aproximadores:
                if ((numeroSecreto<tentativa) && (tentativa-numeroSecreto)>10){
                    System.out.println("Muito alto! Está longe");
                }
                else if((numeroSecreto<tentativa) && (tentativa-numeroSecreto)<=10){
                    System.out.println("Um pouco alto, mas está próximo!");
                }

                else if ((numeroSecreto>tentativa) && (numeroSecreto-tentativa)>10){
                    System.out.println("Muito baixo! Está longe");
                }
                else if((numeroSecreto>tentativa) && (numeroSecreto-tentativa)<=10){
                    System.out.println("Um pouco abaixo, mas está próximo!");
                }            
            }
        }
        leia.close();   
        if(contador>1){
        contador--;
        System.out.println("\nParabéns você acertou, era mesmo "+tentativa+"\nVoce acertou em "+contador+" tentativas.");
        }
    leia.close(); 
    }
}