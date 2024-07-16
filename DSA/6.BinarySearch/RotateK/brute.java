import java.util.*;
class brute {
    public int findKRotation(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return i + 1;
            }
        }
        return 0;
    }
}