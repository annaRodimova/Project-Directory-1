import java.util.*;
public class spravichnik {
    public static void main(String arga[]){
        String[][] list = new String[1][2];
        Scanner scan = new Scanner (System.in);
        list[0][0]= scan.nextLine();
        list[0][1]= scan.nextLine();
        System.out.println(list[0][1]+ list[0][0]);
    }
}
