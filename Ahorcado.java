package desafios;

import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado {
    Scanner sc;
    ArrayList<String>palabrasAdivinar;
    int cont;
    String hiddenWord;

    public Ahorcado() {
        palabrasAdivinar = new ArrayList<>();
        sc = new Scanner(System.in);
        cont = 0;
        hiddenWord = "";
    }

    private void setPalabrasAdivinar(){
        palabrasAdivinar.add("caballo");
        palabrasAdivinar.add("terremoto");
        palabrasAdivinar.add("Raskolnikov");
        palabrasAdivinar.add("solución");
        palabrasAdivinar.add("sardina");
    }

    private int chooseNumberXSelectWord(){
        //arreglar
        int num = (int) Math.random()*3+1;
        return num;
    }

    private String getPalabraAdivinar(int num){
        return palabrasAdivinar.get(num);
    }

    private String introduceWordOrLetter(){
        System.out.println("Introduce una palabra o letra: ");
        String word = sc.nextLine();
        return word;
    }


    private String getHangedWord(int num){
        String hangedWord = palabrasAdivinar.get(num);
        return hangedWord;
    }

    private String getHiddenWord(String hangedWord){
        String hiddenWord = "_".repeat(hangedWord.length());
        return hiddenWord;
    }

    private int checkIfWordIsTheWordHidden(String hangedWord, String hiddenWord, String word){
        if(this.hiddenWord!="")
            hiddenWord = this.hiddenWord;
        if(hangedWord.equals(word)){
            System.out.println("Has acertado, la palabra era: " + hangedWord + ", has necesitado " + cont + " intentos");
        }else{
            for (int i = 0; i < hangedWord.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    if(j>=hangedWord.length())
                        break;
                    else{
                        if(hangedWord.charAt(i)==word.charAt(j)){
                            hiddenWord = hiddenWord.substring(0,i) + hangedWord.charAt(i)
                                    + hiddenWord.substring(i,hiddenWord.length()-1);
                            this.hiddenWord = hiddenWord;
                            //if the word/letter is find:
                            i++;
                            j=-1;
                        }
                    }
                }
            }
            cont++;
        }

        System.out.println(hiddenWord);

        if(!hiddenWord.contains("_")){
            System.out.println("has acertado, la palabra era " + hiddenWord + ", has necesitado " + cont + " intentos");
            this.hiddenWord = hiddenWord;
        }else
            System.out.println();

        return cont;
    }




    public void finalOutput(){
        DrawingHanged d = new DrawingHanged();
        setPalabrasAdivinar();

        String palabraSinOcultar = getHangedWord(chooseNumberXSelectWord());
        String palabraOculta = getHiddenWord(palabraSinOcultar);
        String nuevaPalabra;


        while(palabraOculta.contains("_")){
            d.drawing(checkIfWordIsTheWordHidden(palabraSinOcultar,palabraOculta,introduceWordOrLetter()));
            nuevaPalabra = palabraOculta;
        }
    }


    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.finalOutput();
    }
}
