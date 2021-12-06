public class Practice {

public static void main(String[] args) {

	      String s1 = "AMMA";
	      String s2 = "";

          System.out.println("Print String reversely-Char");
	      for(int i = s1.length()-1;i>=0;i--)
	      {
	    	  System.out.print(s1.charAt(i));
	      }
	      System.out.println();
	      
	      System.out.println("Print String reversely-String");
	      for(int i = s1.length()-1;i>=0;i--)
	      {	    	  
	    	  s2 = s2+s1.charAt(i);
	      }
	      System.out.println(s2);
	      
	      if(s1.equals(s2))
	      {
	    	  System.out.println("Given String is palindrome");
	      }
	      else
	      {
	    	  System.out.println("Given String is not palindrome");
	      }  
	    
}  
}  

//OUTPUT
Print String reversely-Char
AMMA
Print String reversely-String
AMMA
Given String is palindrome