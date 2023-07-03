package practice;




import java.util.Scanner;
public class EvenOdd {



    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      
      Scanner scanner=new Scanner(System.in);
      int num=scanner.nextInt();
       if((num%2!=0)||((num%2==0)&&((num>=6)&&(num<=20)))){
           System.out.println("Weird");
       }
       else if(((num%2==0)&&(num<=2)&&(num>=5))||((num%2==0)&&(num>20))){
           System.out.println("Not Weird");
       }
       else {
           System.out.println("invalid");
       }
       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       scanner.close();
    }
    
}

