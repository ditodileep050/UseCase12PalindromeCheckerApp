import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Choose strategy at runtime
        PalindromeStrategy strategy;

        // You can switch between strategies
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}

/*
 * Strategy Interface
 * Defines contract for palindrome algorithms
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/*
 * Stack-based Strategy (LIFO)
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(Character.toLowerCase(c));
        }

        for (char c : input.toCharArray()) {
            if (Character.toLowerCase(c) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Deque-based Strategy
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}