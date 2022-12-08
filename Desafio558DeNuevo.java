package desafios;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Desafio558DeNuevo {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer>words;

    public int numCases(){
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Map Words(int numCases){
        String word = "";

        for (int i = 0; i < numCases; i++) {
            word = sc.nextLine();
            int upperLetters = 0;
            int anterior = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.toUpperCase().charAt(i)){
                    upperLetters++;
                }
            }



        }
        return words;
    }





    public void program(){
        int num = 2;
        for (int i = 0; i < num; i++) {
            int numCasos = numCases();

        }
    }

    public static void main(String[] args) {
        Desafio558DeNuevo d = new Desafio558DeNuevo();
        d.program();
    }
}
