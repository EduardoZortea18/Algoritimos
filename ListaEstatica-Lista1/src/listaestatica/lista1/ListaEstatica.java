/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestatica.lista1;

/**
 *
 * @author ezortea
 */
public class ListaEstatica {
    private int[] info;

    private int tamanho;
    
    public int getTamanho() {
        return tamanho;
    }
    public ListaEstatica(int[] info, int tamanho) {
        this.tamanho = tamanho;
        this.info = new int[this.tamanho];
    }

    public ListaEstatica() {
        this.tamanho = 0;
        this.info = new int[this.tamanho];
    }
    
    private void redimensionar(){
        int[] newList = new int[this.tamanho + 10];
        this.info = newList;
        this.tamanho = newList.length;
    }
    
    public void inserir(int info){
        if(this.tamanho == this.info.length){
            this.redimensionar();
        }
        
        this.info[this.tamanho] = info;
        this.tamanho += this.tamanho;
    }
    
    public void exibir(){
        for(int i = 0; i <= this.info.length; i++){
            System.out.println(this.info[i]);
        }
    }
    
    public int buscar(int info){
        for(int i = 0; i <= this.info.length; i++){
            if(info == this.info[i]){
                return i;
            }
        }
        
        return -1;
    }
    
    public void retirar(int info){
        int[] newList = new int[tamanho - 1];
        
        for(int i = 0; i <= this.info.length; i++){
            if(info != this.info[i]){
                newList[i] = this.info[i];
            }
        }
        
        this.info = newList;
        this.tamanho = newList.length;
    }
    
    public void liberar() {
        int[] newList = new int[10];
        
        for(int i = 0; i <= newList.length; i++){
            newList[i] = this.info[i];
        }
        
        this.info = newList;
        this.tamanho = newList.length;
    }
    
    public int obterElemento(int posicao){
        if(posicao < this.tamanho || posicao > this.tamanho){
            throw new IndexOutOfBoundsException();
        }
        
        return this.info[posicao];
    }
    
    public boolean estaVazia(){
        return this.info.length == 0;
    }
    
    @Override
    public String toString(){
        String values = "";
        for(int i = 0; i <= this.info.length; i++){
            if(i == this.info.length){
                values += this.info[i];

            }
            values += this.info[i] + ",";
        }
        
        return values;
    }
}
