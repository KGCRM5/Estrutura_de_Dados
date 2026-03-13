public class Fila {
    int []f;
    int inicio;
    int fim;
    int qtd_elementos;

    Fila(int tamanho) {
        f = new int[tamanho];
        inicio = -1;
        qtd_elementos = 0;
    }
    Fila() {
        f = new int[500];
        inicio = 0;
        fim = -1;
        qtd_elementos = 0;
    }
    boolean inserir(int elemento) {
        if(!this.filaCheia()) {
            this.fim = (this.fim + 1) % this.f.length;
            this.f[this.fim] = elemento;
            qtd_elementos++;
            return true;
        }
        return false;
    }
    int remover() {
        int valor;
        if(!this.filaCheia()) {
            valor = this.f[this.inicio];
            this.inicio = (this.inicio + 1) % this.f.length;
            qtd_elementos--;
            return valor;
        }
        return -1; //Fila vazia. Código de erro
    }
    int verInicio() {
        if(!this.filaVazia())
            return this.f[this.inicio];
        return -1;
    }
    void verFila() {

    }
    private boolean filaCheia() {
        if(this.qtd_elementos == this.f.length)
            return true;
        return false;
    }
    private boolean filaVazia() {
        if(this.qtd_elementos == 0)
            return true;
        return false;
    }
}