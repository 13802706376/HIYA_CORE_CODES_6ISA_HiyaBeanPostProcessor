package com.hiya.sa.bean.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class HiyaBeanFactoryPostProcessor implements BeanFactoryPostProcessor
{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
			throws BeansException
	{
		String[] beanStr = configurableListableBeanFactory.getBeanDefinitionNames();
		for (String beanName : beanStr)
		{
			if ("hiyaInitializingBean".equals(beanName))
			{
				BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanName);
				MutablePropertyValues m = beanDefinition.getPropertyValues();
				if (m.contains("name"))
				{
					m.addPropertyValue("name", "赵四");
					System.out.println("调用了BeanFactoryPostProcessor，修改了name属性初始值了");
				}
			}

		}
	}

}
