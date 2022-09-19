package desafios;

import java.util.*;

public class Desafio109 {
    /**
     * 1. recibe el nombre de la categoria
     * 2. resultados anotados sobre ella if(nombre.length<16)
     *    a) nombre pareja que juega en casa, seguido del número de sets
     *    b) nombre pareja visitante, seguido del número de sets
     * 3. si uno de la pareja ha ganado nos quedamos con ese
     * 4. contar cuantas veces se repite cada nombre en la lista y quedarse con el nombre que más se repite
     * 5. En el caso de que se repitan por igual se imprime directamente EMPATE, sino al punto 6
     * 6. Si no existe el nombre lo introducimos en el mapa con un dos
     * 7. Si ya existe el nombre sacamos la clave y le sumamos
     */
    Scanner sc;
    String category;

    public Desafio109() {
        this.sc = new Scanner(System.in);
    }

    /**
     * ask for category
     * @return category
     */
    public String setCategory(){
        category = sc.nextLine();
        return category;
    }

    /**
     *
     * @param category
     * @return partidos Ganados
     */
    public ArrayList<String> setPartner(String category){
        String partido[] = new String[4];
        ArrayList<String>partidosGanados = new ArrayList<>();

        do{
            for (int i = 0; i < partido.length; i++) {
                partido[i] = sc.next();

                if(partido[0].equals("FIN"))
                    return partidosGanados;
            }
            if(Integer.parseInt(partido[1])>Integer.parseInt(partido[3])){
                partidosGanados.add(partido[0]);
            }else{
                partidosGanados.add(partido[2]);
            }
        }while(partido[0] != "FIN");

        return partidosGanados;
    }


    /**
     *
     * @return partidos ganados
     */
    public Map<Integer,String> addTeamswithPoints(ArrayList<String>partidosGanados){
        Map<Integer,String> teamsCont = new TreeMap<>();



        return teamsCont;
    }

    /**
     *
     * @param teamsCont = Mapa que dice los equipos ordenados de menor a mayor cual es el resultado de cada uno
     * @return
     */
    public String chooseTeamWithMorePoints(Map<Integer, String>teamsCont){
        Map<String, Integer>teamsPoints = new HashMap<>();
        int cont = 0;

        return "teamsPoints";

    }





    public void output(){
        chooseTeamWithMorePoints(addTeamswithPoints(setPartner(setCategory())));
    }




    public static void main(String[] args) {
        Desafio109 desafio = new Desafio109();
        desafio.output();
    }
}
