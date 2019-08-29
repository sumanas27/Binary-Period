public class BinaryPeriod {

    public static void main(String[] args) {
        System.out.println("\nEx1: " + getBinaryPeriodForInt(102));
        System.out.println("\nEx2: " + getBinaryPeriodForInt(1651));
    }

    static int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0, res = -1;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        for (int p = 1; p < l; p++) {
            if (p <= l / 2) {
                boolean ok = true;
                for (int i = 0; i < l - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    res = p;
                }
            }
        }

        return res;
    }
}
