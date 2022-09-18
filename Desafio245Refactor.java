package desafios;

import java.util.Scanner;

public class Desafio245Refactor {
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

    Scanner sc = new Scanner(System.in);
    int actual, siguiente, personas;
    boolean dalton = true;

    public int numPersonas(){
        personas = sc.nextInt();
        return personas;
    }

    public boolean comparaAlturas(int personas){
        actual = sc.nextInt();
        for (int i = 0; i < personas-1; i++) {
            siguiente = sc.nextInt();
            if(actual>=1 || actual<=Math.pow(10,18) || siguiente>=1 || siguiente<=Math.pow(10,18)){
                if(siguiente<=actual){
                    dalton = false;
                    break;
                }
                actual = siguiente;
            }
        }
        return dalton;
    }

    public void salidaDalton(boolean dalton){
        if(dalton)
            System.out.println("DALTON");
        else
            System.out.println("DESCONOCIDOS");
    }



    public void output(){
        personas = numPersonas();
        while(personas>1){
            salidaDalton(comparaAlturas(personas));
            sc.nextLine();
            personas = numPersonas();
        }
    }

    public static void main(String[] args) {
        Desafio245Refactor desafio = new Desafio245Refactor();
        desafio.output();
    }
}
