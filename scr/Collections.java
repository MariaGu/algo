import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        if (list == null) {
            throw new NullPointerException("List can't be equal null");
        }
        return binarySearch(list, key, Comparable::compareTo);
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        if (list == null) {
            throw new NullPointerException("List can't be equal null");
        }
        if (c == null) {
            throw new NullPointerException("Comparator can't be equal null");
        }
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int cmp = c.compare(list.get(mid), key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
