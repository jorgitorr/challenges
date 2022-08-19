package desafios;

import java.util.Scanner;

public class Desafio245 {
    /**
     * 1 num personas de la linea
     * altura de cada persona
     * la entrada termina con una entrada sin personas que no se deberá procesar
     *
     * 1. num personas
     *  a. si es mayor de 0 sigue
     *  b. sino sale
     * 2. altura de todas las personas
     *  a. guardar la altura anterior y compararla con la actual
     * 3. comprueba si los numeros son consecutivos
     *  a. si --> DALTON
     *  b. no --> DESCONOCIDOS
     * 4. va al paso 1
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actual, siguiente;
        boolean dalton = true;

        int personas = sc.nextInt();

        while(personas!=0){
            actual = sc.nextInt();
            for (int i = 0; i < personas; i++) {
                siguiente = sc.nextInt();
                if(siguiente<=actual){
                    dalton = false;
                    break;
                }
                actual = siguiente;
            }

            if(dalton)
                System.out.println("DALTON");
            else
                System.out.println("DESCONOCIDO");

            sc.nextLine();
            dalton = true;
            personas = sc.nextInt();
        }

    }
}
