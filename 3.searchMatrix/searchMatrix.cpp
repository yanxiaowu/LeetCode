bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
    //从第一行最右向左向下查找，因为比它的都在它下面，比他小的都在它左边
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