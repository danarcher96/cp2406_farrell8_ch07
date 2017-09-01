import java.util.*;
public class ValidatePassword
{
   public static void main(String[] args)
   {
      String userPassword;
      int passLength;
      int upperCasecount = 0;
      int lowerCasecount = 0;
      int digitCount = 0;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter your password");
      userPassword = input.nextLine();
      passLength = userPassword.length();

      for(int i = 0; i < passLength; i++)
      {
         char ch = userPassword.charAt(i);
         if (Character.isUpperCase(ch))
            upperCasecount++;
         else
            if (Character.isLowerCase(ch))
               lowerCasecount++;
            else
               if (Character.isDigit(ch))
                  digitCount++;
      }

      if(upperCasecount >= 2 && lowerCasecount >= 2 && digitCount >= 2)
         System.out.print("Valid Passsword");
      else

      {
         System.out.print("Invalid password");
         if (upperCasecount < 2)
            System.out.print("Not enoough upper case characters");
         if (lowerCasecount < 2)
            System.out.print("Not enough lowercase characters");
         if (digitCount < 2)
            System.out.print("Not enough digits");

      }
   }
}
