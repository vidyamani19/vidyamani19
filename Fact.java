import java.util.*;
class Fact
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        long fact = 1;
        for(int i=2;i<=num;i++)
        {
            fact*=i;
        }
        System.out.print(fact);
    }
}
