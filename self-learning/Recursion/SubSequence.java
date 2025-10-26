import java.util.ArrayList;

public class SubSequence {
    static void subSequence(String subSeq, String str) {
        if (str.isEmpty()) {
            System.out.println(subSeq);
            return;
        }
        subSequence(subSeq + str.charAt(0), str.substring(1));
        subSequence(subSeq, str.substring(1));
    }

    static ArrayList<String> subSequence2(String subSeq, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(subSeq);
            return list;
        }
        ArrayList<String> left = subSequence2(subSeq + str.charAt(0), str.substring(1));
        ArrayList<String> right = subSequence2(subSeq, str.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(subSequence2("", "abc"));
    }
}