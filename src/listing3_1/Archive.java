package listing3_1;

import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Zip {
	ZipFile getArchive(String name )throws IOException {
		return new ZipFile(name);
	}
}

class Jar extends Zip {
	@Override
	ZipFile getArchive(String name) throws IOException {
		return new JarFile(name);
	}
}
public class Archive {
	public static void main(String[] args) throws IOException{
		if (args.length == 2 && args[0].equals("-zip")) {
			ZipFile zf = new Zip().getArchive(args[1]);
		}
		else if (args.length == 2 && args[0].equals("-jar")) {
			JarFile jf = (JarFile)new Jar().getArchive(args[1]);
		}
	}
}
