package first;

/* Napisz funkcję drukującą do konsoli
 * dzień tygodnia na podstawie przekazanego parametru.
 * Sprawdz, czy dzien nie wykracza poza zakres,
 * jesli tak zwroc blad. Wykorzystaj konstrukcję
 * switch...case
 */
public class Zadanie2 {
    void getDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There's no such day");
                break;
        }
    }

    void getDayOfTheWeekTwo(int day) {
        String myDay;
        switch (day) {
            case 1:
                myDay = "Monday";
                break;
            case 2:
                myDay = "Tuesday";
                break;
            case 3:
                myDay = "Wednesday";
                break;
            case 4:
                myDay = "Thursday";
                break;
            case 5:
                myDay = "friday";
                break;
            case 6:
                myDay = "Saturday";
                break;
            case 7:
                myDay = "Sunday";
                break;
            default:
                myDay = "nie ma takiego dnia tygodnia";
                break;
        }
        System.out.println(myDay);
    }
}
