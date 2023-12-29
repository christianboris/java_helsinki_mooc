
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day += 1;
        if (this.day > 30) {
            this.month += 1;
            this.day = 1;
        }
        
        if (this.month > 12) {
            this.year += 1;
            this.month = 1;
        }
    }
    
    public void advance(int howManyDays){
        for (int i = 1; i <= howManyDays; i++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int newday = this.day + days;
        int newmonth = this.month;
        int newyear = this.year;
        if (newday > 30) {
            newmonth += (int)(newday / 30);
            newday = newday % 30;
        }
        
        if (newmonth > 12) {
            newyear += (int)(newmonth / 12);
            newmonth = newmonth % 12;
        }
        
        SimpleDate clone = new SimpleDate(newday, newmonth, newyear);
        return clone;
    }

}
