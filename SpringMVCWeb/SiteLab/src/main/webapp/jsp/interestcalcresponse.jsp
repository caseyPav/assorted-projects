<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <title>Interest Calculator</title>

        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet"
              type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

        <!-- Theme CSS -->
        <link href="${pageContext.request.contextPath}/css/grayscale.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

        <!-- Navigation -->
        <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-center navbar-main-collapse">
                    <ul class="nav navbar-nav">
                        <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/index.jsp">Home</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/jsp/luckysevens.jsp">Lucky Sevens</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/jsp/factorizer.jsp">Factorizer</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/jsp/interestcalc.jsp">Interest Calculator</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/jsp/floorcalc.jsp">Flooring Estimate</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="${pageContext.request.contextPath}/jsp/tipcalc.jsp">Tip Calculator</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#contact">Unit Converter</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
        <div class="container">
            <div class="container content-section text-center">
                <div class="col-md-4">
                    <h1>Interest Calculator</h1>  
                    <h4>
                        here are your results...
                    </h4>
                    <form action="${pageContext.request.contextPath}/jsp/interestcalc.jsp">
                        <button type="submit" class="btn btn-default">
                            Return
                        </button><br/><br/>
                    </form>
                    <h6> <c:forEach var="interest" items="${listToReturn}">
                            <c:out value="${interest.year}"/><br/>
                            <c:out value="Balance:  $${interest.balance}"/><br/>
                            <c:out value="Yearly Interest:  $${interest.interest}"/><br/><br/>
                        </c:forEach></h6>
                </div>
                <div class="col-md-4">
                    
                </div>
                <div class="col-md-4" id="kalhed">
                </div>
            </div>
        </div>
        <!-- Footer -->
        <footer id="footer">
            <div class="container text-center">
                <p></p>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.min.js"></script>
        <!-- Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/js/grayscale.js"></script>

    </body>

</html>