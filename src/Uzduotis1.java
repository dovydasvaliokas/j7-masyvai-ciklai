/*
Užduotis 1:
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri patikrina ar skaičius yra pirminis (prime). Skaičius yra pirminis, tik tada jeigu jis dalinasi TIK iš savęs ir iš vieneto. Keletas pirminių skaičių pavyzdžių: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113
Pastaba: galima eiti nuo 0 iki x ir skaičiuoti iš kelių skaičių, x dalinasi be liekanos. Jeigu tik iš vieneto ir pačio savęs, tai tada x yra pirminis. Jeigu iš daugiau - tai tada ne pirminis.
3. Susikurkite papildomą funkciją, kuri suskaičiuoja kiek yra pirminių skaičių masyve.

 */
public class Uzduotis1 {
    public static void main(String[] args) {
        System.out.println("arPirminis(11) = " + arPirminis(11));
        System.out.println("arPirminis(20) = " + arPirminis(20));
        System.out.println("arPirminis(111) = " + arPirminis(111));
    }

    /**
     * Patikrina ar skaičius yra pirminiss
     * @param skaicius tikrinamas skaičius
     * @return true, jeigu pirminis, false jeigu ne
     */
    public static boolean arPirminis(int skaicius) {
        for (int i = 2; i < skaicius / 2; i++) {
            if (skaicius % i == 0) {
                return false;
            }
        }
        return true;
    }
}
