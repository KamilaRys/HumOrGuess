FROM openjdk:17-oracle
ADD target/HumOrGuess-0.0.1-SNAPSHOT.jar .
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://byoveuuupfglypa8ncsk-postgresql.services.clever-cloud.com:50013/byoveuuupfglypa8ncsk
ENV SPRING_DATASOURCE_USERNAME=ud6ixazzdzkf7xhay2nq
ENV SPRING_DATASOURCE_PASSWORD=twByzhNn3nseM8htqgoHzKzRkusf1a
EXPOSE 8000
CMD java -jar HumOrGuess-0.0.1-SNAPSHOT.jar