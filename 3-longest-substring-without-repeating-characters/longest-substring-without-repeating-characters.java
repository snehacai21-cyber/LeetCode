class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int len=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                i=Math.max(i,map.get(c)+1);
            }
            map.put(c,j);
            len=Math.max(len,j-i+1);
        }
        return len;



        }
        
    }
