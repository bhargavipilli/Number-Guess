import java.lang.*;
import java.util.*;

public class guess{
    public static void main(String args[])
    {   
        Random random =new Random();
        int gnum=random.nextInt(100);
       // System.out.println(gnum);
        int k=5;
       boolean flag1=true;
       boolean flag2=true;
        while(true)
        {
        System.out.println("enter number to guess of range 1 to 100\nand you have only 'five' chances");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<gnum)
        {
            System.out.println("you guessed low");
            k--;
        }
         if(num>gnum)
        {
            System.out.println("you guessed high");  
            k--; 
        }
       if(gnum%2==0 && flag1==true)
        {
            System.out.println("HINT : it is an even number");
            flag1=false;

        }
         if(gnum%2!=0 && flag2==true)
        {
           System.out.println("HINT : it is an odd number");   
           flag2=false;
        }
        if(k==0)
        {
            System.out.println("Sorry :( no more chances for you");
        }
         if(num==gnum){
            System.out.println("Congratulations!! you guessed correct");
            break;
        }

    }
}
}