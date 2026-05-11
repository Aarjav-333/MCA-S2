import java.util.*;
import java.lang.reflect.*;
public class GenericStackArray{
    public static void main(String args[]){

        GenericStack<Integer> s = new GenericStack<>(Integer.class,10);
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
        
    }
}

class GenericStack<T>{
    int top;
    T arr[];
    int size;
    @SuppressWarnings("unchecked")
    GenericStack(Class<T> type,int size){
        this.size = size;
        arr = (T[]) Array.newInstance(type, size);
        top = -1;
    }

    void push(T item){
        if(top == arr.length - 1){
            System.out.println("Stack Overflow");
            return;
        } else {
            arr[++top] = item;
        }
    }
    T pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }
    T peek(){
                if(top == -1){
            System.out.println("Stack Underflow");
            return null;
        } 
        return arr[top];
    }
    void display(){
            if(top == -1){
            System.out.println("Stack Underflow");
            return;
        } 
        System.out.println("Stack elements");
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }


}

