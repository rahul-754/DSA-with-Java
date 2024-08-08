public class firstooccofkey{
    public static int search(int arr[],int key,int i){
        if(i==arr.length){
            System.out.println("Key not found");
            return -1;
                }
                    
        if(arr[i]==key){
            return i;
        }
        return search(arr, key, i+1);
    }
    public static int lastocc(int arr[],int key,int i ){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastocc(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;

    }
    public static void main(String[] args) {
        int[] arr={1,3,4,4,6};
        // i=arr.length-1;
        System.out.println(lastocc(arr, 4, 0));
    }
}