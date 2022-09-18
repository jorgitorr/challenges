package desafios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio109 {
    /**
     * 1. recibe el nombre de la categoria
     * 2. resultados anotados sobre ella if(nombre.length<16)
     *    a) nombre pareja que juega en casa, seguido del número de sets
     *    b) nombre pareja visitante, seguido del número de sets
     */
    Scanner sc;
    Map<String,String>partners;
    String category;

    public Desafio109() {
        this.sc = new Scanner(System.in);
        partners = new HashMap<>();
    }

    public String setCategory(){
        category = sc.nextLine();
        return category;
    }


    public void setPartner(String category){
        String equipo, resultado;

        if(category!="FIN"){
            do{
                equipo = sc.next();
                resultado = sc.next();

                if(equipo!="FIN" || resultado!="FIN"){
                    partners.put(equipo,resultado);
                }else{
                    setCategory();
                }

            }while(equipo!="FIN" || resultado!="FIN");
        }
    }


    public void output(){
        setPartner(setCategory());
    }




    public static void main(String[] args) {
        Desafio109 desafio = new Desafio109();
        desafio.output();
    }
}
