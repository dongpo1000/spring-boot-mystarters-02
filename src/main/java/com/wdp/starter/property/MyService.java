package com.wdp.starter.property;

import lombok.Data;

/**
 * Description: 条件类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-02
 */
@Data
public class MyService {

	private String msg;

	public String sayMsg(){
		return "my" + msg;
	}
}
