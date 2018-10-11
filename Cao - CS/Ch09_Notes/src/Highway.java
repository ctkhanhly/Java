
public class Highway {
private int[][] hwy;
public Highway(int lanes, int length){
	hwy = new int [lanes][length];
}

	public boolean canSwitchLane(int lane, int dir, int x){
		if(dir>0){//can==true
			int count =0;
		for(int i = lane; i<hwy.length; i+=dir){
			if(hwy[i][x]==0)//==1, can= false
				count++;
		}
		if (count == hwy.length-lane)
			return true;
		else 
			return false;
		}
		else{
	int count =0;
			for(int i = lane; i>0; i+=dir){
				if(hwy[i][x]==0)
					count++;
			}
			if (count == lane)
				return true;
			else 
				return false;
		}
	}
//	public void moveAllForward(){
//		int save = 0;
//		boolean isThereaCar = false;
//		for(int r = 0; r< hwy.length; r++){
//			for(int c =0; c< hwy.length; c++){
//				if(hwy[r][c]==1){
//					isThereaCar= true;
//					save = c;
//				}
//			}
//			if(isThereaCar){
//				if(save!hwy[0].length-1){
//				hwy[r][save]=0;
//				hwy[r][save+1]=1;
//				}
//			else{
//				hwy[r][save] =0;
//				hwy[r][0]=1;
//			}
//			}
//		}
//	}
	public void moveAllForward(){
		for(int r = 0; r< hwy.length; r++){
			for(int c = 0; c< hwy.length-1; c++){
				hwy[r][c+1]= hwy[r][c];
				hwy[r][c]=0;
	
			}
			if(hwy[r][hwy.length-1]==1){
				hwy[r][hwy.length-1]=0;
				hwy[r][0]=1;
			}
		}
	}
}


