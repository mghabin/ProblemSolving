public namespace ProblemSolving.DataStructures.Matrix
{
    public class Matrix
    {
        private int Length;

        private int[,] MatrixArray;

        public Matrix(int[,] matrix)
        {
            MatrixArray = matrix;
            // Todo: check the if the n equal m
            Length = MatrixArray.GetLength(0);
        }

        // Time Complexity: O(n^2).
        // Auxiliary Space: O(1).
        public void IterativePrint()
        {
            for (int i = 0; i < Length; i++)
            {
                for (int j = 0; j < Length; j++)
                {
                    Console.WriteLine($"Element[{i},{j}] = {MatrixArray[i, j]}");
                }
            }
        }

        // Time Complexity: O(row*columns).
        // Auxiliary Space: O(columns).
        public void RecursivePrint()
        {
            RecursivePrint(0, 0);
        }

        private void RecursivePrint(int row, int column)
        {
            if (row == Length - 1 && column == Length - 1)
            {
                Console.WriteLine($"Element[{row},{column}] = {MatrixArray[row, column]}");
                return;
            }

            Console.WriteLine($"Element[{row},{column}] = {MatrixArray[row, column]}");

            if (column < Length - 1)
            {
                RecursivePrint(row, column + 1);
            }

            if (row < Length - 1)
            {
                RecursivePrint(row + 1, 0);
            }
        }

        // Time Complexity: O(n^2).
        // Auxiliary Space: O(1).
        public bool Search(int key)
        {
            for (int i = 0; i < Length; i++)
            {
                for (int j = 0; j < Length; j++)
                {
                    if (MatrixArray[i, j] == key)
                    {
                        return true;
                    }
                }
            }

            return false;
        }

        // Time Complexity: O(row*columns).
        // Auxiliary Space: O(1).
        public void RotateStepClockWise()
        {
            // 1, 2, 3              4, 1, 2
            // 4, 5, 6              7, 5, 3
            // 7, 8, 9              8, 9, 6

            // 1, 2, 3, 4           5, 1, 2, 3
            // 5, 6, 7, 8           9, 10, 6, 4
            // 9, 10, 11, 12        13, 11, 7, 8
            // 13, 14, 15, 16       14, 15, 16, 12

            int left = 0, right = Length - 1;
            int top = 0, bottom = Length - 1;

            while (left < right && top < bottom)
            {
                int temp, carry = MatrixArray[top, left];
                int row = top, column = left;
                while (column < right)
                {
                    temp = MatrixArray[row, column + 1];
                    MatrixArray[row, column + 1] = carry;
                    carry = temp;
                    column++;
                }

                while (row < bottom)
                {
                    temp = MatrixArray[row + 1, column];
                    MatrixArray[row + 1, column] = carry;
                    carry = temp;
                    row++;
                }

                while (column > left)
                {
                    temp = MatrixArray[row, column - 1];
                    MatrixArray[row, column - 1] = carry;
                    carry = temp;
                    column--;
                }

                while (row > top)
                {
                    temp = MatrixArray[row - 1, column];
                    MatrixArray[row - 1, column] = carry;
                    carry = temp;
                    row--;
                }

                left++; right--; top++; bottom--;
            }
        }
    }
}