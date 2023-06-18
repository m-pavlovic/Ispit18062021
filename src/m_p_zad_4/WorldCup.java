package m_p_zad_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldCup {

    private Scanner sc;
    private Country country;
    private ArrayList<String> part;
    private String year;


    public WorldCup() {
        sc = new Scanner(System.in);
        country = new Country();
        part = new ArrayList<String>();
    }


    public void worldCupInYear(int year) {
        this.year = Integer.toString(year);
        System.out.println("World Cup in " + year);
    }

    public void listParticipants() {
        System.out.println("How many participants?");
        int n = sc.nextInt();
        part = country.getParticipants(n);
        System.out.println("Participants:");
        for (String s : part) {
            System.out.println(s);
        }
    }
//
    public void save2File(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println("Error creating file");
        }


    }

    public void read4File(String fileName) {
        File file = new File(fileName);
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }

    }




}
