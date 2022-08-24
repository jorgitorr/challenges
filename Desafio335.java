package desafios;

import java.util.Scanner;

public class Desafio335 {
    /*
    entrada:
    1. casos de prueba
        a. altura de piramide de canicas

    1 piso -> 1 (1)
    2 pisos -> 4 (3, 1)
    3 pisos -> 10 (6, 3, 1)
    4 pisos -> 20 (10, 6, 3, 1)
    5 pisos -> 35 (15, 10, 6, 3, 1)
    6 pisos -> 56 (21, 15, 10, 6, 3, 1)

    he averiguado el siguiente número
    sabiendo que el anterior es una bola
    más por cada fila más la bola final(1).

    a la final se le suma un número que siempre
    va creciendo, 3+3=6+4=10+5=15+6=21

    x = cont que se incrementa en 1
    alturaPiramide-3 -> para que empieze contando
                        desde 3
    salida:
        1. num = 3;
           x = 3; -> tiene que ser a partir del 3 // es una constante para que sea un numero fijo
           cont = 1;
        3. if altura piramide == 1
            a. x=1 -> va al 4
           else
            b. bucle con la altura de la piramide
                numSuma = x+cont;
                num = 3 + numSuma;
                cont++;
        4. sale se le suma 1 y se imprime.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, alturaPiramide, resultado, cont, resultadoF;//porque empieza en 3
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            resultado = 3;
            cont = 3;
            resultadoF = 0;

            alturaPiramide = sc.nextInt();
            if(alturaPiramide == 1){
                System.out.println("1");continue;
            }else if(alturaPiramide == 2){
                System.out.println("4");continue;
            }else{
                for (int j = 2; j < alturaPiramide; j++) {
                    /*
                    1 piso -> 1 (1)
                    2 pisos -> 4 (3, 1)
                    3 pisos -> 10 (6, 3, 1)
                    4 pisos -> 20 (10, 6, 3, 1)
                    5 pisos -> 35 (15, 10, 6, 3, 1)
                    6 pisos -> 56 (21, 15, 10, 6, 3, 1)

                    x = 3;
                    3+3=6+4=10+5=15+6=21
                    3 + X
                    X se incrementa por 1

                     */
                    resultado = resultado + cont; // sumo el resultado al contador que se incrementa (3+3=6+4=10+5=15...)
                    resultadoF += resultado;//guardo la variable resultado en otra variable(6+10+15...)
                    cont++;//voy incrementando la variable contador
                }

                resultadoF += 4; //le sumo los primeros números = 3 + 1
                System.out.println(resultadoF);


            }
        }
    }
}
