package java_practice;
import java.util.Scanner;

public class OutputFormatting 
{

    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<1;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%04d\n",s1,x);  
            }
            System.out.println("================================");
            
            sc.close();//closing scanner

    }
}

