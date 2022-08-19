package desafios;

import java.util.Scanner;

public class Desafio112 {
    /*
    1. num de casos
    2. ciclo con cada caso de prueba, cada caso formado por
        a. distancia (m)
        b. velocidad max (km/h)
        c. num segundos (s)
     3. if(a==0 && b==0 && c==0) --> 5
        else --> 4
     4. si la velocidad media supera a la max
     distancia entre camaras --> 9165 m --> 9,165 km
     velocidad max --> 110 km/h
     segundos --> 300 --> 0,083 h
        formula =
        (calcular la velocidad a la que ha ido
        y comprobar si es mayor/menor a la max)

            distancia en km --> 9,165
            X * 0,083 == 9,165
            X == 9,165/0,083
            X == 110,42
            velocidad max - X = 0,42

            Por tanto la formula es:
          - la distancia entre camaras/las horas que ha tardado
          - restamos el resultado por la velocidad max


     5. termina


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, distancia, limiteVelocidad, tiempo;
        double distanciaKm, tiempoS, x;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            distancia = sc.nextInt();
            limiteVelocidad = sc.nextInt();
            tiempo = sc.nextInt();

            if(distancia==0 && limiteVelocidad == 0 && tiempo == 0)
                break;
            else{
                distanciaKm = distancia/1000;//metros-->km
                tiempoS = (tiempo/60)/60;//segundos-->horas
                x = distanciaKm/tiempo;
                if(x>limiteVelocidad){
                    if(x>limiteVelocidad+(limiteVelocidad*20)/100){
                        System.out.println("PUNTOS");
                    }else{
                        System.out.println("MULTA");
                    }
                }else{
                    System.out.println("OK");
                }
            }
        }


    }
}
