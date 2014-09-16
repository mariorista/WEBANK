
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
if ( session.isNew() == true ){
    %><jsp:forward page="index.jsp"/><%
}
%>
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
    <title>DIT BANK</title>

    <script type="text/javascript" src="script.js"></script>
    <script type="text/javascript">
        function formAValidator(){
            // Make quick references to our fields
            var acc = document.getElementById('acc');

            // Check each input in the order that it appears in the form!
            if(notEmpty(acc, "Miss account task!")){
                    if(isNumeric(acc, "Please enter a valid accountID(NO LETTERS)")){
                                   return true;
                    }
            }
            return false;
        }
        function formBValidator(){
            // Make quick references to our fields
            var from = document.getElementById('from');
            var to = document.getElementById('to');
            var how = document.getElementById('how');

            // Check each input in the order that it appears in the form!
            if(notEmpty(from, "Miss AccountFrom task!")){
                if(isNumeric(from, "Please enter a valid AccountFrom(NO LETTERS)")){
                    if(notEmpty(to, "Miss AccountTo task!")){
                        if(isNumeric(to, "Please enter a valid AccountTo(NO LETTERS)")){
                            if(notEmpty(how, "Miss balance task!")){
                                if(isNumeric(how, "Please enter a valid balance(NO LETTERS)")){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        function notEmpty(elem, helperMsg){
            if(elem.value.length == 0){
                    alert(helperMsg);
                    elem.focus(); // set the focus to this input
                    return false;
            }
            return true;
        }
        function isNumeric(elem, helperMsg){
            var numericExpression = /^[0-9]+$/;
            if(elem.value.match(numericExpression)){
                    return true;
            }else{
                    alert(helperMsg);
                    elem.focus();
                    return false;
            }
	}
        function lengthRestriction(elem, equal){
            var uInput = elem.value;
            if(uInput.length == equal){
                    return true;
            }else{
                    alert("Please enter 9 characters");
                    elem.focus();
                    return false;
            }
        }

    </script>
    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
</head>
<body>
<div id="art-page-background-simple-gradient">
    </div>
    <div id="art-main">
        <div class="art-Sheet">
            <div class="art-Sheet-tl"></div>
            <div class="art-Sheet-tr"></div>
            <div class="art-Sheet-bl"></div>
            <div class="art-Sheet-br"></div>
            <div class="art-Sheet-tc"></div>
            <div class="art-Sheet-bc"></div>
            <div class="art-Sheet-cl"></div>
            <div class="art-Sheet-cr"></div>
            <div class="art-Sheet-cc"></div>
            <div class="art-Sheet-body">
                <div class="art-Header">
                    <div class="art-Header-jpeg"></div>
                    <div class="art-Logo">
                        <h1 id="name-text" class="art-Logo-name"><a href="index.jsp">DIT Bank</a></h1>
                        <div id="slogan-text" class="art-Logo-text">we care about your money</div>
                    </div>
                </div>
                

                <div class="art-nav">
                	<div class="l"></div>
                	<div class="r"></div>
                        <ul class="art-menu">
                                <li>
                			<a href="index.jsp" target="blank" class=" active"><span class="l"></span><span class="r"></span><span class="t">Home</span></a>
                		</li>
                		<li>
                			<a href="contact.jsp" target="blank" class=" active"><span class="l"></span><span class="r"></span><span class="t">Contact Us</span></a>
                		</li>
                                <li>
                			<a href="about.jsp" target="blank" class=" active"><span class="l"></span><span class="r"></span><span class="t">About Us</span></a>
                		</li>
                                <li>
                			<a href="logout.jsp" class=" active"><span class="l"></span><span class="r"></span><span class="t">LogOut</span></a>
                		</li>
                        </ul>

                </div>

                <div class="art-contentLayout">
                    <div class="art-content">
                        <div class="art-Post">
                            <div class="art-Post-body">
                        <div class="art-Post-inner">

                        </div>

                        		<div class="cleared"></div>
                            </div>
                        </div>
                        <div>
                                 <h2 class="art-postheader">
                                     Γεια σου <%=session.getAttribute("surname").toString().toUpperCase() %> <%=session.getAttribute("name").toString().toUpperCase()%>
                                            </h2>
                                
                                  <hr />
                                  <form  METHOD=POST ACTION="checkInfo.jsp" class="oti-na-nai" onsubmit="return formAValidator()">
                                                <table border="0">
                                                    <thead>
                                                        <tr>
                                                          <h4>Πληροφορίες Λογαριασμού</h4>
                                                        </tr>
                                                    </thead>
                                                  <tbody>
                                                      <tr>
                                                          <td>Κωδικός Λογαριασμού:</td>
                                                          <td><input id="acc" type="text" name="account" /></td>
                                                      </tr>

                                                      <tr>
                                                          <td></td>
                                                          <td><input type="submit" value="Check Info" /></td>
                                                      </tr>
                                                  </tbody>

                                                </table>
                                            </form>
                                                <hr />

                                                <form  METHOD=POST ACTION="transfer.jsp" class="oti-na-nai"onsubmit="return formBValidator()">
                                                    <table border="0" >
                                                        <thead>
                                                            <tr>
                                                                <h4>Μεταφορά χρημάτων</h4>
                                                            </tr>
                                                        </thead>
                                                        <tfoot>
                                                            <p style="color: red">
                                                                Πρέπει να γνωρίζετε το υπόλοιπο των λογαριασμών σας
                                                                ( Χρησιμοποιήστε την παραπάνω επιλογή ).
                                                            </p>
                                                        </tfoot>
                                                        <tbody>
                                                            <tr>
                                                                <td>
                                                                    Κωδικός Λογαριασμού(Από):
                                                                </td>
                                                                <td>
                                                                    <input id="from" type="text" name="accF" value="" />
                                                                </td>

                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    Κωδικός Λογαριασμού(Προς):
                                                                </td>
                                                                <td>
                                                                    <input id="to" type="text" name="accto" value="" />
                                                                </td>

                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    Ποσόν:
                                                                </td>
                                                                <td>
                                                                    <input id="how" type="text" name="amount" value="" />
                                                                </td>

                                                            </tr>
                                                            <tr>
                                                                <td></td>
                                                                <td>
                                                                    <input type="submit" value="Transfer Money" />
                                                                </td>
                                                            </tr>
                                                    
                                                        </tbody>
                                                        
                                                    </table>
                                                </form>
                                        
                                
                                        <div class="cleared"></div>
                        </div>

                        		<div class="cleared"></div>
                            </div>



                </div>
                <div class="cleared"></div><div class="art-Footer">
                    <div class="art-Footer-inner">


                    </div>
                    <div class="art-Footer-background"></div>
                </div>
        		<div class="cleared"></div>
            </div>
        </div>
        <div class="cleared"></div>

    </div>

</body>
</html>
