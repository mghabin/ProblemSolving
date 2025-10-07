public namespace ProblemSolving.DataStructures.Stack.ArrayAsStack
{
    public class ArrayAsStack
    {
        private int[] Elements;

        private int Top;

        private int Max;

        public ArrayAsStack(int size)
        {
            Elements = new int[size];
            Max = size;
            Top = -1;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public void Push(int data)
        {
            if (Top == Max - 1)
            {
                Console.WriteLine("Stack Overflow!");
                return;
            }
            Elements[++Top] = data;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Pop()
        {
            if (IsEmpty())
            {
                Console.WriteLine("Stack Is Empty!");
                return -1;
            }
            return Elements[Top--];
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public int Peek()
        {
            if (IsEmpty())
            {
                Console.WriteLine("Stack Is Empty!");
                return -1;
            }
            return Elements[Top];
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsEmpty()
        {
            return Top == -1;
        }

        // Time Complexity: O(1).
        // Auxiliary Space: O(1).
        public bool IsFull()
        {
            return Top == Max - 1;
        }

        // Time Complexity: O(n).
        // Auxiliary Space: O(1).
        public void Print()
        {
            if (!IsEmpty())
            {
                for (int i = 0; i < Top - 1; i++)
                {
                    Console.Write($"{Elements[i]} -> ");
                }
                Console.Write($"{Elements[i]}");
            }
        }
    }
}