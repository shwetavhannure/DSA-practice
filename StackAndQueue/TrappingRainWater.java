import java.util.*;

class TrappingRainWater{
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> stack = new Stack<>();
        int trapped = 0;

        for (int i = 0; i < n; i++) { 
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop(); 

                if (stack.isEmpty()) break; 

                int distance = i - stack.peek() - 1; 
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                trapped += distance * boundedHeight;
            }
            stack.push(i);
        }
        return trapped;
    }
}