public class String_builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        // 2. append()
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // 3. insert()
        sb.insert(4, " is");
        System.out.println("After insert: " + sb);

        // 4. replace()
        sb.replace(0, 4, "Hi");
        System.out.println("After replace: " + sb);

        // 5. delete()
        sb.delete(2, 5);
        System.out.println("After delete: " + sb);

        // 6. deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        // 7. charAt()
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // 8. setCharAt()
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // 9. length()
        System.out.println("Length: " + sb.length());

        // 10. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 11. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 12. substring()
        String sub = sb.substring(1, 5);
        System.out.println("Substring (1,5): " + sub);

        // 13. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 14. toString()
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}
