package org.co;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Api1 {
	
	
	public void getmethod() throws IOException {
	URL url = new URL("http://dummy.restapiexample.com/");
	HttpURLConnection openConnection = (HttpURLConnection)url.openConnection();
	openConnection.setRequestMethod("GET");
	openConnection.connect();
	
	int responseCode = openConnection.getResponseCode();
	System.out.println("status code"+responseCode);
	String responseMessage = openConnection.getResponseMessage();
	System.out.println("responseMessage"+responseMessage);
	InputStream inputStream = openConnection.getInputStream();
	InputStreamReader input = new InputStreamReader(inputStream);
	BufferedReader buffer = new BufferedReader(input);
	
	String line;
	StringBuffer  buffered= new StringBuffer();
	
	while((line=buffer.readLine())!=null ) {	
		buffered.append(line);
	
	
	}
	System.out.println(buffered);
	}
 
	public static void main(String[] args) throws IOException {
		Api1 connection = new Api1();
		connection.getmethod();
		
	}
	
	 
}
