
import java.util.Comparator;
public class BasketballPlayer {
    private String firstName;
    private String lastName;       
    private double ppg;

    public BasketballPlayer(String firstName, String lastName, Double ppg){//constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppg = ppg;
    }

    public double getppg() {//getters that i need
        return ppg;
    }
    
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override//have to override toString
    public String toString() {
    return lastName +", "+firstName+" ("+ppg+")" ;
    }


    public static Comparator<BasketballPlayer> ppgSort = new Comparator<BasketballPlayer>(){//since we are comparing by multiple fields,

        public int compare(BasketballPlayer b1, BasketballPlayer b2){                      // i opted to do it this way over doing it with override
            double ppg1 = b1.getppg();
            double ppg2 = b2.getppg();
            int returnValue = (int)(ppg2-ppg1);
            return returnValue;//this is descending order
        }
    };


    public static Comparator<BasketballPlayer> lastNameSort = new Comparator<BasketballPlayer>(){

        public int compare(BasketballPlayer b1, BasketballPlayer b2){
            String name1 = b1.getLastName().toLowerCase();
            String name2 = b2.getLastName().toLowerCase();
            int returnValue = name1.compareTo(name2);
            if (returnValue==0){
            name1 = b1.getFirstName().toLowerCase();
            name2 = b2.getFirstName().toLowerCase();
            return name1.compareTo(name2);
            } 
            return returnValue;
        }
    };
    
    public static Comparator<BasketballPlayer> firstNameSort = new Comparator<BasketballPlayer>(){

        public int compare(BasketballPlayer b1, BasketballPlayer b2){
            String name1 = b1.getFirstName().toLowerCase();
            String name2 = b2.getFirstName().toLowerCase();
            int returnValue = name1.compareTo(name2);
            if (returnValue==0){
            name1 = b1.getLastName().toLowerCase();
            name2 = b2.getLastName().toLowerCase();
            return name1.compareTo(name2);
            } 
            return returnValue;
        }
    };
}