import java.util.Scanner;

class PasswordChecker1 
{
    int Process(String s1) 
    {
        String s = s1;
        int count1 = 0, count2 = 0, f = 0, flag;
        // System.out.println(s.length());
        if (s.length() < 4) {
            return 0;
        }
        if (s.charAt(0) == '0' || s.charAt(0)== '1' || s.charAt(0) == '2' || s.charAt(0) == '3' || s.charAt(0) == '4' ||
        s.charAt(0) == '5' || s.charAt(0) == '6' || s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9') 
        {
            return 0;
        }
        else {
            for (int i=0; i<s.length(); i++)
             {
                if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' ||
                s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') 
                {
                    count1 += 1;
                }
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
                {
                    count2 += 1;
                }
                if (s.charAt(i) == ' ' || s.charAt(i) == '/') 
                {
                    f = 1;
                }
            }
            if (count1 >= 1 && count2 >= 1 && f == 0)
            {
                flag = 1;
            }
            else 
            {
                flag = 0;
            }
        }
        return flag;
    }
}
class Password 

{
    public static void main(String[] args) {
        PasswordChecker1 obj = new PasswordChecker1();
        Scanner sc = new Scanner(System.in);
        String s;
        int ans;
        System.out.print("Enter Password: ");
        s = sc.nextLine();
        ans = obj.Process(s);
        System.out.println(ans);
        sc.close();
    }
}