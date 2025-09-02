package Unit_3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(23);
        al.add(44);
        al.add(15);
        al.add(19);

        for(int al1: al){
            System.out.print(al1 +" ");
        }
    }
}
