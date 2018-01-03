package me.geemu.config;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2017/12/5 10:38
 * Description:
 */
@Configuration
@EnableTransactionManagement
public class CustomConfig {

    @Bean("mapper")
    public DozerBeanMapperFactoryBean mapper() {
        return new DozerBeanMapperFactoryBean();
    }

    @Bean
    public PlatformTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
