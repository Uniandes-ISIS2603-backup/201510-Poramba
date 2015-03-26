<h1 id="api-rest-vacas-">Api rest -Vacas:</h1>
<p>La comunicación entre cliente y servidor se realiza intercambiando objetos JSON.Donde del front-end vienen como objetos son mientras del back-end vienen como objetos java. Para ello es necesario realizar un procedimiento en donde cada atributo de un objeto Java se convierte en una propiedad del objeto Json.</p>
<p>Todos los servicios se generan en la URL /vacas.home. Por defecto cada entidad tiene un atributo id: las cuales les permite identificarse.</p>
<p>{
id:'',
atrb1, 
atrb1, 
....
.
..
.
atrbN, 
}</p>
<h2 id="crud-b-sico">CRUD Basico</h2>
<p>La respuesta del servidor al solicitar una colecciOn tiene la siguiente forma:</p>
<p>{
    totalRecords: 0, //cantidad de registros en la base de datos
    records: [] //collecciÃ³n con los datos solicitados. cada objeto tiene la estructura de la entidad.
}</p>
<h2 id="api-de-vacas">Api de Vacas</h2>
<h2 id="hotel">Hotel</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad Hotel.</p>
<h3 id="estructura-de-un-objeto-json-de-un-hotel-">Estructura de un objeto Json de un hotel.</h3>
<p>{
    <strong>id</strong>: '' /<em>Tipo Long</em>/,
    <strong>nombre</strong>: '' /<em>Tipo String</em>/,
    <strong>descripcion</strong>: '' /<em>Tipo String</em>/,
    <strong>numero_Estrellas</strong>: '' /<em>Tipo Integer</em>/,
    <strong>ubicacion</strong>: '' /<em>Tipo String</em>/
}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/hotel</td>
<td>obtener todos los objetos Json de hotel</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxHotel:</strong> cantidad maxima hoteles</td>
<td></td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/hotel/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del hotel con un id</td>
</tr>
<tr>
<td>post</td>
<td>/hotel/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de Hotel</td>
<td>un objeto Json de Hotel creado</td>
</tr>
<tr>
<td>put</td>
<td>/hotel/:id</td>
<td>actualizar los atributos de un hotel con un identificador determinado</td>
<td>Objeto Json de hotel</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/hotel/:id</td>
<td>Borra una instancia de hotel con un identificador</td>
<td>Objeto Json de hotel</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>
<h2 id="evento">Evento</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad evento.</p>
<h3 id="estructura-de-un-objeto-json-de-un-evento-">Estructura de un objeto Json de un evento.</h3>
<p>{
    <strong>id</strong>: '' /<em>Tipo Long</em>/,
    <strong>nombre</strong>: '' /<em>Tipo String</em>/,
    <strong>min_edad</strong>: '' /<em>Tipo Integer</em>/,
    <strong>max_edad</strong>: '' /<em>Tipo Integer</em>/,
    <strong>reglas</strong>: '' /<em>Tipo String</em>/
}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/hotel</td>
<td>obtener todos los objetos Json de hotel</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima eventos</td>
<td>event</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/event/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del evento con un id</td>
</tr>
<tr>
<td>post</td>
<td>/event/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de evento</td>
<td>un objeto Json de evento creado</td>
</tr>
<tr>
<td>put</td>
<td>/event/:id</td>
<td>actualizar los atributos de un evento con un identificador determinado</td>
<td>Objeto Json de evento</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/event/:id</td>
<td>Borra una instancia de un evento  con un identificador</td>
<td>Objeto Json de evento</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>


