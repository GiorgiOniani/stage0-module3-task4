package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        int part1 = 9 * a * a - 5 * b + 2 + a - 7;
        int part2 = (a + b - 4 * a * b) / 2;
        int part3 = part1 * part2;

        System.out.println(part3);

        boolean formulaCorrect = Math.abs(part3 - ((9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2))) < 1e-10;
        System.out.println(formulaCorrect);
    }
}
