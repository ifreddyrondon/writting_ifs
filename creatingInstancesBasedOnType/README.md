# Convirtiendo tipos en instancias (creatingInstancesBasedOnType)

## Contexto

Detectamos un patrón recurrente en el backend medieante el cual contamos con un ```enum``` y en función de este valor se elije que función invocar. Ocurre esto con el tipo ```ShippingTypeBO``` así como también en ```PaymentType``` agregando el contrato al enum, según sea su tipo.

Esta herramienta del lenguaje es utilizada también en los siguientes casos:

- [MainGoalConstants.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/constants/MainGoalConstants.groovy)
- [ShippingTransport.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/constants/ShippingTransport.groovy)
- [FlowSteps.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/graph/commons/FlowSteps.groovy)
- [AttachmentType.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/graph/inputs/constants/AttachmentType.groovy)
- [AttributeName.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/graph/inputs/constants/AttributeName.groovy)
- [ConstraintName.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/feature/discounts/src/groovy/com/mercadolibre/api/flow/graph/inputs/constants/ConstraintName.groovy)
- [ToggleAttachmentStatus.groovy](https://github.com/mercadolibre/fury_buyingflow-cart/blob/develop/src/groovy/com/mercadolibre/api/flow/graph/inputs/constants/ToggleAttachmentStatus.groovy)

Un patrón semejante se vió en los siguientes códigos: 
- src/groovy/com/mercadolibre/api/flow/action/userIdentification/UserIdentificationInputDataAdd.groovy
- src/groovy/com/mercadolibre/api/flow/exceptions/apps/ErrorAppsResponseFactory.groovy
- src/groovy/com/mercadolibre/buyingflow/business/AccreditationTimeBO.groovy
- src/groovy/com/mercadolibre/buyingflow/dto/parameters/GetShippingOptionsParametersFactory.groovy
- src/groovy/com/mercadolibre/buyingflow/mapper/OperationStatusMapper.groovy
- src/groovy/com/mercadolibre/buyingflow/mapper/PaymentStatusBEMapper.groovy
- src/groovy/com/mercadolibre/buyingflow/mapper/shipping/deliverypromise/DeliveryPromiseSimpleFactory.groovy
- src/groovy/com/mercadolibre/commands/DestinationCommand.groovy
- src/groovy/com/mercadolibre/commands/resolver/DestinationCommandResolver.groovy

La ausencia de entidedades conspira contra la escalabilidad del código y genera archivos con un


## Consecuencias negativas

- Los archivos enum tienen tendenia a crecer y esto impacta en el tiempo de compilación.
- Viola el principio [DRY](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)
- La ausencia de entidades trae aparejado problemas ante cambios de requerimiento (caso emblema es la falta de entidades de medios de pagos y/o medios de envíos para renderizar la congrats, ver aquí los beneficios de crear las entidades [dojo congrats](https://github.com/diegosanchez/dojo/tree/master/dojo_5) )

## Alternativa

Utilización de una variante al patrón Factory. Esta clase permite aparear un ```Type``` con una ```Clazz``` pudiendo crear instancias en función de un tipo.

Esto nos fuerza a generar las abstracciones y entidades para cada una de las instancias específicas. Ejemplo de uso:

```java
    FactoryBasedOnType<Payment, String> paymentFactory = new FactoryBasedOnType(DefaultPayment.class);

    factory.map("master", Mastercard.class);
    factory.map("visa", Visa.class);

    FactoryBasedOnType<Shipment, String> shippingFactory = new FactoryBasedOnType(NoShipment.class);

    factory.map("me2", MercadoEnvio.class);
    factory.map("me1", MercadoEnvio.class);
    factory.map("puis", Puis.class);

    Payment payment = paymentFactory.createType("master");
    Shipment shipment = shippingFactory.createType("me2");

    Mapper winner = payment.challenge( shipment );

    winner.asMap();
```

