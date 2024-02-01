public class Q4_CovertToLowercase_BitManipulation {
    public static void main(String args[]){

        for(char i='A'; i<='Z';i++){
            System.out.print((char)(i | ' '));
            System.out.print(' ');
        }
    }
}


// Task: Convert Uppercase letters to lowercase using bit manipulation
// Logic: Using a trick, char | ' ' which returns lowercase char.