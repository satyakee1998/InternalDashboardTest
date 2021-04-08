package com.dashboard.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.dashboard.utility.OauthAuthentication;

@Component
public class FetchUserList {
///// private static final com.sun.org.slf4j.internal.Logger LOGGER = LoggerFactory.getLogger(PostPrefund.class);

	String currency = null;
	String username = null;

	String jsonResponse = null;
	String response = null;

	public String fetchcustomer(String starting, String ending, String oauthAccessToken, String Agent_Code,
			String Sub_Agent_code, HttpServletRequest request, String auth, String nisg) {

		String endings = "15";
		try {

			URL url = new URL(nisg + "/api/v1/getUserWithAgentCode/" + Agent_Code + "/" + Sub_Agent_code);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
////conn.setRequestProperty("clientHasID", clientkahash);
////conn.setRequestProperty("x-api-key", ipax);
			conn.setRequestProperty("Authorization", "Bearer " + oauthAccessToken);

			String input = "{\"fromNumber\":\"" + starting + "\",\"limit\":\"" + endings + "\"}";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			while ((jsonResponse = br.readLine()) != null) {

				response = jsonResponse;

			}

		} catch (MalformedURLException e) {

///// LOGGER.error(Constant.ERRORS, e.getCause(), e.getMessage());
			return e.getMessage();

		} catch (IOException e) {

			return e.getMessage();

		}
		return response;
	}
	/*
	 * public static void main(String[] args) { FetchUserList fetch = new
	 * FetchUserList(); OauthAuthentication oauthAuth = new OauthAuthentication();
	 * String token=oauthAuth.createOauthToken("mithilesh@stylopay.com","W@llet123",
	 * "http://developer.sandbox.stylopay.com:8081");
	 * 
	 * String
	 * response=fetch.fetchcustomer("1","15",token,"Agent_Code","Sub_Agent_code",
	 * null,null,"http://developer.sandbox.stylopay.com:8081/api-mm");
	 * System.out.println(response); }
	 */
}
