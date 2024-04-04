<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Pharmacy Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Product List</h1>
  <img src="/test.jpg" alt="test"/>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nom</th>
                <th>Quantité</th>
                <th>Description</th>
                <th>Prix</th>
            </tr>
        </thead>
        <tbody>
            <%-- Your Java code to fetch and display products here --%>
            <%-- Example data (replace with actual data retrieval logic) --%>
            <tr>
                <td>1</td>
                <td>Product 1</td>
                <td>10</td>
                <td>Description 1</td>
                <td>190.00</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Product 2</td>
                <td>5</td>
                <td>Description 2</td>
                <td>150.00</td>
            </tr>
        </tbody>
    </table>
</div>

<!-- Include Bootstrap JavaScript for interactive components -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>
