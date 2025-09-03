import java.util.Scanner;

class WeatherReport
{
    String date = "";
    String day = "";
    String weather = "";

    public WeatherReport(String date, String day, String weather)
    {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        WeatherReport[] weatherReport = new WeatherReport[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
        
            weatherReport[i] = new WeatherReport(date, day, weather);
        }

        int firstIdx = 0;
        for(int i = 1; i < n; i++)
        {
            if(weatherReport[i].day.compareTo(weatherReport[firstIdx].day) > 0) firstIdx = i;
        }

        System.out.println(weatherReport[firstIdx].date + " " + weatherReport[firstIdx].day + " " + weatherReport[firstIdx].weather);
    }
}