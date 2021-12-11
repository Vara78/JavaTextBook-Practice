package pack1;

public class Main {
    public static void main(String[] args) {

        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMintues = totalSeconds / 60;
        long currentMintue = totalMintues % 60;
        long totalHours = totalMintues / 60;
        long currentHour = totalHours % 24;

        System.out.print("Current time is " + currentHour + ":" + currentMintue + ":" + currentSecond + " CST");
    }
}
