package desafios;

import java.util.Scanner;

public class Desafio151 {
    /*
        1. num de filas
        2. ciclo (num filas)
            a. pide los elementos de la matriz
        3. se comprueba si la matriz es identidad
        mirando que con un for de filas
        y otro de columnas para revisar la
        consecución de las filas y las columnas
        de forma independientes
            a. si hay otro numero = NO
            b. si es = se conserva el true
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean identidad;
        int filas, espacios = 0;
        String matriz;

        filas = sc.nextInt();
        sc.nextLine();

        while(filas>0 && filas<50){
            identidad = true;
            for (int i = 0; i < filas; i++) {
                matriz = sc.nextLine();
                if(matriz.charAt(i+espacios)!='1'){
                    identidad = false;
                }
                espacios++;
                /*
                  le pongo aquí el valor de 1 porque si lo pongo antes no tiene
                  en cuenta la primera posición y no la compara, al añadirselo
                  después se añade la distancia entre los números y el espacio
                */
            }
            if(identidad)
                System.out.println("SI");
            else
                System.out.println("NO");

            filas = sc.nextInt();
            sc.nextLine();
            espacios = 0;
        }



    }
}
