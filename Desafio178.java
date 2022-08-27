package desafios;

import java.util.Scanner;

public class Desafio178 {
    /*
    1. casos de prueba
    2. inserta titular (donde buscar)
    3. inserta mensaje a buscar
    4. buscar en cada letra de la frase la primera coincidencia con el mensaje
        si la encuentra

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String frase, mensaje;//frase->palabra donde busco
        //mensaje->palabra que buscar
        int contador = 0;

        casos = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < casos; i++) {
            frase = sc.nextLine();
            mensaje = sc.nextLine();
            if(frase.length()<2000 || mensaje.length()<2000){//si la palabra es menor de 2000
                if(mensaje.charAt(0)!=' '){//si la primera letra del mensaje no es espacio
                    contador = 0; //cada vez que lea un nuevo mensaje el contador a 0
                    for (int j = 0; j < mensaje.length(); j++) {
                        for (int k = 0; k < frase.length(); k++) {
                            if(j==mensaje.length()-1){//cuando la j no pueda seguir sale
                                break;
                            }else{
                                while(mensaje.charAt(j)==' '){//salta los espacios
                                    j++;
                                    contador++;//le sumo 1 al contador, para que siempre que haya espacio se sume uno
                                }
                                if(mensaje.toLowerCase().charAt(j)==frase.toLowerCase().charAt(k)){
                                    j++;//suma 1 posición al charAt del mensaje
                                    contador++;
                                }
                            }
                        }
                    }
                }
            }
            if(contador==mensaje.length()-1){//cuando sea igual o mayor el contador al mensaje sale
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }





    }
}
