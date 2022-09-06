public class Complejidad1 {

    public static double sumar(double num){
        long timepo_inicial, timepo_final, tiempo_ejecucion;
        timepo_inicial = System.currentTimeMillis();
        double suma = 0;
        for ( int x =1; x< num+1; x++)
             suma += x;
        timepo_final = System.currentTimeMillis();
        tiempo_ejecucion = timepo_final - timepo_inicial;
        System.out.println("tiempo de ejecucion: " + tiempo_ejecucion);
        return suma;
    }

    public static void main(String[] args){
        System.out.println(Complejidad1.sumar(1000000000));

    }
}


