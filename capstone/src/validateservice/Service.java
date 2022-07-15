package validateservice;
import java.io.File;
import java.io.IOException;

import exception.FileNameException;
import exception.NameSyntaxException;
import exception.ParenthesesException;


public interface Service {
	   void checkParantheses(String s) throws ParenthesesException;
	   void checkClassName(String word) throws NameSyntaxException;
	   void CheckFileName(String string, File file) throws FileNameException;
	   void writefile(File file, String words) throws IOException;
}
