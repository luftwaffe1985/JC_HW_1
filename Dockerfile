FROM openjdk:latest
WORKDIR /C:/Users/Asus/IdeaProjects/JC_HW_1/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d out ./org/example/Main.java
WORKDIR /C:/Users/Asus/IdeaProjects/JC_HW_1/src/app/out
CMD java -classpath . org.example.Main
