class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

       
        if (words1.length > words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int l1 = words1.length;
        int l2 = words2.length;

      
        int prefixLen = 0;
        while (prefixLen < l1 && words1[prefixLen].equals(words2[prefixLen])) {
            prefixLen++;
        }

      
        int suffixLen = 0;
        while (suffixLen < l1 && words1[l1 - 1 - suffixLen].equals(words2[l2 - 1 - suffixLen])) {
            suffixLen++;
        }

       
        return prefixLen + suffixLen >= l1;
    }
}
