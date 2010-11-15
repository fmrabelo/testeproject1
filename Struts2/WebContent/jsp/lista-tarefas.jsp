<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Tarefas Cadastradas</title>
</head>
<body>


<table>
<tr>
<th>Id</th>
<th>Descrição</th>
<th>Finalizado?</th>
<th>Data de finalização</th>
</tr>
<c:forEach items="${tarefas}" var="tarefa">
<tr>
<td>${tarefa.id}</td>
<td>${tarefa.descricao}</td>
<c:if test="${tarefa.finalizado eq false}">
<td>Não finalizado</td>
</c:if>
<c:if test="${tarefa.finalizado}">
<td>Finalizado</td>
</c:if>
<td>
<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>