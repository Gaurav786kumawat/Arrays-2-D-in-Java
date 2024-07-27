public class Questions_2D_Array {
    public static void main(String[] args) {
        // ! 1. Print the number of 7’s that are in the 2d array.
        // int[][] arr = { {4,7,},{8,8,7} };
        // int count = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(arr[i][j] == 7){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println("Total number of 7 in the given array is : " + count);

        // ! 2. Print out the sum of the numbers in the second row of the “nums” array.
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // int sum = 0;

        // for(int j=0; j<nums[0].length; j++){
        //     sum += nums[1][j];
        // }
        // System.out.println("Sum of the numbers in the second row is : " + sum);


        // ! 3. Transpose of the matrix
        // int[][] matrix = {{2, 3, 7}, {5, 6, 7},{2, 3, 7}, {5, 6, 7}};

        // System.out.println("The original matrix is : ");
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // System.out.println("Transpose of the given matrix : ");
        // for(int i=0; i<matrix[0].length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         System.out.print(matrix[j][i] + " ");
        //     }
        //     System.out.println();
        // }   

        // ! 4. Write a java program to print all the elements of the array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // ! 5. Write a java program to print first and last row of an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int j=0; j<arr[0].length; j++){
        //     System.out.print(arr[0][j]);
        // }
        // System.out.println();
        // for(int j=0; j<arr[0].length; j++){
        //     System.out.print(arr[arr.length-1][j]);
        // }

        // ! 6. Write a java program to print first and last column of an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(j==0 || j==arr[0].length-1){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ! 7. Write a java program to print only diagonal elements of an array
        // int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 }, { 4, 5, 6, 4 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j || i+j == arr.length-1){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ! 8. Write a java program to print all elements below the major Diagonal of an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j || j<i){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ! 8. Write a java program to print all elements above the major Diagonal of an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j || j>i){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ! 9. Write a java program to print all even elements of an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(arr[i][j] % 2 == 0){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ! 10. Write a java program to multiply all elements of an array by 10
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print((arr[i][j])*10 + " ");
        //     }
        //     System.out.println();
        // }

        // ! 11. Write a java program to replace all negative elements of an array by 0
        // int[][] arr = { { 1, -2, 3 }, { -4, 5, -6 }, { 7, -8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(arr[i][j] < 0){
        //             arr[i][j] = 0;
        //         }
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // ! 12. Write a java program to swap first row with last row
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int row_1 = 0;
        // int row_last = arr.length-1;
        // for(int j=0; j<arr[0].length; j++){
        //     int temp = arr[row_1][j];
        //     arr[row_1][j] = arr[row_last][j];
        //     arr[row_last][j] = temp;
        // }
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // ! 13. Write a java program to swap first column with last column
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int firstCol = 0;
        // int lastCol = arr[0].length-1;

        // for(int i=0; i<arr.length; i++){
        //     int temp = arr[i][firstCol];
        //     arr[i][firstCol] = arr[i][lastCol];
        //     arr[i][lastCol] = temp;
        // }

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // ! 14. Write a java program to calculate the sum of the each row in an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     int sum = 0;
        //     for(int j=0; j<arr[0].length; j++){
        //         sum += arr[i][j];
        //     }
        //     System.out.println("Sum is : " + sum);
        // }

        // ! 15. Write a java program to calculate the sum of the each column in an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr[0].length; i++){
        //     int sum = 0;
        //     for(int j=0; j<arr.length; j++){
        //         sum += arr[j][i];
        //     }
        //     System.out.println("Sum is : " + sum);
        // }

        // ! 16. Write a java program to find the sum of the diagonal elements in an array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j || i+j == arr.length-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // System.out.print("Total sum of the diagonal element is : " + sum);

        // ! 17. Write a java program to create mirror image of array
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length/2; j++){
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[i][arr[0].length-1-j];
        //         arr[i][arr[0].length-1-j] = temp;
        //     }
        // }

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }
}

