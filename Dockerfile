
FROM openjdk:7
WORKDIR C:\Users\dxgon\git\es2g25final\HelloWorld\src
RUN javac Hello.java
CMD ["java", "-jar"]
