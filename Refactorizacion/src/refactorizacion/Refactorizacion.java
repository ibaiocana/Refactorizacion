package refactorizacion;

public class Refactorizacion {
    public static void main(String[] args) {
        
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        Prueba p = new Prueba();
        p.valor = 10;
        p.modificar(v, 0);
        p.borrar(v, 0);
        p.insertar(v, 0);
    }

        
    
}
