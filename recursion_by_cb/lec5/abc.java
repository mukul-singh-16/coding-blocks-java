import java.util.*;
public class Main {
    public static void main (String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<=n;i++)
        {
        String str=scan.nextLine();
        sol(str,"");
        }
    }
    public static void sol(String str,String answer)
    {
        if(str.length()==0)
        {
        System.out.println(answer);
        return;
        }
        char ch=str.charAt(0);
        if(ch=='p'&& str.charAt(1)=='i')
        sol(str.substring(2),answer+"3.14");
        else
        sol(str.substring(1),answer+ch);
        // return;
    }
}