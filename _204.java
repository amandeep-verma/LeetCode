
public class _204 {
	class Solution {
	    
	    public boolean ifPrime(int n)
	    {
	        if(n%2 ==0)
	            return false;
	        
	        for(int i=3;i*i<=n;i=i+2)
	        {
	            if(n%i==0)
	                return false;
	        }
	        return true;
	    }
	        
	    public int countPrimes(int n) {
	        
	        // Solution 1 :-(Sieve of Eratosthenes)
	        int totalPrime=0;
	        boolean[] set = new boolean[n];
	        
	        for(int i=2; i*i<n; i++)
	        {
	            if(!set[i])
	            {
	                for(int j=i*i; j<n; j=j+i)
	                {
	                    set[j]=true;
	                }
	            }
	        }
	        
	        for(int i=2; i<n; i++)
	        {
	            if(!set[i])
	                totalPrime++;
	        }
	        return totalPrime;
	        
	        // Solution 0.2 :-(time limit exceed)
//	        if(n<2)        
//	            return 0;
	        
//	         ArrayList<Integer> list = new ArrayList<Integer>();
//	         list.add(2);
	        
//	         for(int i =3;i<=n;i=i+2)
//	         {
//	             boolean isPrime=true;
//	             for(int j=0; j< list.size(); j++)
//	             {
//	                 if( i % list.get(j) == 0)
//	                 {
//	                     isPrime=false;
//	                     break;
//	                 }
//	             }
//	             if(isPrime)
//	                 list.add(i);
//	         }
	        
//	         return list.size();
	        
	        //Solution 0 :-(time limit exceeds)
//	         if(n<2)
//	             return 0;
	        
//	         int totalPrime=1;
//	         for(int i =3;i<=n;i=i+2)
//	         {
//	             if(ifPrime(i))
//	                 totalPrime++;
//	         }
//	         return totalPrime;
	    }
	}
}
