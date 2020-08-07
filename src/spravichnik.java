import java.util.*;
public class spravichnik {
    public static String[][] Add(String name , String phone , String [][]list){
        int size_column = list.length; // считает не в индексах а в колл. элементов в транзитном списке
        int size_rows = 2; // строки не меняются
        String [][] list_new = new String[size_column+1][size_rows]; // здесь мы увеличиваем наш массив на 1 строку
        for(int i = 0 ; i<size_column ; i++){
            for(int j = 0 ; j<size_rows ; j++){
                list_new[i][j] = list[i][j]; // в новый лист заполняем элементы старого
            }
        }
        list_new[size_column][0] = name; //даем обозначения нашим столбцам в последней строке в новом массиве
        list_new[size_column][1] = phone;
        return  list_new;
    }
    public static void display(String[][] list) {
        for(int j = 0 ; j<list.length ; j++){
            System.out.print("имя " + list[j][0] + '\t');
            System.out.print("телефон " + list[j][1] + '\t');
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
        while (scan.hasNext()){
            new_name = scan.nextLine();
            new_phone = scan.nextLine();
            new_list = Add(new_name, new_phone, new_list);
            display(new_list);
        }
    }
}
