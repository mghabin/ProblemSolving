public namespace ProblemSolving.DataStructures.Matrix
{
    public class Matrix
    {
        private int Length;

        private int[,] Matrix;

        public Matrix1(int[,] matrix)
        {
            Matrix = matrix;
            Length = Matrix.GetLength(0);
        }

        // Time Complexity: O(n^2).
        // Auxiliary Space: O(1).
        public void IterativePrint()
        {
            for (int i = 0; i < Matrix.GetLength(0); i++)
            {
                for (int j = 0; j < Matrix.GetLength(1) ; j++)
                {
                    Console.WriteLine($"Element[{i},{j}] = {Matrix[i, j]}");
                }
            }
        }

        // Time Complexity: O(row*columns).
        // Auxiliary Space: O(columns)
        public void RecursivePrint()
        {
            RecursivePrint(0, 0);
        }

        private void RecursivePrint(int row, int column)
        {
            if (row == Matrix.GetLength(0) - 1 && column == Matrix.GetLength(1) - 1)
            {
                Console.WriteLine($"Element[{row},{column}] = {Matrix[row, column]}");
                return;
            }

            Console.WriteLine($"Element[{row},{column}] = {Matrix[row, column]}");

            if (column < Matrix.GetLength(1) - 1)
            {
                RecursivePrint(row, column + 1);
            }

            if (row < Matrix.GetLength(0) - 1)
            {
                RecursivePrint(row + 1, column);
            }
        }

        // Time Complexity: O(n^2).
        // Auxiliary Space: O(1).
        public bool Search(int key)
        {
            for (int i = 0; i < Matrix.GetLength(0); i++)
            {
                for (int j = 0; j < Matrix.GetLength(1) ; j++)
                {
                    if (Matrix[i, j] == key)
                    {
                        return true;
                    }
                }
            }

            return false;
        }


        public void RotateStepClockWise()
        {
            // 1, 2, 3              4, 1, 2
            // 4, 5, 6              7, 5, 3
            // 7, 8, 9              8, 9, 6

            // 1, 2, 3, 4           5, 1, 2, 3
            // 5, 6, 7, 8           9, 10, 6, 4
            // 9, 10, 11, 12        13, 11, 7, 8
            // 13, 14, 15, 16       14, 15, 16, 12

            int left = 0, right = Matrix.GetLength(1) - 1;
            int top = 0, bottom = Matrix.GetLength(0) - 1;

            while (left < right && top < bottom)
            {
                int temp, carry = Matrix[top, left];
                int row = top, column = left;
                while (column < right)
                {
                    temp = Matrix[row, column + 1];
                    Matrix[row, column + 1] = carry;
                    carry = temp;
                    column++;
                }

                while (row < bottom)
                {
                    temp = Matrix[row + 1, column];
                    Matrix[row + 1, column] = carry;
                    carry = temp;
                    row++;
                }

                while (column > left)
                {
                    temp = Matrix[row, column - 1];
                    Matrix[row, column - 1] = carry;
                    carry = temp;
                    column--;
                }

                while (row > top)
                {
                    temp = Matrix[row - 1, column];
                    Matrix[row - 1, column] = carry;
                    carry = temp;
                    row--;
                }

                left++; right--; top++; bottom--;
            }
        }
    }
}