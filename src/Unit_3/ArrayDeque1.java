package Unit_3;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.add("1st");
        adq.addFirst("0");

        System.out.println(adq);
        System.out.println(adq.offerFirst("-1"));
        System.out.println(adq.offerLast("3"));
        System.out.println(adq);
    }
}
