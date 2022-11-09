package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.Quick;
import main.Bubble;
import main.Isertion;
import main.Selection;

import imp.BubbleSort;
import imp.InsertionSort;
import imp.SelectionSort;
import imp.QuickSort;
import org.junit.Test;
import main.Menu;


public class test {
    Menu menu;

    @Test
    public void testInsertion() {
        menu = new Isertion();
        assertTrue(menu.getOrdena() instanceof InsertionSort);
        int[] aux = {22,17,10 ,1, 4};
        int[] numeros = menu.Ordena(aux);
        assertEquals(numeros[0], 1);
        assertEquals(numeros[1], 4);
        assertEquals(numeros[2], 10);
        assertEquals(numeros[3], 17);
        assertEquals(numeros[4], 22);
    }

    @Test
    public void testBubble() {
        menu = new Bubble();
        assertTrue(menu.getOrdena() instanceof BubbleSort);
        int[] aux = {22,17,10 ,1, 4};
        int[] numeros = menu.Ordena(aux);
        assertEquals(numeros[0], 1);
        assertEquals(numeros[1], 4);
        assertEquals(numeros[2], 10);
        assertEquals(numeros[3], 17);
        assertEquals(numeros[4], 22);
    }

    @Test
    public void testSelection() {
        menu = new Selection();
        assertTrue(menu.getOrdena() instanceof SelectionSort);
        int[] aux = {22,17,10 ,1, 4};
        int[] numeros = menu.Ordena(aux);
        assertEquals(numeros[0], 1);
        assertEquals(numeros[1], 4);
        assertEquals(numeros[2], 10);
        assertEquals(numeros[3], 17);
        assertEquals(numeros[4], 22);
    }

    @Test
    public void testQuick() {
        menu = new Quick();
        assertTrue(menu.getOrdena() instanceof QuickSort);
        int[] aux = {22,17,10 ,1, 4};
        int[] numeros = menu.Ordena(aux);
        assertEquals(numeros[0], 1);
        assertEquals(numeros[1], 4);
        assertEquals(numeros[2], 10);
        assertEquals(numeros[3], 17);
        assertEquals(numeros[4], 22);
    }
}
