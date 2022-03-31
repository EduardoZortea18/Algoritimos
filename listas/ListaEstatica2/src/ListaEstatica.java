public class ListaEstatica<ClasseParametrizada> {
    private ClasseParametrizada[] info;
    private Integer tamanho;

    public ListaEstatica(){
        this.info = (ClasseParametrizada[])new Object[10];
        this.tamanho = 0;
    }

    public void inserir(ClasseParametrizada valor){
        if (tamanho >=info.length){
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i < tamanho; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(ClasseParametrizada valor){
        for (int i =0; i < tamanho; i++){
            if (info[i] == valor){
                return i;
            }
        }

        return -1;
    }

    public void retirar(ClasseParametrizada valor){
        int position = buscar(valor);

        if (position != -1){
            for (int i = position; i < tamanho; i++){
                info[i] = info[i + 1];
            }

            tamanho--;
            
            info[tamanho] = null;
        }
    }

    public void liberar(){
        info = ((ClasseParametrizada[])new Object[10]);
        tamanho = 0;
    }

    public ClasseParametrizada obterElemento(Integer posicao) throws IndexOutOfBoundsException{
        if (posicao < 0 || posicao > tamanho){
            throw new IndexOutOfBoundsException("Posição não existe.");
        }

        return info[posicao];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void inverter(){
        int esquerda = 0;
        int direita = tamanho - 1;
        
        int qtdeTrocas = tamanho / 2;
        
        ClasseParametrizada item;
        
       while(qtdeTrocas > 0) {
    	   item = info[esquerda];
    	   info[esquerda] = info[direita];
    	   info[direita] = item;
    	   
    	   esquerda++;
    	   direita--;
    	   qtdeTrocas--;
       }
    }
    
    @Override
    public String toString() {
        String lista = "";

        for (int i = 0; i < tamanho; i++){
            lista += info[i] + ", ";
        }

        lista = lista.substring(0, lista.length() - 1);
        return lista;
    }

    private void redimensionar(){
        ClasseParametrizada[] newInfo = ((ClasseParametrizada[])new Object[info.length + 10]);

        for (int i = 0; i < info.length; i++){
            newInfo[i] = info[i];
        }

        info = newInfo;
    }
}
