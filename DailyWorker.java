import java.util.*;

public class DailyWorker {
    int salary_rate;
    DailyWorker(String name,int salary_rate)
    {
        this.salary_rate=salary_rate;
        System.out.println("DETAILS : ");
        System.out.println("NAME : "+name);
        System.out.println("SALARY RATE : "+salary_rate);
    }
}

class daily_worker extends DailyWorker
{
  daily_worker(String name, int salary_rate,String type)
    {
        super(name,salary_rate);
        System.out.println("TYPE : " +type);
    }
    void ComPay(int days)
    {
        int wage= days * salary_rate ;
        System.out.println("TOTAL PAY : "+wage );
    }
}

class DailyWorkerJob
{
    public static void main(String args[])
    {
        daily_worker obj=new daily_worker("LOREN", 1000,"DAILY WORKER");
        obj.ComPay(7);
    }
}
