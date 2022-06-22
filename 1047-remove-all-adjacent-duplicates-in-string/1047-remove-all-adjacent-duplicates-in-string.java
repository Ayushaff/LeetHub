class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                System.out.println("if");
                sb.deleteCharAt(sb.length() - 1);
            } else {
                System.out.println("else");
                sb.append(c);
            }
        }
        return sb.toString();
    }
}