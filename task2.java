import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array A (n <= 400):");
        int n = scanner.nextInt();

        System.out.print("Enter size of array B (m <= 200):");
        int m = scanner.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of array B:");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }
        scanner.close();

        Set<Integer> symmetricDifference = new HashSet<>();

        for (int a : A) {
            if (!contains(B, a)) {
                symmetricDifference.add(a);
            }
        }

        for (int b : B) {
            if (!contains(A, b)) {
                symmetricDifference.add(b);
            }
        }

        int[] C = new int[symmetricDifference.size()];
        int i = 0;
        for (Integer num : symmetricDifference) {
            C[i++] = num;
        }

        System.out.println("Symmetric difference (Array C): " + Arrays.toString(C));
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
