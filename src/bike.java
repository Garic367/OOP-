import javax.swing.*;

public class bike extends Transport{
    String colour;

    public bike(String first_name, String second_name, int speed, int year,String colour) {
        super(first_name, second_name, speed, year);
        this.colour = colour;
    }


    public void tell(){
        System.out.println(super.first_name);
        System.out.println(super.second_name);
        System.out.println(super.speed);
        System.out.println(super.year);
        System.out.println(colour);
    }


}
