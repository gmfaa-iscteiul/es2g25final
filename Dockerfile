
FROM openjdk:7
COPY C:\Users\dxgon\git\es2g25final\HelloWorld\src\*.jar
WORKDIR C:\Users\dxgon\git\es2g25final\HelloWorld\src
CMD ["java", "-jar"]
