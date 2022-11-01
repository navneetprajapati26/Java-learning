package arrayList;

import java.util.*;

public class Array_Lists_2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // System.out.println(mainList);
        // travertion of 2D Array list
        // TrevIn2D(mainList);

        // maxWaterImp();
        pairSumImp();

    }

    // travertion of 2D Array list
    public static void TrevIn2D(ArrayList<ArrayList<Integer>> mainList) {
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

    // Imp. Qus. # max water TC O(n^2)
    public static int maxWater(ArrayList<Integer> hight) {
        int maxWater = 0;
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int h = Math.min(hight.get(i), hight.get(j));
                int w = j - i;
                int currWater = h * w;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // Imp. Qus. # max water tow pointer approch TC O(n)
    public static int maxWAter_tow_pointer_approch(ArrayList<Integer> hight) {
        int maxWater = 0;
        int lp = 0;
        int rp = hight.size() - 1;

        while (lp < rp) {

            // water
            int h = Math.min(hight.get(lp), hight.get(rp));
            int w = rp - lp;
            int currWater = h * w;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (hight.get(lp) < hight.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }

    // Imp. Qus. # max water implimantetion
    public static void maxWaterImp() {
        ArrayList<Integer> hight = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        // System.out.println("Max Water is " + maxWater(hight));
        // System.out.println("Max Water is " + maxWAter_tow_pointer_approch(hight));
    }

    // Imp. Qus. # pair sum brute forc approch
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;

                }
            }
        }
        return false;

    }

    // Imp. Qus. # pair sum tow pointer approch
    public static boolean pairSum_TowPointerApproch(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // Imp. Qus. # pair Sum implimantetion
    public static void pairSumImp() {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(pairSum(list, 9));
        System.out.println(pairSum_TowPointerApproch(list, 5));

    }

}
