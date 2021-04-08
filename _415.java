
public class _415 {
	class Solution {
	    public String addStrings(String num1, String num2) {
	        if(num1.equals("0"))
	            return num2;
	        if(num2.equals("0"))
	            return num1;
	        

	        
	        // Solution 1
	        StringBuilder sum = new StringBuilder();
	        
	        // makes sure num1 is bigger
	        if(num1.length()<num2.length())
	        {
	            String temp= num1;
	            num1 = num2;
	            num2= temp;
	        }
	        
	        int i;
	        int j=num1.length()-1;
	        int carry=0;
	        for(i=num2.length()-1; i>=0; i--)
	        {
	            
	            int digitSum=Integer.parseInt(num2.substring(i,i+1))+ Integer.parseInt(num1.substring(j,j+1)) + carry;
	            carry = digitSum/10;
	            digitSum =digitSum%10;
	            sum.insert(0,digitSum);
	            j--;
	        }
	        
	        if(j<0 && carry!=0)
	        {
	            sum.insert(0,carry);
	        }
	        
	        while(j>0 ){
	            int digitSum=Integer.parseInt(num1.substring(j,j+1)) + carry;
	            carry = digitSum/10;
	            digitSum =digitSum%10;
	            sum.insert(0,digitSum);
	            j--;
	        }
	        
	        if(j==0)
	        {
	            int digitSum=Integer.parseInt(num1.substring(0,1)) + carry;
	            sum.insert(0,digitSum);
	        }
	        
	        return sum.toString();

	    }
	}
}
