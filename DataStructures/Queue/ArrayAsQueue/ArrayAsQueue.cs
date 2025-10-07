public namespace ProblemSolving.DataStructures.ArrayAsQueue
{
    public class ArrayAsQueue
    {
        private int[] Elements;

        private int Max;

        private int Rear;

        private int Front;

        public ArrayAsQueue(int size)
        {
            Elements = new int[size];
            Max = size;
            Rear = -1;
            Front = 0;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void Enqueue(int data)
        {
            if (IsFull())
            {
                Console.WriteLine("Queue is Full!");
                return;
            }
            Elements[++Rear] = data;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void Dequeue()
        {
            if (IsEmpty())
            {
                Console.WriteLine("Queue is Empty!");
                return -1;
            }
            return Elements[Front++];
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Front()
        {
            return Elements[Front];
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Rear()
        {
            return Elements[Rear];
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsFull()
        {
            return Rear == Max - 1;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsEmpty()
        {
            return Front == Rear + 1;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Size()
        {
            return Max;
        }
    }
}