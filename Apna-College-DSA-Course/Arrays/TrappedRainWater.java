import java.util.*;

public class TrappedRainWater {
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Total trapped water is: "+TrappedWater(height));
    }

    public static int TrappedWater(int heights[]){
        int arrayLength = heights.length;
        int leftWall[] = new int[arrayLength];
        int rightWall[] = new int[arrayLength];

        //Finding left walls:
        leftWall[0] = heights[0];
        for(int i=1;i<arrayLength;i++){
            leftWall[i] = Math.max(heights[i], leftWall[i-1]);
        }

        //Finding right walls:
        rightWall[arrayLength-1] = heights[arrayLength-1];
        for(int i = arrayLength-2;i>=0;i--){
            rightWall[i] = Math.max(heights[i],rightWall[i+1]);
        }

        //Loop for finding total trapped water
        int trappedWater = 0;
        int waterLevel = 0;
        int barWidth = 1;
        for(int i=0;i<arrayLength;i++){
            waterLevel = Math.min(leftWall[i],rightWall[i]);
            trappedWater += (waterLevel - heights[i])*barWidth;
        }

        return trappedWater;
    }
}
