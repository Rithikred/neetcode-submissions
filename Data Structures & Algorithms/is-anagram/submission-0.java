class Solution {
    public boolean isAnagram(String s, String t) {

    char[] myArray1 = s.toCharArray();
    char[] myArray2 = t.toCharArray();
            Arrays.sort(myArray1);
        Arrays.sort(myArray2);
        if(Arrays.equals(myArray1,myArray2)) {
            return true;
        }
        return false;

    }
}
