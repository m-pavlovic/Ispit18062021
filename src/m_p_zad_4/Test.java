package m_p_zad_4;

/*
Klasa Country ima metodu koja vraća listu sudionika koja se generira slučajno iz prethodnog niza za željeni broj sudionika num koji se definira pri pozivu te metode. Za slučaj da je taj broj jednak ili veći broju država u navedenom nizu vraća se lista sa svim državama. Klasa WorldCup ima metodu worldCupInYear koja od korisnika traži unos godine svjetskog prvenstva (ne traži se provjera korisničkog unosa) i za tu godinu generira listu sudionika slučajnim odabirom opisanim ranije. Nadalje imamo zadano sljedeće specifikacije:


read4File → čita sve podatke iz .txt datoteke i ispisuje ih u konzolu
Testiranje provedite na sljedeći način:

1. Kreirajte i ispišite listu sudionika (5) za npr. 1982. godinu
2. Spremite te podatke u datoteku worldCup.txt
3. Kreirajte i ispišite listu sudionika (4) za npr. 1990. godinu
4. Spremite te podatke u datoteku worldCup.txt
5. Kreirajte i ispišite listu sudionika (3) za 2010. godinu
6. Spremite te podatke u datoteku worldCup.txt
7. Pročitajte i prikažite u konzoli podatke iz datoteke worldCup.txt
 */

/*
expected output
Enter a year:
1982

[USA, Sweeden, Island, Australia, Spain, Turkey]
Participants in the WorldCup - 1982
USA
Sweeden
Island
Australia
Spain
Turkey

Enter a year:
1990

[Australia, Russia, New Zealand, Brasil, Kongo]
Participants in the WorldCup - 1990
Australia
Russia
New Zealand
Brasil
Kongo

Enter a year:
2010

[Japan, Turkey, Australia, Kongo]
Participants in the WorldCup - 2010
Japan
Turkey
Australia
Kongo

-----------------------------------------------------------
From file worldCup.txt:
-----------------------------------------------------------
Participants in the WorldCup - 1982
USA
Sweeden
Island
Australia
Spain
Turkey
-----------------------------------------------------------
Participants in the WorldCup - 1990
Australia
Russia
New Zealand
Brasil
Kongo
-----------------------------------------------------------
Participants in the WorldCup - 2010
Japan
Turkey
Australia
Kongo
 */

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
                WorldCup wc = new WorldCup();
                System.out.println("Enter a year:");
                Scanner sc = new Scanner(System.in);
                int year = sc.nextInt();
                wc.worldCupInYear(year);
                wc.listParticipants();
                wc.save2File("worldCup.txt");
                sc.reset();
                System.out.println("Enter a year:");
                year = sc.nextInt();
                wc.worldCupInYear(year);
                wc.listParticipants();
                wc.save2File("worldCup.txt");
                sc.reset();
                System.out.println("Enter a year:");
                year = sc.nextInt();
                wc.worldCupInYear(year);
                wc.listParticipants();
                wc.save2File("worldCup.txt");
                wc.read4File("worldCup.txt");
        }
}
