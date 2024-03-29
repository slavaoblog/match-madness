FROM gradle:8.4.0-jdk20

WORKDIR /app

RUN apt-get update && apt-get install -yq make unzip

COPY config config
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .

RUN ./gradlew --no-daemon dependencies

COPY src src

RUN ./gradlew --no-daemon build

EXPOSE 8080

CMD java -jar build/libs/match-madness-0.0.1-SNAPSHOT.jar
