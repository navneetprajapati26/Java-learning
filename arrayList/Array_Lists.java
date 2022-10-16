package arrayList;

import java.util.*;;

// # Dynamic size
// # Primitiv data type can't be stored directly
// # Part of java colection freamwork
// 1) Add Element TC-> O(1)
// 2) Get Element TC-> O(1)
// 3) Remove Element TC-> O(n)
// 4) Set Element at Index TC-> O(n)
// 5) Contains Element TC-> O(n)

public class Array_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Opretion
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 9);
        System.out.println(list);

        // get opretion
        int element = list.get(2);
        System.out.println(element);

        // Delete element
        list.remove(2);
        System.out.println(list);

        // set element
        list.set(1, 10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(9));

    }

}
