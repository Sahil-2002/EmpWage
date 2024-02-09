import java.util.Random;
//Check Employee is or present or Absent
public class Main {
public static int rateperhour =20;
public  int workingdays;
public static int maxhours =100;
int parttime =0, fulltime =0, hoursum=0;
public Main(int workingdays){
    this.workingdays=workingdays;
    for(int i=0; i<workingdays; i++) {
        Random random = new Random();

        int hourdaily = random.nextInt(10);
        if (hourdaily <= 4) {
            parttime++;
            System.out.println("its part time wage of the day " + hourdaily * rateperhour);
        } else if (hourdaily > 4) {
            System.out.println("Its full time wage of the day " + hourdaily * rateperhour);
            fulltime++;

        }
        hoursum=hoursum+hourdaily;
    }
    System.out.println("total part time count is "+parttime + " total full time count is "+fulltime);
    System.out.println("total hour count you worked for month with working days "+workingdays + " is "+hoursum);


    }

    public static void main(String[] args) {

        Main sc = new Main(20);

    }

}











