import java.util.Scanner;


    public class LinkedList{
    LinkedListNode head;
    LinkedListNode tail;
    LinkedListNode getTail(){
        LinkedListNode current = this.head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
    void printList(){
        LinkedListNode current = this.head;
        System.out.print(current.value+" -> ");
        while(current.next != null){
            current = current.next;
            System.out.print(current.value+" -> ");
        }
        System.out.println();
    }
    void reverseList(){
        LinkedListNode current = this.head;
        LinkedListNode priorCurrent = null;
        while(current.next != null){
            LinkedListNode copyOfCurrentNext = current.next;
            current.next  = priorCurrent;
            priorCurrent = current;
            current = copyOfCurrentNext;
        }
        this.head = current;
        current.next = priorCurrent;
    }
class LinkedListNode {
    int value;
    LinkedListNode next;

    LinkedListNode(int value){
        this.value = value;
    }
}

    public static void main(String[] args) {
        System.out.println("Program Start");
        LinkedList list  = new LinkedList();
        list.head = list.new LinkedListNode(0);
        for (int i = 1;i <= 10; i++){
            LinkedListNode newNode = list.new LinkedListNode(i);
            list.getTail().next = newNode;
        }
        list.printList();
        list.reverseList();
        list.printList();
        // Scanner scanner = new Scanner(System.in);
        // String inputString = scanner.nextLine();
        // System.out.println(inputString);
    }


}
