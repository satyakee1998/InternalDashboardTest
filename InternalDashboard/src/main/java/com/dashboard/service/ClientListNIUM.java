package com.dashboard.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
@Component
public class ClientListNIUM {


	String jsonResponse = null;
	StringBuilder response = new StringBuilder();
	
	public String getcustomerlistNIUM() {
		//String request=null;
		
		
		
		try {

			//URL url = new URL("http://localhost:8081/api/clients");
			URL url = new URL("http://localhost:3000/clientlistNIUM");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			while ((jsonResponse = br.readLine()) != null) {

				response =response.append(jsonResponse);

			}
			
		}catch (MalformedURLException e) {

		////	LOGGER.error(Constant.ERRORS, e.getCause(), e.getMessage());
			// Logger.getLogger("Satyakee").info(e.getMessage());
			return e.getMessage();
			
		  } catch (IOException e) {

			  //request.getSession().setAttribute("niumstatus", "Something Went Wrong." );
		  		
			   //Logger.getLogger("Satyakee").info(e.getMessage());
		
	}
		return response.toString();
	}
}
