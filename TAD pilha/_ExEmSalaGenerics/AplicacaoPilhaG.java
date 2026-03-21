import java.util.Scanner;
import java.util.InputMismatchException;

public class AplicacaoPilhaG {
    public static void main(String []args) {
        
        Pilha <Integer> minhaPilha = null;
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int elemento;
        
        do {
            try {
                System.out.println("\n1 - Criar pilha");
                System.out.println("2 - Empilhar");
                System.out.println("3 - Desempilhar");
                System.out.println("4 - Ver topo");
                System.out.println("5 - Exibir pilha (debug)");
                System.out.println("6 - Sair");
                System.out.println();
                System.out.print("Digite uma opção [1 a 6]: ");
                opcao = sc.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println("Digite o tamanho máximo da pilha");
                        minhaPilha = new Pilha <Integer>(sc.nextInt());
                        break;
                    case 2:
                    /* caso a instância de minhaPilha não tiver sido criada ainda,
                         então, a execução da linha "minhaPilha.empilhar(elemento)" irá gerar e lançar uma exeção de NullPointerException
                    */
                        System.out.print("Digite um dado a ser empilhada: ");
                        elemento = sc.nextInt();
                        minhaPilha.empilhar(elemento);
                        break;
                    case 3:
                    /* caso a instância de minhaPilha não tiver sido criada ainda,
                     então, a execuçao da linha "minhaPilha.desempilhar()" irá gerar e lançar uma exeção de NullPointerException
                    */
                        elemento = minhaPilha.desempilhar();
                        System.out.print("Elemento desempilhado = " + elemento);
                        break;   
                    case 4:
                    /* caso a instância de minhaPilha não tiver sido criada ainda,
                    então, a linha "minhaPilha.verTopo()" irá gerar e lançar uma exeção de NullPointerException
                    */
                        elemento = minhaPilha.verTopo();
                        System.out.println("Topo da pilha = " + elemento);
                        break;
                    case 5:
                    /* caso a instância de minhaPilha não tiver sido criada ainda,
                    * então, a linha minhaPilha.exibirPilha() irá gerar uma exeção de NullPointerException
                   */
                        minhaPilha.exibirPilha();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            
            } catch(NullPointerException e) {
                System.out.println("Opção inválida. Pilha inexistente. Crie primeiro uma pilha");
            } catch(InputMismatchException e) {
                System.out.println("Digite um dado válido");
            } catch(ExcecaoPilhaVazia e) {
                System.out.println(e);
            } catch(ExcecaoPilhaCheia e) {
                System.out.println(e);
            } 
        } while (opcao != 6);
    System.out.println("Tchau!!");
    }
}