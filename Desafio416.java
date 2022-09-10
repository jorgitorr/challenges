package desafios;

import java.util.ArrayList;
import java.util.Scanner;

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

                    if(fecha1Separada[0].equals(fecha2Separada[0]) && fecha1Separada[1].equals(fecha2Separada[1]))
                        checkRepeated = true;

                }
            }
        }
        return checkRepeated;
    }

    public void printCheck(boolean checkRepeated, int numPersonas){
        if(checkRepeated)
            System.out.println("SI");
        else if(numPersonas!=0)
            System.out.println("NO");
    }

    public void repetitiveProcess(){
        int edad;

        do{
            edad = getNumberOfPeople();
            printCheck(compareDates(getBirthday(edad)),edad);
        }while (edad!=0);
    }

    public static void main(String[] args) {
        Desafio416 desafio = new Desafio416();
        desafio.repetitiveProcess();
    }
}
