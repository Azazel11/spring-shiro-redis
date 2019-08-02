package com.example.springshiroredis.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{
    //增加拦截器
    @Bean
    public WebMvcConfigurer getInterfaceAuthCheckInterceptor() {
        return new WebMvcConfigurer();
    }
    //等部署完了，将这个方法注释一下看看。
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new BootInterceptor())    //指定拦截器类
//                .addPathPatterns("/**");        //指定该类拦截的url
//    }
}
