package m_p_zad_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
/*
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

 */
    public void save2File(String fileName) {
//        File file = new File(fileName);
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(file, true);
//            String str = "Participants in the WorldCup - " + year + "\n";
//            byte[] b = str.getBytes();
//            fos.write(b);
//            for (String s : part) {
//                b = s.getBytes();
//                fos.write(b);
//                fos.write('\n');
//            }
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(part);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void read4File(String fileName) {
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            System.out.println("-----------------------------------------------------------");
            System.out.println("From file " + fileName + ":");
            System.out.println("-----------------------------------------------------------");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }




}
