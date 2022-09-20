package desafios;

import java.util.Scanner;
import java.util.Stack;

public class Desafio140 {
    /*
    1. casos de prueba, si es -1 sale si no sigue al paso 2
    2. el número lo divide en digitos
    3. agrega estos digitos a una pila
     */
    Scanner sc;
    Stack pila;

    public Desafio140() {
        this.sc = new Scanner(System.in);
        this.pila =new Stack();
    }

    public String pideNum(){
        String num = sc.nextLine();
        return num;
    }

    public Stack returnNum(String num){
        for (int i = 0; i < num.length(); i++) {
            pila.push(num.charAt(i));
        }
        return pila;
    }

    public void add(Stack<Character>pila){
        int suma = 0;
        while(!pila.empty()){
            System.out.print(pila.peek());
            if(pila.size()!=1)
                System.out.print( " + ");
            suma += Integer.parseInt(String.valueOf(pila.pop()));
        }


        System.out.print(" = " + suma);
    }

    public void output(){
        String num = pideNum();
        while(num != "-1"){
            add(returnNum(num));
            sc.nextLine();
            num = pideNum();
        }
    }

    public static void main(String[] args) {
        Desafio140 desafio = new Desafio140();
        desafio.output();
    }
}
