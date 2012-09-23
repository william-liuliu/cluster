package com.kylin.jgroups;

import org.apache.log4j.Logger;

import com.kylin.jgroups.test.AddressTest;
import com.kylin.jgroups.test.EventTest;
import com.kylin.jgroups.test.HeaderTest;
import com.kylin.jgroups.test.MessageTest;
import com.kylin.jgroups.test.UtilTest;
import com.kylin.jgroups.test.ViewTest;

public class JGroupsAPITestRunner {
	
	private static final Logger logger = Logger.getLogger(JGroupsAPITestRunner.class);

	public static void main(String[] args) throws Exception {
		
		logger.info("----- JGroups API Test Start --------");

		new UtilTest().test();
		logger.info("END\n");
		
		new AddressTest().test();
		logger.info("END\n");
		
		new MessageTest().test();
		logger.info("END\n");
		
		new HeaderTest().test();
		logger.info("END\n");
		
		new EventTest().test();
		logger.info("END\n");
		
		new ViewTest().test();
		logger.info("END\n");
		
		logger.info("----- JGroups API Test End --------");
		

	}

}
