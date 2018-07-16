package com.ps.springm1.model;

public class MultipleWhereClauseQueryGenerator {

	public void MultipleWhereClauseQuery(String queryString,String createNode)
	{
		String [] nodes=createNode.split(",");
		RelationalOperatorDetector rs=new RelationalOperatorDetector();
		for(int i=0;i<nodes.length;i++)
		{
			
			System.out.println(queryString);
			String relationalOperator=rs.RelationalOperatorIdentifier(nodes[i]);
			String [] nodesplitter=nodes[i].split(relationalOperator);
			nodesplitter[0]="HELLO";//db column name
			nodesplitter[1]="WORLD";//db column value
			StringBuilder sb=new StringBuilder();
			sb.append(nodesplitter[0]);
			sb.append(relationalOperator);
			sb.append(nodesplitter[1]);
			String replacequery=sb.toString();
			System.out.println(replacequery);
			String replacedString = queryString.replaceAll(nodes[i],replacequery);
			System.out.println(replacedString);	
	        queryString=replacedString;
	
		}
				
	}
	public static void main(String args[])
	{
		MultipleWhereClauseQueryGenerator ms =new MultipleWhereClauseQueryGenerator();
		String queryString="(QUANTITY=3) AND QUANTITY<=4";
		String createNode="QUANTITY=3,QUANTITY<=4";
		ms.MultipleWhereClauseQuery(queryString, createNode);
	}	
		
	}

