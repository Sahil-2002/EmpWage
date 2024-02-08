import java.util.Random;
//Check Employee is or present or Absent
public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");

        Random r = new Random();
        int present = 0;
        int absent = 0;
        int perhourwage = 20;


        for (int i = 1; i <= 30; i++) {
            boolean attendance = r.nextBoolean();
            if (attendance) {
                present++;
                System.out.println("employee is present");
            } else {
                absent++;

                System.out.println("employee is absent ");
            }

        }
        System.out.println("total present count is " + present);
        System.out.println("total absent count is " + absent);
        int hour = r.nextInt(9);
        if (hour >= 8) {
            System.out.println("wage of day is " + perhourwage * hour);
        } else if (hour < 8) {
            System.out.println("wage of day is " + perhourwage * hour);

        }




        // parttime employee wage
        int parttime_hour = 8;

            System.out.println("part time wage is "+parttime_hour*perhourwage);

            switch(hour){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:

                    System.out.println("you worked  "+hour+" hours today so employee wage is "+hour*perhourwage);
                    break;
                case 8:
                case 9:
                    System.out.println("you worked "+hour+" hours so completed today's working hour and more  so employee wage is "+hour*perhourwage);
            }
if(present>=20){
    System.out.println("monthly wage is "+present*hour*perhourwage);
}


    }









}





