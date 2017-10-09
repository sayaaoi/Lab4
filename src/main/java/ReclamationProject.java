
/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * find the longest of overlapping substrings in a and b.
 */
public class ReclamationProject {
    /**
     * find the longest of overlapping substrings in two string inputs.
     * @param args given strings from user.
     */
    public static void main(final String[] args) {
        String input1 = "Best university";
        String input2 = "UIUC is the best university.";
        System.out.println(doit(input1, input2));
    }
    /**
     * Find the longest of overlapping substrings in two string inputs.
     * @param a given strings from user.
     * @param b given strings from user.
     * @return the longest of overlapping substrings in two string inputs.
     */
    public static String doit(final String a, final String b) {
        String copya = a;
        String copyb = b;
        if (a.length() > b.length()) {
            String c = copya; // set c to a
            copya = copyb; copyb = c;
        }

        /*
         * For loop with i
         */
        String r = "";
        for (int i = 0; i < copya.length(); i++) {
            for (int j = copya.length() - i; j > 0; j--) {
                for (int k = 0; k < copyb.length() - j; k++) {
                    // r = (a.regionMatches(i, b, k, j) && j > r.length()) ?
                    //a.substring(i,i + j) : r; // Do it!
                    if (copya.regionMatches(i, copyb, k, j) && j > r.length()) {
                        r = copya.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return r;
        }
}
