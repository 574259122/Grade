import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int point = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("��ṹ : ");
      point = sc.nextInt();

      switch (point / 10) {
         case 10:
         case 9:
         case 8:
            System.out.println("�ô  : A");
            break;
         case 7:
            System.out.println("�ô  : B");
            break;
         case 6:
            System.out.println("�ô  : C");
            break;
         case 5:
            System.out.println("�ô  : D");
            break;
         default:
            System.out.println("�ô  : F");
            break;
      }
   }	
}