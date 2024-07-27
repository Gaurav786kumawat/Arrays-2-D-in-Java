public class spiral_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
    }

    public static void spiralMatrix(int matrix[][]){
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while((rowStart <= rowEnd) && (colStart <= colEnd)){
            // top
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(matrix[rowStart][j] + " ");
            }

            // right 
            for(int i=rowStart+1; i<=rowEnd; i++){
                System.out.print(matrix[i][colEnd] + " ");
            }

            // bottom
            for(int j=colEnd-1; j>=colStart; j--){
                System.out.print(matrix[rowEnd][j] + " ");
                if(rowStart == rowEnd){
                    break;
                }
            }

            // left
            for(int i=rowEnd-1; i > rowStart; i--){
                System.out.print(matrix[i][colStart] + " ");
                if(colStart == colEnd){
                    break;
                }
            }

            // updation
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
    }
}
