import java.util.Scanner;
import java.util.Arrays;

class Person
{
    String name = "";
    int height = 0;
    double weight = 0;

    public Person(String name, int height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            String names = sc.next();
            int heights = sc.nextInt();
            double weights = sc.nextDouble();

            person[i] = new Person(names, heights, weights);
        }

        Arrays.sort(person, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i = 0; i < n; i++)     
            System.out.printf("%s %d %.1f \n", person[i].name, person[i].height, person[i].weight);
        System.out.println();

        System.out.println("height");
        Arrays.sort(person, (a, b) -> b.height - a.height);
        for(int i = 0; i < n; i++)     
            System.out.printf("%s %d %.1f \n", person[i].name, person[i].height, person[i].weight);
            

       
    }
}