public class OopsBannerAppJoinUC4 {

    public static void main(String[] args) {

        // Create String array with 9 lines
        String[] line = new String[9];

        // Store each line separately
        line[0] = String.join(" ", "   ***   ", "   ***   ", "******   ", "   ***** ");
        line[1] = String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      ");
        line[2] = String.join(" ", "**     **", "**     **", "**     **", "**       ");
        line[3] = String.join(" ", "**     **", "**     **", "**    ** ", " **      ");
        line[4] = String.join(" ", "**     **", "**     **", "******   ", "   ***   ");
        line[5] = String.join(" ", "**     **", "**     **", "**       ", "      ** ");
        line[6] = String.join(" ", "**     **", "**     **", "**       ", "       **");
        line[7] = String.join(" ", " **   ** ", " **   ** ", "**       ", "      ** ");
        line[8] = String.join(" ", "   ***   ", "   ***   ", "**       ", " *****   ");

        // Use normal for loop to print banner
        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
    }
}