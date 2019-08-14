package com.wiley.beginning.spring.ch2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Ch2Configuration {
    @Bean
    public AccountDao accountDaoJdbc() {
        return new AccountDaoJdbcImpl();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public AccountService accountService() {
        return new AccountServiceImpl();
    }
}
