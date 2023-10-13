# backend-lab1

Simple endpoint app with time and health status

# Build the project
## Clone the project
```bash
git clone https://github.com/AKushch1337/backend-lab1
```
## Move into the directory of the project
```bash
cd /path/to/project
```

## Build the project using Gradle Wrapper
```bash
./gradlew build
```
```bash
./gradlew run
```

# Build the project using Docker

```bash
docker build . -t lab1:1.0 
```

```bash
docker run -p 8080:8080 --rm lab1:1.0
```

# Build the project using Docker Compose

```bash
docker compose build
```

```bash
docker compose up
```

## Check the web page on your local host

Go to http://127.0.0.1:8080/healthcheck



