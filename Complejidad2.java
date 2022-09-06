
public class Complejidad2 {
    private static double time;
    private double n;
    public static double sumal(double n){
        double tiempo_inicial = time;
        double suma = (n * (n + 1)) / 2;
        double tiempo_final = time;
        double tiempo_ejecucion = tiempo_final - tiempo_inicial;
        System.out.println("el tiempo de jecucion es: " + tiempo_ejecucion);
        return suma;

    }
    public static void main(String[] args){
        System.out.println(Complejidad2.sumal(1000000000));

    }

}
