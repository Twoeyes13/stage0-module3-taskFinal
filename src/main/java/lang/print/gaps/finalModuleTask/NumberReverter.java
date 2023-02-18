package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = Math.round(number/100);
        int second = Math.round(number/10) % 10;
        int third = number % 10;
        System.out.println(third + "" + second + "" + first);
    }


}
