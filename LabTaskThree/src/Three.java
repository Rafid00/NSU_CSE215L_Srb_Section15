public class Three {
    public static void main(String[] args) {
//Part (a) -->
        int min, max;
        int lower, upper;
        min = 1;
        max = 1000;
        lower = (int) (min + Math.random() * (max - min + 1));
        upper = (int) (min + Math.random() * (max - min + 1));
        System.out.println("two random numbers are within the range (1-1000): " + lower + ", " + upper);
//Part (b) -->
        System.out.println("\nall the integers between lower and upper which are divisible by 5 or 8 in descending order: ");
        int n;
        if (lower > upper) {
            n = lower;
            lower = upper;
            upper = n;
        }
        while (upper >= lower) {
            if (upper % 5 == 0 || upper % 8 == 0) {
                System.out.print(upper + " ");
            }
            upper--;
        }
        System.out.print("\n");
    }
}
