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
    ArrayList<String>lines;

    public Desafio558() {
        this.sc = new Scanner(System.in);
        this.groupOfWords = new HashMap();
        this.lines  = new ArrayList<>();
    }

    private int numIdentifications(){
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    private ArrayList<String> askLines(int num){
        for (int i = 0; i < num; i++) {
            lines.add(sc.nextLine());
        }
        return lines;
    }

    private Map<String,String> saveLinesInGroups(ArrayList lines){
        int contUpper = 0, contStorage = 0;
        for (int i = 0; i < lines.size(); i++) {
            String word = lines.get(i).toString();
            contUpper = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j)==word.toUpperCase().charAt(j)){
                    contUpper++;
                }
                //si el contador actual es mayor que el guardado entonces guardo la palabra, sino no
                if(contUpper>contStorage){
                    groupOfWords.put(word.toLowerCase(),word);
                }
                contStorage = contUpper;
            }
        }

        return groupOfWords;
    }

    //comprobamos cual es la palabra con más mayúsculas del mapa


    public void baseOutput(){
        saveLinesInGroups(askLines(numIdentifications()));
    }

    public static void main(String[] args) {
        Desafio558 desafio558 = new Desafio558();
        desafio558.baseOutput();
    }
}
