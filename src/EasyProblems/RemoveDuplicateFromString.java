package EasyProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static void main(String args[]) {
        String name="harikadda";
        removeDuplicateCharacter(name);
        System.out.println(removeDuplicateChars(name));
        System.out.println(removeDuplicateCharsUsingLinkedHashSet(name));
    }

    public static void removeDuplicateCharacter(String name)
    {
        HashSet<Character> ham= new HashSet<>();

        for(char c:name.toCharArray())
        {
            ham.add(c);
        }

        System.out.println(ham);

    }

    public static String removeDuplicateChars(String name)
    {
       StringBuilder sbr = new StringBuilder();

        name.chars().distinct().forEach(c->sbr.append((char) c));
       return sbr.toString();
    }

    public static String removeDuplicateCharsUsingLinkedHashSet(String name)
    {
        StringBuilder sbr = new StringBuilder();
        Set<Character> linkedhashset = new LinkedHashSet<>();

        for(char c: name.toCharArray())
        {
            linkedhashset.add(c);
        }

        for(char c:linkedhashset)
        {
            sbr.append(c);
        }
        return sbr.toString();
    }
}
