import java.util.Scanner;
import java.util.Arrays;

class Person
{
    int height = 0;
    int weight = 0;
    int index = 0;

    public Person(int height, int weight, int index)
    {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new Person(height, weight, i + 1);
        }
        
        Arrays.sort(person, (a, b) -> {
            if(a.height != b.height)
                return a.height - b.height;
            else
                return b.weight - a.weight;
        });

        for(int i = 0; i < n; i++)
            System.out.println(person[i].height + " " + person[i].weight + " " + person[i].index);
    }
}