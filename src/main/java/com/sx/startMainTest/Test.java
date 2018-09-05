package com.sx.startMainTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		test3();
	}
	
	
	
	static void test1() throws FileNotFoundException, IOException{
		 Properties p = new Properties();
	      URL u = Test.class.getResource("/test.properties");
	      System.out.println(Test.class.getResource("/test.properties"));
	      System.out.println("------");
	      System.out.println(Test.class.getResource("../../../test.properties"));
	      System.out.println("------");
	      System.out.println(u.getPath());;
	      p.load(new FileInputStream(u.getPath()));
	      p.list(System.out);
	}
	
	static void test2() throws FileNotFoundException, IOException{
		ResourceBundle r=ResourceBundle.getBundle("test"); 
		Enumeration<String> s =r.getKeys();
		for (;;) {
			if(s.hasMoreElements()){
				String key=s.nextElement();
				System.out.println(key+" = "+r.getString(key));
			}else{
				break;
			}
		}
	}
	
	static void test3() throws FileNotFoundException, IOException{
		 Properties p = new Properties();
	      URL u = Test.class.getResource("/log4j.properties");
	      p.load(new FileInputStream(u.getPath()));
	      Enumeration enum1 = p.propertyNames();//得到配置文件的名字
           while(enum1.hasMoreElements()) {
               String strKey = (String) enum1.nextElement();
               String strValue = p.getProperty(strKey);
               System.out.println(strKey + "=" + strValue);
         }
	}
}
