
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2011);

        SimpleDate newDate = date.afterNumberOfDays(4);
        System.out.println(newDate);
        }
}
