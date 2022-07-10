import java.util.Arrays;
import java.util.Scanner;

/*
Užduotis 4:
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurkite papildomą funkciją, kuri patikrina ar skaičius yra neigiamas.
3. Susikurti papildomą funkciją, kuri gauna int[] masyvas ir visus neigiamus skaičius, naudojant Math.abs() konvertuotų į priešingus ir išsaugotų tai masyve. T.y., jei funkcija gauna masyvas = {3, -24, 8, 4, -7, 3, -21} tai po funkcijos masyvas turėtų būti masyvas = {3, 24, 8, 4, 7, 3, 21}

 */
public class Uzduotis4 {
    public static void main(String[] args) {
        int[] skaiciai = masyvoNuskaitymas();
        System.out.println("skaiciai = " + Arrays.toString(skaiciai));

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
}
