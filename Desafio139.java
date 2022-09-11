package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio139 {
    Scanner sc = new Scanner(System.in);
    /*
    cubifinito = al elevar todos sus digitos al cubo y sumarlos
    el resultado o es 1 o es un número cubifinito (es decir 100, 10..)

    1. se pide un número
    2. se separa el número en digitos
    3. se elevan al cubo sus digitos
    4. se suma el digito elevado al cubo
    5. se comprueba si es cubifinito, hay que hacerlo hasta conseguir el mín
        a) si es cubifinito el número al elevarse y sumarse dará 1, por lo tanto el mín num será 1
        b) si no es cubifinito el número al elevarse y sumarse no dará 1, por lo tanto el mín num no será 1

     */

    public String getNum(){
        String num = sc.nextLine();
        return num;
    }

    public ArrayList<String> saveDigits(String num){
        ArrayList<String>numbers = new ArrayList<String>();
        for (int i = 0; i < num.length(); i++) {
            numbers.add(String.valueOf(num.charAt(i)));
        }
        return numbers;
    }

    public int numPowAndAdd(ArrayList numbers){
        int suma = 0;
        int potencia;
        for (int i = 0; i < numbers.size(); i++) {
            potencia = (int) Math.pow(Integer.parseInt((String) numbers.get(i)),3);
            suma += potencia;
        }
        return suma;
    }

    public boolean isCubifinito(int suma){
        boolean cubifinito = false;
        
        if(suma==1 || suma%10==0){
            cubifinito = true;
        }else{
            saveDigits(String.valueOf(suma));//le volvemos a pasar la suma
        }
        return cubifinito;
    }


    public void printCubifinito(boolean cubifinito, int suma, String num){
        if(cubifinito)
            System.out.println(num + " -> " + suma + " - 1 -> cubifinito");
        else
            System.out.println(suma + " -> no cubifinito");
    }

    public void repetitiveProcess(){
        String num;
        do{
            num = getNum();
            printCubifinito(isCubifinito(numPowAndAdd(saveDigits(num))),numPowAndAdd(saveDigits(num)), num);
        }while(num!="0");

    }
    
    public static void main(String[] args) {
        Desafio139 desafio = new Desafio139();
        desafio.repetitiveProcess();
    }
}
