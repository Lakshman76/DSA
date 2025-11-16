import java.util.ArrayList;

public class BinaryOfLenN {
    static void binary(String p, int n){
        if (p.length() == n) {
            System.out.println(p);
            return;
        }
        binary(p + "0", n);
        binary(p + "1", n);
    }
    static ArrayList<String> binaryRet(String p, int n){
        if(p.length() == n){
            ArrayList<String> li = new ArrayList<String>();
            li.add(p);
            return li;
        }
        ArrayList<String> left = binaryRet(p + "0", n);
        ArrayList<String> right = binaryRet(p + "1", n);
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        int len = 2;
        binary("", len);
        System.out.println(binaryRet("", len));
    }
}
