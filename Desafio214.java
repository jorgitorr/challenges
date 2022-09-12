package desafios;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Entrada:
    1. Cantidad de reyes de una dinastia if(x!=0)->paso 2, sino sale
    2. Nombres de reyes separados por espacios(x<20)
    3. Cantidad de reyes futuros
    4. Nombres de reyes futuros separados por espacios(y<20)

    Salida:
    1. cont = 0;
    1. Por cada nombre repetido en la dinastia se agregará +1 a un contador
    2. Se pondrá el número de contador por cada rey futuro
 */
public class Desafio214 {
    Scanner sc = new Scanner(System.in);
    int amountOfKings, amountOfFutureKings;
    ArrayList namesOfKings, nameOfFutureKings;

    public int getAmountOfKings(){
        amountOfKings = sc.nextInt();
        return amountOfKings;
    }

    public ArrayList getNamesOfKings(int amountOfKings){
        namesOfKings = new ArrayList();
        for (int i = 0; i < amountOfKings; i++) {
            namesOfKings.add(sc.next());
        }
        return namesOfKings;
    }

    public int getAmountOfFutureKings(){
        amountOfFutureKings = sc.nextInt();
        return amountOfFutureKings;
    }

    public ArrayList getNamesOfFutureKings(int amountOfFutureKings){
        nameOfFutureKings = new ArrayList();
        for (int i = 0; i < amountOfFutureKings; i++) {
            nameOfFutureKings.add(sc.next());
        }
        return nameOfFutureKings;
    }

    public int[] compareDynasties(ArrayList namesOfKings, ArrayList namesOfFutureKings){
        int cont = 0, contFuture = nameOfFutureKings.size();
        int[]contKings = new int[namesOfFutureKings.size()];

        for (int futureDynasty = 0; futureDynasty < namesOfFutureKings.size(); futureDynasty++) {
            cont = 1;//because it's the first king

            for (int oldDynasty = 0; oldDynasty < namesOfKings.size(); oldDynasty++) {
                if(namesOfFutureKings.get(futureDynasty).equals(namesOfKings.get(oldDynasty))){
                    cont++;
                }
            }
            contKings[futureDynasty] = cont;
        }
        return contKings;
    }


    public int[] seeIfKingIsRepeated(int[]contKings){
        for (int i = 0; i < contKings.length; i++) {
            for (int j = i+1; j < contKings.length; j++) {
                if(nameOfFutureKings.get(i).equals(nameOfFutureKings.get(j))){
                    contKings[j]+=1;
                }
            }
        }
        return contKings;
    }



    public void printContDinasty(int[]contKings){
        for (int king = 0; king < contKings.length; king++) {
            System.out.println(contKings[king]);
        }
    }

    public void process(){
        int numKings = 1;
        while(numKings!=0){
            numKings = getAmountOfKings();
            printContDinasty(seeIfKingIsRepeated(compareDynasties(getNamesOfKings(numKings),
                    getNamesOfFutureKings(getAmountOfFutureKings()))));
        }
    }

    public static void main(String[] args) {
        Desafio214 desafio = new Desafio214();
        desafio.process();
    }
}
