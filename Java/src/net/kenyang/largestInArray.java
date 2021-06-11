import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
ArrayList<Integer>li=new ArrayList<Integer>();
System.out.println("no of elements");
int n=sc.nextInt();
 
System.out.println("enetre array elements");
for(int i=0;i<n;i++) {
	li.add(sc.nextInt());
	
}
Collections.sort(li);
System.out.println(li);
System.out.println("enter which largestt element");
int j=sc.nextInt();
System.out.println(li.get(n-j));

	}

}