import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pilha minhaPilha = null;
		Scanner sc = new Scanner(System.in);
		int opcao, valor;
		
		do {
		    IO.println("\n1 - Criar Pilha");
		    IO.println("2 - Empilhar");
		    IO.println("3 - Desempilhar");
		    IO.println("4 - Ver o topo");
		    IO.println("5 - Ver a pilha");
		    IO.println("6 - Sair");
		    IO.print("\nEscolha uma opção: ");
		    opcao = sc.nextInt();
		    switch(opcao) {
		        case 1:
		            IO.print("Informe o tamanho máximo da pilha: ");
		            minhaPilha = new Pilha(sc.nextInt());
		            break;
		        case 2:
		            if(minhaPilha != null) {
		                IO.print("Digite o valor inteiro a ser empilhado: ");
		                    if(!minhaPilha.empilhar(sc.nextInt()))
		                        IO.println("Pilha está cheia. Operação não realizada");
		            }
		            else
		                IO.println("Pilha ainda não foi criada. Operação não realizada");
		           break;
		        case 3:
		            if(minhaPilha != null) {
    		            valor = minhaPilha.desempilhar();
    		            if(valor != -1)
    		                IO.println("Valor desempilhado = " + valor);
    		            else
    		                IO.println("A pilha está vazia. Operação não realiza");
    		            }
    		            else
    		                IO.println("Pilha ainda não foi criada. Operação não realizada");
		            break;
		        case 4:
		            if(minhaPilha != null) {
    		            valor = minhaPilha.mostrarTopo();
    		            if(valor != -1)
    		                IO.println("Valor no topo = "+ valor);
    		            else
    		                IO.println("A pilha está vazia. Operação não realiza");
		            }
		            else
    		            IO.println("Pilha ainda não foi criada. Operação não realizada");
		            break;
		        case 5:
		            if(minhaPilha != null) 
		                minhaPilha.mostrarPilha();
		            else
    		            IO.println("Pilha ainda não foi criada. Operação não realizada");
		            break;
		        case 6:
		            break;
		        default:
		            IO.println("Opção inválida. Tente novamente.");
		    }
		} while(opcao != 6);
	}
}