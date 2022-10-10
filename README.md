# Automatización de pruebas dentro de la ventana de formulario para softesting 

El presente proyecto, tiene como finalidad, expresar los casos de prueba tenidos en cuenta para evaluar la funcionalidad de la ventana de diligenciamiento de formulario, dentro de la página web otorgada por softesting, en el marco del semillero integral analista de pruebas.

### Comportamiento de la automatización:
Los casos de prueba realizados en este proyecto, están relacionados con verificar el funcionamiento de los campos de texto que componen el formulario de la página web otorgada por softesting, ya que estos, tienen unas reglas específicas para el ingreso de datos; así como también la prueba de elementos para la validación de usabilidad, en este caso, la ortografía y manera en la que están escritas algunas frases. Este nivel de detalle, a pesar de que es una página sencilla, sin muchos componentes, hace que la automatización sea la solución optima para probar este formulario. cabe aclarar que, el envío de datos, es una funcionalidad que no fue contemplada en las pruebas, por traer consigo otros accesos no disponibles por el momento. 
Cabe destacar que los casos de prueba dentro del código, fueron escritos en inglés para una comprensión universal y ceñirse más a parámetros corporativos.

## Casos de prueba diseñados


| Identificador | Descripción |Precondiciones |Entradas |Resultados esperados |Resultados obtenidos |
| ------ | ------ |------ |------ |------ |------ |
| CP_001 |  Verificar correcta escritura de los títulos|  Estar en la ventana de formulario | N/A | Que las palabras "Barrio" y "Mensaje" estén bien escritas | "Varrio" y "Mensaje" |
| CP_002 |Ingresar los datos dentro de los campos de texto, como lo dicen las indicaciones y luego enviar el formulario |estar en la ventana de formulario  | Nombre, Correo, Barrio, Asunto, Mensaje | formulario enviado exitosamente | Mensaje de error :"UPPPPS ALGO HA FALLADO :(" |  |
|  CP_003|  Dejar todos los campos vacíos y luego enviar| Estar en la ventana de formulario | Ninguno |  Mensaje de error, formulario no enviado| Mensaje de error, formulario no enviado |  |
| CP_004 | Ingresar los datos incorrectos en los campos de texto |  Estar en la ventana de formulario| "D", "d-m", "Ca", "co", "p" |  Mensaje de error, formulario no enviado |   Mensaje de error, formulario no enviado|  |
| CP_005 | Recargar la página al ingresar en la opción "Caso 1" | Estar en la ventana de formulario |N/A  | Página de formulario recargada | Mensaje de error "Error 404 not found" |  |