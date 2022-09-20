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
    int maxCont;
    int cont;


    public Desafio109() {
        this.sc = new Scanner(System.in);
        this.maxCont = 0;
        this.cont = 2;
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
     * si el mapa no contiene el valor de los equipos ganados
     * guarda en una variable el valor máx, para saber cual es la clave con el valor máx
     * la constante cont se incrementa cada vez que los partidosGanados.get(i)==partidosGanados.get(j)
     * ya que la j es una más adelantada de la i
     * además si el mapa ya contiene el valor no vuelve a hacer las operaciones anteriores para así ahorrar.
     * @return partidos ganados
     */
    public Map<Integer,String> addTeamswithPoints(ArrayList<String>partidosGanados){
        Map<Integer,String> teamsCont = new TreeMap<>();
        int cont = 0, j = 0;
        for (int i = 0; i < partidosGanados.size()-1; i++) {
            j = 0;

            if(!teamsCont.containsValue(partidosGanados.get(i))){
                if(maxCont<cont)
                    maxCont = cont;

                cont = 0;
                do{
                    j++;
                    if(partidosGanados.get(i).equals(partidosGanados.get(j))){
                        cont++;
                    }
                }while(j<partidosGanados.size()-1);
                teamsCont.put(cont,partidosGanados.get(i));
            }
        }

        return teamsCont;
    }

    /**
     * Si el valor ya está en el mapa lo que hace es agregar 2 al contador y lo remplaza por el que ya está
     * si el valor no está lo que hace es agregarlo y agregar un 2
     * @param teamsCont
     * @return
     */
    public Map<String, Integer> chooseTeamWithMorePoints(Map<Integer, String>teamsCont, int maxCont){
        Map<String, Integer>teamsFinales = new HashMap<>();
        if(teamsFinales.containsKey(teamsCont.containsValue(maxCont))){
            cont+=2;
            teamsFinales.replace(teamsCont.get(maxCont), cont);
        }else{
            teamsFinales.put(teamsCont.get(maxCont), 2);
        }
        return teamsFinales;
    }

    /**
     * coge el mapa del método anterior e imprime el último resultado si es que hay
     * si no hay nada en la última posición sale empate
     * @param teamsFinales
     */
    public void print(Map<String, Integer>teamsFinales){
        for (int i = teamsFinales.size()-1; i <= teamsFinales.size()-1; i++) {
            if(teamsFinales.containsValue(cont)){
                System.out.println(teamsFinales);
                cont = i;
            }else{
                System.out.println("EMPATE 0");
            }
        }
    }

    public void output(){
        String category = setCategory();
        while(!category.equals("FIN")){
            print(chooseTeamWithMorePoints(addTeamswithPoints(setPartner(category)),maxCont));
            category = setCategory();
        }
    }




    public static void main(String[] args) {
        Desafio109 desafio = new Desafio109();
        desafio.output();
    }
}
