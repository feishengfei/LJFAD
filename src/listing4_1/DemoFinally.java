package listing4_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFinally
{
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("usage: java Copy srcfile dstfile");
			return;
		}
		try {
			copy(args[0], args[1]);
		}
		catch (FileNotFoundException fnfe) {
			String msg = args[0] + " could not be found or might be a directory,"
			+ " or " + args[1] + " could not be created, " 
			+ "possibly because " + args[1] + " is a directory";
			System.err.println(msg);
		}
		catch (IOException ioe) {
			String msg = args[0] + " could not be read, or "
				+ args[1] + " could not be written";
			System.err.println(msg);
		}
	}
	public static void copy(String srcFile, String dstFile) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		try {
			FileOutputStream fos = new FileOutputStream(dstFile, true);
			try {
				int b;
				while ((b = fis.read()) != -1) {
					fos.write(b);
				}
			}
			finally {
				try {
					fos.close();
				} 
				catch (IOException e) {
					System.err.println("unable to close " + dstFile);
				}
			}
		}
		finally {
			try {
				fis.close();
			} 
			catch (IOException e) {
				System.err.println("unable to close " + dstFile);
			}
		}
		
	}

}
