package LinkedInPrograms;

public class LowerToUpperCase {

    public static void main(String args[])
    {
        String name="HArika32";
        String newStr="";
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(ch>=90)
            {
                ch=(char)(ch-32);
            }
            newStr=newStr+ch;
        }

        System.out.println(newStr);
    }
}
