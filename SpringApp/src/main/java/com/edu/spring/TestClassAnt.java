package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClassAnt {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml"); // ClassPathresource
		// will check whether applicationContext.xml exists in current project.
		// if it doesn't exist, it will throw FileNotFound exception otherwise
		// it will load applicationContext.xml into
		BeanFactory factory = new XmlBeanFactory(r); 
		// 2 objects are created by Spring IOC container.
		// first and sec
		Ant s = (Ant) factory.getBean("sec");
		System.out.println(s.display());
	}

}
