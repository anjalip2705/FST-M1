package Activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] a = { 5, 3, 7, 4, 8, 3, 1, 9 };

        for (int i : a) {
            System.out.println("Before sorting:" + i);
        }
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i : a) {
            System.out.println("After sorting:" + i);
        }

    }

}
