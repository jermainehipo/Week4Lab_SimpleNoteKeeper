<%-- 
    Document   : viewnote
    Created on : 2-Oct-2022, 6:01:58 PM
    Author     : jerma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <b>Title: </b>${title}
        <b>Contents: </b><br>
        ${content}
        <a href="note?edit">Edit
    </body>
</html>
