package backtracking;

public class BackTracking {

    public  static void  changeArr(int arr[], int i, int val){
      //base case
      if (i == arr.length){
          printArr(arr);
          return;
      }
      //recursion
      arr[i] = val;
      changeArr(arr , i+1,val+1);
      arr[i] = arr[i]-2; // BackTracking step
    }

    public  static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }

    public  static  void findSubSet(String str, int i, String ans){
        // base case
        if (i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
            else {
                System.out.print(ans+" ");
            }
            return;
        }
        //recursen


        //no
        findSubSet(str, i+1, ans);
        //yes
        findSubSet(str,i+1, ans+str.charAt(i) );
    }

    public static void main(String[] args) {
      int[] a =new int[5];
      //changeArr(a,0,1);
       // System.out.println();
      //printArr(a);
        findSubSet("abc",0,"");
    }
}
