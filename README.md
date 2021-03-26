# Ejercicio práctico: AREP-Tercio 2
Se construyó un servicio que calcula el arcoseno y el logaritmo de un número el servicio está desplegado en una instancia de EC2 y también está desplegado con API Gateway utilizando AWS Lambda.

### Código desplegado en EC2
[https://github.com/federico29/ParcialAREP/tree/master/EC2](https://github.com/federico29/ParcialAREP/tree/master/EC2)
### Código desplegado con API Gateway utilizando Lambda
[https://github.com/federico29/ParcialAREP/tree/master/Lambda%20y%20API%20Gateway](https://github.com/federico29/ParcialAREP/tree/master/Lambda%20y%20API%20Gateway)
## Video de demostración
[https://youtu.be/cALlQs63XRo](https://youtu.be/cALlQs63XRo)

## Instalación
Copiar este repositorio y compilarlo:
```
$ git clone https://github.com/federico29/ParcialAREP
$ mvn package
```

## Ejecutar pruebas
Para ejecutar las pruebas ejecute el siguiente comando:
```
$ mvn test
```

## Documentación
Generar la documentación del proyecto:
```
$ mvn javadoc:javadoc
```

## Construido con
- Maven
- Java
- GIT
- Docker
- AWS EC2

## Licencia
federico29/AREP-Parcial2 is licensed under the [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.html).

## Autor
Federico Barrios Meneses
