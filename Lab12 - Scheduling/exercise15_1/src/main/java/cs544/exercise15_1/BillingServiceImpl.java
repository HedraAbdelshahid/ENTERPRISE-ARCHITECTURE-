package cs544.exercise15_1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class BillingServiceImpl implements BillingService {

    @Scheduled(cron="0/5 * * * * *")
    public void printBills() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currenttime = timeFormatter.format(date);

        System.out.println(currenttime + "    "+Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName());
    }

    @Scheduled(cron="0/10 * * * * *")
    @Override
    public void generateBillingReport() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currenttime = timeFormatter.format(date);

        System.out.println(currenttime + "    "+Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName());
    }

}
