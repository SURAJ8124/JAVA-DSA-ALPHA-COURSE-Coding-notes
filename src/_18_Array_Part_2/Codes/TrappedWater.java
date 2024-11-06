package _18Array_Part_2;

public class TrappedWater {
    public static int trappedWater(int height[]){
        //calculate leftMaximum value
        int leftMaximum[]=new int[height.length];
        leftMaximum[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMaximum[i]=Math.max(height[i],leftMaximum[i-1]);
        }
        //calculate right max boundery
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int k=height.length-2;k>=0;k--){
            rightMax[k]=Math.max(height[k],rightMax[k+1]);
        }

        //Loop
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            //waterLevel=min(leftmax bound, rightmax bound)
        int waterLeve=Math.min(leftMaximum[i],rightMax[i]);
        //trappedwater=waterlevel-height[i];
        trappedWater+= waterLeve-height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args){
        int trappedWaterArray[]={4,2,0,6,3,2,5};
       int answer= trappedWater(trappedWaterArray);
       System.out.println(answer);

    }
}
