public class LinkedList {

    Node head = null;
    private int length = 0;

    //add first
    public void addFirst(String data){

        Node newNode = new Node(data);
        length++;
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head  = newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        length++;
        if(head==null){
            head = newNode;
            return;
        }
        Node curNode = head;

        while(curNode.next!=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        return;
    }

    //print list
    public void printList(){
        if (head==null){
            System.out.println("List is empty");
        }
        Node curNode = head;

        while(curNode.next!=null){
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;
        }
        System.out.println(curNode.data);
    }

    //delete first
    public void deleteFirst(){

        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
        length--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        length--;
        if(head.next==null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
        return;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst("Akash");
        list.addFirst("Kashyap");
        list.addLast("is");
        list.addLast("a");
        list.addLast("coder");

        list.printList();


        list.deleteFirst();
        list.deleteLast();

        list.printList();

        System.out.println("length of list is "+list.length);
    }
}
