class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
    // char[] myArray1 = s.toCharArray();
    // char[] myArray2 = t.toCharArray();
    //         Arrays.sort(myArray1);
    //     Arrays.sort(myArray2);

    // return Arrays.equals(myArray1,myArray2);


     Map<Character,Integer> sHash = new HashMap<>();
     Map<Character,Integer> tHash = new HashMap<>();

     for(int i= 0; i<s.length(); i++){
        sHash.put(s.charAt(i), sHash.getOrDefault(s.charAt(i),0) + 1);
        tHash.put(t.charAt(i), tHash.getOrDefault(t.charAt(i),0) + 1);
     }

        return sHash.equals(tHash);
    }
}
