package divide_and_conquer;

public class Sorting {

    public  static  void  margeArr(int[] a, int[] b){
        int aL = a.length;
        int bL = b.length;

        int[] c = new  int[aL+bL];
        for (int i =0; i<aL;i++){
            c[i] = a[i];
        }
        for (int i =0; i<bL;i++){
            c[aL+i] = b[i];
        }
        for (int i =0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        margeArr(a,b);
    }
}