<h2 id="transporte">Transporte</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad transporte.</p>
<h3 id="estructura-de-un-objeto-json-de-un-transporte-">Estructura de un objeto Json del transporte.</h3>
<p>{
    <strong>ciudad_origen</strong>: '' /<em>Tipo String</em>/,
    <strong>ciudad_destino</strong>: '' /<em>Tipo String</em>/,
    <strong>distancia</strong>: '' /<em>Tipo Long</em>/,
    <strong>medio_de_transporte</strong>: '' /<em>Tipo Integer</em>/,
    <strong>reglas</strong>: '' /<em>Tipo String</em>/
}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/transporte</td>
<td>obtener todos los objetos Json de transporte</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima transporte</td>
<td>transporte</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/transporte/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del transporte con un id</td>
</tr>
<tr>
<td>post</td>
<td>/transporte/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de transporte</td>
<td>un objeto Json de transporte creado</td>
</tr>
<tr>
<td>put</td>
<td>/transporte/:id</td>
<td>actualizar los atributos de un transporte con un identificador determinado</td>
<td>Objeto Json de transporte</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/transporte/:id</td>
<td>Borra una instancia de un transporte  con un identificador</td>
<td>Objeto Json de transporte</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<h2 id="intinerary">Intinerario</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad intinerario.</p>
<h3 id="estructura-de-un-objeto-json-de-un-intinerario-">Estructura de un objeto Json del intinerario.</h3>
<p>{
    <strong>nombre</strong>: '' /<em>Tipo String</em>/,
    <strong>descripcion</strong>: '' /<em>Tipo String</em>/,
    <strong>inicio</strong>: '' /<em>Tipo String</em>/,
    <strong>final</strong>: '' /<em>Tipo String</em>/,
    <strong>acciones</strong>: '' /<em>Tipo String</em>/
}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/intinerary</td>
<td>obtener todos los objetos Json de intinerario</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima intinerario</td>
<td>intinerary</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/intinerary/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del intinerario con un id</td>
</tr>
<tr>
<td>post</td>
<td>/intinerary/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de intinerario</td>
<td>un objeto Json de intinerario creado</td>
</tr>
<tr>
<td>put</td>
<td>/intinerary/:id</td>
<td>actualizar los atributos de un intinerario con un identificador determinado</td>
<td>Objeto Json de intinerario</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/intinerary/:id</td>
<td>Borra una instancia de un intinerario  con un identificador</td>
<td>Objeto Json de intinerario</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<h2 id="city">Ciudad</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad Ciudad.</p>
<h3 id="estructura-de-un-objeto-json-de-un-ciudad-">Estructura de un objeto Json del Ciudad.</h3>
<p>{
    <strong>nombre</strong>: '' /<em>Tipo String</em>/,
    <strong>descripcion</strong>: '' /<em>Tipo String</em>/,
    <strong>link</strong>: '' /<em>Tipo String</em>/,
    
}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/city</td>
<td>obtener todos los objetos Json de Ciudad</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima Ciudad</td>
<td>city</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/city/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del Ciudad con un id</td>
</tr>
<tr>
<td>post</td>
<td>/city/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de Ciudad</td>
<td>un objeto Json de Ciudad creado</td>
</tr>
<tr>
<td>put</td>
<td>/city/:id</td>
<td>actualizar los atributos de un Ciudad con un identificador determinado</td>
<td>Objeto Json de Ciudad</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/city/:id</td>
<td>Borra una instancia de un Ciudad  con un identificador</td>
<td>Objeto Json de Ciudad</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<h2 id="traveler">Viajero</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad Viajero.</p>
<h3 id="estructura-de-un-objeto-json-de-un-ciudad-">Estructura de un objeto Json de Viajero.</h3>
<p>{
    <strong>pasaporte</strong>: '' /<em>Tipo String</em>/,
    <strong>nombre</strong>: '' /<em>Tipo String</em>/,
    <strong>apellido</strong>: '' /<em>Tipo String</em>/,
    <strong>Edad</strong>: '' /<em>Tipo Integer</em>/,

}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/traveler</td>
<td>obtener todos los objetos Json de Viajero</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima Viajero</td>
<td>traveler</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/trveler/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del Viajero con un id</td>
</tr>
<tr>
<td>post</td>
<td>/traveler/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de Viajero</td>
<td>un objeto Json de Viajero creado</td>
</tr>
<tr>
<td>put</td>
<td>/traveler/:id</td>
<td>actualizar los atributos de un Viajero con un identificador determinado</td>
<td>Objeto Json de Viajero</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/traveler/:id</td>
<td>Borra una instancia de un Viajero con un identificador</td>
<td>Objeto Json de Viajero</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<h2 id="lugar">Lugar</h2>
<p>En la siguiente tabla se detalla los servicios REST generados para la entidad Lugar.</p>
<h3 id="estructura-de-un-objeto-json-de-un-ciudad-">Estructura de un objeto Json de Lugar.</h3>
<p>{
    <strong>inicio</strong>: '' /<em>Tipo Date</em>/,
    <strong>fin</strong>: '' /<em>Tipo Date</em>/,
    <strong>hotel</strong>: '' /<em>Tipo HotelDTO</em>/,
    <strong>transporte</strong>: '' /<em>Tipo TransporteDTO</em>/,
    <strong>eventos</strong>: '' /<em>Tipo List EventoDTO</em>/,
    <strong>ciudad</strong>: '' /<em>Tipo CiudadDTO</em>/,


}</p>
<table>
<thead>
<tr>
<th>Metodo</th>
<th>URI</th>
<th>ACCION</th>
<th>PARAMETROS</th>
<th>CUERPO</th>
<th>RETORNO</th>
</tr>
</thead>
<tbody>
<tr>
<td>get</td>
<td>/lugar</td>
<td>obtener todos los objetos Json de Lugar</td>
<td><strong>@queryParamPage</strong>  pagina a consultar<strong>@maxEvent:</strong> cantidad maxima Lugar</td>
<td>lugar</td>
<td>UN objeto Json con coleccion de objetos y la cantidad con la que llega</td>
</tr>
<tr>
<td>get</td>
<td>/lugar/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td><strong>@PathParam id:</strong> identificador del registro</td>
<td></td>
<td>un objeto Json con el detalle del Lugar con un id</td>
</tr>
<tr>
<td>post</td>
<td>/lugar/:id</td>
<td>Obtener los atributos del objeto Json con una id especifica</td>
<td></td>
<td>Objeto Json a crear de Lugar</td>
<td>un objeto Json de Lugar creado</td>
</tr>
<tr>
<td>put</td>
<td>/lugar/:id</td>
<td>actualizar los atributos de un Lugar con un identificador determinado</td>
<td>Objeto Json de Lugar</td>
<td><strong>@PathParam id: </strong> identificador del registro</td>
<td>un objeto Json con el sus atributos actualizados</td>
</tr>
<tr>
<td>delete</td>
<td>/lugar/:id</td>
<td>Borra una instancia de un Lugar con un identificador</td>
<td>Objeto Json de Lugar</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>
