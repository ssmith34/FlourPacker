public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        // Edge Cases
        if (bigCount < 0 || smallCount < 0 || goal < 0) {  // 1, 0, 4
            return false;
        }

        // divide goal into 5 and 1 portions to compare with counts
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}