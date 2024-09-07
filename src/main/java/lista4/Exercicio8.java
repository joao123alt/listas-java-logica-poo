package lista4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Exercicio8 {
    
     
        public static void resolucao4()throws InterruptedException {
            
        ArrayList<String> listaProdutos = new ArrayList<>();
        ArrayList<Double> listaPrecos = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
    
        int opcao = 0;
    
        while (opcao != 3) {
                
        System.out.println("\n****** Lista de Compras ******");
        System.out.println("1. Inserir itens");
        System.out.println("2. Ver a lista de compras");
        System.out.println("3. Remover item");
        System.out.println("4- Para ordenar os itens por preço");
        System.out.println("5. Sair");

        System.out.print("Escolha a opção:");
                
        opcao = scanner.nextInt();
                scanner.nextLine(); 
                scanner.nextDouble(); 

    
                 switch (opcao) {
                    case 1:
                       
                        System.out.print("Digite o nome do item:");
                        String item = scanner.nextLine();
                        System.out.print("Digite o preço do item:");
                        Double preco = scanner.nextDouble();
                        listaProdutos.add(item);
                        listaPrecos.add(preco);
                        System.out.println("Item '" + item + "' adicionado à lista.");
                        break;
                    
                
                    case 2:
                        
                        System.out.println("\nLista de Compras:");
                        
                        if (listaProdutos.isEmpty()) {
                            
                            System.out.println("A lista está vazia.");
                        
                        } else {
                            for (int i = 0; i < listaProdutos.size(); i++) {
                                
                                System.out.println((i + 1) + ". " + listaProdutos.get(i) + " R$ " + listaPrecos.get(i) );
                            }
                        }
                        break;
                    
                        
                        case 3:
                    
                        if (listaProdutos.isEmpty()) {
                            System.out.println("A lista está vazia. Não há o que remover.");
                        } else {
                            System.out.println("Digite o número do item para remove-lo:");
                            
                            for (int i = 0; i < listaProdutos.size(); i++) {
                                System.out.println((i + 1) + ". " + listaProdutos.get(i));
                            }
                            
                            int itemRemover = scanner.nextInt();
                            
                            if (itemRemover > 0 && itemRemover <= listaProdutos.size()) {
                                String removido = listaProdutos.remove(itemRemover - 1);
                                System.out.println("Item '" + removido + "' removido da lista.");
                            } else {
                                System.out.println("Número inválido.");
                            }
                        }
                        break;
                    
                        case 4:
                        if (listaProdutos.isEmpty()) {
                            System.out.println("\nA lista está vazia.\n");
                        } else {
                            ArrayList<Integer> indicesOrdenados = new ArrayList<>();
                            for (int i = 0; i < listaPrecos.size(); i++) {
                                indicesOrdenados.add(i);
                            }
                            
                            indicesOrdenados.sort(new Comparator<Integer>() {
                                public int compare(Integer i1, Integer i2) {
                                    return Double.compare(listaPrecos.get(i1), listaPrecos.get(i2));
                                }

                            });
                            
                            System.out.println("\nLista de Compras Ordenada por Preço:");
                            for (int i : indicesOrdenados) {
                                System.out.println((i + 1) + ". " + listaProdutos.get(i) + " R$ " + String.format("%.2f", listaPrecos.get(i)));
                            }
                        }
                        break;
                    
                        
                        case 5:
                    
                        System.out.println("Saindo...");
                        break;
                        default:
                        
                        System.out.println("Opção inválida, tente novamente.");
                }
            }
    
            scanner.close();
        }
    }
  
