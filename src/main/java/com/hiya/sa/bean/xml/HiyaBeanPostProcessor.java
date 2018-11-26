package com.hiya.sa.bean.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HiyaBeanPostProcessor implements BeanPostProcessor
{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("调用了BeanPostProcessor.postProcessBeforeInitialization.....");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("调用了BeanPostProcessor.postProcessAfterInitialization......");
		return bean;
	}

}
