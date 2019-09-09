package L4Assignment.problem1;

public class MergeString {
	
		public static void main(String[] args){
			System.out.println(sortedString("abg","gbd"));
			System.out.println(sortedString("adiss","d"));
		}
		public static String sortedString(String str, String str1){
			
			if(str.length()==0&&str1.length()>0) 
				return str1;
			if(str.length()>0&&str1.length()==0) 
				return str;
			
			if(str.charAt(0)>=str1.charAt(0))
				return str1.substring(0,1) + sortedString(str,str1.substring(1));
			else  if(str.charAt(0)<=str1.charAt(0))
				return str.substring(0,1) + sortedString(str.substring(1),str1);
			return null;
		}
		
	}
