/*Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate (length, width), box (length, width, height), wood box (length, width, height, thick)*/

package Lab_6;
import java.util.*;

public class plate
{
    int length,width;
    plate()
    {
        System.out.println("plate class is called");
    }
}
public class box extends plate
{
    int length,width,height;
    box()
    {
        System.out.println("box class is called");
    }
}
public class wood_box extends box
{
    int length,width,height,thick;
    wood_box()
    {
        System.out.println("wood_box class is called");
    }
    public static void main(String args[])
    {
        wood_box ob=new wood_box();
    }
}