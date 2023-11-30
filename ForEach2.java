package FoeEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEach2 {
    public static void main(String[] args) {
        List<String> participantes = new ArrayList<>();
        participantes.add("Julio");
        participantes.add("Luiz");
        participantes.add("Victor");
        participantes.add("Mateus");

        realizarSorteio(participantes);
    }

    public static void realizarSorteio(List<String> participantes) {
        List<String> copiaParticipantes = new ArrayList<>(participantes);

        Collections.shuffle(copiaParticipantes);

        int i = 0;
        for (String participante : participantes) {
            String amigoSecreto = copiaParticipantes.get(i);
            System.out.println(participante + " tirou " + amigoSecreto);
            i++;
        }
    }
}
