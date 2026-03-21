class Pilha {
    int []p;
    int topo; // armazena o índice do vetor onde está o elemento do topo da pilha
    
    // construtor
    Pilha(int tamanho) {
        p = new int[tamanho];
        topo = -1; // pilha inicialmente está vazia
    }
    
    Pilha() {
        p = new int[500];
        topo = -1; // pilha inicialmente está vazia
    }
    
    boolean empilhar(int valor) {
        if(!this.pilhaCheia()) {
            this.p[++this.topo] = valor;
            return true;
        }
        return false;
    }
    
    int desempilhar() {
        if(!this.pilhaVazia()) {
            return this.p[this.topo--];
        }
        else
            return -1; // código de erro. Pilha vazia
    }
    
    int mostrarTopo() {
        if(!this.pilhaVazia())
            return this.p[this.topo];
        else
            return -1; // código de erro. Pilha está vazia
    }
    
    private boolean pilhaCheia() {
        if(this.topo == this.p.length -1)
            return true;
        return false;
    }
    
    private boolean pilhaVazia() {
        if(this.topo == -1)
            return true;
        return false;
    }
    
    void mostrarPilha() {
        int indice = this.topo;
        while(indice >= 0)
            IO.println(this.p[indice--]);
    }
}