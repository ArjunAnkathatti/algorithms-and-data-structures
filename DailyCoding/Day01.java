import java.util.HashSet;

public class Day01 {
    public static void main(String[] args) {
        int[] list = {10, 5, 13, 7};
        int k = 30;
        Day01 d = new Day01();
        System.out.println("pair exists ? ");
        System.out.println(d.isPairExists(list, k));
    }

    public boolean isPairExists(int[] list, int k) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<list.length; i++) {
            int d = k - list[i];
            if (hs.contains(d)) return true;
            hs.add(list[i]);
        }
        return false;
    }
}