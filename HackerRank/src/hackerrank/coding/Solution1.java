package hackerrank.coding;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution1{
  public static void main(String []argh){
	  Map<String,Integer> phonerecords=new HashMap<String,Integer>();
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if(1<=n && n<=10000) {
      for(int i = 0; i < n; i++){
          String name = in.next().toLowerCase();
          int phone = in.nextInt();
          String ph=phone+"";
          if(ph.length()==8)
          phonerecords.put(name,phone);
          else
        	  i--;
      } 
      }
      System.out.println(phonerecords);
      String s;
      int c=1;
      String[] s1=new String[100000];
      while(in.hasNext()){
    	  if(1<=c && c<=10000) {
           s = in.next().toLowerCase();
           if(s.equals("exit"))
        	break;
           else
           
           if(phonerecords.containsKey(s)) {
          	 s1[c-1]=s+"="+phonerecords.get(s);
           c++;
           }
           else {
            s1[c-1]="Not Found";
           c++;
    	  }
    	  } 
      }
     
      for(int i=0;i<c;i++) {
    	 System.out.println(s1[i]);
    	// System.out.println(s1[i]);
      }
      in.close();
  }
}


