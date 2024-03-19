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
    }

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
}