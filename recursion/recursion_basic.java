package recursion;

// # Recurtion is a mathod of solving a computational problem where 
//the solution depends on solutions to "smaller instances of same problem" 

// Base case -> smaler promlem 

// it have tow direction 
// 1) -> top to down(towords base case)
// 2) -> bottem to top(combine solution)

// theree piler of recurtion 
// 1) Difining "Base Case"
// 2) Aftor Base Case do some "Works"
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

    public static void main(String[] args) {
        // printNum(10);
        // printInc(10);

        System.out.println(Factorial(5));
        ;
    }

}
