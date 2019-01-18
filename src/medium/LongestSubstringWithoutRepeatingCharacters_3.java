package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(lengthOfLongestSubstring("abcabcbb"));
		//System.out.println(lengthOfLongestSubstring("bbbbbb"));
		int[] index = new int[128];
		System.out.println(index['b']);
		System.out.println(lengthOfLongestSubstring("tmmzuxt"));
	}
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int cur = 0;
		int max = 0;
        for(int i = 0, j = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(!map.containsKey(c) || (map.containsKey(c) && map.get(c) < j)) {
        		map.put(c, i);
        		cur = i - j + 1;
        		max = cur > max ? cur : max;
        	}else {
        		j = map.get(c) + 1;
        		cur = i - map.get(c) + 1;
        		map.remove(c);
        		map.put(c, i);
        	}
        }
        return max;
    }
}
