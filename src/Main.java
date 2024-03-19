public class Main {
    public static void main(String[] args) {
        sayHi();
        sayHiTo("Živilė");
        String vardas = "Živilė";
        sayHiTo(vardas);
        printRndIntChoice(14, 20);
        double result = simPI();
        System.out.println(result);
        System.out.println(simPI());
        System.out.println(formatNameCase("nAGLIS"));

        System.out.println("~~~~~~~~~~~~~~~~~Lengvesni~~~~~~~~~~~~~~~~~");
//1. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
        System.out.println("~~~~~~~~~~~~~~~~~ 1 užduotis ~~~~~~~~~~~~~~~~~");

        sum2Int(5, 3);

        System.out.println("~~~~~~~~~~~~~~~~~ 2 užduotis ~~~~~~~~~~~~~~~~~");
//2. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
// Gautą reikšmę atspausdinkite.
        System.out.println(PISq());

        System.out.println("~~~~~~~~~~~~~~~~~ 3 užduotis ~~~~~~~~~~~~~~~~~");
//3. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.;
// Gautą reikšmę atspausdinkite.
        System.out.println(multiply2Int(5, 6));

        System.out.println("~~~~~~~~~~~~~~~~~ 4 užduotis ~~~~~~~~~~~~~~~~~");
//4. Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių vienoje eilutėje.
        int[] arr = {5, 8, 9, 6};
        printArr(arr);

        System.out.println("~~~~~~~~~~~~~~~~~ 5 užduotis ~~~~~~~~~~~~~~~~~");
//5. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random
// int skaičių ir jį gražintų.
        System.out.println(rndNumber(2, 6));

        System.out.println("~~~~~~~~~~~~~~~~~ 6 užduotis ~~~~~~~~~~~~~~~~~");
//6. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo
// kintamuosius, min, max ir length reikšmėms nustatyti.
        int min = 1;
        int max = 10;
        int length = 5;
        printArr(intArr(min, max, length));

        System.out.println("~~~~~~~~~~~~~~~~~ 7 užduotis ~~~~~~~~~~~~~~~~~");
//7. Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
        System.out.println(sum6TaskArr(intArr(min, max, length))); //generauoja naują array?

        System.out.println("~~~~~~~~~~~~~~~~~ 8 užduotis ~~~~~~~~~~~~~~~~~");
//8. Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
        System.out.println(avg6TaskArr(intArr(min, max, length))); //generauoja naują array?

        System.out.println("~~~~~~~~~~~~~~~~~ 9 užduotis ~~~~~~~~~~~~~~~~~");
//9. Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
// Pirmas int - išoriniam ciklui, antras vidiniam.

//10. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
// Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
//11. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
// Pvz “Naglis” turi gautis “silgaN”.

    }

    ////////////////////////////////////////////TEORIJA///////////////////////////////////////////////////////////////
    // void nieko negrąžina, o kitos grąžina ir nurodo ką (double, string...)
    // priima ir grąžina reikšmę
    public static String formatNameCase(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    // grąžins reikšmę atgal į kodą, nes ne void. Void tiesiog atvaizduoja
    public static double simPI() {
        return 3.14;
    }

    public static void printRndIntChoice(int a, int b) {
        if (Math.random() > 0.5) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // funkcijos turi būti trumpos ir daryti po 1 dalyką, aiškus pavadinimas. Nepriima info.
    public static void sayHi() {
        System.out.println("Labas");
    }

    // funkcijoj galima nurodyti ar reikalausim inputo ar be nieko eis paleisti.
    public static void sayHiTo(String name) {
        System.out.println("Labas " + name + "!");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //1. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
    public static void sum2Int(int firstInt, int secondInt) {
        System.out.println(firstInt + secondInt);
    }

    //2. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
    // Gautą reikšmę atspausdinkite.
    public static double PISq() {
        return 9.8596;
    }

    //3. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.;
    // Gautą reikšmę atspausdinkite.
    public static int multiply2Int(int firstInt, int secondInt) {
        return firstInt * secondInt;
    }

    //4. Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių
    // vienoje eilutėje.
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //5. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random
    // int skaičių ir jį gražintų.
    public static int rndNumber(int min, int max) {
        return (int) (min + Math.round(Math.random() * (max - min)));
    }

    //6. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo
    // kintamuosius, min, max ir length reikšmėms nustatyti.
    public static int[] intArr(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (min + Math.round(Math.random() * (max - min)));
        }
        return array;
    }

    //7. Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
    public static int sum6TaskArr(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    //8. Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
    public static double avg6TaskArr(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }
}
