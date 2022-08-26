package desafios;

import java.util.Scanner;

public class Desafio523 {
    /*
    1. casos de prueba
    2. bucle de casos
        a. matricula de Edu
        b. matriculas de coches que se cruza
        c. la linea termina en 0

     salida:
        sacamos las letras = matriculaCoches.substring();
        if(letrasCoches<letrasEdu)
            cochesModernos++;
        else
            cochesAntiguos++;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, matriculasModernas, matriculasAntiguas;
        String matriculas;

        casos = sc.nextInt();
        sc.nextLine();

        /*
        1. comparar la matricula de Edu con cada matricula
        2. comparar las letras de la matricula de Edu con las letras de cada matricula
            a. comparar cada letra de la matricula de Edu con las letras de cada matricula (PBB - PBX, P-P, B-B, B-X)
                - se puede comparar letras:
                    - letra matricula<letra matricula Edu == ++matriculasModernas
                    - letra matricula>letra matricula Edu == ++matriculasAntiguas
                - no se puede comprarar letras:
                    -comparamos los números de la matricula
         3. imprimimos el resultado
         test:
         5555CPP 5558CPB 5554CPX 0
         20190RG 3030PRG 3030PRG 0

         */

        for (int k = 0; k < casos; k++) {
            matriculas = sc.nextLine();

            String matriculasCompletas[] = matriculas.split(" ");
            matriculasModernas = 0;
            matriculasAntiguas = 0;
            for (int i = 1; i < matriculasCompletas.length-1; i++) {//empieza en 1 para que no guarde la matricula de Edu
                //y  es hasta matriculaCompleta.length-1 para que no guarde la última
                for (int j = 0; j < matriculasCompletas[i].substring(4,7).length(); j++) { //recorre cada letra de la matricula
                    //si la matricula es más pequeña es más antigua
                    if(matriculasCompletas[0].substring(4,7).charAt(j)>matriculasCompletas[i].substring(4,7).charAt(j)){
                        matriculasAntiguas++;
                        break;
                    }
                    else if(matriculasCompletas[0].substring(4,7).charAt(j)<matriculasCompletas[i].substring(4,7).charAt(j)){
                        matriculasModernas++;
                        break;
                    }
                    else{
                        if(j==2){//en el caso de que las letras sean iguales, compara los números
                            if(Integer.parseInt(matriculasCompletas[i].substring(0,4))<Integer.parseInt(matriculasCompletas[0].substring(0,4))){
                                matriculasModernas++;
                            }else{
                                matriculasAntiguas++;
                            }

                        }
                    }
                }
            }
            System.out.println(matriculasAntiguas + " " + matriculasModernas);
        }

    }
}
