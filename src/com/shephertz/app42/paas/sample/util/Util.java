package com.shephertz.app42.paas.sample.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {

	static Properties dbProps = new Properties();
	static File dbFile = null;
	static {
		try {
			dbFile = new File("webapps/Config.properties");
			//dbFile = new File("Config.properties");
			dbProps.load(new FileInputStream(dbFile.getAbsolutePath()));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * This function fetches the DB Ip from Config.properties
	 */
	public static String getDBIp() {
		System.out.println("#######################");
		System.out.println(dbProps.getProperty("app42.paas.db.ip"));
		
		return dbProps.getProperty("app42.paas.db.ip");
	}

	/*
	 * This function fetches the DBPassword from Config.properties
	 */
	public static String getDBPassword() {
		return dbProps.getProperty("app42.paas.db.password");
	}

	/*
	 * This function fetches Username from Config.properties
	 */
	public static String getDBUser() {
		return dbProps.getProperty("app42.paas.db.username");
	}
	
	/*"jdbc:mysql://52.5.16.247"
	 * This function fetches the DB Name from Config.properties
	 */
	public static String getDBName() {
		return dbProps.getProperty("app42.paas.db.name");
	}

	/*
	 * This function fetches the DB Port from Config.properties
	 */
	public static int getDBPort() {
		return  Integer.parseInt(dbProps.getProperty("app42.paas.db.port"));
	}
}
