package com.custom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CubeNumber extends TagSupport 
{
	private int num;
	
	public void setNum(int num)
	{
		this.num= num;
	}
	
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		
		try {
			
			out.print(num*num*num);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return SKIP_BODY;
	}
}
