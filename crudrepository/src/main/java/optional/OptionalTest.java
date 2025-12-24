package optional;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Optional;

@Slf4j
public class OptionalTest
{
    public Optional<LocalDate> showDate(int year,int month,int day)
    {
        if (year<0||month<0||day<0)
        {
            return Optional.empty();
        }
        else
            return Optional.of(LocalDate.of(year,month,day));
    }

    public static void main(String[] args) {
        OptionalTest test=new OptionalTest();
        Optional<LocalDate> opt=test.showDate(2025,11,20);
        if(opt.isPresent())
        {
            log.info("Date is:"+opt.get());
        }
        else
            log.info("wrong inpus");
    }
}
