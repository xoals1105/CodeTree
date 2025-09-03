import java.util.Scanner;

class BombInfo
{
    String DismantlingCode = "";
    char LineColor = ' ';
    int time = 0;

    public BombInfo(String DismantlingCode, char LineColor, int time)
    {
        this.DismantlingCode = DismantlingCode;
        this.LineColor = LineColor;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();

        BombInfo bomb = new BombInfo(uCode, lColor, time);

        System.out.println("code : " + bomb.DismantlingCode);
        System.out.println("color : " + bomb.LineColor);
        System.out.println("second : " + bomb.time);
    }
}