package hackerrank.coding;

import java.util.*;

public class Solution {

	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		while(true)
		{int n=sc.nextInt();
		sc.nextLine();
		if(1<=n && n<=10){
			String[]res=new String[n];

			for(int i=0;i<n;i++){
				String s1=sc.nextLine();
				int m=s1.length();
				String s2="",s3="";
				if(2<=m && m<=10000){
					for(int j=0;j<m;j++){
						if(j%2==0)
							s2=s2+s1.charAt(j);
						else
							s3=s3+s1.charAt(j); 
					}
				}
				res[i] =s2+" "+s3;
			}
			for(int k=0;k<n;k++) {
				System.out.println(res[k]);
			}
		}
		}
	}
}

