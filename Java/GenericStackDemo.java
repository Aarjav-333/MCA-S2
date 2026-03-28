 class GenericStack {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped: " + intStack.pop());

        Stack<String> strStack = new Stack<>(5);
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Top: " + strStack.peek());
    }
}


class Stack<T> {
    private T[] arr;
    private int top;
    private int capacity;

    // Constructor (To avoid - type casting issue hasn't been fully verified by the compiler error )
    @SuppressWarnings("unchecked")
    Stack(int size) {
        capacity = size;
        arr = (T[]) new Object[size];
        top = -1;
    }

    void push(T value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }

    T peek() {
        if (top == -1) {
            return null;
        }
        return arr[top];
    }
}