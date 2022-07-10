import java.util.Arrays;
import java.util.Scanner;

/**
 * Užduotis 2:
 * 1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
 * 2. Susikurti papildomą funkciją, kuri gauna du int[] masyvus (galima ir listus - su jais lengviau ši užduotis) ir juos sudeda į vieną bendrą didelį ir jį grąžina. T.y., jeigu turime x = {3, 5, 8} ir y = {2, 7, 12, 9}, tai bendras sudėtas masyvas turėtų būti: rezultatas = {3, 5, 8, 2, 7, 12, 9}
 * PASTABA: NEGALIMA NAUDOTI SUKURTŲ JAVA FUNKCIJŲ. T.y., jokių array.copyOf(), jokių Java Collections, jokių Stream API, jums "sujungimo" funkciją reikia persidaryti patiems. Ko gali reikėti, tai masyvo ilgio, o jį Javoje kaip ir JS masyvas.length
 */
public class Uzduotis2 {
    public static void main(String[] args) {
        int[] masyvas1 = masyvoNuskaitymas();
        int[] masyvas2 = masyvoNuskaitymas();

        System.out.println("masyvas1 = " + Arrays.toString(masyvas1));
        System.out.println("masyvas2 = " + Arrays.toString(masyvas2));

        int[] jungtinis = masyvuSujungimas(masyvas1, masyvas2);
        System.out.println("jungtinis = " + Arrays.toString(jungtinis));

    }

    /**
     * Nuskaito skaičių massyvą iš konsolės
     * @return skaičių masyvą
     */
    public static int[] masyvoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek massyve bus skaičių: ");
        int n = skaitytuvas.nextInt();
        int[] skaiciai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį skaičių: ");
            skaiciai[i] = skaitytuvas.nextInt();
        }
        return skaiciai;
    }

    /**
     * Funkcija sujungiu du masyvus į vieną
     * @param m1 pirmas masyvass
     * @param m2 antras masyvas
     * @return int[] masyvą, kuriame yra abiejų masyvų elementai sujungti į vieną
     */
    public static int[] masyvuSujungimas(int[] m1, int[] m2) {
        int bendrasDydis = m1.length + m2.length;
        int[] bendrasMasyvas = new int[bendrasDydis];
        for (int i = 0; i < m1.length; i++) {
            bendrasMasyvas[i] = m1[i];
        }

        for (int i = 0; i < m2.length; i++) {
            bendrasMasyvas[i + m1.length] = m2[i];
        }
        return bendrasMasyvas;
    }
}
