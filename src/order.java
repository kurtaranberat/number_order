import java.util.Scanner;
public class order {
      public  static  void main (String []args ){
          Scanner brt=new Scanner(System .in );
          System.out.print("birinci sayıyı giriniz =");
          int a = brt.nextInt();
          System.out.print("ikinci sayıyı giriniz =");
          int b = brt.nextInt();
          System.out.print("üçünçü  sayıyı giriniz =" );
          int c= brt.nextInt();

          if ((a>b)&&(a>c))
              System.out.print("enbuyuk sayı  birinci sayı  ");
          if ((a<b)&&(b>c))
              System.out.print("enbuyuk sayı ikinci sayı  ");
          if ((c>b)&&(a<c))
              System.out.print("enbuyuk sayı üçünçü sayı  ");
      }
}
