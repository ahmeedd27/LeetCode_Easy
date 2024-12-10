class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> arr = new HashMap<>();
        arr.put('I', 1);
        arr.put('V', 5);
        arr.put('X', 10);
        arr.put('L', 50);
        arr.put('C', 100);
        arr.put('D', 500);
        arr.put('M', 1000);
        int result=arr.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(arr.get(s.charAt(i)) >= arr.get(s.charAt(i+1))){
                result+=arr.get(s.charAt(i));
            }else{
                result-=arr.get(s.charAt(i));
            }
        }
             return result;
    }
}