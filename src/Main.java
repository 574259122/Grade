import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int point = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("คะแนน : ");
      point = sc.nextInt();

      switch (point / 10) {
         case 10:
         case 9:
         case 8:
            System.out.println("เกรด  : A");
            break;
         case 7:
            System.out.println("เกรด  : B");
            break;
         case 6:
            System.out.println("เกรด  : C");
            break;
         case 5:
            System.out.println("เกรด  : D");
            break;
         default:
            System.out.println("เกรด  : F");
            break;
      }
   }	
}