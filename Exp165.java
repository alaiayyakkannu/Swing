import java.io.*;  
	import java.net.*;  
	
public class Exp165 {
	public static void main(String[] args){  
	try{  
	URL url=new URL("file:///F:/Assignment2/print%20form.html/");  
	URLConnection urlcon=url.openConnection();  
	InputStream stream=urlcon.getInputStream();  
	int i;  
	while((i=stream.read())!=-1){  
	System.out.print((char)i);  
	}  
	}catch(Exception e){System.out.println(e);}  
	}  
	  
}
