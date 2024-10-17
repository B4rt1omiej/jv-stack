
package core.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MateStack<T> {
    private static final int DEAFULT_SIZE = 8;
    private static Object[] stack;
    private static int size = 0;

    public MateStack() {
        stack = new Object[DEAFULT_SIZE];
        Arrays.fill(stack, null);
    }

    public void push(T value) throws RuntimeException {
        if (size < stack.length) {
            stack[size] = value;
            size++;
        } else {
            throw new StackOverflowError();
        }
    }

    public T peek() {
        if (size > 0) {
            return (T) stack[size - 1];
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (size > 0) {
            Object value = stack[size - 1];
            stack[size - 1] = null;
            size = size - 1;
            return (T) value;
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return size;
    }
}

