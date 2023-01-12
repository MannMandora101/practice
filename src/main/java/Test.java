import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();

    }

    public void test(){
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);
        a = 1000;
        b = 1000;
        System.out.println(a==b);
    }

    public int randomNumber(){
        int min = -1;
        int max = 50;
        if(min < 0 || max < 0){
            return -999999;
        }
        Random random = new Random();
        int num = random.nextInt(max-min+1)+min;
        return num;
    }



    public static Date getCurrentTime() {
        return new Date();
    }

    public static Date getDateBeforeGivenWorkingDays(Date fromDate, int noOfDays) {
        int count = noOfDays;
        Calendar c1 = Calendar.getInstance();
        if (fromDate == null) {
            return null;
        } else {
            c1.setTime(fromDate);

            while(count > 0) {
                c1.add(5, -1);
                --count;
            }

            return c1.getTime();
        }
    }

    public static long getDateDiff(Date current, Date dealtime) {
        long diff = current.getTime() - dealtime.getTime();
        diff /= 3600000L;
        return diff;
    }
}
