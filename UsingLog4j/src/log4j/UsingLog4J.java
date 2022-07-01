package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UsingLog4J {
	static Logger log=Logger.getLogger(UsingLog4J.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("hi");
		log.warn("hello");
		log.error("welcome");
		log.fatal("to");
		log.debug("chennai");
	}

}
