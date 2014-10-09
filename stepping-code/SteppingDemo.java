

public class SteppingDemo {

    public static void main(String[] args) {
        
        int total = sumAllNumbers();
        
        System.out.println(String.format("The total is %d", total));
    }
    
    protected static int sumAllNumbers() {
        int total = 0;
        for (int i=0; i < 100; i++) {
            total += isNumberEven(i) ? i : 0;
        }
        
        return total;
    }
    
    protected static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
}

