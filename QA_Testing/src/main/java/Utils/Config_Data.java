package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Data {
	
	public Properties property = new Properties();
	File file = new File("Config_Data.properties");
	
	public Config_Data() throws IOException	{
		FileInputStream Input_File = new FileInputStream(file);
		property.load(Input_File);
		Input_File.close();
	}

}
