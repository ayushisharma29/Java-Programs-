import java.util.Scanner;
class PracticesetMain
{
      public static void main(String args[])
      {
             Scanner S = new Scanner(System.in);
             System.out.println("enter marks of sub1");
             float Sub_1 = S.nextFloat();
             System.out.println("enter marks of sub2");
             float Sub_2 = S.nextFloat();
             System.out.println("enter marks of sub3");
             float Sub_3 = S.nextFloat();
             float gpa = (Sub_1+Sub_2+Sub_3)*100/3000;
             System.out.println(gpa);
       }
}