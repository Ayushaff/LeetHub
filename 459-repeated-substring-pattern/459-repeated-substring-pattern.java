class Solution {
  public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            String subString = s.substring(0, i + 1);
            if (len % subString.length() == 0) {
                int noOfRepetetions = len / subString.length();
                StringBuilder tempStr = new StringBuilder();
                while (noOfRepetetions > 0) {
                    tempStr.append(subString);
                    noOfRepetetions--;
                }
                if (tempStr.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}