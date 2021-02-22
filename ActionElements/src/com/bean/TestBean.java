package com.bean;

import java.io.Serializable;

//POJO class
public class TestBean implements Serializable 
{
		private String message=null;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
}
