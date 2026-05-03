mvn clean package
docker stop janitor
docker rm janitor
docker build -t janitor .
docker run -d --name janitor -p :8080 janitor