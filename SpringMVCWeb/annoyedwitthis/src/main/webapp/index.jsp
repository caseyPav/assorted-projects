<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>this garbage works...</h1>
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">
                    LUCKY SEVENS
                </h3>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-4">
                <h4>
                    welcome to lucky sevens. prepare to lose all of your money
                </h4>
            </div>
            <div class="col-md-4">
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <form class="form-horizontal" action="${pageContext.request.contextPath}/annoyedwitthis/idiot" method="POST">
                    <div class="form-group">
                        <label form="userBet" class="col-sm-2 control-label formlabel">
                            User Bet
                        </label>
                        <div class="col-sm-10">
                            <input type="number" name="userBet" min="1" max="10000" data-bind="value:replyNumber"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">

                            <button type="submit" class="btn btn-default">
                                Play
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </body>

</html>

