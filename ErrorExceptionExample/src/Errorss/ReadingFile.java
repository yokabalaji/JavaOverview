package Errorss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args)throws IOException {
		File a=new File("E:\\New folder/bala.txt");
		FileInputStream b=null;
		try {
		b=new FileInputStream(a);
		int c=0;
		while((c=b.read())!=-1) {
		//	System.out.println(c);
			System.out.println((char)(c));
		}
		}catch(FileNotFoundException fn) {
			System.out.println("not found");
			
		}finally {
			b.close();
		}
	}

}
