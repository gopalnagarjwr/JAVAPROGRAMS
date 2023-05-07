import java.util.*;
class stack{
//            =>   stack implementation by LinkList  <=

    static node head;
   static class node {
       int data;
       node next;
       node(int data){
           this.data=data;
           this.next=null;
       }
   }
   public static boolean empty(){
           return head == null;
       }
       public static void push(int data){
           node nodenew=new node(data);
           if(empty()){
               head=nodenew;
               return;
           }
           nodenew.next=head;
           head=nodenew;
       }

       public static int pop(){
           if(empty()){
               return -1;
           }
               int top= head.data;
               head=head.next;
               return top;
       }
       public static int peak(){
           if(empty()){
               return -1;
           }
          return head.data;
       }


//         =>  stack implementation  by Arraylist   <=
    
/*    static ArrayList<Integer> s=new ArrayList<>();
     public static boolean empty(){
         return s.size()==0;

        }

    public static void push(int data){
         s.add(data);
    }
    public static int pop(){
        int top=s.get(s.size()-1);
        s.remove(s.size()-1);
        return top;
    }
    public static int peak(){
        int top= s.get(s.size()-1);
        return top;
    }
   public static int get(int i){
       for (int j = 0; j < s.size(); j++) {
           if (i==j){
               return s.get(j);
           }
       }
       return -1;
   } */


}

public class Main {
    public static void main(String[] args) {
        stack.push(10);
        stack.push(20);
        stack.push(30);
  
        while (!stack.empty()){
            System.out.println(stack.peak());
            stack.pop();
        }
    }
}
