import java.util.Scanner;
import java.util.Arrays;

class Person
{
    int num = 0;
    int height = 0;
    int weight = 0;

    public Person(int num, int height, int weight)
    {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person = new Person[n];
        int height = 0;
        int weight = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            height = sc.nextInt();
            weight = sc.nextInt();

            person[i] = new Person(num, height, weight);
            num++;
        }

        Arrays.sort(person, (a, b) -> {
            if(a.height != b.height)
                return b.height - a.height;
            else if(a.weight != b.weight)
                return b.weight - a.weight;
            else   
                return a.num - b.num;
        });

        for(int i = 0; i < n; i++)
            System.out.println(person[i].height + " " + person[i].weight + " " + person[i].num);       
    }
}