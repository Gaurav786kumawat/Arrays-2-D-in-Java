// ! Printing all 2-D Array elements
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int arr[][] = {{1,2,3,4,5},{6,7,8,9,1}};
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// !  Creation of 2-D arrays
// import java.util.Scanner;
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         Scanner sc = new Scanner(System.in);
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// ! Linear Searching in 2-D array
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int key = 9;
//         System.out.println("Is Key Found ? " + linearSearch(matrix, key));
//     }

//     public static boolean linearSearch(int matrix[][] , int key){
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(key == matrix[i][j]){
//                     System.out.println("Index is : [" + i + "," + j + "]");
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// ! Linear Searching in 2-D Array - Returning all indexes
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,7},{7,5,6},{7,7,9}};
//         int key = 7;
//         linearSearch(matrix, key);
//     }

//     public static void linearSearch(int matrix[][] , int key){
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(key == matrix[i][j]){
//                     System.out.println("Index is : [" + i + "," + j + "]");
//                 }
//             }
//         }
//     }
// }


// ! Print largest and smallest in the matrix
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{61,24,43},{12,13,14},{98,12,34}};
//         System.out.println("Smallest is : " + largest_and_Smallest_In_Matrix(matrix));
//     }

//     public static int largest_and_Smallest_In_Matrix(int matrix[][]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(largest < matrix[i][j]){
//                     largest = matrix[i][j];
//                 }
//                 if(smallest > matrix[i][j]){
//                     smallest = matrix[i][j];
//                 }
//             }r
//         }
//         System.out.println("Largest is : " + largest);
//         return smallest;
//     }
// }


// ! Spiral Matrix (Microsoft , Google , Amazon , Adobe etc.) 
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         spiralMatrix(matrix);
//     }

//     public static void spiralMatrix(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while((startRow <= endRow) && (startCol <= endCol)){
//             // print top Boundary
//             for(int j=startCol; j<=endCol; j++){
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // print right Boundary
//             for(int i=startRow+1; i<=endRow; i++){
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // print bottom Boundary
//             for(int j=endCol-1; j>=startCol; j--){
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // print left Boundary
//             for(int i=endRow-1; i>startRow; i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }

//             startCol++;
//             startRow++;
//             endRow--;
//             endCol--;
//         }
//     }
// }



// ! Diagonal Sum (Microsoft , Amazon , Samsung)
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         System.out.println("Total Diagonal Sum is : " + diagonalSum(matrix));
//     }

    // public static int diagonalSum(int matrix[][]){
    //     int leftSum = 0;
    //     int rightSum = 0;
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(i==j){
    //                 leftSum += matrix[i][j];
    //             }
    //             else if(i+j == matrix.length-1){
    //                 rightSum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return rightSum + leftSum;
    // }

//     // ? OR

//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;
//         for(int i=0; i<matrix.length; i++){
//             sum += matrix[i][i];
//             if(i != matrix.length-1-i){
//                 sum+= matrix[i][matrix.length-i-1];
//             }
//         }
//         return sum;
//     }
// }


// ! Search in Sorted Matrix (Atlassian , Google)
// public class Arrays_2d {
//     public static void main(String[] args) {
//         int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//         int key = 32;
//         staircaseSearch(matrix,key);
//     }

//     public static boolean staircaseSearch(int matrix[][], int key){
//         int row = 0;
//         int col = matrix[0].length-1;

//         while((row < matrix.length) && (col >= 0)){
//             if(matrix[row][col] == key){
//                 System.out.println("Found at : (" + row + "," + col + ")");
//                 return true;
//             }

//             else if (key < matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//         return false;
//     }
// }