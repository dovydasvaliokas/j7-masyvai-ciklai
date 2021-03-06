import java.util.Scanner;

/**
 * Užduotis 5:
 * 1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
 * 2. Susikurti papildomą funkciją, kuri gauna String zodis ir patikrina ar jis yra vyriškos giminės galūnės. t.y. žodžių, kurie baigiasi as, us ar is galūnėmis.
 * 3. Susikurti papildomą funkciją, kuri gauna String[] masyvas ir patikrintų kiek masyve yra vyriškos giminės žodžių,  Pvz., jeigu turime masyvą zodziai = {"kelmas", "botAGAS", "laumė", "mašina", "burlaivis"}, tai turėtų grąžinti atsakymą 3, kadangi jame yra trys žodžiai, kurie baigiasi vyriška galūn
 */
public class Uzduotis5 {
    public static void main(String[] args) {
        String[] zodziai = masyvoNuskaitymas();
        int kiekVyriskosGiminesZodziu = kiekVyriskosGiminesZodziu(zodziai);
        System.out.println("kiekVyriskosGiminesZodziu = " + kiekVyriskosGiminesZodziu);
    }

    /**
     * Patikrina ar žodis yra vyriškos giminės (baigiasi galūne "is", "as" arba "us"
     * Funkcija ignoruoja didžiųjų/mažųjų raidžių skirtumą (not case-sensitive)
     * @param zodis tikrinamas žodis
     * @return true jeigu vyriškoss giminės, false jeigu ne
     */
    public static boolean arVyriskoGiminesZodis(String zodis) {
        return zodis.toLowerCase().endsWith("as") || zodis.toLowerCase().endsWith("us") || zodis.toLowerCase().endsWith("is");
    }

    /**
     * Nuskaito žodžių massyvą iš konsolės
     * @return žodžių masyvą
     */
    public static String[] masyvoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek massyve bus žodžių: ");
        int n = skaitytuvas.nextInt();
        skaitytuvas.nextLine();
        String[] zodziai = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį žodį: ");
            zodziai[i] = skaitytuvas.nextLine();
        }
        return zodziai;
    }

    /**
     * Suskaičiuoja kiek masyve yra žodžių, kurie baigiassi vyriška galūne
     * @param zodziai žodžių masyvas
     * @return kiekį
     */
    public static int kiekVyriskosGiminesZodziu(String[] zodziai) {
        int kiekis = 0;
        for (String s : zodziai) {
            if (arVyriskoGiminesZodis(s)) {
                kiekis++;
            }
        }
        return kiekis;
    }
}
