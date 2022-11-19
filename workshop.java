//Fibonacci Series program
import java.lang.Package;
public class workshop{
    public static void main(String args[]){
        int n1=0, n2=1, n3; 
        int count =15;
        System.out.println("Fibonacci Series till 15 terms :");
        for(int i=2;i<count;i++){
            //compute for next num
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n1+",");
        }
        
    }
}
