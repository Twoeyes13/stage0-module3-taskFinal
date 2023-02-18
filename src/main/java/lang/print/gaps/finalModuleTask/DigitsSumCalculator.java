package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = Math.round(number / 1000);
        int second = Math.round(number / 100) % 10;
        int third = Math.round(number / 10) % 10;
        int fourth = number % 10;
        int sum = first + second + third + fourth;
        System.out.println(sum);
    }
}
