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
        // System.out.println(list);

        // get opretion
        int element = list.get(2);
        // System.out.println(element);

        // Delete element
        list.remove(2);
        // System.out.println(list);

        // set element
        list.set(1, 10);
        // System.out.println(list);

        // contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(9));

        // Siz of Array list

        int a = list.size();
        // System.out.println(a);

        for (int i = 0; i < list.size(); i++) {
            // System.out.print(i + " ");
        }
        // System.out.println("Rivors if List");
        // revorse trversing of ArryList
        for (int i = list.size() - 1; i >= 0; i--) {
            // System.out.print(i + " ");
        }

        // maxList(list);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // max = Math.max(max, list.get(i));
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        // System.out.println(max);

        // Swaping in arrayList
        ArrayList<Integer> list_a = new ArrayList<>();
        list_a.add(1);
        list_a.add(4);
        list_a.add(3);
        list_a.add(6);
        list_a.add(5);
        list_a.add(2);
        System.out.println(list_a);
        Swep(list_a, 1, 2);
        System.out.println(list_a);

        // Sortinig of arrrayList

        // # ascending order
        Collections.sort(list_a);
        System.out.println(list_a);

        // # descending order
        // here we are useing comparator for definig the fix logic reverseOrder() is a
        // comparator
        Collections.sort(list_a, Collections.reverseOrder());
        System.out.println(list_a);

    }

    // Max of a ArrayList
    public static void maxList(ArrayList<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // max = Math.max(max, list.get(i));
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    // Swaping in arrayList
    public static void Swep(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

}
