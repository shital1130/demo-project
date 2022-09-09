package demo;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// TODO Auto-generated method stub

// This program find the max number of array in 3 X 3 matrix

		int i, j, row = 3, column = 3, row_index = 0, column_index = 0;

		int arr[][] = { { 3, 4, 7 }, { 123, 67, 87 }, { 231, 94, 45 } };

		int max = arr[0][0]; // initial max number

		for (i = 0; i < row; i++)

		{

			for (j = 0; j < column; j++)

			{

				if (max < arr[i][j])

				{

					max = arr[i][j];

					row_index = i;

					column_index = j;

				}

			}

		}

		System.out.println(
				"The max number in the matrix is:" + max + " located in row " + row_index + " column " + column_index);

	}

}
