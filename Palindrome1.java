import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.function.*;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read_value =new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num=read_value.nextLong();
		String numb=String.valueOf(num);
		List<String> number= Arrays.asList(numb.split(""));
		List<Integer> number1=number.stream().map(Integer::parseInt).collect(Collectors.toList());
		double size=number.size();
		if (size%2!=0) {
			int n = (int)((size-1)/2);
			System.out.println("n= "+n);
			for (int i=1;i<=n;i++) {
				if (number1.get(n+i)<=number1.get(n-i)) {
					int a =number1.get(n-i);
					number1.set(n+i,a);
					//System.out.println(number1);
					//System.out.println("Good Going!");
				break;
				}
				else if (number1.get(n+i)>number1.get(n-i)) {
					int b =number1.get(n+i-1);
					System.out.println(b);
					int c=number1.get(n+i-1)+1;
					number1.set(n+i-1,c);
					int d=number1.get(n-i);
					number1.set(n+i, d);
					System.out.println(c);
					//System.out.println(number1);
					//System.out.println("The value after n+i>n-i is "+number1);
					break;
					}
				}
			for (int j=1;j<=n;j++) {
				int e=number1.get(n-j);
				number1.set(n+j, e);
				//System.out.println(number1);
			}
			//System.out.println("The Palindrome soon after the number provided is "+number1);
				}
		if (size%2==0) {
			int n = (int)(size/2);
			System.out.println("n= "+n);
			for(int k=0;k<n;k++) {
				if (number1.get(n+k)<=number1.get(n-k-1)) {
					int f = number1.get(n-k-1);
					number1.set(n+k, f);
					//System.out.println("The Palindrome is: "+number1);
					break;
				}
				else if (number1.get(n+k)>number1.get(n-k-1)) {
					int g=number1.get(n-k-1);
					number1.set(n-k-1,g+1);
					//System.out.println(number1);
					break;
			}
			}for (int m=0;m<n;m++) {
				int h=number1.get(n-m-1);
				number1.set(n+m, h);
				//System.out.println(number1);
			}
		}
		long r=0;
		long o=0;
		 {
			int q=number1.size();
			while(q>0) {
				for(int x : number1) {
			o = (long) ((Math.pow(10, q-1))*x);
			r=r+o;
			q--;
		}	}System.out.println(r);
		read_value.close();
		}}}
		
	
				
		
		
	


