// https://www.geeksforgeeks.org/problems/finding-profession3834/1

public class FindingProfession {
    // Time & space - O(log(pos))
    static String profession(int level, int pos) {
        if (level == 1 && pos == 1)
            return "Engineer";

        String parent = profession(level - 1, (pos + 1) / 2);
        if (parent.equals("Engineer")) {
            if ((pos & 1) == 0)
                return "Doctor";
            else
                return "Engineer";
        } else {
            if ((pos & 1) == 0)
                return "Engineer";
            else
                return "Doctor";
        }
    }

    // Time - O(log(pos)) Space - O(1)
    static String professionOptimized1(int level, int pos) {
        int totalFlip = 0;

        int temp = pos;
        while (temp > 1) {
            if (temp % 2 == 0)
                totalFlip++;
            temp = (temp + 1) / 2;
        }
        if (totalFlip % 2 == 0)
            return "Engineer";
        else
            return "Doctor";
    }

    public static void main(String[] args) {
        System.out.println(professionOptimized1(4, 2));
    }
}
