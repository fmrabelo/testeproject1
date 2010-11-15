<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<link href="<s:url value="/resources/main.css"/>" rel="stylesheet" type="text/css"/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Tarefa</title>
</head>

<body>

	<div class="titleDiv"><s:text name="application.title"/></div>

	<h1>
	   <s:if test="tarefa==null || tarefa.id == null">
		 <s:text name="label.employee.add"/>
	   </s:if>
	   <s:else>
		 <s:text name="label.employee.edit"/>
	   </s:else>
	</h1>	

    <table>
		<tr>
			<td align="left" style="font:bold;color:red"> 
	            <s:fielderror/> 	 	
                <s:actionerror/>
                <s:actionmessage/>
            </td>
        </tr>
    </table>
    
    <s:form>
	    <table align="center" class="borderAll">
	         <tr>
	         	<td class="tdLabel">         	
	         		<s:text name="label.firstName"/>         	
	         	</td>
	         	<td>         	
	         		<s:textarea name="tarefa.descricao" rows="5" cols="50"/>         		
	         	</td>
	         </tr>
	    </table>
	    <br/>
	    <table> 
	    	     <tr>
	    		    <td><s:submit action="adicionaTarefa" key="button.label.submit" cssClass="butStnd"/></td>
	    	        <td><s:reset key="button.label.cancel" cssClass="butStnd"/></td>
	    		 <tr>
	    </table> 		  		 
    
    </s:form>
     	
</body>
</html>