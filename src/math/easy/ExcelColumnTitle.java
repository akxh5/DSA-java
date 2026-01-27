package math.easy;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // offset for 1-based system
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));    // A
        System.out.println(convertToTitle(26));   // Z
        System.out.println(convertToTitle(27));   // AA
        System.out.println(convertToTitle(28));   // AB
        System.out.println(convertToTitle(52));   // AZ
        System.out.println(convertToTitle(701));  // ZY
        System.out.println(convertToTitle(702));  // ZZ
        System.out.println(convertToTitle(703));  // AAA
    }
}
