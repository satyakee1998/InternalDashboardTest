

package com.dashboard.service;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;




public class FetchMMCustomers {
	
	String jsonResponse = null;
	String response = null;
	
	public String fetchcustomer (String starting,String ending,String oauthAccessToken,String Agent_Code,String Sub_Agent_code, String MMurl) {
		
	
	String result =null;
	String endings = "15";
	

	try {
		String input = "{\"fromNumber\":\""+starting+"\",\"limit\":\""+endings+"\"}";
		
		OkHttpClient client = new OkHttpClient().newBuilder()
		.build();
		MediaType mediaType = MediaType.parse("application/json,text/plain");
		RequestBody body = RequestBody.create(mediaType, input);
		
		Request request = new Request.Builder()
		.url(MMurl+"/api/v1/getUserWithAgentCode/"+Agent_Code+"/"+Sub_Agent_code)
		.method("POST", body)
		.addHeader("Content-Type", "application/json")
		.addHeader("Authorization", "Bearer " + oauthAccessToken)

		.build();
		Response response = null;
		try {
		response = client.newCall(request).execute();
		} catch (IOException e) {
			/* exception */
		return e.getMessage();
		}

		try {
		result = response.body().string();

		} catch (IOException e) {
			/* exception */
		return e.getMessage();
		}
		}
		catch (Exception e) {
			/* exception */
		return e.getMessage();
		}

		return result;
	
}

}
