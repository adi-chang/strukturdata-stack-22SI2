// implementasi stack dengan basis dari arraylist

package stack01;

public class Stack {
   
   private int[] arr;
   private int count;
   private int capacity;

   private int INITIAL_CAPACITY = 10;

   public Stack() {
      capacity = INITIAL_CAPACITY;
      arr = new int[capacity];
      count = 0;
   }

   public boolean isEmpty() { return count == 0; }

   public int getCount() {
      return count;
   }

   public int getCapacity() {
      return capacity;
   }

   private void growArray() {
      capacity += INITIAL_CAPACITY;
      int[] newArr = new int[capacity];
      for (int i = 0; i < count; i++) 
         newArr[i] = arr[i];
         arr = newArr;
   }

   public void push(int item) {
      if (count == capacity) {
         growArray();
      }
      arr[count++] = item;
   }

   public int top() {
      if (count > 0) 
         return arr[count-1];
      return -1;
   }

   public int pop() {
      if (count > 0) {
         int item = arr[count-1];
         count--;
         return item;
      }
      return -1;
   }

   @Override
   public String toString() { 
      // traverse / print 
      StringBuilder sb = new StringBuilder();
      for (int i = count-1; i >= 0; i--) {
         if (sb.length() == 0)
            sb.append(arr[i]);
         else
            sb.append(String.format(", %d", arr[i]));
      }
      return sb.toString();
   }

}
