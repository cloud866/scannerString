public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5};

        for (int item : arr1) {
            if (item == 3)
                //break; - stop
                continue; // - propusk

            System.out.println(item);
        }
    }
}