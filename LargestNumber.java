package largestNumber;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < size; i++) {
            String x;
            x = scanner.next();
            vector.add(x);
        }
        scanner.close();
        printLargest(vector);
    }

    static void printLargest(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        Iterator it = arr.iterator();
        while (it.hasNext())
            System.out.print(it.next());
        System.out.println();
    }
}
