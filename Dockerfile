#FROM openjdk:17
#
## Установите рабочую директорию внутри контейнера
#WORKDIR /app
#
## Копируйте JAR-файл с вашим приложением в контейнер
#COPY target/box-0.0.1-SNAPSHOT.jar box-0.0.1-SNAPSHOT.jar
#
## Определите порт, который ваше приложение будет использовать
#EXPOSE 8080
#
## Команда для запуска вашего Spring Boot-приложения
#CMD ["java", "-jar", "box-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]