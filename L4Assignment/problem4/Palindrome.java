package L4Assignment.problem4;

public class Palindrome {
	
	 public static void main(String[] args) {
	        System.out.println("Is moon a palindrom?--- " + isPalindrome("moon"));
	        System.out.println("Is noon a palindrome?--- " + isPalindrome("noon"));
	        System.out.println("Is 'a' a palindrome?--- " + isPalindrome("a"));
	        System.out.println("Is moon 'cbc' a palindrome?--- " + isPalindrome("cbc"));
	        
	         
	    }
	
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1)
			return true;
		else if(str.charAt(0) != str.length() - 1)
			return false;
		else
			return isPalindrome(str.substring(1, str.length() - 1));
	}

}
