import java.util.Scanner;

class Account
{
    String id;
    int level;

    public Account()
    {
        this.id = "codetree";
        this.level = 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        Account acoount = new Account();
        System.out.println("user " + acoount.id + " lv " + acoount.level);
        acoount.id = id;
        acoount.level = level;
        System.out.println("user " + acoount.id + " lv " + acoount.level);
    }
}