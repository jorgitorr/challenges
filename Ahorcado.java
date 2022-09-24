package desafios;

import java.util.ArrayList;
import java.util.Scanner;

/*
este ahorcado guarda unas palabras en un array, tu cometido es adivinar la palabra que te piden en el momento
las letras estarán ocultas por ____ que será igual a la longuitud de la palabra
cada vez que adivines una letra se sustituirá un _ por la letra correspondiente
Si no adivinas una letra se añadiendo un dibujo del ahorcado y restando uno al contador máximo(10)

1. pide la palabra
2. comprueba si la palabra es igual que la palabra a adivinar
 */
public class Ahorcado {
    Scanner sc;
    ArrayList<String>palabrasAdivinar;
    int cont = 10;

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
        int num = (int) Math.random();
        return num;
    }

    private String getPalabraAdivinar(int num){
        return palabrasAdivinar.get(num);
    }

    private String introduceWordOrLetter(){
        String word = sc.nextLine();
        return word;
    }


    private String getHangedWord(int num, String word){
        String hangedWord = palabrasAdivinar.get(num);
        return hangedWord;
    }

    private String getHiddenWord(String hangedWord){
        String hiddenWord = "".repeat(hangedWord.length());
        return hiddenWord;
    }

    private int checkIfWordIsTheWordHidden(String hangedWord, String hiddenWord){
        String inputWord;
        int cont = 0;

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
        for (int i = 0; i < hiddenWord.length(); i++) {
            if(hiddenWord.charAt(i)=='_'){

            }
        }

        System.out.println(hiddenWord);
        System.out.println("contador: " + cont);

        return cont;
    }

    private void drawing(int cont){
        String hangingDraw;

        switch (cont){
            case 1:
                hangingDraw = "______";
                break;
            case 2:
                hangingDraw = "__|__";
                break;
            case 3:
                hangingDraw =
                        "  | \n" +
                        "__|__";
            case 4:
                hangingDraw =
                        "  | \n" +
                        "  | \n" +
                                "__|__";
                break;
            case 5:
                hangingDraw =
                        "  | \n" +
                        "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 6:
                hangingDraw =
                        "  | \n" +
                        "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 7:
                hangingDraw =
                        "------" +
                        "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 8:
                hangingDraw =
                        "------" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 9:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 10:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 11:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  | \n" +
                                "__|__";
                break;
            case 12:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  |   /\n" +
                                "__|__";
                break;
            case 13:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                break;
            case 14:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |  /|\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                break;
            case 15:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |  /|\\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                System.out.println("Has muerto, vuelve a intentarlo en otro momento");
                break;


        }
    }





    public static void main(String[] args) {

    }
}
