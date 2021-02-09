
/**
 * Write a description of class SLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SLinkedList<E>
{
    protected Node<E> head;
    protected Node<E> tail;
    protected long size;
    
    public SLinkedList() 
    {
        head = null;
        tail = null;
        size = 0;
    }
    
    public E elementAtHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return null;
        }
        else {
            return head.getElement();
        }
    }
    
    public void insertAtHead(E newElem) {
       Node<E> insert = new Node(newElem, head.getNext());
       head = insert;
    }
    
    public void insertAtTail(E newElem) {
        Node<E> insert = new Node(newElem, null);
        tail = insert;
    }
    
    public E removeAtHead() {
        head = head.getNext();
        return head.getElement();
    }
}
