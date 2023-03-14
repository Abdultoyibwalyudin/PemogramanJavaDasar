package Chapter10.Exercise.Exercise_10_01;

import java.sql.Time;

public class Exercise_10_01 {
    public static void main(String[] args){
        Time time1 = new Time(0);
        Time time2 = new Time(555550000);

        System.out.println(time1.getHours() + ":" +
                time1.getMinutes() + ":" + time1.getSeconds());
        System.out.println(time2.getHours() + ":" +
                time2.getMinutes() + ":" + time2.getSeconds());
    }
}

