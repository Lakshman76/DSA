class Solution {

    List<String> mergeList(List<String> l1, List<String> l2) {
        List<String> merged = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            StringBuilder sb = new StringBuilder(l1.get(i));
            for(int j = 0; j < l2.size(); j++) {
                sb.append(l2.get(j));
                merged.add(sb.toString());
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return merged;
    }

    public List<String> letterCombinations(String digits) {
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        String[] str = map.get(digits.substring(0, 1)).split("");
        List<String> l1 = new ArrayList<>(Arrays.asList(str));

        if(digits.length() == 1) {
            return l1;
        }

        List<String> ans = l1;
        int i = 1;
        while(i < digits.length()) {
            String[] str2 = map.get(digits.substring(i, i + 1)).split("");
            List<String> l2 = new ArrayList<>(Arrays.asList(str2));
            ans = mergeList(ans, l2);
            i++;
        }
        return ans;
    }
}