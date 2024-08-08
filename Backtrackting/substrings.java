public class substrings {
    public static void substr(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        // kaam
        //choice yes
        substr(str, ans+str.charAt(i), i+1);
        //choice no
        substr(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        substr(str, "", 0);
    }
}
