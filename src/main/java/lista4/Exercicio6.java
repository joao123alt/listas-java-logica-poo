package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

    public static void resolucao4()throws InterruptedException {
        
    ArrayList<String> listaCompras = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;

    while (opcao != 3) {
            
    System.out.println("\n****** Lista de Compras ******");
    System.out.println("1. Inserir itens");
    System.out.println("2. Ver a lista de compras");
    System.out.println("3. Remover item");
    System.out.println("4. Sair");
    System.out.print("Escolha a opção:");
            
    opcao = scanner.nextInt();
            scanner.nextLine(); 

             switch (opcao) {
                case 1:
                   
                    System.out.print("Digite o nome do item:");
                    String item = scanner.nextLine();
                    listaCompras.add(item);
                    System.out.println("Item '" + item + "' adicionado à lista.");
                    break;
                
            
                case 2:
                    
                    System.out.println("\nLista de Compras:");
                    
                    if (listaCompras.isEmpty()) {
                        
                        System.out.println("A lista está vazia.");
                    
                    } else {
                        for (int i = 0; i < listaCompras.size(); i++) {
                            
                            System.out.println((i + 1) + ". " + listaCompras.get(i));
                        }
                    }
                    break;
                
                    
                    case 3:
                
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista está vazia. Não há o que remover.");
                    } else {
                        System.out.println("Digite o número do item para remove-lo:");
                        
                        for (int i = 0; i < listaCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaCompras.get(i));
                        }
                        
                        int itemRemover = scanner.nextInt();
                        
                        if (itemRemover > 0 && itemRemover <= listaCompras.size()) {
                            String removido = listaCompras.remove(itemRemover - 1);
                            System.out.println("Item '" + removido + "' removido da lista.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                
                    
                    
                    case 4:
                
                    System.out.println("Saindo...");
                    break;
                    default:
                    
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}