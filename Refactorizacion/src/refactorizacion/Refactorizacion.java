package refactorizacion;

public class Refactorizacion {
    public static void main(String[] args) {
        
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        CambiaLongitud p = new CambiaLongitud();
        p.setValor(10);
        p.modificar(v, 0, 1);
        p.borrar(v, 0, 1);
        p.insertar(v, 0, 1);
    }

        
    
}
