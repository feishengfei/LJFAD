package listing4_1;

import java.io.File;
import java.io.FilenameFilter;

public class GrepJavaFile {
	public static void main(String[] args) {
		if(args.length == 1) {
			String[] list = new File(args[0]).list(new FilenameFilter() {
				
				@Override
				public boolean accept(File f, String s) {
					return s.endsWith(".java");
				}
			});
			System.out.println("Dir " + args[0] 
			      + " contains:" + list.length);
			for(int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
	}
}
