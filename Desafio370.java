package desafios;

import java.util.Scanner;

public class Desafio370 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String num;
        int izq, der;
        casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {

            num = sc.nextLine();

            int guion = num.indexOf("-");
            izq = Integer.parseInt(num.substring(0,guion));
            der = Integer.parseInt(num.substring(guion+1,num.length()));

            if(izq+1==der){
                if(izq%2==0){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }else if(izq==der+1){
                if(der%2==0){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }

        }

    }


}
