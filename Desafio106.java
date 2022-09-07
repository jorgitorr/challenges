package desafios;

import java.util.Scanner;

public class Desafio106 {
    /*
    1. casos de prueba
    2. sucesión de códigos de barra
        a. si cod<8 -> EAN-8
        b. si cod>8 && cod<13 -> EAN-13
    3. se comprueba si tiene que añadirse ceros:
          a) EAN-8 si cod.length<8
            - se completa con 0 a la izq de los numeros separando
            el último hasta que cod.length==8.
          b) EAN-13 si cod.length<13
            - se completa con 0 a la izq hasta que cod.length==13
          c) si no -> va al paso 4.
     4.  se comprueba si el último dígito es correcto
          a) se multiplican los números impares por 3
          y los pares se dejan igual y se suman entre ellos
          excepto el último número
          ^^^^^^^^^^^^^^^^^^^^^^^^
            - al resultado que de habrá que sumarle un número X,
            comparamos X con el último dígito
                a) X == último dígito
                    - sout("SI");
                    - sout("NO");
      5. si el cod es EAN-13 se comprobará de que paises son
          (comparar números con la tabla)

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String cod;
        int ultimoDigito, suma;
        String pais = "";
        int digitosPaises, digitosPaises2;

        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            suma = 0;
            cod = sc.nextLine();
            //guardo el ultimo dígito que compararé después
            ultimoDigito = Integer.parseInt(String.valueOf(cod.charAt(cod.length()-1)));

            //creo nuevo String, quitándo el último dígito y añadiendo el 0
            if(cod.length()<8){
                while(cod.length()<8){
                    //le añado 0
                    cod += '0';
                }
            }else if(cod.length()>8 && cod.length()<13){
                while(cod.length()<13){
                    cod += '0';

                }
                //para comprobar de que país es:
                digitosPaises = Integer.parseInt(cod.substring(0,1));
                digitosPaises2 = Integer.parseInt(cod.substring(0,2));
                if (digitosPaises == 0) {
                    pais = "EEUU";
                }else if(digitosPaises2 == 50){
                    pais = "Inglaterra";
                }else{
                    digitosPaises = Integer.parseInt(cod.substring(0,3));
                    switch (digitosPaises){
                        case 380:
                            pais = "Bulgaria";
                            break;
                        case 539:
                            pais = "Irlanda";
                            break;
                        case 560:
                            pais = "Portugal";
                            break;
                        case 70:
                            pais = "Noruega";
                            break;
                        case 759:
                            pais = "Venezuela";
                            break;
                        case 850:
                            pais = "Cuba";
                            break;
                        case 890:
                            pais = "India";
                            break;
                    }
                }
            }

            //se comprueba que el último dígito es correcto
            //empezando por la derecha
            int cont = 1; //este contador va a usarse para saber si el número al que accedemos es par o impar
            for (int j = cod.length()-2; j > 0; j--) {//cod.length()-2 porque empiezo desde dos posiciones antes
                if(cont%2!=0 || cont==1){
                    suma += Integer.parseInt(String.valueOf(cod.charAt(j)))*3;
                }else{
                    suma += Integer.parseInt(String.valueOf(cod.charAt(j)));
                }
                ++cont;
            }

            if((suma+ultimoDigito)%10==0){
                System.out.println("SI " + pais);
            }else{
                System.out.println("NO " + pais);
            }


        }

    }
}
