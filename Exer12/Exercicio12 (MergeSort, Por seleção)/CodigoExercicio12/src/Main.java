public class Main {
    public static void main(String[] args) {


//        OrdenacaoQuickSort ordenacaoQuickSort = new OrdenacaoQuickSort();
        Object [] info = new Object[4];
        info[0] = 10 ;
        info[3] = 20 ;
        info[2] = 30 ;
        info[1] = 40 ;
//        ordenacaoQuickSort.setInfo(info);
//        ordenacaoQuickSort.ordenar();

        OrdenacaoBolha ordenacaoBolha = new OrdenacaoBolha();
//        ordenacaoBolha.setInfo(info);
        ordenacaoBolha.ordenar();
    }

    private static void ToString(Object[] info) {
        for (int i = 0; i < info.length; i++) {
            System.out.print(info[i] + ", ");
        }
    }

}
