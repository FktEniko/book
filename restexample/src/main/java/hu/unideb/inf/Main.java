package hu.unideb.inf;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Bean
    public ModelMapper modelMapper(){
        //ModelMapper m = new ModelMapper();
        //m.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return new ModelMapper();
    }

}







