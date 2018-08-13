package com.sx.test.log4jTest;

import org.slf4j.Logger;
//import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	//private static Logger logger = Logger.getLogger(Test.class); 
	/*public static void main(String[] args) {
		 // System.out.println("This is println message.");  
        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message."); 
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
	}*/
	/*public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("c:\\test.txt");
        
        // 获取通道
        FileChannel fc = fin.getChannel();
        
        // 创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        
        // 读取数据到缓冲区
        fc.read(buffer);
        
        buffer.flip();
        
        while (buffer.remaining()>0) {
            byte b = buffer.get();
            System.out.print(((char)b));
        }
        
        fin.close();

	}*/
	
	 private static final Logger logger = LoggerFactory.getLogger(Test.class);

	    public static void main(String[] args) {
	        logger.info("Current Time: {}", System.currentTimeMillis());
	        logger.info("Current Time: " + System.currentTimeMillis());
	        logger.info("Current Time: {}", System.currentTimeMillis());
	        logger.trace("trace log");
	        logger.warn("warn log");
	        logger.debug("debug log");
	        logger.info("info log");
	        logger.error("error log");
	    }
}
