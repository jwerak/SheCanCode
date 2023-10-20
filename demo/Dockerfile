FROM gradle:7.4-jdk17
COPY . /app
WORKDIR /app
RUN gradle build

CMD gradle bootRun