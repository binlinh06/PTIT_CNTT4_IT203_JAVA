package SESSION03.HW06;

import java.util.Arrays;

public class SS03_06 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] temp = new int[a.length + b.length];
        int k = 0;

        while (i < a.length && j < b.length) {
            int value;
            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }

            // Lọc trùng
            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        // Duyệt phần còn lại của a
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        // Duyệt phần còn lại của b
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        // Cắt mảng đúng kích thước
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] khoCu = {1, 3, 5, 7, 9};
        int[] loMoi = {2, 3, 5, 6, 8, 9, 10};

        System.out.println("Kho cu: " + Arrays.toString(khoCu));
        System.out.println("Lo moi: " + Arrays.toString(loMoi));

        int[] khoTong = mergeBooks(khoCu, loMoi);

        System.out.println("Kho tong (da gop & loc trung): "
                + Arrays.toString(khoTong));
    }
}
