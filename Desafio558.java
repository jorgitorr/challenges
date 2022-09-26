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

    public Desafio558() {
        this.sc = new Scanner(System.in);
    }

    private int numIdentifications(){
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    private ArrayList<String> askLines(int num){
        ArrayList<String>lines = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lines.add(sc.nextLine());
        }
        return lines;
    }

    /**
     * compara si las palabras tienes más mayusculas
     * @param lines
     * @return
     */
    private Map<String,String> saveUpperInGroup(ArrayList lines){
        Map<String, String>groupOfWords = new HashMap<>();
        int contUpperActual = 0, contUpperAnterior = 0;
        for (int i = 0; i < lines.size(); i++) {
            String word = lines.get(i).toString();
            for (int j = 0; j < word.length(); j++) {
                if(word.toUpperCase().charAt(j)==word.charAt(j)){
                    contUpperActual++;
                }
                if(contUpperActual>contUpperAnterior && !groupOfWords.containsValue(word)){
                    groupOfWords.put(word.toLowerCase(),word);
                }
            }
            contUpperAnterior=contUpperActual;
        }
        return groupOfWords;
    }


    private void printCamelCase(Map<String, String> groupOfWords){
        for (int i = 0; i < groupOfWords.size(); i++) {
            System.out.println(groupOfWords.values());
        }
    }


    public void baseOutput(){
        int num = numIdentifications();
        while(num > 0){
            printCamelCase(saveUpperInGroup(askLines(num)));
            num = numIdentifications();
        }
    }

    public static void main(String[] args) {
        Desafio558 desafio558 = new Desafio558();
        desafio558.baseOutput();
    }
}
