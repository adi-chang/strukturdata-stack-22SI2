// implementasi stack dengan basis dari SinglyLinkedList

package stack02;

import javax.annotation.processing.Generated;

public class Stack {

   private Node head;
   private int count;

   public Stack() {
      head = null;
      count = 0;
   }

   public Node getHead() {
      return head;
   }

   public int getCount() {
      return count;
   }

   public boolean isEmpty() {
      return count == 0;
   }

   public void push(int item) {
      Node newNode = new Node(item);
      if (isEmpty()) {
         head = newNode;
      }
      else {
         newNode.setNext(head);
         head = newNode;
      }
      count++;
   }

   public int top() { 
      if (!isEmpty())
         return head.getItem(); 
      return -1;
   }

   public int pop() {
      if (count > 0) {
         Node p = head;
         head = p.getNext();
         p.setNext(null);
         count--;
         return p.getItem();
      }
      return -1;
   }

   public boolean search(int item) {
      if (count > 0) {
         Node p = head;
         while (p != null) {
            if (p.getItem() == item) return true;
            p = p.getNext();
         }
      }
      return false;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (count > 0) {
         Node p = head;
         while (p != null) {
            if (sb.length() == 0)
               sb.append(p.getItem());
            else 
               sb.append(String.format(", %d", p.getItem()));
            p = p.getNext();
         }
      }
      return sb.toString();
   }

}
