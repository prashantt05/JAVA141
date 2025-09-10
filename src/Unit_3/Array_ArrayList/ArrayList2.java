package Unit_3.Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            products.add(sc.next());
        }
        Collections.sort(products);
        Iterator it = products.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+ ",");
        }

        products.add(1,"apple");
        products.addLast("Zebra");
        products.addFirst("Orange");
        System.out.println(products.get(1));
    }

}
