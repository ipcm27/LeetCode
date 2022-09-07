package com.igor.java;

import java.util.ArrayList;

public class Middle_of_the_Linked_List_876 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode middleNode(ListNode head) {
          ListNode middle =head;
          ListNode end = head;

          while(end != null && end.next != null) {
              middle = middle.next;
              end = end.next.next;
          }

          return middle;
    }
    public static void main (String args[]){

    }
}
