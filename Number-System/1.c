#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n;
        scanf("%d",&n);
        int arr[n];
        for(int i=0;i<n;i++){
            scanf("%d",&arr[i]);
        }
        int m;
        scanf("%d",&m);
        int arr1[m];
        int k=0;
        int result[1000];
        for(int i=0;i<m;i++){
            scanf("%d",&arr1[i]);
        }
    //  for(int i=0;i<n;i++){
    int i=0;
    while(i<n){
            for(int j=0;j<m;j++){
                for(int k=0
                )
                if(arr[i]==arr1[j]){
                     continue;
                    
                }
                else{
                   
                 result[k]=arr[i];
                    k++;
                    i++;
                }
            }
        }
//     int i=0;
//     int j=0;
//   // int k=0;
//     while(i<n){
//         if(arr[i]==arr1[j]){
//             // result[k]=arr[i];
//             // i++;
//             // k++;
//             // j=0;
//             continue;
//             j++;
//         }
//         else
//         result[k]=arr[i];
//         k++;
//         i++;
//     }
        for(int i=0;i<=k;i++){
            printf("%d ",result[i]);
        }
        printf("\n");
    }
}