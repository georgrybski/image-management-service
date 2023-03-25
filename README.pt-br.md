[English](README.md) | [Português](README.pt-br.md)

# Serviço de Gerenciamento de Imagens

Este microserviço foi desenvolvido para armazenar e recuperar imagens do MongoDB utilizando Spring Boot e RabbitMQ.

De forma geral, seria mais interessante enviar as imagens para um serviço de armazenamento em nuvem, como o Amazon S3, possivelmente diretamente do front-end com uma URL pré-autorizada, para evitar operações de I/O bloqueantes e aliviar a carga do lado do servidor.

Este projeto é apenas uma experimentação pessoal com o MongoDB.

## Instalação

Para utilizar este serviço, você precisará ter Java 17+ e também precisará ter o MongoDB e o RabbitMQ instalados.

Para executar os serviços utilizando os arquivos `docker-compose` incluídos neste projeto, você precisará ter o Docker instalado.

Quando o Docker estiver instalado e em execução, você pode executar os seguintes comandos na pasta raiz do projeto para iniciar os serviços:

```cd src/main/docker```

```docker-compose -f mongo-db up -d```

```docker-compose -f rabbit-mq up -d```

Depois que o MongoDB e o RabbitMQ estiverem em execução, você pode iniciar o Serviço de Gerenciamento de Imagens executando o seguinte comando:

```./mvnw spring-boot:run```

## Configuração

O serviço é configurado usando o arquivo `application.properties`. Você pode alterar o nome do banco de dados MongoDB modificando a propriedade `spring.data.mongodb.database`.

## Uso

O Serviço de Gerenciamento de Imagens atualmente fornece três endpoints:

## GET /productImage/{productId}

Recupera a imagem com o `productId` especificado. A resposta terá o `Content-Type` definido como `image/png`.

## POST /productImage 

Salva uma nova imagem de produto. O corpo da solicitação deve conter os dados binários do arquivo de imagem, e o `Content-Type` deve ser definido como `image/png`. A resposta conterá o ID da imagem recém-criada.

## DELETE /productImage/{productId}

Exclui a imagem com o `productId` especificado.

## Contribuindo

Pull requests são bem-vindos. Para mudanças importantes, abra primeiro uma issue para discutir o que você gostaria de alterar.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para obter mais detalhes.