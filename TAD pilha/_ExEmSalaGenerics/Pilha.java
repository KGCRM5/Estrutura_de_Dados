public class Pilha <T>
{
    private T [] p;
    private int topo;
    
    Pilha(int tamanho) {
        this.p = (T[]) new Object[tamanho];
        this.topo = -1;
    }
    
    public boolean empilhar(T valor) throws ExcecaoPilhaCheia {
        if(this.pilhaCheia())
            throw new ExcecaoPilhaCheia("Pilha cheia. Não foi possível realizar a operação!");
        this.p[++this.topo] = valor;
        return true;
        
    }
    public T desempilhar() throws ExcecaoPilhaVazia {
        if(this.pilhaVazia())
            throw new ExcecaoPilhaVazia("Pilha vazia. Não foi possível realizar a operação!");
        return this.p[this.topo--];
    }
    public T verTopo() throws ExcecaoPilhaVazia {
        if(this.pilhaVazia())
            throw new ExcecaoPilhaVazia("Pilha vazia. Não foi possível realizar a operação!");
        return this.p[this.topo];
        
    }
    
    public void exibirPilha() {
        for(int i = this.topo; i >= 0; i--)
            System.out.println(this.p[i]);
    }
    
    private boolean pilhaVazia() {
        if(this.topo == -1)
            return true;
        return false;
    }
    
    private boolean pilhaCheia() {
        if(this.topo == this.p.length-1)
            return true;
        return false;
    }
    
}