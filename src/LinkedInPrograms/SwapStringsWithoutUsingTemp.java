package LinkedInPrograms;

import java.util.SortedMap;

public class SwapStringsWithoutUsingTemp {
    public static void main(String args[])

    {
        String a="hello";
        String b ="harika";

        a=a+"*"+b;
        b=a.substring(0,a.indexOf("*"));
        a=a.substring(a.indexOf("*")+1);
        System.out.println(a);

        System.out.println("Swapped values of a and b are a= "+a+"  and b is "+b);

    }

    public static void swapStrings()
    {

        String a="hello";
        String b ="harika";

        a=a+b;
        System.out.println(a);

    }
}
