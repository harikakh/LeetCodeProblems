package LinkedInPrograms;

public class FindIfTheStringIsRotatedWord {

    public static void main(String args[])
    {

        System.out.println(isRotated("ABACD","CDABA"));
    }

    public static boolean isRotated(String str1,String str2)
    {

       if(str1.length()!=str2.length())
       {
           return false;
       }
         str1=str1+str1;
      if(str1.indexOf(str2)!=-1)
      {
          return true;
      }
      else
      {
          return false;
      }

    }

}
