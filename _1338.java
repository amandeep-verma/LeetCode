
public class _1338 {
	class Solution {
	    public int minSetSize(int[] arr) {
	        
	        // Solution 4(c)
	        int[] bucket = new int[100001];
	        for(int i :arr)
	        {
	            bucket[i]++;
	        }
	        
	        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> o2-o1);
	        for(int i: bucket)
	        {
	            if(i!=0)
	                queue.add(i);
	        }
	        
	        int sum =0;
	        int count=0;
	        
	        while(sum<arr.length/2)
	        {
	            sum += queue.poll();
	            count++;
	        }

	        return count;
	        
	        
	        // Solution 4(b)
//	         int[] bucket = new int[100001];
//	         for(int i :arr)
//	         {
//	             bucket[i]++;
//	         }
	        
//	         ArrayList<Integer> li = new ArrayList<Integer>();
//	         for(int i: bucket)
//	         {
//	             if(i!=0)
//	                 li.add(i);
//	         }
	        
//	         li.sort((o1,o2)->o2-o1);
	        
//	         int sum =0;
//	         int count=0;
	        
//	         while(sum<arr.length/2)
//	         {
//	             sum += li.get(count);
//	             count++;
//	         }
	        
//	         return count;
	        
	        
	        // Solution 4(a)
//	         int[] bucket = new int[100001];
//	         for(int i =0 ;i<arr.length;i++)
//	         {
//	             bucket[arr[i]]++;
//	         }
	        
//	         Arrays.sort(bucket);
	        
//	         int sum =0;
//	         int count=0;
//	         int i = bucket.length-1;
	        
//	         while(sum<arr.length/2)
//	         {
//	             sum += bucket[i--];
//	             count++;
//	         }
	        
//	         return count;
	        
	        
	        // Solution 3;//Improvised
//	         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	         for(int i =0 ;i<arr.length; i++)
//	         {
//	             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//	         }
	        
//	         PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> o2-o1);
//	         for(Integer val:map.values())
//	             queue.add(val);
	        
	    
//	         int half = arr.length/2;
	        
//	         int sum =0;
//	         int count=0;
	        
//	         while(sum<half)
//	         {
//	             sum += queue.poll();
//	             count++;
//	         }
	        
//	         return count;
	        
	        
	        
	        // Solution 2; //Improvised
//	         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	         for(int i =0 ;i<arr.length; i++)
//	         {
//	             if(!map.containsKey(arr[i]))
//	                 map.put(arr[i],1);
//	             else
//	             {
//	                 int freq = map.get(arr[i]);
//	                 map.put(arr[i],1+freq);
//	             }
//	         }
	        
//	         List<Integer> li = new ArrayList<>(map.values());
	        
//	         li.sort((o1,o2)-> o2-o1 );
//	         int half = arr.length/2;
	        
//	         int sum =0;
//	         int count=0;
	        
//	         while(sum<half)
//	         {
//	             sum += li.get(count);
//	             count++;
//	         }
	        
//	         return count;
	        
	        // Solution 1;
//	         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	         for(int i =0 ;i<arr.length; i++)
//	         {
//	             if(!map.containsKey(arr[i]))
//	                 map.put(arr[i],1);
//	             else
//	             {
//	                 int freq = map.get(arr[i]);
//	                 map.put(arr[i],1+freq);
//	             }
//	         }
	        
//	         List<Map.Entry<Integer, Integer>> li = new ArrayList<>(map.entrySet());
//	         li.sort((o1, o2) -> {
//	 			return o2.getValue().compareTo(o1.getValue()); 
//	 		 });
	        
//	         int half = arr.length/2;
	        
//	         int sum =0;
//	         int count=0;
	        
//	         while(sum<half)
//	         {
//	             sum += li.get(count).getValue();
//	             count++;
//	         }
	        
//	         return count;
	    }
	}
}
