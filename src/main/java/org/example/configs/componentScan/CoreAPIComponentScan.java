package org.example.configs.componentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@ComponentScan(basePackages = {
        "com.example",
})
@Configuration
public class CoreAPIComponentScan {

    @Bean
    public  List<String> getList() {
        List<String > lst = new ArrayList<>();
        lst.add("1");
        lst.add("2");
        return lst;
    }
}
