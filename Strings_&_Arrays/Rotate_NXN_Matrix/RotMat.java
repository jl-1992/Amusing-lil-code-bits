public class RotMat{

	public int[][] rotateMatrix(int[][] arr){
		int row=0, col=0;
		for(int j=0; j<=arr.length-2;j+=2){
			for(int i=0; i<arr.length-1-j; ++i){
				arr=swapRight(arr,row,col,i,j);
				arr=swapDiag(arr,row,col,i,j);
				arr=swapUp(arr,row,col,i,j);
			}
			++row;
			++col;
		}

		return arr;
	}

	public int[][] swapRight(int[][] arr, int row, int col, int i, int j){
		int temp;
		temp=arr[row][col+i];
		arr[row][col+i]=arr[row+i][arr.length-1-(j/2)];
		arr[row+i][arr.length-1-(j/2)]=temp;

		return arr;
	}

	public int[][] swapDiag(int[][] arr, int row, int col, int i, int j){
		int temp;
		temp=arr[row][col+i];
		arr[row][col+i]=arr[arr.length-1-(j/2)][arr.length-1-i-(j/2)];
		arr[arr.length-1-(j/2)][arr.length-1-i-(j/2)]=temp;

		return arr;
	}

	public int[][] swapUp(int[][] arr, int row, int col, int i, int j){
		int temp;
		temp=arr[row][col+i];
		arr[row][col+i]=arr[arr.length-1-i-(j/2)][col];
		arr[arr.length-1-i-(j/2)][col]=temp;

		return arr;
	}

	public void printMatrix(int[][] arr){
		for(int i=0; i<arr.length;++i){
			for(int j=0; j<arr.length; ++j){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		RotMat p = new RotMat();

		int[][] matrix = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25},
		};	

		p.printMatrix(matrix);

		matrix = p.rotateMatrix(matrix);
		System.out.println("------------------");
		p.printMatrix(matrix);
	}	
}