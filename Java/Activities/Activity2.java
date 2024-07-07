package Activities;

public class Activity2 {

    public static void main(String[] args) {
        int[] a = {10, 77, 10, 54, -11, 10};
        int b = 0;
        for(int i = 0; i<a.length; i++) {
            if(a[i] == 10) {
                b = b + a[i];
            }
        }
        if( b == 30) {
            System.out.println("Sum of all 10s in array is equal to 30");
        } else {
            System.out.println("Sum of all 10s in array is not equal to 30");
        }
    }
}
