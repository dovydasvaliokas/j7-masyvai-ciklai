import java.util.Scanner;

/**
 * Užduotis 3:
 * 1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
 * 2. Susikurti papildomą funkciją, kuri gauna double[] masyvas ir apskaičiuoja jo sumą, tačiau BŪTINAI naudokite while ciklą. Masyvo suma yra gana sena JavaScript uždutis, tačiau pasipraktikuokite while ciklą su paprastesne užduotimi, jog būtų lengviau kitoms (kur būtinai reikės while, nes for neveiks (būtų labai sunku užrašyti for))
 */
public class Uzduotis3 {
    public static void main(String[] args) {
        double[] skaiciai = masyvoNuskaitymas();


    }

    /**
     * Nuskaito skaičių massyvą iš konsolės
     * @return skaičių masyvą
     */
    public static double[] masyvoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek massyve bus skaičių: ");
        int n = skaitytuvas.nextInt();
        double[] skaiciai = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį skaičių: ");
            skaiciai[i] = skaitytuvas.nextDouble();
        }
        return skaiciai;
    }

}
