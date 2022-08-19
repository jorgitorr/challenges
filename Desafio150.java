package desafios;

import java.util.Scanner;

public class Desafio150 {
    /*
     * 1. introduce el número de lineas del hexagono
     *  a. si el número es diferente a 0 sigue sin cambios
     *  b. si es cero no se metera en el for
     * 3. introduce el caracter
     *  a. si el caracter es 0 revisara el num y si también es 0 termina
     *  b. sino imprimirá el hexagono
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLineas, numEspacios, numCaracteres;
        String caracter;

        numLineas = sc.nextInt();
        sc.nextLine();
        caracter = sc.nextLine();

        while(numLineas!=0 || caracter.charAt(0)!='0'){
            /*
             * le asignamomos a las variables para
             * el numEspacios y de caracteres
             * el mismo valor que el num de lineas
             */
            numEspacios = numLineas;
            numCaracteres = numLineas;

            /*
             * ciclo para numLineas
             */

            for (int i = 0; i < numLineas; i++) {
                for (int j = 0; j < numEspacios-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < numCaracteres; j++) {
                    System.out.print(caracter + "");
                }
                System.out.println();
                numCaracteres+=2;
                numEspacios--;
            }
            /*
             * ciclo para lineas de abajo
             * al iniciar el bucle:
             * numEspacios = 0
             * numCaracteres =  max antes asignado
             * por lo tanto
             * numEspacios hay que aumentarlo
             * numCaracteres hay que disminuirlo
             *
             * numCaracteres-=4 para que
             * se le resten los 2 ultimos sumados
             * y los dos del mismo final
             */
            numCaracteres-=4;
            for (int i = 0; i < numLineas-1; i++) {
                for (int j = 0; j < numEspacios+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < numCaracteres; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
                numEspacios++;
                numCaracteres-=2;
            }
            numLineas = sc.nextInt();
            sc.nextLine();
            caracter = sc.nextLine();
        }

    }
}
