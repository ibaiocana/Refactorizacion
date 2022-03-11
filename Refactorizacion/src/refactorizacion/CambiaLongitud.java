package refactorizacion;

public class CambiaLongitud {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    private int valor;
        //metodo que modifica el contenido de la posicion p de un array con el valor pasado

        public void modificar(int[] vector, int LongitudActual, int posicion) {
            int i;
            
            //Mostramos los elementos del array
            System.out.print("v={");
            final int longitud = vector.length;
            
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
            
            //Modificamos el array
            if (posicion < longitud) {
                //mostramos su contenido
                System.out.println("Elemento a modificar=" + vector[posicion]);
                vector[posicion] = this.getValor();
            }
            
            //Mostramos los elementos del array
            Visualizar(i, longitud, vector);
        }
    
    public void borrar(int[] vector, int LongitudActual, int posicion) {
        int i;
        //mostramos su contenido
        
        //Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        
        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }
        
        //Mostramos los elementos del array
        Visualizar(i, longitud, vector);
    }

    public void insertar(int[] vector, int LongitudActual, int posicion) {
        int i;
        //mostramos su contenido
        
        //Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        
        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }
        
        Visualizar(i, longitud, vector);
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

