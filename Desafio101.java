package desafios;

import java.util.Scanner;

public class Desafio101 {
    Scanner sc = new Scanner(System.in);
    /*
    Un cuadrado es diabólico cuando:
        - suma col == suma filas == suma diagonales (CM)

    un diabólico es esotérico cuando:
        - suma esquinas(CM2) = (4 * CM) / n
        - mismas cifras que el número de casillas.

        - Si n es impar:
            a) la suma de las cifras de las cuatro casillas de la mitad
            de los laterales = CM2
            b) casilla central * 4 = CM2
        - Si n es par:
            a) la suma de las dos casillas centrales de cada lateral = 2*CM2
            b) la suma de las cuatra casillas centrales = CM2

       ---------------------------------------------------------
       1. valor de n = (n es el ancho y alto del cuadrado) termina con 0
       2. valores de las celdas
       3. escribe ESOTERICO si es esoterico
          DIABOLICO si es diabolico
          NO para cualquier otro

     */

    public int pideN(){
        int n = sc.nextInt();
        return n;
    }

    public int[][] pideCuadrado(){
        int n = pideN();
        int cuadrado[][] = new int[n][n];
        for (int ancho = 0; ancho < n; ancho++) {
            for (int alto = 0; alto < n; alto++) {
                cuadrado[ancho][alto] = sc.nextInt();
            }
        }
        return cuadrado;

    }

    public boolean cuadradoDiabolico(int cuadrado[][]){
        boolean diabolico = false;
        int sumaFilas = 0, sumaCol = 0, sumaDiagonales = 0;
        //la diagonal está mal
        for (int ancho = 0; ancho < cuadrado.length; ancho++) {
            for (int alto = 0; alto < cuadrado.length; alto++) {
                sumaFilas += cuadrado[ancho][alto];
                sumaCol += cuadrado[alto][ancho];
            }
            //las diagonales están mal en el enunciado()
            int diagonalesFinales = (cuadrado.length-1)-ancho;

            sumaDiagonales += cuadrado[ancho][ancho];
            sumaDiagonales += cuadrado[diagonalesFinales][diagonalesFinales];
        }

        if(sumaFilas == sumaCol){
            diabolico = true;
        }
        return diabolico;
    }

    public int devuelveCM(int [][]cuadrado){
        int CM = 0;
        for (int ancho = 0; ancho < cuadrado.length; ancho++) {
            CM += cuadrado[0][ancho];
        }
        return CM;
    }

    public int devuelveCM2(int [][] cuadrado){
        int CM2;
        CM2 = (devuelveCM(cuadrado) * 4)/cuadrado.length;
        return CM2;
    }

    /**
     * @param "cálculo de una parte del ejercicio 2 para sacar esotéricos"
     * @return la suma de las esquinas
     */
    public int devuelveSumaEsquinas(int[][]cuadrado){
        int sumaEsquinas = 0;
        sumaEsquinas += cuadrado[0][0] + cuadrado[0][cuadrado.length-1] + cuadrado[cuadrado.length-1][0]
                + cuadrado[cuadrado.length-1][cuadrado.length-1];
        return sumaEsquinas;
    }

    public boolean devuelvePasoDos(int cuadrado[][]){
        boolean pasoDos = false;

        if(devuelveSumaEsquinas(cuadrado) == devuelveCM2(cuadrado)){
            pasoDos = true;
        }
        return pasoDos;
    }

    /**
     *
     * @param "le paso un boolean para saber si es " diabolico
     * @param "le paso la matriz del " cuadrado
     */
    public void esEsoterico(boolean diabolico, int cuadrado[][]){
        if(diabolico){
            if(devuelvePasoDos(cuadrado)){
                if(cuadrado.length%2==0){
                    if(esPar(cuadrado)){
                        System.out.println("ESOTERICO");
                    }else{
                        System.out.println("DIABOLICO");
                    }
                }else{
                    if(esImpar(cuadrado)){
                        System.out.println("ESOTERICO");
                    }else{
                        System.out.println("DIABOLICO");
                    }
                }
            }else{
                System.out.println("DIABOLICO");
            }
        }else{
            System.out.println("NO");
        }
    }



    public boolean esPar(int[][]cuadrado){
        //está sin terminar
        int sumaCasillasCentrales = 0;
        boolean esPar = false;
        //no se sale bien porque no se si estará bien el ejemplo
        sumaCasillasCentrales += cuadrado[cuadrado.length/2][0] + cuadrado[(cuadrado.length/2)-1][0];
        sumaCasillasCentrales += cuadrado[0][cuadrado.length/2] + cuadrado[0][(cuadrado.length/2)-1];
        sumaCasillasCentrales += cuadrado[cuadrado.length/2+1][cuadrado.length/2] + cuadrado[cuadrado.length/2+1][cuadrado.length/2-1];
        sumaCasillasCentrales += cuadrado[cuadrado.length/2+1][cuadrado.length/2-1] + cuadrado[cuadrado.length/2+1][cuadrado.length/2];

        if(sumaCasillasCentrales == 2*(devuelveCM2(cuadrado))){
            esPar = true;
        }
        return esPar;
    }

    public boolean esImpar(int[][]cuadrado){
        int sumaMitadLaterales = 0;
        boolean esImpar = false;

        if(cuadrado.length<=3){
            sumaMitadLaterales += cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        }else{
            sumaMitadLaterales += cuadrado[(cuadrado.length-1)/2][0];
            sumaMitadLaterales += cuadrado[0][(cuadrado.length-1)/2];
            sumaMitadLaterales += cuadrado[(cuadrado.length-1)][(cuadrado.length)-1/2];
            sumaMitadLaterales += cuadrado[(cuadrado.length-1)/2][(cuadrado.length)-1];
        }

        if(sumaMitadLaterales == devuelveCM(cuadrado)){
            if((cuadrado[cuadrado.length/2][cuadrado.length/2])*4==devuelveCM2(cuadrado)){
                esImpar = true;
            }
        }
        return esImpar;
    }


    public static void main(String[] args) {
        Desafio101 d = new Desafio101();
        int matriz[][] = d.pideCuadrado();
        d.esEsoterico(d.cuadradoDiabolico(matriz),matriz);
    }
}
