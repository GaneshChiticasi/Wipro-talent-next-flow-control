import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		int n;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       if(n>0)
    	   System.out.println("positive");
       else if(n<0)
    	   System.out.println("negative");
       else
    	   System.out.println("zero");
	}

}
