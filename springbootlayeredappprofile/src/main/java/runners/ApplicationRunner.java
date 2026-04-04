package runners;

import org.springframework.boot.ApplicationArguments;

public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("non optional arg values::"+args.getNonOptionArgs());
        System.out.println("optional arg names and values::");
        for(String name:args.getOptionNames()){
            System.out.println(name+"---->"+args.getOptionValues(name));
        }

    }
}
