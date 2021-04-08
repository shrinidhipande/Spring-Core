package com.bfpp.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.beans.Contact;
import com.bfpp.beans.JdbcDataSource;

public class AppTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));
		
		BeanFactoryPostProcessor bfpp = beanFactory.getBean("bfpp", BeanFactoryPostProcessor.class);
		bfpp.postProcessBeanFactory(beanFactory);
		
		JdbcDataSource dataSource = beanFactory.getBean("dataSource",JdbcDataSource.class);
		
		System.out.println(dataSource);
		Connection conn = dataSource.getConnection();
		if(conn != null) {
			System.out.println("Connection Established");
		}else {
			System.out.println("Error in Connection");
		}
		
		HashMap<Integer,List<Contact>> hm = new HashMap<>();
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from contact");
		Contact c = null;
		
		List<Contact> al = new ArrayList<Contact>();
		
		while(rs.next()) {
			int id = rs.getInt(1);//id
			String name = rs.getString(2);
			int acc = rs.getInt(3);
			
			c = new Contact(id,name,acc);
			al.add(c);
			
		}
		
		hm.put(al.get(0).getAccNo(), al);
		
		System.out.println(hm);
	}

}
