package org.example.configs.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    private final Environment env;
    @Autowired
    public DataSourceConfig(Environment env) {
        this.env = env;
    }

    @Bean
    @Profile("dev")
    public DataSource getDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(env.getProperty("spring.datasource.url"));
        hikariConfig.setUsername(env.getProperty("spring.datasource.username"));
        hikariConfig.setPassword(env.getProperty("spring.datasource.password"));
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setPoolName("springHikariCP");
        return new HikariDataSource(hikariConfig);
    }
}
