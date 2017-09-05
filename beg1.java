import java.util.*;
class Hello
{
   private static Scanner sc;
   public static void main(StringString[] args)
   {
       int a;
       sc = new Scanner(System.in);
       a=sc.nextInt();
       if(a>0)
          System.outout.println("Positive");
       else if(a<0)
          System.out.println("Negative");
       else
          System.out.println("Zero");
   }
}
