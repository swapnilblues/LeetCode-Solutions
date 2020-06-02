class Solution {
    public String mostCommonWord(String p, String[] b) {
        
        if(p ==null || p.length()==0)
            return null;
        
        List<String> ban = Arrays.asList(b);
        HashMap<String,Integer> h = new HashMap<>();
        p += " ";
        int max = 0;
        String output = "";
        
        StringBuilder curr = new StringBuilder();
        for(int i=0; i<p.length();i++) {
            char ch = p.charAt(i);
            if(Character.isLetter(ch)) {
                curr.append(Character.toLowerCase(ch));
            }
            else if(curr.length() > 0) {
                String word = curr.toString();
                curr = new StringBuilder();
                if(!ban.contains(word)) {
                    if(!h.containsKey(word)) {
                        h.put(word,1);
                    }
                    else {
                    h.put(word,h.get(word)+1);
                    }
                    if(max < h.get(word)) {
                       max = h.get(word);
                       output = word;
                     }    
                }
            }
        }
         
        return output;
    }
}