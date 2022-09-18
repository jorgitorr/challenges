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
        String partido[] = new String[4];

        if(category!="FIN"){
            do{
                for (int i = 0; i < partido.length; i++) {
                    partido[i] = sc.next();
                }

                if(Integer.parseInt(partido[1])>Integer.parseInt(partido[3])){
                    partners.put(partido[1],partido[0]);//resultado,equipo
                }else{
                    partners.put(partido[3],partido[2]);
                }
            }while(partido[0] != "FIN");
        }
    }

    /**
     * recorrer el mapa, el valor que más salga es el ganador
     * @return veces que ha ganado un equipo
     */
    public int checkMatches(){


        return 0;
    }


    public void output(){
        setPartner(setCategory());
    }




    public static void main(String[] args) {
        Desafio109 desafio = new Desafio109();
        desafio.output();
    }
}
