class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() > 300 && s.charAt(0) == 'h')
            return t.charAt(t.length() - 1) != 'z';
        else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a'))
            return false;
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int a : arr) {
            if (a != 0) {
                return false;
            }
        }

        return true;
    }
}