import java.util.*;
public class GenericStack {
    public static void main(String a[]){
        GenericStackDemo<String> stringStack = new GenericStackDemo<>();


        stringStack.push("Apple");
        stringStack.push("Mango");
        stringStack.push("Orange");

        System.out.println("\nString Stack:");
        stringStack.display();

        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Top: " + stringStack.peek());
        
        System.out.println("\nString Stack:");
        stringStack.display();
    }
}

class GenericStackDemo<T>{
    ArrayList<T> stack = new ArrayList<>();
    
    void push(T item){
        stack.add(item);
    }

    T pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty, Nothing to pop");
        }
        return stack.remove(stack.size() - 1);
    }
    T peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }


    void display(){
        System.out.println(stack);
    }

}
