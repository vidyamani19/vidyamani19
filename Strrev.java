import java.util.*;
class Strrev
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();
        System.out.print(str);
    }
}
