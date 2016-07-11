<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <title>Site Lab Home</title>

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
                            <a class="page-scroll" href="#contact">Flooring Estimate</a>
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

        <!-- Intro Header -->
        <header class="intro">
            <div class="intro-body">
                <div class="container">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <h1 class="brand-heading">SITE LAB</h1>
                            <p class="intro-text"></p>
                            <a href="#about" class="btn btn-circle page-scroll">
                                <i class="fa fa-angle-double-down animated"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- About Section -->
        <section id="about" class="container content-section text-center">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>About This Project</h2>
                    <p>The landing page, site-wide nav bar, and footer are modified from the open source Greyscale theme <a

                            href="http://startbootstrap.com/template-overviews/grayscale/">found here</a>. I began this project
                        with the ostensible goal of following a sensible design process that would result
                        in an aesthetically pleasing interface I would want to use. </p>
                    <p>After spending longer than I would
                        care to admit selecting acceptable font pairings, selecting a color palate, and mucking around in
                        Inkscape I realized that I should probably significantly narrow my focus and actually make some
                        progress. I thought this was a decent looking theme, so I'm running with it...</p>
                    <p> I could waste a lot of time on design...</p>
                </div>
            </div>
        </section>


        <!-- Footer -->
        <footer>
            <div class="container text-center">
                <p>&#x2116; &copy; Casey Pavelko 2016</p>
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
