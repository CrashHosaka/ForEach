package FoeEach;

public class ForEach1 {
    public static void main(String[] args) throws InterruptedException {
        String[] cor = {"vermelho","azul","verde","amarelo","laranja","roxo"};

        for (String i: cor){
            Thread.sleep(1000);
            System.out.println("A cor é "+i);
        }
    }
}
