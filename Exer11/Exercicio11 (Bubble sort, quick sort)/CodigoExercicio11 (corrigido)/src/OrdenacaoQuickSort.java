public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    @Override
    public void ordenar() {
        Object[] info = getInfo();

        int n = info.length - 1;
        quickSort(0, n);

        for (int i = 0; i < getInfo().length; i++) {
            System.out.println(info[i]);
        }
    }


    // NAO É PERFORMÁTICO QUANDO O VETOR JÁ ESTA ORGANIZADO DE FORMA DECRESCENTE
    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {
        T[] info = getInfo();
        int a = inicio;
        int b = fim + 1;
        T pivo = info[inicio];

        do {
            do {
                a++;
            } while ((a <= fim) && ((info[a]).compareTo(pivo)) < 0);
            do {
                b--;
            } while ((b >= inicio) && (info[b].compareTo(pivo) > 0));

            if (a >= b) {
                break;
            }

            trocar(a, b);
        } while (true);

        trocar(b, inicio);

        return b;
    }
}
