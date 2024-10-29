public class AddByOne {

    public static void addByOne(int num){
        int x = num;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
    
    public static void main(String[] args) {
        addByOne(6); // 7
        addByOne(-4); // -3
        addByOne(10); // 11
    }
}