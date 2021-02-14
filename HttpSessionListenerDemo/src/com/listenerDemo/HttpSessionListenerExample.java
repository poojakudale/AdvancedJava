package com.listenerDemo;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


//@WebListener
public class HttpSessionListenerExample  implements HttpSessionListener {

		private static int sessions;
	
		public static int getTotalNoOfActiveSesion()
		{
			return sessions;
		}
		
		
      public void sessionCreated(HttpSessionEvent arg0) 
      { 
    	  sessions++;
    	  System.out.println("Session Created one session is added to counter");
      }


    public void sessionDestroyed(HttpSessionEvent arg0) 
    { 
    	sessions--;
  	  System.out.println("Session Destroyed one session is deduct from counter");

    }
	
}
