
public class _30 {

	class Solution {
	    
	    public Map<String, Integer> mapmaker(String[] words)
	    {
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        for(int i =0; i<words.length;i++)
	            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
	        return map;
	    }
	    
	    public List<Integer> findSubstring(String s, String[] words) {

	    	// there can be a better solution to eliminate extra checks
	    	
	        Map<String, Integer> mapStored =  mapmaker(words);
	            
	        // Solution3 : put words[] in map
	        List<Integer> ret = new ArrayList<Integer>();
	        int wordSize = words[0].length();
	        for ( int i = 0 ; i <= s.length() - (words.length * wordSize) ; i++)
	        {
	            String sub = s.substring(i,i+wordSize);
	            Map<String, Integer> map= new HashMap<String, Integer>(mapStored);
	            if (map.containsKey(sub))
	            {
	                int val = map.get(sub);
	                if(val>1)
	                    map.put(sub,val-1);
	                else
	                    map.remove(sub);
	                
	                for(int j = i+wordSize ; j< i+(words.length * wordSize) ; j=j+wordSize)
	                {
	                    sub = s.substring(j,j+wordSize);
	                    if(!map.containsKey(sub))
	                        break;
	                    else
	                    {
	                        val = map.get(sub);
	                        if(val>1)
	                            map.put(sub,val-1);
	                        else
	                            map.remove(sub);
	                    }
	                }
	                if(map.isEmpty())
	                {
	                    ret.add(i);
	                    // i =  
	                }
	            }
	        }
	        return ret;
	        
	        
	        
	        // Solution2: no sorting. Add words array in a list and remove elements for check.
	        
//	         List<Integer> ret = new ArrayList<Integer>();
//	         int wordSize = words[0].length();
//	         for ( int i = 0 ; i <= s.length() - (words.length * wordSize) ; i++)
//	         {
//	             String sub = s.substring(i,i+wordSize);
//	             ArrayList<String> flag = new ArrayList<String>(Arrays.asList(words));
//	             if (flag.remove(sub))
//	             {
//	                 for(int j = i+wordSize ; j< i+(words.length * wordSize) ; j=j+wordSize)
//	                 {
//	                     sub = s.substring(j,j+wordSize);
//	                     if(!flag.remove(sub))
//	                     {
//	                         break;
//	                     }
//	                 }
//	                 if(flag.isEmpty())
//	                     ret.add(i);
//	             }
//	         }
//	         return ret;
	        
	        
	        
	        // Solution 1: by sorting
//	         Arrays.sort(words);
//	         List<Integer> ret = new ArrayList<Integer>();
//	         int wordSize = words[0].length();
//	         for ( int i = 0 ; i <= s.length() - (words.length * wordSize) ; i++)
//	         {
//	             String sub = s.substring(i,i+wordSize);
//	             int pos = Arrays.binarySearch(words, sub);
//	             if(pos>=0)
//	             {
//	                 boolean[] flag = new boolean[words.length];
//	                 flag[pos] = true;
//	                 boolean contains = true;
//	                 for(int j = i+wordSize ; j< i+(words.length * wordSize) ; j=j+wordSize)
//	                 {
//	                     sub = s.substring(j,j+wordSize);
//	                     pos = Arrays.binarySearch(words, sub);
//	                     if(pos<0  )
//	                     {
//	                         contains = false;
//	                         break;
//	                     }  
//	                     if(flag[pos] == true)
//	                     {
//	                         boolean leftCheck = false;
//	                         while(pos>=0 && words[pos].equals(sub) )
//	                         {
//	                             if(flag[pos]==false)
//	                             {
//	                                 leftCheck = true;
//	                                 break;
//	                             }
//	                             pos--;
//	                         }
//	                         if(!leftCheck)
//	                         {
//	                             pos++;
//	                             while(pos<words.length && words[pos].equals(sub) )
//	                             {
//	                                 if(flag[pos]==false)
//	                                 {
//	                                     leftCheck = true;
//	                                     break;
//	                                 }
//	                                 pos++;
//	                             }
//	                         }
//	                         if(!leftCheck)
//	                         {
//	                             contains = false;
//	                             break;
//	                         }
//	                     }
//	                     flag[pos] = true;
//	                 }
	                
//	                 if(contains)
//	                     ret.add(i);
//	             }
//	         }
//	         return ret;
	    }
	}
}
