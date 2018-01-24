package first;

/* Napisz funkcję zwracającą miesiąc
 * na podstawie przekazanego parametru.
 * Wykorzystaj tablicę Stringów do przetrzymywania
 * nazw miesięcy.
 */
public class Zadanie3 {
    public String getMonth(int month){
        String[]months={"January", "February", "March","April", "May", "June", "july", "August", "September",
        "October", "November", "December"};
        if(month>=1 && month<=12){
            return months[month-1];
        }return"Nie ma takiego miesiąca";
    }
}
