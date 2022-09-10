package desafios;

import java.util.ArrayList;
import java.util.Scanner;

/*
        1. número de personas
        2. fecha de nacimiento de cada una
            formato dia/mes/año(1600-2000) separadas por espacio
            a) divide cada fecha por espacios
            b) las introduce en un arraylist
        3. comprueba si alguno de los cumple
        está repetido
            a) si está un boolean se pone true
            b) no está un boolean se pone false
         4. comprueba el numero de personas no sea 0
         y vuelve al 2
     */

public class Desafio416 {
    Scanner sc = new Scanner(System.in);

    public int getNumberOfPeople(){
        int numPersonas = sc.nextInt();
        return numPersonas;
    }

    public ArrayList getBirthday(int numPersonas){
        ArrayList<String>listBirthday = new ArrayList<>();
        for (int i = 0; i < numPersonas; i++) {
            listBirthday.add(sc.next());
        }
        return listBirthday;
    }

    public boolean compareDates(ArrayList listBirthday){
        boolean checkRepeated = false;
        String fecha1, fecha2;
        String[]fecha1Separada;
        String[]fecha2Separada;
        
        for (int i = 0; i < listBirthday.size(); i++) {
            for (int j = 0; j < listBirthday.size(); j++) {
                if(j!=i){
                    fecha1 = (String) listBirthday.get(i);
                    fecha2 = (String) listBirthday.get(j);
                    fecha1Separada = fecha1.split("/");
                    fecha2Separada = fecha2.split("/");
                    if(fecha1Separada[0].equals(fecha2Separada[0]) && fecha1Separada[1].equals(fecha2Separada[1])){
                        checkRepeated = true;
                        break;
                    }
                }
            }
        }
        return checkRepeated;
    }

    public void printCheck(boolean checkRepeated){
        if(checkRepeated)
            System.out.println("SI");
        else
            System.out.println("NO");
    }

    public void process(){
        printCheck(compareDates(getBirthday(getNumberOfPeople())));
    }

    public static void main(String[] args) {
        Desafio416 desafio = new Desafio416();
        desafio.process();
    }
}
