package brunagarciadelfino.avaliacaocontinuada02.dominios;


public class ListaObj <T> {

    private T[] vetor;
    private int numeroElemento;

    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho];
        numeroElemento = 0;
    }

// adiciona itens a lista

    public boolean adiciona(T valor) {
        if (numeroElemento >= vetor.length) {
            System.out.println("Lista está cheia");
            return false;
        }
        else {
            vetor[numeroElemento++] = valor;
            return true;
        }
    }

    // exibe itens da lista
    public void exibe() {
        if (numeroElemento == 0) {
            System.out.println("\n A lista está vazia");
            return;
        }
        System.out.println("\n Exibindo todos elementos da lista:");
        for (int i = 0; i< numeroElemento; i++) {
            System.out.println(vetor[i] + "\t");
        }
        System.out.println();
    }

    // busca item da lista
    public int busca(T valor) {
        for (int i = 0; i < numeroElemento; i++) {
            if (vetor[i].equals(valor))
                return i;
        }
        return -1;
    }

    // remove pelo indice
    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= numeroElemento)
            return false;
        for (int i = indice; i < numeroElemento -1; i++)
            vetor[i] = vetor[i+1];
        numeroElemento--;
        return true;
    }

    // remove elemento
    public boolean removeElemento(T valor) {
        return removePeloIndice(busca(valor));
    }


    public int getTamanho() {
        return numeroElemento;
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= numeroElemento)
            return null;
        return vetor[indice];
    }

    // limpa os elementos
    public void limpa() {
        numeroElemento = 0;
    }

}
