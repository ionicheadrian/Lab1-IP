import java.util.ArrayList;

public class GasCar implements Cars{
    List<String> passengers = new ArrayList<>();
    public void getBrand() {
        System.out.println(Brand);
    }
    public void getType() {
        System.out.println(Type);
    }
    public void get_passengers()
    {
     while(passengers.length > 0)
     {
         System.out.println(passengers[0]);
     }
    }
}
