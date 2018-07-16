package com.ps.springm1.model;


public class RelationalOperatorDetector {

	public String  RelationalOperatorIdentifier(String name)
	{
		if(name.contains(">="))
		{return ">=";}
		else if(name.contains("<="))
		{return "<=";}
		else if(name.contains("<>"))
		{return "<>";}
		else if(name.contains(">"))
		{return ">";}
		else if(name.contains("="))
		{return "=";}
		else 
		{return "undefined relational operator";}
		
		
	}
	public static void main(String args[])
	{
		RelationalOperatorDetector rs =new RelationalOperatorDetector();
		String relationalOperator=rs.RelationalOperatorIdentifier("column<>value");
		System.out.println(relationalOperator);
		
	}
}
