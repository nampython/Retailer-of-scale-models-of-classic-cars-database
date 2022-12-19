package org.example.configs.componentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@ComponentScan(basePackages = {
        "com.example",
        "org.example"
})
@Configuration
public class CoreAPIComponentScan {
}
