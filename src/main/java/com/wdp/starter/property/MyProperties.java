package com.wdp.starter.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description: 配置类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-02
 */
@ConfigurationProperties(prefix = "my")
@Data
public class MyProperties {

	private String msg = "默认值";
}
