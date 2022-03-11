/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author Ibai
 */
public class Vector {
    
    private int valor;
    
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    public void Visualizar(int i, final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
    
}
