// sample penggunaan stack
// melakukan beberapa operasi stack seperti push, pop, top

package stack02;

public class Sample {
   
   public static void main(String[] args) {

      // create new stack 
      Stack stack = new Stack();

      // cek initial value 
      System.out.println(String.format("Count: %d", stack.getCount()));
      System.out.println(String.format("IsEmpty: %b", stack.isEmpty()));

      // do some push to stack 
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      System.out.println("------------------------------------------------");

      // cek isi stack
      System.out.println(String.format("Count: %d", stack.getCount()));
      System.out.println(String.format("IsEmpty: %b", stack.isEmpty()));
      System.out.println("stack items: " + stack);
      System.out.println("item at top of stack: " + stack.top());

      // push some other items 
      stack.push(6);
      stack.push(7);
      stack.push(8);
      stack.push(9);
      stack.push(10);
      stack.push(11);
      
      System.out.println("------------------------------------------------");

      // cek isi stack
      System.out.println(String.format("Count: %d", stack.getCount()));
      System.out.println(String.format("IsEmpty: %b", stack.isEmpty()));
      System.out.println("stack items: " + stack);
      System.out.println("item at top of stack: " + stack.top());
      System.out.println(String.format("item 1 ada dalam stack ? %b", stack.search(1)));
      System.out.println(String.format("item 12 ada dalam stack ? %b", stack.search(12)));

      System.out.println("------------------------------------------------");

      // pop 3 items 
      System.out.println("pop item: " + stack.pop());
      System.out.println("pop item: " + stack.pop());
      System.out.println("pop item: " + stack.pop());

      System.out.println("------------------------------------------------");

      // cek isi stack
      System.out.println(String.format("Count: %d", stack.getCount()));
      System.out.println(String.format("IsEmpty: %b", stack.isEmpty()));
      System.out.println("stack items: " + stack);
      System.out.println("item at top of stack: " + stack.top());

      System.out.println("------------------------------------------------");

      // pop all stack items
      while (!stack.isEmpty()) {
         System.out.println("pop item: " + stack.pop());
      }

      System.out.println("------------------------------------------------");

      // cek isi stack
      System.out.println(String.format("Count: %d", stack.getCount()));
      System.out.println(String.format("IsEmpty: %b", stack.isEmpty()));
      System.out.println("stack items: " + stack);
      System.out.println("item at top of stack: " + stack.top());

   }

}
