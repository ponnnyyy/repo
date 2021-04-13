public class Sort {
    public  void sort(int a[],int l,int r){
        if(l>r) return;
        int left=l,right=r;
        int pivot=a[left];
        while(left<right){
            while (left<right && a[right]>=pivot){
                right--;
            }
            if (left<right){
                a[left]=a[right];
            }
            while (left<right && a[left]<=pivot){
                left++;
            }
            if (left<right){
                a[right]=a[left];
            }
            if (left==right){
                a[left]=pivot;
            }
        }
         sort(a,l,right-1);
        sort(a,right+1,r);
    }

}
