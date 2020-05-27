
FROM openjdk:7
WORKDIR C:\Users\dxgon\git\es2g25final\HelloWorld\src
RUN javac C:\Users\dxgon\git\es2g25final\HelloWorld\src\Hello.java
CMD ["java", "-jar"]
