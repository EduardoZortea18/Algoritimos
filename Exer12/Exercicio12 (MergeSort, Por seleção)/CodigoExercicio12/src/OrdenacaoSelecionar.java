public class OrdenacaoSelecionar<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    @Override
    public void ordenar() {
        int i;
        int j;
        T[] info = getInfo();
        int n = info.length;

        for (i = n - 1; i >= 1; i--) {

            int idxMaiorValor = 0;

            for (j = 0; j < j - 1; j++) {
                if ((info[j].compareTo(info[idxMaiorValor])) > 0) {
                    idxMaiorValor = j;
                }
            }
            trocar(idxMaiorValor, i);
        }
    }
}
