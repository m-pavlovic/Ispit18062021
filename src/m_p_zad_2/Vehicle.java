package m_p_zad_2;

/*
Lako uočavate da je jedna klasa apstraktna! Metoda description daje samo ispis toString metode. U glavnom dijelu programa napravite po dva objekta klase Boat i klase Car te ih dodajte u listu. Glavna, testna klasa treba imati dvije metode i to:

listAll → koja daje pregled svih vozila u listi (samo description je dovoljno)
callAllMethods → pokreće metode runEngine, move, getEnergy i stopEngine svakog vozila u listi
Klasa RandomDirection vam je pomoćna klasa koja generira direction i speed za metodu move vozila. Direction se generira slučajno iz niza stringova {"North", "East", "West", "South"}, a speed slučajno u intervalu od MIN do MAX (npr. 1 do 100).

Konzolni izlaz za jedan primjer koji ima samo jedan brod i jedan automobil je:

List all vehicles:
Boat{boatName='BOAT-NAME-1', id=30}
Car{model='cabrioCar', id=33}

------------------------------------------------------
Running engine for the -> Boat
Boat is moving:
	 direction: South	 speed: 52.764489459669946
In the case of an electric boat ensure battery power, otherwise, get the fuel!
Stop engine for the -> Boat
------------------------------------------------------

------------------------------------------------------
Running engine for the -> Car
Car is moving:
	 direction: West	 speed: 10.116427533161161
In the case of an electric car ensure battery power, otherwise, get the fuel!
Stop engine for the -> Car
 */

public interface Vehicle {

        String description();

        void runEngine();

        void move();

        void getEnergy();

        void stopEngine();
}
