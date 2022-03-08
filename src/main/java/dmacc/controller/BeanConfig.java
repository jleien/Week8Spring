/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 7, 2022
**/
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.PC;

/**
 * @author jake
 *
 */
@Configuration
public class BeanConfig {
	@Bean
	public PC pc() {
		PC bean = new PC();
		return bean;
	}
}
