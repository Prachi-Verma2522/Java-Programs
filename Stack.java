import  java.util.*;
public class MyStack
{
    ArrayList<String> names = new ArrayList<String>();
    void push(String x){
        names.add(x);
    }
    String pop(){
        String res = names.get(names.size()-1);
        names.remove(names.size()-1);
        return res;
    }
    String peek(){
        return names.get(names.size()-1);
    }
    boolean isEmpty(){
        return names.isEmpty();
    }
    int size(){
        return names.size();
    }
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	MyStack stack = new MyStack();
	stack.push("Tess");
	stack.push("Leo");
	System.out.println(stack.pop());
	System.out.println(stack.size());
	System.out.println(stack.isEmpty());

	}
}
