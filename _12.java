
public class _12 {
	class Solution {
	    public String intToRoman(int num) {
	        
	        
	        // Solution 2
	        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	        StringBuilder sb = new StringBuilder();
	        
	        int i =0;
	        while( num >0)
	        {
	            while (i <14 && values[i] <= num)
	            {
	                sb.append(strs[i]);
	                num = num - values[i];
	            }
	            i++;
	        }
	        return sb.toString();
	        
	        // Solution 1
	        
	        // char[] a = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	        // int index =0;
	        // StringBuilder roman = new StringBuilder();
	        // while(num!=0)
	        // {
	        //     int present = num %10;
	        //     num = num/10;
	        //     if (present == 0 )
	        //     {}
	        //     else if( present < 4)
	        //     {
	        //         for(int i=1; i<=present;i++)
	        //             roman.insert(0,a[index]);
	        //     }
	        //     else if(present ==4)
	        //         roman.insert(0,new StringBuilder(a[index]+"").append(a[index+1]));
	        //     else if(present <9)
	        //     {
	        //         for(int i =0; i< present - 5;i++)
	        //             roman.insert(0,a[index]);
	        //         roman.insert(0,a[index+1]);
	        //     }
	        //     else
	        //     {
	        //         roman.insert(0,new StringBuilder(a[index]+"").append(a[index+2]));
	        //     }
	        //     index = index+2;
	        // }
	        // return roman.toString();
	    }
	}
}
