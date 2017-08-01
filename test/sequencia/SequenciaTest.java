/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sequencia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camila
 */
public class SequenciaTest {
    
    Sequencia teste = new Sequencia();

    @Test
    public void testClasseValida11() {
        int[][] saida = {{1, 2, 3}, {6, 7, 8, 9}, {22}};
        int[] entrada = {1, 2, 3, 6, 7, 8, 9, 22};
        assertArrayEquals(saida, teste.intervalo(entrada));
    }
    
    @Test
    public void testClasseValida2() {
        int[] entrada = {};
        assertArrayEquals(entrada, teste.intervalo(entrada));
    }
    
}
