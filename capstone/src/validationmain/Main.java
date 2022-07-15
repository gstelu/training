package validationmain;

import java.io.File;
import java.io.IOException;
import java.security.Provider.Service;
import java.util.HashSet;
import java.util.Set;

import exception.FileNameException;
import exception.NameSyntaxException;
import exception.ParenthesesException;
import serviceimpl.Serviceimp;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Java Syntax Validator");
	Serviceimp obj=new Serviceimp();
		Set<String> keyword= new HashSet<>();
		keyword.add("public");keyword.add("private");keyword.add("boolean");
	    keyword.add("String");keyword.add("float");keyword.add("int");
		keyword.add("abstract");;keyword.add("return");keyword.add("static");keyword.add("void");keyword.add("super");;
		keyword.add("static");keyword.add("final");keyword.add("class");keyword.add("import");
		keyword.add("if");keyword.add("else");keyword.add("try");keyword.add("catch");keyword.add("do");
		keyword.add("while");keyword.add("finally");keyword.add("switch");keyword.add("case");
		keyword.add("interface");keyword.add("long");keyword.add("package");keyword.add("null");keyword.add("for");
		File file= new File("C:\\Users\\lanala\\Desktop\\Javafile.java");
		file.createNewFile();
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = """
                public static{
                  
                }
                """;
		try {
			 String parenthesesString = null;
			    //while((str=br.readLine())!=null) {
				String[] content=str.split(str);
			      String temp="";
			      int j = 0;
		            for( String k:content)
		            {
                        j=j+1;
		                if(k=="{" || k=="}"||k=="[" || k=="]"||k=="(" || k==")")
		                {
		                	parenthesesString=parenthesesString+k;
		                }

		             for(String i:keyword)
		                {    
		                    if(k=="class")
		                    {
		                    	 obj.CheckFileName(content[j], file);
		                         obj.checkClassName(content[j]);
		                    }
		  
		                    if(k==i)
		                    {  
		                        temp=i;
		                        break;
		                    }
		                    else if(temp== "int" || temp=="float" || temp=="long"|| temp== "double" ||temp== "char" ||temp== "int" || temp== "String")
		                    {
		                        break;
		                    }
		                }
		           }
		            obj.checkParantheses(parenthesesString);
		            obj.writefile(file, str);
		 	} catch(ParenthesesException e1)
             {
	            System.out.println(e1.getMessage());
	        } catch(NameSyntaxException e2)
	          {
	            System.out.println(e2.getMessage());
	          }catch(FileNameException e3)
	        {
	            System.out.println(e3.getMessage());
	        }
			 catch(Exception e) {
				 System.out.println("something error");
			 }
		obj.writefile(file, str);
    }
			
}