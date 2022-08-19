package desafios;

import java.util.Scanner;

public class Desafio149 {
    /**
     * 1. entrada con el número de toros que van a participar
     * 2. entero por cada uno de los toros
     * 3. devuelve el mayor valor
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toros, velocidadToro, mayor = 0; //mayor = velocidad corredor

        toros = sc.nextInt();

        while(toros>=1){
            mayor = 0;
            for (int i = 0; i < toros; i++) {
                velocidadToro = sc.nextInt();
                if(velocidadToro > mayor){
                    mayor = velocidadToro;
                }
            }
            System.out.println(mayor);
            toros = sc.nextInt();
        }
    }
}
