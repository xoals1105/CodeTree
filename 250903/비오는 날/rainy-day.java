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
        int cnt = 1;
        WeatherReport[] weatherReport = new WeatherReport[n];

        for (int i = 0; i < n; i++) 
        {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            weatherReport[i] = new WeatherReport(date, day, weather);
        }

        int firstIdx = -1; // 아직 못 찾았다는 의미
        for(int i = 0; i < n; i++) {
        if(weatherReport[i].weather.equals("Rain")) 
        {
        if(firstIdx == -1 || weatherReport[i].date.compareTo(weatherReport[firstIdx].date) < 0) {
            firstIdx = i;
        }
    }
}

        System.out.println(weatherReport[firstIdx].date + " " + weatherReport[firstIdx].day + " " + weatherReport[firstIdx].weather);
    }
}