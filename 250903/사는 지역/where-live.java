import java.util.Scanner;
import java.util.Arrays;

class Data
{
    String name = "";
    String address = "";
    String region = "";

    public Data(String name, String address, String region)
    {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Data[] data = new Data[n];
      
        for (int i = 0; i < n; i++) {
            String names = sc.next();
            String addresses = sc.next();
            String regions = sc.next();

            data[i] = new Data(names, addresses, regions);
        }

         // 사전순으로 이름이 가장 느린 사람 찾기
        int lastIdx = 0;
        for(int i = 0; i < n; i++)
        {
            if(data[i].name.compareTo(data[lastIdx].name) > 0) lastIdx = i;
        }

        System.out.println("name " + data[lastIdx].name);
        System.out.println("addr " + data[lastIdx].address);
        System.out.println("city " + data[lastIdx].region);
    }
}