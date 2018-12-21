package self.dev;

public class Tester {

    private Bundle bundle;

    public static void main(String[] args) {
        new Tester().tester_function();
    }

    public void tester_function() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        bundle = new Bundle();
        System.out.println(bundle.CompareArrays(a, b));
        bundle.SortOddArray(new int[]{5, 3, 2, 8, 1, 4}); // 1 3 2 8 5 4
        bundle.SortOddArray(new int[]{ 5, 3, 1, 8, 0 }); // 1 3 5 8 0

        System.out.println();
        System.out.println(Bundle.whoLikesIt());
        System.out.println(Bundle.whoLikesIt("Peter"));
        System.out.println(Bundle.whoLikesIt("Jacob", "Alex"));
        System.out.println(Bundle.whoLikesIt("Max", "John", "Mark"));
        System.out.println(Bundle.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Howard", "Julie"));


        System.out.println(Bundle.findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(Bundle.findShort("turns out random test cases are easier than writing out basic ones"));

        System.out.println(bundle.FindMultipliers(10));
    }
}
