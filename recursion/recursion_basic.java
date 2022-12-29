package recursion;

// # Recurtion is a mathod of solving a computational problem where 
//the solution depends on solutions to "smaller instances of same problem" 

// Base case -> smaller promlem

// it have tow direction 
// 1) -> top to down(towards base case)
// 2) -> bottom to top(combine solution)

// three paler of recursion
// 1) Defining "Base Case"
// 2) After Base Case do some "Works"
// 3) call Iner Function f(n-1)

public class recursion_basic {

    // Qus 1
    public static void printNum(int tileNum) {
        if (tileNum == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(tileNum + " ");
        printNum(tileNum - 1);
    }

    // Qus 2
    public static void printInc(int tileNum) {
        if (tileNum == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(tileNum - 1);
        System.out.print(tileNum + " ");
    }

    // Qus 3 (Factorial)
    public static int Factorial(int n) {

        if (n == 0)
            return 1;
        int ans = n * Factorial(n - 1);

        return ans;

    }

    // Qus 4 (sum of first n natural numbers)
    public static  int sumOfN(int n){
        if (n == 1){
            return  1;
        }
        int ans = n + sumOfN(n-1);
        return  ans;
    }

    // Qus 5 (Nth fibonacci )
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return  n;
        }
        int ans  = fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }

    // Qus6 arry is sorted or not
    public  static  boolean isSorted(int[] arr, int i){
        if (i == arr.length -1){
             return true;
        }
        if (arr[i] > arr[i+1]){
            return  false;
        }

        return  isSorted(arr,i+1);
    }

    // Qus7 first Occurence
    public  static  int firstOccrenc(int[] arr, int key, int i){
        if(i == arr.length ){
            return  -1;
        }
        if(arr[i] == key){
            return  i;
        }

        return firstOccrenc(arr,key,i+1);

    }

    // Qus8 last Occurence
    public  static  int lastOccrenc(int[] arr, int key, int i){
        if(i == arr.length){
            return  -1;
        }
        if(arr[(arr.length-1) -i] == key){
            return  (arr.length-1) -i ;
        }

        return lastOccrenc(arr , key , i+1);
    }

    // Qus9 Power of a number
    public static  int pow(int x,  int n){
        if (n == 0){
            return 1;
        }
        return x*pow(x,n-1);
    }

    // O(log n)
    public  static  int optimizedPow(int x, int n){
        if (n == 0){
            return  1;
        }
        int halfPower = optimizedPow(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        if (n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        // printNum(10);
        // printInc(10);

        //System.out.println(fibonacci(33));

        int[] arr = {1,2,3,4,5,5,2};
        //System.out.println(isSorted(arr, 0));
        //System.out.println(firstOccrenc(arr,5,0));
        //System.out.println(lastOccrenc(arr,5,0));
        System.out.println(pow(2,3));
        System.out.println(optimizedPow(2,3));
    }

}
