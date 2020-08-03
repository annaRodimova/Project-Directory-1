import java.util.*;
public class spravichnik {
    public static String[][] Add(String name , String phone , String [][]list){
        int size_column = list.length;
        int size_rows = 2;
        String [][] list_new = new String[size_column+1][size_rows];
        for(int i = 0 ; i<size_column ; i++){
            for(int j = 0 ; j<size_rows ; j++){
                list_new[i][j] = list[i][j];
            }
        }
        list_new[size_column][size_rows-2] = name;
        list_new[size_column][size_rows-1] = phone;
        return  list_new;
    }
    public static void display(String[][] list) {
        for(int j = 0 ; j<list.length ; j++){
            for (int i = 0 ; i<2 ; i++) {
                System.out.print(list[j][i] + '\t');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        String[][] list = new String[0][2];
        Scanner scan = new Scanner (System.in);
        String new_name = scan.nextLine();
        String new_phone = scan.nextLine();
        String[][] new_list = Add(new_name, new_phone, list);
        display(new_list);
    }
}
