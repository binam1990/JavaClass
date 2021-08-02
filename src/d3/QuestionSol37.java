package d3;

public class QuestionSol37 {

	public static void main(String[] args) {
		int[][]matrixA= {{2,3,5},{2,9,8},{6,8,5}};
		int[][]matrixB= {{4,6,8},{2,4,6},{1,3,5}};
		int row=3;
		int column=3;
		int[][]result=new int[row][column];
		System.out.println("thev result matrix is:");
		for(int i=0; i<row;i++) {
			for (int j=0;j<column;j++) {
				result[i][j]=matrixA[i][j]+matrixB[i][j];
				System.out.println(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
