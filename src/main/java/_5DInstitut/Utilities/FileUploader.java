package _5DInstitut.Utilities;

import java.io.File;
import java.io.IOException;

public class FileUploader {
	
	public static void getFileFromLocalSystem(String folder) throws Exception {
		
		File directory = new File(folder);
		String allFiles="";
		File[] fileList = directory.listFiles();
		
		for (File file:fileList) {
			if(file.isFile()) {
				allFiles=allFiles + "\""+file.getName()+"\""+ " ";
			}
			
			try {
				Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AutoITExecutor\\GetPath.exe"+" "+directory+File.separator);
				Thread.sleep(2000);
				Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AutoITExecutor\\SelectAllFiles.exe"+" "+allFiles);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
