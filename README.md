# Image Management Service

This microservice is designed to store and retrieve images from MongoDB using Spring Boot and RabbitMQ.

## Installation

To use this service, you will need to have Java 17+ and you'll also need to have MongoDB and RabbitMQ installed. 

To use the `docker-compose` files included in this project to run the services, you'll need to have Docker installed.

Once docker is installed and running, you can run the following commands in the project's root folder to start the services:

```cd src/main/docker```

```docker-compose -f mongo-db up -d```

```docker-compose -f rabbit-mq up -d```

Once you have MongoDB and RabbitMQ running, you can start the Image Management Service by running the following command:

```./mvnw spring-boot:run```

## Configuration

The service is configured using the `application.properties` file. You can change the MongoDB database name by modifying the `spring.data.mongodb.database` property.

## Usage

The Image Management Service currently provides three endpoints:

## GET /productImage/{productId} 

Retrieves the image with the specified `productId`. The response will have the `Content-Type` set to `image/png`.

## POST /productImage 

Saves a new product image. The request body should contain the binary data of the image file, and the `Content-Type` should be set to `image/png`. The response will contain the ID of the newly created image.

## DELETE /productImage/{productId}

Deletes the image with the specified `productId`.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
