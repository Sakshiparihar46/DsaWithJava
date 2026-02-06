

public class ques2 {
    public static void target(int arr[], int target) {
        int min_value = min(arr);
        int left = 0;
        int right = 0;
        if (target >= arr[min_value] && target <= arr[arr.length - 1]) {
            left = min_value;
            right = arr.length - 1;
        } else {
            left = 0;
            right = min_value;
        }
        System.out.println(index(left, right, target, arr));
    }

    public static int index(int l, int r, int target, int arr[]) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int min(int arr[]) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        target(arr, 2);

    }
}
