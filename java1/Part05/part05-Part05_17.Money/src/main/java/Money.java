
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int cents = this.cents + addition.cents();
        int euros = this.euros + addition.euros();
        if (cents > 99) {
            euros += cents / 100;
            cents = cents % 100;
        }
        Money newMoney = new Money(euros, cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() > compared.euros()) {
            return false;
        }
        
        if (this.cents() < compared.cents()) {
            return true;
        } else {
            return false;            
        }
            
    }
    
    public Money minus(Money decreaser) {
        int cents = this.cents - decreaser.cents();
        int euros = this.euros - decreaser.euros();
        if (cents < 0) {
            euros -= 1;
            cents += 100;
        }
        
        if (euros < 0) {
            euros = 0;
            cents = 0;
        }
        Money newMoney = new Money(euros, cents);
        
        return newMoney;
    }

}
