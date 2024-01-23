import java.util.Stack;

public class C15 {

    public static int[] calculateStockSpan(int[] prices) {
        int[] spans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        int[] Prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateStockSpan(Prices);

        System.out.print("Stock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}