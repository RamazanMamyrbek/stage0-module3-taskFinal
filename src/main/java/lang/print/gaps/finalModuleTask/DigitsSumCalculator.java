package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int res = number/1000 + (number-(number/1000)*1000)/100 + (number-(number/100)*100)/10 + (number-(number/10)*10);
        System.out.println(res);
    }
}
