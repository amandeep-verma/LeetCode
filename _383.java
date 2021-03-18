
public class _383 {
	class Solution {
	    public boolean canConstruct(String ransomNote, String magazine) {
	        if(ransomNote.length()>magazine.length())
	            return false;
	        
	        
	        int[] freq = new int[128];
	        
	        for(int i =0 ; i<magazine.length(); i++)
	            freq[magazine.charAt(i)]++;
	        
	        for(int i =0 ; i<ransomNote.length(); i++)
	        {
	            if(--freq[ransomNote.charAt(i)]<0)
	                return false;
	        }
	        return true;
	        
	        
	        // Solution 1
	        
//	         if(ransomNote.length()>magazine.length())
//	             return false;
	        
//	         int[] freq = new int[26];
//	         int i;
//	         for(i =0 ; i<ransomNote.length(); i++)
//	         {
//	             freq[ransomNote.charAt(i)-97]--;
//	             freq[magazine.charAt(i)-97]++;
//	         }
	        
//	         for(;i<magazine.length();i++)
//	             freq[magazine.charAt(i)-97]++;
	        
//	         for(i =0 ; i<26; i++)
//	         {
//	             if(freq[i]<0)
//	                 return false;
//	         }
//	         return true;
	    }
	}
}
