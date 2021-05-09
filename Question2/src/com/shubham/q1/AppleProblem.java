package com.shubham.q1;

public class AppleProblem {

	public static void main(String[] args) {
		int n= 5;
		System.out.println(possibaleDistribution(n));
	}

	private static String possibaleDistribution(int n) {
		//if n=1,2,3
		if(n==1 ||n==2 ||n==3) 
			return "NO";
		
		for(int i=2;i<n;i++) 
			if(n%i==0) return "Yes";
		
		return "NO";
	}

}
