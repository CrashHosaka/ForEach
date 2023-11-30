package FoeEach;

import java.util.Scanner;

public class ForEach4 {
    public static void main(String[] args) throws InterruptedException {
        String[] num = new String[10];
        Scanner numScanner = new Scanner(System.in);
        int i = 0;
        int o = 1;

        try {
            for (String t : num) {
                System.out.println("Informe o "+(i+1)+"º número.");
                num[i] =numScanner.nextLine();
                i++;
            }
        } catch (Exception e) {
            System.out.println("Valor informado inválido.");
        }
        for (String q : num){
            System.out.println(o+"º número = "+q);
            o++;
        }
        numScanner.close();
    }
}
