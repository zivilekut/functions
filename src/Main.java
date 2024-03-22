import java.util.Arrays;
import java.util.Objects;

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
        int[] arr6 = intArr(min, max, length);
        printArr(arr6);

        System.out.println("~~~~~~~~~~~~~~~~~ 7 užduotis ~~~~~~~~~~~~~~~~~");
//7. Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
        System.out.println(sum6TaskArr(arr6));

        System.out.println("~~~~~~~~~~~~~~~~~ 8 užduotis ~~~~~~~~~~~~~~~~~");
//8. Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
        System.out.println(avg6TaskArr(arr6));  //neapvalina teisingai

        System.out.println("~~~~~~~~~~~~~~~~~ 9 užduotis ~~~~~~~~~~~~~~~~~");
//9. Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
// Pirmas int - išoriniam ciklui, antras vidiniam.
        rectangle(3, 4);

        System.out.println("~~~~~~~~~~~~~~~~~ 10 užduotis ~~~~~~~~~~~~~~~~~");
//10. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
// Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
        String sentence = "Man reikia atostogų.";
        numberOfChar(sentence);

        System.out.println("~~~~~~~~~~~~~~~~~ 11 užduotis ~~~~~~~~~~~~~~~~~");
//11. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
// Pvz “Naglis” turi gautis “silgaN”

        String sentence2 = "Feliz Navidad";
        System.out.println(reverse(sentence2));

        System.out.println("~~~~~~~~~~~~~~~~~Sunkesni~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~ 1 užduotis ~~~~~~~~~~~~~~~~~");
//1. Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje
// ir gale. PVZ (---labas---)
        textWithHyphens("labas");

        System.out.println("~~~~~~~~~~~~~~~~~ 2 užduotis ~~~~~~~~~~~~~~~~~");
//2. Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu. Jei
// tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
        int stringLength = 10;
        String text = generateRndStr(stringLength);
        System.out.println(text);
        randomStringSplit(text);


        System.out.println("~~~~~~~~~~~~~~~~~ 3 užduotis ~~~~~~~~~~~~~~~~~");
//3. Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos argumentas dalijasi be liekanos
// (išskyrus vienetą ir patį save).
        System.out.println(divisionWithoutRemainder(2));

        System.out.println("~~~~~~~~~~~~~~~~~ 4 užduotis ~~~~~~~~~~~~~~~~~");
//4. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77. Išrūšiuokite masyvą
// pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.
        sortArr();
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~ 5 užduotis ~~~~~~~~~~~~~~~~~");
//5. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777. Naudodami 3 uždavinio
// funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.
        primaryNumbers();

//6. (NEveikia, nedaryti) Sugeneruokite atsitiktinio (nuo 10 iki 20) ilgio masyvą, kurio visi, išskyrus paskutinį,
// elementai yra atsitiktiniai skaičiai nuo 0 iki 10, o paskutinis masyvas, kuris generuojamas pagal tokią pat salygą
// kaip ir pirmasis masyvas. Viską pakartokite atsitiktinį nuo 10 iki 30  kiekį kartų. Paskutinio masyvo paskutinis
// elementas yra lygus 0;
//7. (NEveikia, nedaryti)Suskaičiuokite šešto uždavinio elementų, kurie nėra masyvai, sumą. Skaičiuoti reikia visuose
// masyvuose ir submasyvuose.
        System.out.println("~~~~~~~~~~~~~~~~~ 8 užduotis ~~~~~~~~~~~~~~~~~");
//8. Sugeneruokite masyvą iš trijų elementų, kurie yra atsitiktiniai skaičiai nuo 1 iki 33. Jeigu tarp trijų paskutinių
// elementų yra nors vienas ne pirminis skaičius, prie masyvo pridėkite dar vieną elementą- atsitiktinį skaičių nuo 1
// iki 33. Vėl patikrinkite pradinę sąlygą ir jeigu reikia pridėkite dar vieną elementą. Kartokite, kol sąlyga
// nereikalaus pridėti elemento.
        primaryArr();
