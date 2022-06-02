# AE-Example Reactive MongoDb
Aplicación Empresarial: Example Reactive MongoDb

En la primera captura de pantalla podemos ver la creación de un paquete IUserRepository donde se llama la dependencia que se conectará con el Mongo Atlas, señalo la función userRepository.save() de la interfaz para salvar el objeto user en nuestra base datos no-relacional.

![Screen Shot 2022-06-02 at 7 12 51 AM](https://user-images.githubusercontent.com/90350943/171627159-91d9012b-a156-4ef1-a628-9263a2f51441.png)

Mediante Postman generamos el servicio POST para que se almacene del lado del servidor el objeto user en nuestra base de datos. Confirmamos esa acción revisando nuestra collection user en Mongo Atlas.

![Screen Shot 2022-06-02 at 7 14 15 AM](https://user-images.githubusercontent.com/90350943/171628428-c0845ecb-0e83-456b-a8f8-a775d5cee2f3.png)

![Screen Shot 2022-06-02 at 7 14 34 AM](https://user-images.githubusercontent.com/90350943/171628522-bd0ce2c2-6800-4e72-ac68-178380845d92.png)

