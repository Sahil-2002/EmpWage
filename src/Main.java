import java.util.Random;
//Check Employee is or present or Absent
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int present=0;
        int absent =0;
        int perhour =20;


        for (int i = 1; i <=30; i++) {
            boolean attendance = r.nextBoolean();
            if (attendance) {
                present++;
                System.out.println("employee is present");
            } else {
                absent++;

                System.out.println("employee is absent ");
            }

        }
        int hour =r.nextInt(9);
        if(hour>=8){
            System.out.println("wage of day is "+perhour*hour);
        } else if (hour<8) {
            System.out.println("wage of day is "+perhour*hour);

        }

        System.out.println("total present count is "+present);
        System.out.println("total absent count is "+absent);

    }
}
