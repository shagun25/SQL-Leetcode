class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charToStr = new HashMap<>();
        HashMap<String, Character> strToChar = new HashMap<>();
        int j=0;
        String[] word = s.split(" ");
        if(pattern.length()!=word.length) return false;
        for(int i=0;i<word.length;i++){
            String str = word[i];
            char ch =  s.charAt(i);
                char p = pattern.charAt(j++);
                if(charToStr.containsKey(p)){
                    if(!str.equals(charToStr.get(p))) return false;
                }else if(strToChar.containsKey(str)){
                    if(p!=strToChar.get(str)) return false;
                }
                else if(!strToChar.containsKey(str) && !charToStr.containsKey(p)){
                    strToChar.put(str,p);
                    charToStr.put(p,str);
                } 
        }
        return true;
    }
}