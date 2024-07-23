package LinkedInPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpressionToCheckIFAStringContainsNum {

    public static void main(String args[])
    {
        String data ="423423423";

        //regex for a number expression
        String regex="[+-]?[0-9]+";

        //Used for compiling the regex
        Pattern p = Pattern.compile(regex);

        //Matcher object
        Matcher m =p.matcher(data);

        if(m.find() && m.group().equals(data))
        {
            System.out.println("It is a integer");
        }
        else
            System.out.println("It is not a integer");
    }
}
