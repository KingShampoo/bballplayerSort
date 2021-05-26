
import java.util.*;
public class Driver {

    public static void main(String[] args) {
        ArrayList<BasketballPlayer> bbPlayers = new ArrayList(5);

        BasketballPlayer b1 = new BasketballPlayer("Jay","Smith",12.7);
        BasketballPlayer b2 = new BasketballPlayer("DeShaun", "Smith",12.7);
        BasketballPlayer b3 = new BasketballPlayer("Taylor", "DeShaun",18.1);
    
        bbPlayers.add(b1);
        bbPlayers.add(b2);
        bbPlayers.add(b3);//add players to arraylist
        
        System.out.print("Initial array: [");//print arraylist AS IS, im sure there was a better way to format these print lines
        for(BasketballPlayer bplayer:bbPlayers){
            System.out.print(bplayer.toString()+", ");
        }
        System.out.print("]\n");

        Collections.sort(bbPlayers, BasketballPlayer.ppgSort);//sort by ppg first and print

        System.out.print("sort by ppg: [");
        for(BasketballPlayer bplayer:bbPlayers){
            System.out.print(bplayer.toString()+", ");
        }
        System.out.print("]\n");

        Collections.sort(bbPlayers, BasketballPlayer.lastNameSort);//sort by last name next and print
        
        System.out.print("sort by last name: [");
        for(BasketballPlayer bplayer:bbPlayers){
            System.out.print(bplayer.toString()+", ");
        }
        System.out.print("]\n");

        Collections.sort(bbPlayers, BasketballPlayer.firstNameSort);//sort by first name and print
        
        System.out.print("sort by first name: [");
        for(BasketballPlayer bplayer:bbPlayers){
            System.out.print(bplayer.toString()+", ");
        }
        System.out.print("]\n");
    

    

    }
}
