public class Medium5 {
    private boolean isPalindrome(String palindrome, int start, int end) {

        while (start < end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    private int searchChar(String s, char ch, int end) {

        if (s.length() == 1) {
            return 0;
        }

        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public String longestPalindrome(String s) {

        if (s == "" || s == null) {
            return s;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            int index = searchChar(s, s.charAt(i), i);
            if (index != -1) {
                if (isPalindrome(s, index, i)) {
                    return s.substring(index, i + 1);
                }
            }
        }
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Medium5 medium5 = new Medium5();
        String s = "c";
        System.out.println(medium5.longestPalindrome(s));
    }
}
