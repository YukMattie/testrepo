class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        char [] sArr = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if (sArr[i] != sArr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
