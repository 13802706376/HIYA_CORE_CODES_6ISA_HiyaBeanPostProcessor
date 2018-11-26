package com.hiya.sa.bean.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class HiyaInitializingBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware
{

	public HiyaInitializingBean()
	{
		System.out.println("HiyaInitializingBean 构造方法。。。。");
	}

	private String name;
	private String nullTest;

	private int age;

	public void prints(String str)
	{
		System.out.println(str + ":hahahah");
	}

	public void init()
	{
		System.out.println("init");
	}

	@Override
	public void setBeanFactory(BeanFactory paramBeanFactory) throws BeansException
	{
		System.out.println("调用了BeanFactoryAware的setBeanFactory方法了");
	}

	@Override
	public void setBeanName(String paramString)
	{
		System.out.println("调用了BeanNameAware的setBeanName方法了");
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("调用了DisposableBean的destroy方法了");
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("调用了Initailization的afterPropertiesSet方法了");
	}
}
