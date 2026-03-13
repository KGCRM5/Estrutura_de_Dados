package _AFilaSequencialGenerica;

public class FilaSequencial <T>{
	// Constante e Atributos Privados
	private static int TAM_DEFAULT = 100;
	private int inicio, fim;
	private T e[ ];
	// Métodos públicos
	public FilaSequencial(int tamanho) {// construtor 1 (com tamanho)
		  this.inicio = this.fim = 0;
		  e = (T[]) new Object[tamanho];
	}
	
	public FilaSequencial() {  // construtor 2 (sem parâmetros).
		this(TAM_DEFAULT);
	}

	// verifica se a fila está vazia
	public boolean qIsEmpty() {
		return (this.inicio == this.fim);	
	}
	
	// Verifica se a fila está cheia
    public boolean qIsFull() {
    	return (this.fim == TAM_DEFAULT);
    }
    // insere um elemento no final da fila
	public void enqueue(T e) throws Exception {
		if (! qIsFull( )){
			    this.e[this.fim++] = e;
		}
		else 
			throw new Exception("Oveflow - Estouro de Fila");	
	}

	// remove um elemento do final da fila
    public T dequeue() throws Exception {
    	  if (! qIsEmpty( )){
    		  return this.e[ this.inicio++];
    	  }else{
    		  throw new Exception("underflow - Esvaziamento de Fila");
    	  }
    }
   

    // retorna quem está no início da fila
    // caso a fila não esteja vazia
	public T front() throws Exception {
		if (! qIsEmpty())
			return e[inicio];
		else{
			throw new Exception("underflow - Esvaziamento de Fila");
		}			
	}

	// retorna quem está no final da fila caso ela não esteja vazia
	public T rear() throws Exception {
		if (! qIsEmpty()){
			  int pfinal = this.fim - 1;
			  return this.e[pfinal];
		}else{
			 throw new Exception("underflow - Esvaziamento de Fila");
		}			
	}
	

	// Retorna o total de elementos da fila
	public	int totalElementos(){
		if (!qIsEmpty()) return this.fim - this.inicio;
		else return 0;

	}
}
