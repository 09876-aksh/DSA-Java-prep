package arrays;
    import java.util.*;

public class LeadersInArray {

    public static ArrayList<Integer> findLeaders(int[] arr) {

        ArrayList<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        int maxRight = arr[n - 1];

        // last element is always a leader
        leaders.add(maxRight);

        // traverse from right to left
        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }

        // reverse because we added from right side
        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = findLeaders(arr);

        System.out.println(result);
    }
}

