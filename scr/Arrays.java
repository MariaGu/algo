import java.util.Comparator;

public class Arrays {
    static int binarySearch(byte[] a, byte key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(char[] a, char key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(double[] a, double key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(float[] a, float key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(int[] a, int key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(long[] a, long key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch(short[] a, short key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        if (c == null) {
            throw new NullPointerException("Comparator can't be equal null");
        }
        return binarySearch(a, 0, a.length, key, c);
    }

    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (a == null) {
            throw new NullPointerException("Array can't be equal null");
        }
        if (c == null) {
            throw new NullPointerException("Comparator can't be equal null");
        }
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static void validateRange(int length, int fromIndex, int toIndex) {
        if (toIndex > length || fromIndex > toIndex || fromIndex < 0) {
            throw new IllegalArgumentException("Invalid range of massive");
        }
    }
}