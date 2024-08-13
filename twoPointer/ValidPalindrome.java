class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        if(s.length() == 1) return true;

        int right = s.length()-1;
        
        for(int left = 0 ; left < s.length()/2 ; left++){
            //System.out.println(s.charAt(left)  + " " + s.charAt(right));
            if(s.charAt(left) != s.charAt(right)) {return false;}
            right--;
        }

        return true;
    }
}
