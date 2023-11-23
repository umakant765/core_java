package com.rays.opp;

public class Logic1 {
	public static void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum="+c);
	}
	public void isArmstrong(int number) {
		int r=0;
		int sum=0;
		int n=number;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==number) {
			System.out.println("Armstrong number...");
		
		}
		else {
			System.out.println("not Armstrong...");
		}
	}
public void secondLargest(int[]arr) {
	int max=0;
	int min=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			min=max;
			max=arr[i];
		}
		if (min<arr[i]&&max>arr[i])
		{min=arr[i];
		}
		System.out.println("second largest ="+min);
	}
}

	public void noteCount(int amount)
	{
		int count=0;
		int[]notes= {500,200,100,50,20,10,5,2,1};
		for (int i=0;i<notes.length;i++) {
			count=amount/notes[i];
			amount=amount%notes[i];
			if(count>0) {
				System.out.println(notes[i]+"="+count);
			}
	}
}
}
