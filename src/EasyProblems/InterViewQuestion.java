package EasyProblems;

public class InterViewQuestion {

    public static void main(String args[])
    {
validateStrings();
    }

    public static void validateStrings()
    {
        String str="AABBCDDEEEQQS";

        int left=0;
        int right=0;
        int count=0;
        StringBuilder stringBuilder = new StringBuilder();
      while(left<=right && right<str.length())
      {

          if( str.toCharArray()[left]==(str.toCharArray()[right]))
          {

              count++;
              right++;

          }
          else {
              stringBuilder.append(count).append(str.toCharArray()[left]);
              count=0;
              left=right;
          }
      }
        stringBuilder.append(count).append(str.toCharArray()[left]);
        System.out.println(stringBuilder);
    }
}
