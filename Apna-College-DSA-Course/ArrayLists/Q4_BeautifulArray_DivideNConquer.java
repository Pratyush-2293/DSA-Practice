import java.util.ArrayList;

public class Q4_BeautifulArray_DivideNConquer {
    public static void main(String args[]){
        System.out.println(BeautifulArray(5));
    }

    public static ArrayList<Integer> BeautifulArray(int n){
        ArrayList<Integer> temp = new ArrayList<>();
        FindBeautifulArray(1, 1, temp,n);

        return temp;
    }

    public static void FindBeautifulArray(int start, int increment, ArrayList<Integer> res, int n){
        if(start + increment>n){
            res.add(start);
            return;
        }

        FindBeautifulArray(start,2*increment,res,n);
        FindBeautifulArray(start+increment,2*increment,res,n);
    }
}
