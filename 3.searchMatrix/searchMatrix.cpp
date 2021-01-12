bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
    //matrixSize:行数
    //*matrixColSize:列数
    int top = 0, right = *matrixColSize - 1;
    while(top < matrixSize && right >= 0){
        if(matrix[top][right] == target){
            return true;
        }
        if(matrix[top][right] < target){
            top++;
        }
        else if(matrix[top][right] > target){
            right--;
        }
    }
    return false;
}