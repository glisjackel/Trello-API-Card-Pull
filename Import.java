package com.mentor.trello;

import com.ning.http.client.*;

import java.util.concurrent.Future;

public class Import {
    public static void main(String args[]) throws Exception {
    	@SuppressWarnings("resource")
		AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
    	Future<Response> f = asyncHttpClient.prepareGet("https://trello.com/c/PSvQXnyq").
    			execute();
    	Response r = f.get();
    	System.out.println(r.getResponseBody());
    	    	System.exit(0);   
    }
}

//Save as a java file in the above package//
