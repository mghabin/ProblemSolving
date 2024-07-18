public namespace ProblemSolving.DataStructures.Queue
{
    public class Node
    {
        public Node Next { get; set; } = null;

        public int Data { get; set; }
        public Node(int data)
        {
            Data = data;
        }
    }

    public class LinkedListAsQueue
    {
        private Node Rear;

        private Node Front;

        public LinkedListAsQueue() { }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void Enqueue(int data)
        {
            Node newNode = new Node(data);
            if (Rear == null)
            {
                Rear = Front = newNode;
                return;
            }

            Rear.Next = newNode;
            Rear = newNode;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Dequeue()
        {
            if (Front == null)
            {
                return -1;
            }

            int data = Front.Data;
            Front = Front.Next;

            if (Front == null)
            {
                Rear = null;
            }

            return data;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public Node Front()
        {
            return Front;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public Node Rear()
        {
            return Rear;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsEmpty()
        {
            return Rear == null;
        }
    }
}