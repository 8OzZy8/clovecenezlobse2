package hlavni;
import java.util.*;
public class kostka {
    static public int randomkostka(){
        Random r=new Random();
        int cislo = r.nextInt(6);
        return(cislo);
    }
}
