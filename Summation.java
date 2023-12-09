public class Summation {

    public static void main(String[] args) {
        int n = 8;
        int result = summationRecursive(n);
        String summationExpression = buildSummationExpression(n);
        System.out.println(summationExpression + " = " + result);
    }

    static int summationRecursive(int n) {
        if (n == 0) {
            return 0; 
        } else {
            return n + summationRecursive(n - 1);
        }
    }

    static String buildSummationExpression(int n) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            expression.append(i);
            if (i < n) {
                expression.append("+");
            }
        }
        return expression.toString();
    }
}
