package desafios;

import java.util.*;

public class Desafio610 {
    Scanner sc = new Scanner(System.in);
    int casos;

    public int getCasos(){
        casos = sc.nextInt();
        return casos;
    }

    public Queue<Integer> posiciontsQueue(){
        Queue<Integer> posicionts = new LinkedList<>();
        int num;
        for (int i = 0; i < 4; i++) {
            num = sc.nextInt();
            posicionts.add(num);
        }
        return posicionts;
    }

    public String checkIfPeterOrStart(Queue<Integer>positions){
        int personas = positions.poll()/2;
        int ironMan = positions.poll(), spider = positions.poll();
        String tipo = "";

        if(spider%positions.peek()==0 && spider<=personas){
            tipo += "p";
        }if(ironMan%positions.peek()==0 && ironMan<=personas){
            tipo += "s";
        }
        return tipo;
    }

    public void print(String tipo){
        if(tipo.equals("p")){
            System.out.println("No quiero irme, Peter!");
        }else if(tipo.equals("s")){
            System.out.println("No quiero irme, Sr. Stark!");
        }else{
            System.out.println("No hay abrazo");
        }
    }

    public void base(){
        int casos = getCasos();
        while(casos>0){
            print(checkIfPeterOrStart(posiciontsQueue()));
            casos--;
        }
    }



    public static void main(String[] args) {
        Desafio610 desafio610 = new Desafio610();
        desafio610.base();
    }
}
