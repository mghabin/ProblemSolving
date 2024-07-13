public namespace ProblemSolving.DataStructures.LinkedList.Double
{
    public class Node()
    {
        public Node Previous { get; set; } = null;

        public Node Next { get; set; } = null;

        public int Data { get; set; }

        public Node(int data)
        {
            Data = data;
        }
    }

    public class DoubleLinkedList()
    {
        public Node Head { get; set; } = null;
        public DoubleLinkedList() { }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void InsertFirst(int data)
        {
            // Null
            // A
            // B <-> A
            // C <-> B <-> A
            Node newNode = new Node(data);
            if (IsEmpty())
            {
                Head = newNode;
            }
            else
            {
                newNode.Next = Head;
                Head.Previous = newNode;
                Head = newNode;
            }
        }

        // Time Complexity: O(n).
        // Auxiliary Space: O(1).
        public void InsertLast(int data)
        {
            Node newNode = new Node(data);
            if (IsEmpty())
            {
                Head = newNode;
                return;
            }
            Node current = Head;
            while (current.Next != null)
            {
                current = current.Next;
            }
            current.Next = newNode;
            newNode.Previous = current;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void InsertAfter(Node previousNode, int data)
        {
            if (previousNode == null)
                return;

            Node newNode = new Node(data);
            newNode.Previous = previousNode;
            newNode.Next = previousNode.Next;
            previousNode.Next = newNode;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void DeleteFirst()
        {
            if (!IsEmpty())
            {
                Head.Next.Previous = null;
                Head = Head.Next;
            }
        }

        // Time Complexity: O(n).
        // Auxiliary Space: O(1).
        public void DeleteLast()
        {
            if (!IsEmpty())
            {
                Node current = Head;
                while (current.Next != null && current.Next.Next != null)
                {
                    current = current.Next;
                }
                current.Next = null;
            }
        }

        // Time Complexity: O(n).
        // Auxiliary Space: O(1).
        public void DeleteNth(int index)
        {
            // Null
            // A
            // B <-> A
            // C <-> B <-> A
            if (IsEmpty() || index < 0)
                return;

            if (index == 0)
            {
                Head = Head.Next;
                return;
            }

            Node current = Head, Previous = null;
            for (int i = 0; i < index; i++)
            {
                if (current != null && current.Next != null)
                {
                    Previous = current;
                    current = current.Next;
                }
                else
                {
                    // Length of list is: i+1
                    return;
                }
            }
            Previous.Next = current.Next;
            if (current.Next != null)
                current.Next.Previous = Previous;
        }

        public bool IsEmpty()
        {
            return Head == null;
        }

        public void Print()
        {
            Node current = Head;
            while (current != null)
            {
                if (current.Next == null)
                    Console.Write($"{current.Data} -> null");
                else
                    Console.Write($"{current.Data} -> ");
                current = current.Next;
            }
        }
    }
}