public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    // GASTA MUITA MEMORIA
    // SE MEMORIA FOR UM PROBLEMA -> QUICKSORT
    // SE MEMORIA NAO FOR UM PROBLEMA -> MERGESORT

    @Override
    public void ordenar() {
        T[] info = getInfo();
        mergeSort(0, info.length-1);
    }

    public void mergeSort(int inicio, int fim) {
        merge(inicio, fim, inicio/fim);
    }

    public void merge(int inicio, int fim, int meio) {
        T[] info = getInfo();

        int tamEsquerda = meio-inicio-1;
        T[] esquerda = (T[]) new Comparable[tamEsquerda];

        for (int i = 0; i <  tamEsquerda; i++) {
            esquerda[i] = info[i];
        }

        int tamDireita = fim-meio;
        T[] direita = (T[]) new Comparable[tamDireita];
        for (int i = 0; i <  tamDireita; i++) {
            direita[i] = info[i+meio+1];
        }

        int cEsq = 0;
        int cDir = 0;

        int i;
        for (i = inicio; i <= fim; i++) {
            if (cEsq < tamEsquerda && cDir < tamDireita) {
                if (esquerda[cEsq].compareTo(direita[cDir]) < 0) {
                    info[i] = esquerda[cEsq];
                    cEsq++;
                } else {
                    info[i] = direita[cDir];
                    cDir++;
                }
            } else {
                break;
            }
        }

        while (cEsq < tamEsquerda) {
            info[i] = esquerda[cEsq];
            cEsq++;
            i++;
        }

        while (cDir < tamDireita) {
            info[i] = direita[cDir];
            cDir++;
            i++;
        }
    }
}
