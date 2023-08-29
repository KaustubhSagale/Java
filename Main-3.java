import java.util.*;
/*Name: Kaustubh Sagale
  Roll Number: 27051
  SE-IT-B
*/
interface vehicles_27051{
    void gearChange();
    void SpeedUp();
    void applyBreak();
}

class bycycle implements vehicles_27051{
    public void gearChange(){
        System.out.println("Changing the gear of Bycycle Gear...");
    }
    public void SpeedUp(){
        System.out.println("Speed Up the Bycycle");
    }
    public void applyBreak(){
        System.out.println("Applying the break to Bycycle ...");
    }
}
class car implements vehicles_27051{
    public void gearChange(){
        System.out.println("Changing gear of the car Gear...");
    }
    public void SpeedUp(){
        System.out.println("Speed Up the car");
    }
    public void applyBreak(){
        System.out.println("Applying the break to car ...");
    }
}
class bike implements vehicles_27051{
    public void gearChange(){
        System.out.println("Changing the gear of bike Gear...");
    }
    public void SpeedUp(){
        System.out.println("Speed Up the bike");
    }
    public void applyBreak(){
        System.out.println("Applying the break to bike ...");
    }
}
public class Main {
	
  public static void main(String[] args) {
       car c=new car();
       c.gearChange();
       c.SpeedUp();
       c.applyBreak();
    
    System.out.println("........................................");
        bike b=new bike();
       b.gearChange();
       b.SpeedUp();
       b.applyBreak();
       
       System.out.println("........................................");
       bycycle l=new bycycle();
       l.gearChange();
       l.SpeedUp();
       l.applyBreak();
  }
}