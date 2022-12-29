package bitManipuletion;

 class Qustions {
//     int n ,k;
//     Qustions(int n, int k){
//         this.n = n;
//         this.k = k;
//     }

//    todo: Q 1. )Check if the ith bit is set or not
     public String  isKthBitSet(int n, int k){
     int bitMask = 1<<(k-1);
     if ((n & bitMask) != 0){
         return  "set";
     }
     else {
         return  "not set";
     }
     }

     // todo: Q 2.) Set the ith bit of a number.
     public  void  setKthBit(int n, int k){
         int bitMske = 1<<(k-1);
         System.out.println(n|bitMske);
     }

     // todo: Q 3.) clear the ith bit of a number

     public  void  clearKthBit(int n, int k){
         int bitMask = ~(1<<(k-1));
         System.out.println(n&bitMask);
     }

     // todo: Q 4.) Remove the last set bit of a number

     public  void removeLastSetBit(int n){
         int bitMask = n-1;
         System.out.println(n&bitMask);
     }

     //todo: finding possition of last set bit
     public  void positionOfLastSet(int n){
         int bitMask = ~(n-1);
         System.out.println(n&bitMask);
     }

     // todo: Q 5. ) Find whether a number is even or odd
     public void  even_or_odd(int n){
         int bitMask =1;
         if ((n&bitMask) == 0){
             System.out.println("even");
         }
         else {
             System.out.println("odd");
         }
     }
     public  void  usingdivMod(int n){
         int calcnum = (n/2)*2;
         if(calcnum == n){
             System.out.println("even");
         }
         else {
             System.out.println("odd");
         }
     }
     public void  using_rs_ls(int n){
         int bitMsak = (n>>1)<<1;
         if(n == bitMsak){
             System.out.println("even");
         }
         else {
             System.out.println("odd");
         }
     }

     // todo: Q 6.) Check if the number is a power of 2?
     public  void  isPowerOf2(int n){
         int bitMask = (n-1);
         if((n&bitMask) == 0){
             System.out.println("it is power of tow");
         }
         else {
             System.out.println("it is not a power of tow");
         }
     }

}
