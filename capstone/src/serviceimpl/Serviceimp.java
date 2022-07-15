package serviceimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

import exception.FileNameException;
import exception.NameSyntaxException;
import exception.ParenthesesException;
import validateservice.Service;

public class Serviceimp implements Service {
	
	public void checkParantheses(String s) throws ParenthesesException {
		  Stack<Character> st = new Stack<>();
	         for(int i=0;i<s.length();i++)
	            {
	                if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
	                    st.push(s.charAt(i));
	                }
	                else if(!st.empty() && ((s.charAt(i)==']'&& st.peek()=='[')||(s.charAt(i)=='}'&& st.peek()=='{')||(s.charAt(i)==')'&& st.peek()=='(')))
	            {
	                     st.pop();

	            } else {
	                 st.push(s.charAt(i));
	            }
	        }

	        if(! st.empty() ) {
	            throw new ParenthesesException("Please Check for balanced Paranthesis");
	        }	
	}
	
	
	public void checkClassName(String word) throws NameSyntaxException {
		 if(Character.isLowerCase(word.charAt(0)))
         {
          throw new NameSyntaxException("Plese change class name start with capital letter");
         }
		
	}
	public void CheckFileName(String string, File file) throws FileNameException {
		 if(!(file.getName()==string))
	        {

	        throw new FileNameException("File name does not match with class name");    
	        }
    }
		
	public void writefile(File file, String words) throws IOException {
		BufferedWriter bf = null;
	    try {
	    	 bf = new BufferedWriter(new FileWriter("C:\\Users\\gstelu\\Desktop\\Javafile.java"));
	         bf.write(words);
	         bf.flush();
	       } catch(Exception e) {}
	    finally {
	    	try {
	    		bf.close();
	    	}catch(Exception e) {}
	    }
		
	}

}
