package FoeEach;

import java.util.Scanner;

public class ForEach5 {
    public static void main(String[] args) {
        Scanner quantScanner = new Scanner(System.in);
        System.out.println("Quantos produtos desejá cadastrar?");
        int quant = quantScanner.nextInt();

        Scanner inventScanner = new Scanner(System.in);

        String[] invent = new String[quant];

        for (int i=0;i<quant;i++){
            System.out.println("Informe o "+(i+1)+"º produto.");
            invent[i] = inventScanner.nextLine();
        }

        int t = 1;

        for (String i : invent) {
            System.out.println(t+"º produto: "+i);
            t++;
        }

        quantScanner.close();
        inventScanner.close();
    }
}
