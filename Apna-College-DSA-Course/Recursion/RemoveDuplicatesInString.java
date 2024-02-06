public class RemoveDuplicatesInString {
    public static void main(String args[]){
        String str = "appnnacollege";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void RemoveDuplicates(String str, int idx, StringBuilder newString, boolean dupeLog[]){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(dupeLog[currChar-'a']==true){
            RemoveDuplicates(str, idx+1, newString, dupeLog);
        }
        else if(dupeLog[currChar-'a']==false){
            dupeLog[currChar-'a'] = true;
            RemoveDuplicates(str, idx+1, newString.append(currChar), dupeLog);
        }
    }
}
