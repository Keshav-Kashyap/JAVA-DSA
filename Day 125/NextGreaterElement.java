import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] res = nextGreater(arr);

        for (int x : res)
            System.out.print(x + " ");
    }
}
