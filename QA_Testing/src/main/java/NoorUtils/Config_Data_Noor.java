package NoorUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Data_Noor {

	public Properties Property = new Properties();
	File file = new File("Noor.properties");
	
	public Config_Data_Noor() throws IOException {
		FileInputStream Input_File = new FileInputStream(file);
		Property.load(Input_File);
		Input_File.close();
	}
}
