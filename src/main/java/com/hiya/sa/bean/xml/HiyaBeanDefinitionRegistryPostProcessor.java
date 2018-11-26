package com.hiya.sa.bean.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class HiyaBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor
{
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException
	{
		BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder.rootBeanDefinition(HiyaPerson.class);
		beanBuilder.addPropertyValue("name", "bob");
		beanBuilder.addPropertyValue("age",17);
		registry.registerBeanDefinition("person", beanBuilder.getBeanDefinition()); 
		System.out.println("调用了BeanDefinitionRegistryPostProcessor，动态注册了person ");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException
	{
		
	}
}
