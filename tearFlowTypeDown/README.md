# Descartar la utilización de el enum FlowType

## Contexto

En las APPs se estan sumando distintos flujos, de manera progresiva, los cuales nos fuerzan a estar preguntando continuamente en qué flujo estamos y esto se traduce en la siguiente estructora (paradigma estructurado):

```java
public class PaymentOnlyOptionsLoadingTitleGenerator {

    @FlowType
    private final String flowType;

    /**
     * Constructor
     * @param flowType {@link FlowType}
     */
    public PaymentOnlyOptionsLoadingTitleGenerator(String flowType) {
        this.flowType = flowType;
    }

    /**
     * Get title by flow type
     * @param context {@link Context}
     * @return String with title a flow type in particular
     */
    public String getTitle(@NonNull Context context) {
        String subtitle;

        if (flowType == null) {
            subtitle = context.getString(R.string.cho_po_label_default_loading_message);
        } else {
            switch (flowType) {
                case FlowType.RESERVATION:
                    subtitle = context.getString(R.string.cho_po_label_loading_message);
                    break;
                case FlowType.CONTRACT:
                default:
                    subtitle = context.getString(R.string.cho_po_label_default_loading_message);
                    break;
            }
        }

        return subtitle;
    }
}
```

## Consecuencias negativas

- Viola el principio de [Open/Close](https://en.wikipedia.org/wiki/Open/closed_principle)
- Caída de cobertura por falta de tests.

## Alternativa

Aplicación de patrón [Double Dispatch](https://en.wikipedia.org/wiki/Double_dispatch).

### Diagrama de clases

#### Jerarquía de Flow

![flow class diagram][flow_class_diagram]

#### Jerarquía de Wordings

![wording class diagram][wording_class_diagram]

### Diagrama de secuencias

#### Obtener un wording para el flujo de reservation

![get wording for flow][get_wording_for_flow]


[flow_class_diagram]: ./diagrams/WordingsForFlow/Flow/class_diagram.png
[wording_class_diagram]: ./diagrams/WordingsForFlow/Words/class_diagram.png
[get_wording_for_flow]: ./diagrams/WordingsForFlow/Words/get_wording_for_flow.png
