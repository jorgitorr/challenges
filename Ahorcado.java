package desafios;

import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado {
    Scanner sc;
    ArrayList<String>palabrasAdivinar;
    int cont = 0;

    public Ahorcado() {
        palabrasAdivinar = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    private void setPalabrasAdivinar(){
        palabrasAdivinar.add("caballo");
        palabrasAdivinar.add("terremoto");
        palabrasAdivinar.add("Raskolnikov");
        palabrasAdivinar.add("solución");
    }

    private int chooseNumberXSelectWord(){
        int num = (int) Math.random()*4;
        return num;
    }

    private String getPalabraAdivinar(int num){
        return palabrasAdivinar.get(num);
    }

    private String introduceWordOrLetter(){
        String word = sc.nextLine();
        return word;
    }


    private String getHangedWord(int num){
        String hangedWord = palabrasAdivinar.get(num);
        return hangedWord;
    }

    private String getHiddenWord(String hangedWord){
        String hiddenWord = "".repeat(hangedWord.length());
        return hiddenWord;
    }

    private int checkIfWordIsTheWordHidden(String hangedWord, String hiddenWord){
        String inputWord;

        System.out.println("Introduce una palabra: ");
        inputWord = sc.nextLine();

        if(hangedWord.equals(inputWord)){
            System.out.println("Has acertado, la palabra era: " + hangedWord + ", has necesitado " + cont + " intentos");
        }else{
            for (int i = 0; i < hangedWord.length(); i++) {
                for (int j = 0; j < inputWord.length(); j++) {
                    if(hangedWord.charAt(i)==inputWord.charAt(j)){
                        hiddenWord.replace(hiddenWord.charAt(i),inputWord.charAt(j));
                    }
                }
            }
            cont++;
        }

        //se tiene que comprobar si ha acertado todas las letras
        int contGuiones = 0;
        for (int i = 0; i < hiddenWord.length(); i++) {
            if(hiddenWord.charAt(i)=='_'){
                contGuiones++;
            }
        }

        if(contGuiones==0)
            System.out.println("Has acertado, la palabra era: " + hangedWord + ", has necesitado " + cont + " intentos");
        else
            System.out.println(cont + " intentos, te quedan " + (15-cont));//15=intentosMax

        System.out.println(hiddenWord);

        return cont;
    }


    public void finalOutput(){
        DrawingHanged d = new DrawingHanged();
        d.drawing(checkIfWordIsTheWordHidden(getHangedWord(chooseNumberXSelectWord()),
                getHiddenWord(getPalabraAdivinar(chooseNumberXSelectWord()))));
    }


    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.finalOutput();
    }
}
