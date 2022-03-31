/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import listaestatica.lista1.ListaEstatica;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ezortea
 */
public class ListaEstaticaTests {
    
    @Test
    public void Should_Insert_New_List_Items(){
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(list.toString(), "5,10,15,20");
    }
}
