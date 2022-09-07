package desafios;

import java.util.Scanner;

public class Desafio106Refactor {
    Scanner sc = new Scanner(System.in);
    int ultimoDigito, suma;
    String pais = "";
    int digitosPaises, digitosPaises2;



    public void addZero(String cod){
        if(cod.length()<8){
            while(cod.length()<8){
                cod += '0';
            }
        }else if(cod.length()>8 && cod.length()<=13){
            while(cod.length()<13){
                cod += '0';
            }
        }
    }

    public void setPais(String cod){
        digitosPaises = Integer.parseInt(cod.substring(0,1));
        digitosPaises2 = Integer.parseInt(cod.substring(0,2));
        if (digitosPaises == 0) {
            pais = "EEUU";
        }else if(digitosPaises2 == 50){
            pais = "Inglaterra";
        }else{
            digitosPaises = Integer.parseInt(cod.substring(0,3));
            paisesTresDigitos(digitosPaises);
        }

    }

    public void paisesTresDigitos(int digitosPaises){
        switch (this.digitosPaises){
            case 380:
                pais = "Bulgaria";
                break;
            case 539:
                pais = "Irlanda";
                break;
            case 560:
                pais = "Portugal";
                break;
            case 70:
                pais = "Noruega";
                break;
            case 759:
                pais = "Venezuela";
                break;
            case 850:
                pais = "Cuba";
                break;
            case 890:
                pais = "India";
                break;
            default:
                pais = "Desconocido";
                break;
        }
    }

    public int devuelvaSuma(String cod){
        int cont = 1;
        suma = 0;
        for (int j = cod.length()-2; j >= 0; j--) {
            if(cont%2!=0 || cont==1){
                suma += Integer.parseInt(String.valueOf(cod.charAt(j)))*3;
            }else{
                suma += Integer.parseInt(String.valueOf(cod.charAt(j)));
            }
            ++cont;
        }

        return suma;
    }

    public void result(String cod){
        ultimoDigito = Integer.parseInt(String.valueOf(cod.charAt(cod.length()-1)));

        if((devuelvaSuma(cod)+ultimoDigito)%10==0){
            System.out.println("SI " + pais);
        }else{
            if(cod.length()==13){
                System.out.println("NO " + pais);
            }else{
                System.out.println("NO");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String cod;
        Desafio106Refactor prueba = new Desafio106Refactor();

        casos = 1;
        while(casos!=0){
            casos = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < casos; i++) {
                cod = sc.nextLine();

                prueba.addZero(cod);
                prueba.setPais(cod);
                prueba.devuelvaSuma(cod);
                prueba.result(cod);
            }
        }
    }



}
