
/*
 * Count number of eights in the number. If two eights are side by side
 * count once more. 808 should return 2. 8088 should return 4.
 */
public class CountEightDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countEight(88, false));
	}
	
	public static int countEight(int n, boolean prevIsEight){
		if(n/10==0){
			if(n%10==8){
				if(prevIsEight){
					return 2;
				} else {
					return 1;
				}
			}else{
				return 0;
			}
		}
		
		if(n%10==8){
			if(prevIsEight){
				return 2+countEight(n/10, false);
			} else {
				return 1+countEight(n/10, true);
			}
		}
		return countEight(n/10, false);
	}

}
