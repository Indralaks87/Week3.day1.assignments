package w3.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
		if(i%2!=0) {
		    
			char[]c = words[i].toCharArray();
			
			for (int j =  c.length-1; j >=0; j--) {
			System.out.print(c[j]);	
			
			}
		}
		else {
			 
			System.out.print(" " +words[i] + " ");
		       }
	      }

       }
 
}
	
	
