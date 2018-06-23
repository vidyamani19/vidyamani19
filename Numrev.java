import java.util.*;
class Numrev
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        StringBuffer sb = new StringBuffer(num);
        num = sb.reverse().toString();
        System.out.print(num);
    }
}
