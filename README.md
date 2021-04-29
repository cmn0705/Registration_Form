*Tags: Html,Java,Servlet,Tomcat*

[**Registration Form**](https://cmn0705.github.io/Registration_Form/tomcat/webapps/Quiz2/WEB-INF/registration.html)

This is a Java Servlet (server-side web application):
* Receive the data sent by registration form
* Save the received data in a file in server
* Send a message/page back to the web browser (the user) to confirm the registration

**Note: Running Server on Mac**

**Application folder ‘Quiz2’ is placed in the folder tomcat/webapps**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image001.png)

**In Terminal, go to tomcat/bin folder, type ‘./startup.sh’ to start the server:**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image003.png)

**In browser, go to <http://localhost:9091/> to make sure the server is running**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image005.png)

**Go to tomcat/webapps/Quiz2/WEB-INF folder, Open the registration.html by clicking on it:**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image007.png)

**The file is open in Browser, enter an User information and click the ‘Register’ button:**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image008.png)

**The Browser return a message**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image010.png)

**Go to tomcat/bin folder, we see that the data have been saved in the file ‘Quiz2’**
![](https://github.com/cmn0705/Registration_Form/blob/master/img/image012.png)
