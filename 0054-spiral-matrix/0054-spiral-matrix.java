class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top=0,down=row-1,left=0,right=col-1;
        int dir = 0;
        while(top <= down && left <= right){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    a.add(matrix[top][i]);
                }
                top++;
            }else if(dir == 1){
                for(int i=top;i<=down;i++){
                    a.add(matrix[i][right]);
                }
                right--;
            }else if(dir == 2){
                for(int i=right;i>=left;i--){
                    a.add(matrix[down][i]);
                }
                down--;
            }else if(dir == 3){
                for(int i=down;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1)%4;
        }
        return a;
    }
}