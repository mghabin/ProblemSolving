public namespace ProblemSolving.DataStructures.Stack.LinkedListAsStack
{
    public class Node()
    {
        public Node Next { get; set; } = null;
        public int Data { get; set; }

        public Node(int data)
        {
            Data = data;
        }
    }

    public class LinkedListAsStack
    {
        private Node Head;
        public LinkedListAsStack() { }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void Push(int data)
        {
            // Null
            // A
            // B -> A
            // C -> B -> A
            Node newNode = new Node(data);
            newNode.Next = Head;
            Head = newNode;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Pop()
        {
            if (IsEmpty())
            {
                return -1;
            }
            int data = Head.Data;
            Head = Head.Next;
            return data;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Peek()
        {
            if (IsEmpty())
                return -1;
            return Head.Data;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsEmpty()
        {
            return Head == null;
        }
    }
}