//9. Sugeneruokite masyvą iš 10 elementų, kurie yra masyvai iš 10 elementų, kurie yra atsitiktiniai skaičiai nuo 1
// iki 100. Jeigu tokio didelio masyvo (ne atskirai mažesnių) pirminių skaičių vidurkis mažesnis už 70, suraskite
// masyve mažiausią skaičių (nebūtinai pirminį) ir prie jo pridėkite 3. Vėl paskaičiuokite masyvo pirminių skaičių
// vidurkį ir jeigu mažesnis nei 70 viską kartokite.

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
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //5. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random
    // int skaičių ir jį gražintų.
    public static int rndNumber(int min, int max) {
        return min + (int) Math.round(Math.random() * (max - min));
    }

    //6. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo
    // kintamuosius, min, max ir length reikšmėms nustatyti.
    public static int[] intArr(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rndNumber(min, max);
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

        return sum6TaskArr(array) / (double) array.length;
    }

    //9. Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
    // Pirmas int - išoriniam ciklui, antras vidiniam.
    public static void rectangle(int rows, int columns) {
        String[][] rectangle = new String[rows][columns];

        String asterisk = "* ";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rectangle[i][j] = asterisk;
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }

    //10. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
    // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
    public static void numberOfChar(String sentence) {
        char[] characters = sentence.toCharArray();

        int charNumber = 0;
        int spaceNumber = 0;
        for (char character : characters) {

            if (Objects.equals(character, ' ')) {
                spaceNumber++;

            } else {
                charNumber++;

            }
        }
        System.out.println("Simbolių iš viso: " + sentence.length());
        System.out.println("Tarpų: " + spaceNumber);
        System.out.println("Kitų simbolių: " + charNumber);
    }

    //11. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
    // Pvz “Naglis” turi gautis “silgaN”
    public static StringBuilder reverse(String sentence) {

        StringBuilder reverse = new StringBuilder();
        reverse.append(sentence);
        reverse.reverse();

        return reverse;
    }
    //////////////////////////////////////////SUNKESNI///////////////////////////////////////////////////////////

    //1. Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje
    // ir gale. PVZ (---labas---)
    public static void textWithHyphens(String text) {
        System.out.println("---" + text + "---");
    }

    //2. Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu. Jei
    // tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static void randomStringSplit(String txt) {
        String number = "";

        for (int i = 0; i < txt.length(); i++) {
            char currentChar = txt.charAt(i);
            if (Character.isDigit((currentChar))) {
                number += currentChar;
            } else {

                if (number.length() > 0) {
                    System.out.println("[" + number + "]");

                }
                System.out.println(txt.charAt(i));
                number = "";
            }

        }
        if (number.length() > 0) {
            System.out.println("[" + number + "]");

        }


    }

    //3. Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos argumentas dalijasi be liekanos
    // (išskyrus vienetą ir patį save).
    public static int divisionWithoutRemainder(int number) {
        if (number <= 1) {
            return 0;
        }

        int divisionsWithoutRemainder = 0;

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                divisionsWithoutRemainder++;
            }
        }

        return divisionsWithoutRemainder;
    }

    //4. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77. Išrūšiuokite masyvą
    // pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.
    public static void sortArr() {
        int[] arr = intArr(33, 77, 100);
        System.out.println("Atsitiktiniai skaičiai: ");
        printArr(arr);

        System.out.println("Jų daliklių skaičius: ");
        for (int number : arr) {
            System.out.print(divisionWithoutRemainder(number) + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (divisionWithoutRemainder(arr[j + 1]) > divisionWithoutRemainder(arr[j])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        printArr(arr);
    }

    //5. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777. Naudodami 3 uždavinio
    // funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.
    public static void primaryNumbers() {
        int[] arr = intArr(333, 777, 100);
        System.out.println("Atsitiktiniai skaičiai: ");
        printArr(arr);
        int primiryNumbersCounter = 0;
        for (int number : arr) {
            if (divisionWithoutRemainder(number) == 0) {
                primiryNumbersCounter++;
            }

        }
        System.out.println("Iš jų " + primiryNumbersCounter + " yra pirminiai.");
    }

    //8. Sugeneruokite masyvą iš trijų elementų, kurie yra atsitiktiniai skaičiai nuo 1 iki 33. Jeigu tarp trijų paskutinių
    // elementų yra nors vienas ne pirminis skaičius, prie masyvo pridėkite dar vieną elementą- atsitiktinį skaičių nuo 1
    // iki 33. Vėl patikrinkite pradinę sąlygą ir jeigu reikia pridėkite dar vieną elementą. Kartokite, kol sąlyga
    // nereikalaus pridėti elemento.
    public static void primaryArr() {
        int[] arr = intArr(1, 33, 3);
        System.out.println("Array: ");
        printArr(arr);
        while ((divisionWithoutRemainder(arr[arr.length - 1]) != 0) ||
                (divisionWithoutRemainder(arr[arr.length - 2]) != 0) ||
                (divisionWithoutRemainder(arr[arr.length - 3]) != 0)) {
            if (divisionWithoutRemainder(arr[arr.length - 1]) != 0) {
                arr[arr.length - 1] = rndNumber(1, 33);
            }
            if (divisionWithoutRemainder(arr[arr.length - 2]) != 0) {
                arr[arr.length - 2] = rndNumber(1, 33);
            }
            if (divisionWithoutRemainder(arr[arr.length - 3]) != 0) {
                arr[arr.length - 3] = rndNumber(1, 33);
            }
            System.out.println("Updated array: ");
            printArr(arr);
        }
    }

}
