package EasyProblems;

import java.util.HashMap;
import java.util.HashSet;

//Question: Given 2 strings, determine if they have common substring
//Testcase1 : str1 - [cat],str2 - [rat]
//Testcase2: str1 - [art], str2- [a]
//Testcase 3: str1- [study], str2 -[ergo]
public class TwoStrings {

    public static void main(String[] args) {
        String str1 = "barbell";
        String str2 = "trapper";

        //Create two hashsets and add the string values to them . Now intersect both the sets to see if any common chars are present"
        HashSet<Character> setStr1 = new HashSet<>();
        HashSet<Character> setStr2 = new HashSet<>();

        //Add the string values to Hashset
        for (Character s : str1.toCharArray()) {
            setStr1.add(s);
        }

        for (Character s : str2.toCharArray()) {
            setStr2.add(s);
        }

        //Intersect the two hashsets to find common strings
            setStr1.retainAll(setStr2);

        //check the setStr1 if it is empty , if empty return no else yes

        if(!setStr1.isEmpty())
        {
            System.out.println("Yes common substrings are present" + setStr1);
        }
        else
        {
            System.out.println("No common substrings");
        }

    }
}
