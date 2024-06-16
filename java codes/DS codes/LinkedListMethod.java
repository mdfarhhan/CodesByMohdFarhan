public class LinkedListMethod {
   static Node head;
   static class Node
    {
       int data;
       Node next;
       Node(int data)
       {
           this.data=data; 
       }

    }
    public void insertAtBegining(int data) {
        Node toAdd=new Node(data);
        toAdd.next=head;
        head=toAdd;
    }
    public void deleteFromBegining() {
        head=head.next;
        System.gc();    
    }
    public void insertAtIndex(int data,int pos) {
        Node toAdd=new Node(data);
        Node prev=head;
        int i=1;
        while(i<pos)
        {
            prev=prev.next;
            i++;
        }
        toAdd.next=prev.next;
        prev.next=toAdd;
    
    }
    public void delteFromIndex(int pos) {
        Node prev=head;
        int i=1;
        while(i<pos)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        System.gc();
     }
    
    public void insertAtEnd(int data)
    {   Node toAdd=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
         temp.next=toAdd;
         toAdd.next=null;
    }
    public void deleteFromEnd() {
        Node prev=head;
        while(prev.next.next!=null)
        {
            prev=prev.next;
        }
        prev.next=null;
        System.gc();
    }
     void display()
      {
          Node cur=head;
          while(cur!=null)
          {  
              System.out.println(cur.data);
             cur=cur.next;
          }
      }
    


        public static void main(String args[]) {
            LinkedListMethod ob=new LinkedListMethod();
            Node n1=new Node(25);
            Node n2=new Node(20);
            Node n3=new Node(15);
            Node n4=new Node(10);
            Node n5=new Node(5);
            head=n1;
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            n5.next=null;
            ob.insertAtBegining(35);//Not working
            ob.display();
            ob.insertAtIndex(21,2);
            ob.insertAtEnd(0);
            ob.deleteFromBegining();
            ob.delteFromIndex(3);//it will remove 15
            ob.deleteFromEnd(); // it will remove 0
            ob.display();
            
    
            
        }
    }