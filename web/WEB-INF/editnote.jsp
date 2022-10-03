<%-- 
    Document   : editnote
    Created on : 2-Oct-2022, 6:02:11 PM
    Author     : jerma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            Title: <input type="text" name="title" value="${title}">
            Contents: <input type="box" name="content" value="${content}">
            <input type="submit" value="Save">
        </form>
    </body>
</html>
