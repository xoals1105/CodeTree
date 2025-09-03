import java.util.Scanner;
import java.util.Arrays;


class Person
{
    String name = "";
    int height = 0;
    int weight = 0;

    public Person(String name, int height, int weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] person = new Person[n];

        for(int i = 0; i < n; i++)
        {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new Person(name, height, weight); 
        }
        
        Arrays.sort(person, (a, b) -> a.height - b.height);

        for(int i = 0; i < n; i++)
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
    }
}