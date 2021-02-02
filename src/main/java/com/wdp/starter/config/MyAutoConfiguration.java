package com.wdp.starter.config;

import com.wdp.starter.property.MyProperties;
import com.wdp.starter.property.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 自动配置类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-02
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
@ConditionalOnClass(MyService.class)
@ConditionalOnProperty(prefix = "my", value = "enabled", matchIfMissing = true)
public class MyAutoConfiguration {

	@Autowired
	private MyProperties myProperties;

	@Bean
	@ConditionalOnMissingBean(MyService.class)
	public MyService myService() {
		MyService myService = new MyService();
		myService.setMsg(myProperties.getMsg());
		return myService;
	}
}
