public class Main {
    public static void main(String[] args) {
        for(int first = 1; first <= 19; first++) {
            for(int second= 1 ; second <= 19; second++) {
                if(second % 2 == 1) {
                    // Case 1:
                    System.out.print(first + " * " + second + " = " + (first * second));
                }
                else {
                    // Case 2:
                    System.out.println(" / " + first + " * " + second + " = " + (first * second));
                }

                if(second == 19) {
                    // Case 3:
                    System.out.println();
                }
            }
        }
    }
}
