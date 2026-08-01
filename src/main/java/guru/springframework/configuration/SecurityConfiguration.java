package guru.springframework.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
///继承Spring Security的默认配置，然后修改它
    
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();
///permitAll()允许所有的人访问，不用登录
   ///     .and()继续配置 ,console里面的所有内容，任意层目录
        httpSecurity.csrf().disable();
        ///
        httpSecurity.headers().frameOptions().disable();
    }

}
