FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/test-web.jar /test-web/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/test-web/app.jar"]
