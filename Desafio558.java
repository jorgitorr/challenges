package desafios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio558 {
    /*
    1. num de identificadores
    2. linea en formato camelCase
    3. linea mal

    1. Lee el número de identificadores
    2. recoge las lineas
    3. comprueba si en minúsculas todas son iguales
    4. las agrupa en un mapa, la clave es la palabra en minúscula
    5. Comprueba cual es la camel Case con la que tenga más mayus
    6. muestra la que tiene más mayúsculas (sin ser todas mayus)
     */
    Scanner sc;
    Map<String, String>groupOfWords;

    public Desafio558(Scanner sc) {
        this.sc = new Scanner(System.in);
        this.groupOfWords = new HashMap();
    }

    private int numIdentifications(){
        int num = sc.nextInt();
        return num;
    }

    private ArrayList<String> askLines(int num){
        ArrayList<String>lines = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lines.add(sc.nextLine());
        }
        return lines;
    }

    private Map<String,String> saveLinesInGroups(ArrayList lines){
        for (int i = 0; i < lines.size(); i++) {
            String word = groupOfWords.get(i).toString();
            groupOfWords.put(word.toLowerCase(),word);
        }

        return groupOfWords;
    }

    //comprobamos cual es la palabra con más mayúsculas del mapa
    private int Capitalice(Map<String,String>groupOfWords){
        for (int i = 0; i < groupOfWords.size(); i++) {

        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
