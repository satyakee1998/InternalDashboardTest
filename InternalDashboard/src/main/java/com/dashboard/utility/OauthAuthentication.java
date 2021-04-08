package com.dashboard.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.dashboard.bean.LoginBean;

///import sun.misc.BASE64Encoder;
@Component
public class OauthAuthentication {

	LoginBean loginbean = new LoginBean();

	public String createOauthToken(String email, String password, String auth) throws JSONException {

		/*
		 * email= loginbean.getEmail(); password= loginbean.getPassword();
		 */

		String accessToken = null;
		String authJsonResponse = null;
		String authUserResponse = null;
		try {

			URL url = new URL(auth + "/oauth/token");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");

///BASE64Encoder enc = new sun.misc.BASE64Encoder();
			String userpassword = "swagger-client" + ":" + "swagger-secret";
			String encodedAuthorization = Base64.getEncoder().encodeToString(userpassword.getBytes());
			conn.setRequestProperty("Authorization", "Basic " + encodedAuthorization);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			String urlParameters = "username=" + email + "&password=" + password + "&grant_type=password";

			OutputStream os = conn.getOutputStream();
			os.write(urlParameters.getBytes());
			os.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			while ((authJsonResponse = br.readLine()) != null) {
				System.out.println(authJsonResponse);

				authUserResponse = authJsonResponse;

			}
			JSONObject jsonUserResponse = new JSONObject(authUserResponse);
			accessToken = jsonUserResponse.getString("access_token");
		} catch (Exception e) {

		}

		return accessToken;
	}
	
}