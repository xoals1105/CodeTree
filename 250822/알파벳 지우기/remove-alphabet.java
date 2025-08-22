import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String first_str = scanner.next();
        String second_str = scanner.next();

        String firstStorage = "";
        String secondStorage = "";

        int firstStringLength = first_str.length();
        int secondStringLength = second_str.length();

        for(int i = 0; i < firstStringLength; i++)
            if(first_str.charAt(i) >= '0' && first_str.charAt(i) <= '9') firstStorage += first_str.charAt(i);
        for(int i = 0; i < secondStringLength; i++)
            if(second_str.charAt(i) >= '0' && second_str.charAt(i) <= '9') secondStorage += second_str.charAt(i);

        System.out.println(Integer.parseInt(firstStorage) + Integer.parseInt(secondStorage));
        

    }
}