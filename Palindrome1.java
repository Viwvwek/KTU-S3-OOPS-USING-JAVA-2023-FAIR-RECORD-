//using scanner 
import java.util.*;

class Palindrome1
{
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp = n;
    int r=0, sum=0;

    while(n!=0)
    {   
        r= n%10;
        sum =(sum*10)+r;
        n=n/10;
    }
    if(temp == sum)
    {
        System.out.println("The Number is a Palindrome");
    }
    else
    {
        System.out.println("Not a Palindrome");
    }
    }
}