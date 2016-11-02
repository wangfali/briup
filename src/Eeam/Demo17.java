package Eeam;

import java.io.RandomAccessFile;

public class Demo17 {
	public static void main(String[] args) throws Exception {
		long filepoint=0;
		String s;
		RandomAccessFile file=new RandomAccessFile("D:/briupjava/workspace/briup/src/Eeam/Demo16.java", "r");
		long fileLength=file.length();
		while(filepoint<fileLength){
			s=file.readLine();
			System.out.println(s);
			filepoint=file.getFilePointer();
			
		}
		file.close();
	}
}
