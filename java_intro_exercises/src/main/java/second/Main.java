package second;

public class Main {

    public static void main(String[] args) {
		zad0();
        zad1();
       zad2();
       zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad12();
        int[] tab = {1, 3, 5, 7, 8, -3};
        int[] tabTwo = {13, 3, 14, -3, 15, 176};
    }

    private static void zad12() {
        Zadanie12 zad = new Zadanie12();
        System.out.println(zad.earsCount(4));
    }

    private static void zad10() {
        Zadanie10 zad = new Zadanie10();

        zad.showPrimes(15);
        System.out.println("============");
    }

    private static void zad9() {
        Zadanie9 zad = new Zadanie9();
        System.out.println(zad.palindrome("cokolwiek"));
        System.out.println(zad.palindrome("MAOam"));
    }

    private static void zad8() {
        Zadanie8 zad = new Zadanie8();
        zad.showAddres("Cicha", 89);
    }

    private static void zad7() {
        Zadanie7 zad = new Zadanie7();

        zad.printNumbersTwo(10);
        System.out.println("==================");
        zad.printNumbersTwo(100);
    }

    private static void zad6() {
        Zadanie6 zad = new Zadanie6();
        System.out.println(zad.reverseWord("accident"));
    }

    private static void zad5() {
        Zadanie5 zad = new Zadanie5();
        System.out.println(zad.changeChars("An accident? Yeah."));
    }

    private static void zad4() {
        Zadanie4 zad = new Zadanie4();
        zad.lengthOfWords("Co moge tuwypisać, żebysprawdzić działanie programu", 9);
        System.out.println("=========");
        zad.lengthOfWords("Co moge tuwypisać, żebysprawdzić działanie programu", 12);

    }

    private static void zad3() {
        Zadanie3 zad = new Zadanie3();
        System.out.println(zad.changeLetters("na not today,no not today"));
    }

    private static void zad2() {
        Zadanie2 zad = new Zadanie2();
        int[] tab = {1, 3, 5, 7, 8, -3};
        int[] tabTwo = {13, 3, 14, -3, 15, 176};
        // zad.showDifferentNumbers(tab, tabTwo);
        zad.printBoth(tab, tabTwo);
    }

    private static void zad1() {
        Zadanie1 zad = new Zadanie1();
        int[] tab = {1, 3, 5, 7, 8, -3};
        int[] tabTwo = {13, 3, 14, -3, 15, 176};
        zad.sameNumbers(tab, tabTwo);

    }

    private static void zad0() {
        int[] tab = {1, 3, 5, 3, 7, 8, -3};

        Zadanie0 zad = new Zadanie0();
        System.out.println(zad.returnArg(tab, 8));
        System.out.println(zad.returnArg(tab, 3));
        System.out.println(zad.returnArg(tab, 2));
    }
}
