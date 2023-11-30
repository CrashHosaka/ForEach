package FoeEach;

import java.util.Scanner;

public class ForEach3 {
    public static void main(String[] args) throws InterruptedException {
        String[] frutas = {"melancia","banana","abacate","laranja","mexerica",};
        
        for (String i:frutas){
            System.out.println("Temos "+i);
        }

        Scanner frutaScanner = new Scanner(System.in);
        System.out.println("Qual fruta você deseja comprar?");
        String fruta = frutaScanner.nextLine();

        switch (fruta) {
            case "melancia":
                System.out.println("Comprando melancia.");                
                break;
            case "banana":
                System.out.println("Comprando banana.");                
                break;
            case "abacate":
                System.out.println("Comprando abacate.");                
                break;
            case "laranja":
                System.out.println("Comprando laranja.");                
                break;
            case "mexerica":
                System.out.println("Comprando mexerica.");                
                break;
            default:
                System.out.println("Algo deu errado, valor informado inválido.");
                break;
        }
        frutaScanner.close();
    }
}
