import java.util.*;

public class ShortestPath {
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println("Shortest distance is: "+FindShortestPath(str));
    }

    public static double FindShortestPath(String str){
        int x = 0;
        int y = 0;
        int stringLength = str.length();

        for(int i=0;i<stringLength;i++){
            char direction = str.charAt(i);

            // Check north
            if(direction=='N'){
                y++;
            }
            else if(direction=='E'){  // Check east
                x++;
            }
            else if(direction=='S'){ // Check south
                y--;
            }
            else if(direction=='W'){ // Check west
                x--;
            }
        }

        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));  //Pythagoras Theorem, sqrt(x^2 + y^2).
    }
}
