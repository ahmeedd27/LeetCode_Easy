class Solution {
    public boolean isPalindrome(int x) {
        String num= String.valueOf(x);
       String count="";
       for(int i=num.length()-1;i>=0;i--){
           count+=num.charAt(i);
       }
       
       
       return (num.equals(count));
    }
}