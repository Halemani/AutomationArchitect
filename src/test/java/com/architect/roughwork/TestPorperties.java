package com.architect.roughwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPorperties {

	public static void main(String[] args) throws IOException {

		Properties config = new Properties();
		FileInputStream configFIS = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//properties//Config.properties");
		config.load(configFIS);
		System.out.println(config.getProperty("browser"));

		Properties OR = new Properties();
		FileInputStream orFIS = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//properties//OR.properties");
		OR.load(orFIS);
		System.out.println(OR.getProperty("bnkMgrLoginBtn"));
	}

}
