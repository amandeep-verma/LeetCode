
public class _1704 {
	class Solution {
	    
	    
	    public int countVowels(String s, int si, int ei,int count) {
	        
		for (int i = si; i < ei; i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				count++;
		}
		return count;
	}
	    
	    public boolean halvesAreAlike(String s) {
	        
	        
//	         int length = s.length();
//	 	int mid = length / 2 - 1;
//	 	int count1 = countVowels(s, 0, mid);
//	 	int count2 = countVowels(s, mid + 1, length - 1);
//	 	return count1 == count2;
	        
	        // Solution-3
	        int count=0;
	        int i=0;
	        int length = s.length();
		    int mid = length / 2 ;
		    int count1 = countVowels(s, 0, mid, 0);
	        
		    return countVowels(s, mid , length,-1*countVowels(s, 0, mid, 0)) == 0;
	        

	        // Solution 2
//	         String vowel= "AEIOUaeiou";
//	         int count1=0;
//	         int count2=0;
//	         int i=0;
//	         for( ;i<s.length()/2;i++)
//	         {
//	             if(vowel.contains(s.substring(i,i+1)))
//	                 count1++;
//	         }
	        
//	         for( ;i<s.length();i++)
//	         {
//	             if(vowel.contains(s.substring(i,i+1)))
//	                 count2++;
//	         }
//	         return count1==count2;
	        
	        
//	         HashSet<Character> set = new HashSet<Character>();
//	         set.add('A');
//	         set.add('E');
//	         set.add('I');
//	         set.add('O');
//	         set.add('U');
//	         set.add('a');
//	         set.add('e');
//	         set.add('i');
//	         set.add('o');
//	         set.add('u');
	        
//	         int count1=0;
//	         int count2=0;
//	         int i=0;
//	         for( ;i<s.length()/2;i++)
//	         {
//	             if(set.contains(s.charAt(i)))
//	                 count1++;
//	         }
	        
//	         for( ;i<s.length();i++)
//	         {
//	             if(set.contains(s.charAt(i)))
//	                 count2++;
//	         }
//	         return count1==count2;
	    }
	}
}
