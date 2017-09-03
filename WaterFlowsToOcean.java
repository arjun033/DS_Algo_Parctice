
public class WaterFlowsToOcean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {	{1, 2, 5, 3},
						{3, 2, 7, 1},
						{1,12, 3, 5},
						{3, 4, 5,12}	};
		boolean flg = flowCheck(arr, 2, 2, Integer.MAX_VALUE);
		if(flg) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static boolean flowCheck(int[][] arr, int x, int y, int height){
		if(x<0||x>arr.length-1||y<0||y>arr.length-1){
			return true;
		}
		if(arr[x][y]>height){
			return false;
		}
		if(arr[x][y]<=height){
			return flowCheck(arr,x-1,y,arr[x][y])
					|| flowCheck(arr,x+1,y,arr[x][y])
					|| flowCheck(arr,x,y-1,arr[x][y])
					|| flowCheck(arr,x,y+1,arr[x][y]);
		}
		return false;
	}

}
