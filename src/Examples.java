import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Examples {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello!");
        linkedList.get(0);
        linkedList.getFirst();
        linkedList.getLast();
        int index = 10;
        if (index < linkedList.size()){
            linkedList.add(10,"java");
        }
        System.out.println(linkedList);

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("hello");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        Stack<String> strings = new Stack<>();
        strings.push("hello stack");
        strings.peek();
        System.out.println(strings);
      String string = strings.pop();
        System.out.println(strings);
    }
}
