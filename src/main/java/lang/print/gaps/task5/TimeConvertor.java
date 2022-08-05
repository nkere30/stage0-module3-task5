package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        convert(11.5f);
    }
    public static void convert(float minutes) {
        float seconds = (float) (minutes * 60);
        System.out.println(seconds);
    }


}


