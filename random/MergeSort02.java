public class MergeSort02 {
    public static void main(String[] args) {
        int[] a = {12, 32, 28, 21, 8, 2, 38, 17};
        MergeSort02 m = new MergeSort02();
        m.mergeSort(a);
        for (int num : a ) {
            System.out.println(num);
        }
    }

    public void mergeSort(int[] a) {
        mergeSort(a, 0, a.length);
    }

    public void mergeSort(int[] a, int i, int j) {
        if (i >= 0 && j <= a.length && i != j) {
            int mid = (int) (j-i) / 2;
            mergeSort(a, i, i+mid); 
            if (j-i == 1 ) {
                mid++;
                mergeSort(a, i+mid, j);
                merge(a, i, i+mid, j);
            }else {
                mergeSort(a, i+mid, j);
                merge(a, i, i+mid, j);
            }
        }
        return;
    }

    public void merge(int[] a, int begin, int mid, int end) {
        int leftArray = begin;
        int rightArray = mid;
        while (leftArray >= begin && leftArray < mid && rightArray >= mid && rightArray < end) {
            if(a[leftArray] > a[rightArray]) {
                int temp = a[leftArray];
                a[leftArray] = a[rightArray];
                a[rightArray] = temp;
                rightArray++;
            } else {
                leftArray++;
                rightArray++;
            } 
        }
    }
}

