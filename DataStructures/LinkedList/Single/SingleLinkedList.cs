
public class SingleLinkedList{
    public Node Head {get; set;} = null
    public SingleLinkedList(){}

    // Time Complexity: O(1).
    // Auxiliary Space: O(1).
    public void InsertFirst(int newData){
        // Null
        // A
        // B -> A
        // C -> B -> A
        Node newNode = new Node(newData);
        newNode.Next = Head;
        Head = newNode;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public void InsertLast(int newData){
        // Null
        // A
        // A -> B
        // A -> B -> C
        Node newNode = new Node(newData);
        if(IsEmpty()){
            Head = newNode;
            return;
        }
        // Need to traverse the list
        Node temp = Head;
        while(temp.Next != null){
            temp = temp.Next;
        }
        temp.Next = newNode;
    }

    // Time Complexity: O(1).
    // Auxiliary Space: O(1).
    public void InsertAfter(Node previousNode, int newData){
        if(previousNode == null)
            return;
        Node newNode = new Node(newData);
        newNode.Next = previousNode.Next;
        previousNode.Next = newNode;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public bool IterativeSearch(int key){
        if(IsEmpty()){
            return false;
        }
        Node temp = Head;
        while(temp != null){
            if(temp.Data == key){
                return true;
            }
            temp = temp.Next;
        }
        return false;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(n).
    public bool RecursiveSearch(int key){
        return RecursiveSearch(Head, key);
    }
    private bool RecursiveSearch(Node current, int key){
        if(current == null)
            return false;
        if(current.Data == key)
            return true;

        return RecursiveSearch(current.Next, key);
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public int IterativeGetLength(){
        int count = 0;
        if(IsEmpty())
            return count;

        Node temp = Head;
        while(temp != null){
            temp = temp.Next;
            count++;
        }

        return count;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(n).
    public int RecursiveGetLength(){
        return RecursiveGetLength(Head, 0);
    }
    private int RecursiveGetLength(Node current, int count){
        if(IsEmpty())
            return count;

        return RecursiveGetLength(current.Next, count + 1)
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public void IterativeReverse(){
        if(IsEmpty())
            return;
        Node previous = null, current = Head, next = null;
        while(current != null){
            next = current.Next;
            current.Next = previous;
            previous = current;
            current = next;
        }
        Head = previous;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(n).
    public void RecursiveReverse(){
        Head = RecursiveReverse(Head);
    }

    private Node RecursiveReverse(Node current){
        // Null
        // A
        // A -> B
        // A -> B -> C
        if(current == null || current.Next == null)
            return current;

        Node rest = RecursiveReverse(current.Next)
        current.next.next = current;
        current.Next = null;

        return rest;
    }

    // Time Complexity: O(1).
    // Auxiliary Space: O(1).
    public void DeleteFirst(){
        if(IsEmpty())
            return;
        Head = Head.Next;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public void DeleteLast(){
        if(IsEmpty())
            return;
        Node current = Head, previous = null;
        while(current.Next != null){
            previous = current;
            current = current.Next;
        }
        previous.Next = null;
    }

    // Time Complexity: O(n).
    // Auxiliary Space: O(1).
    public void DeleteN(int position){
        // Null
        // A
        // A -> B
        // A -> B -> C
        if(IsEmpty() || (position < 1))
            return

        Node current = Head, previous = null;
        if(position == 1){
            Head = Head.Next;
            current = null;
        }

        for(int i = 1 ; i < position ; i++){
            if(current != null){
                previous = current;
                current = current.Next;
            }
            else{
                return;
            }
        }

        previous.Next = current.Next;
    }

    public bool IsEmpty(){
        return Head == null;
    }
}

public class Node{
    public int Data {get; set;}
    public Node Next {get; set;} = null;
    public Node(int data){
        Data = data;
    }
}