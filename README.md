<h1 id="api-rest-vacas-">Api rest -Vacas:</h1>
<p>La comunicaciÃ³n entre cliente y servidor se realiza intercambiando objetos JSON.Donde del front-end vienen como objetos son mientras del back-end vienen como objetos java. Para ello es necesario realizar un procedimiento en donde cada atributo de un objeto Java se convierte en una propiedad del objeto Json.</p>
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
<td><strong>@PathParam id:</strong> identificador del registro a borrar</td>
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
<td><strong>@PathParam id:</strong> identificador del registro a borrar</td>
<td></td>
</tr>
</tbody>
</table>
