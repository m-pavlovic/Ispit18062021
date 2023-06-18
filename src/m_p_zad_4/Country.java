package m_p_zad_4;

import java.util.ArrayList;

public class Country {

    private static String[] cntr = { "France", "Spain", "USA", "Croatia", "Deutschland", "Belgium", "Sweeden", "Canada",
            "Great Britain", "Russia", "Kongo", "Mexico", "Brasil", "Turkey", "S. Korea", "N. Korea", "Japan", "BiH",
            "Slovenia", "Chile", "Maroco", "New Zealand", "Australia", "Island", "Argentina", "Tunis" };


    public ArrayList<String> getParticipants(int n) {
        ArrayList<String> participants = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            participants.add(cntr[i]);
        }
        return participants;
    }
}
