package co.edu.uniandes.choco.scenarios;

import java.util.List;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.search.solution.Solution;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class Output {
public void solveProblem() {
Solver solver = new Solver();

// FEATURES (Variables & Domains)
BoolVar inversionti = VariableFactory.bool("inversionti", solver);
BoolVar motivadoresdenegocio = (BoolVar) VariableFactory.fixed("motivadoresdenegocio", 1, solver);
BoolVar sistemasempresariales = (BoolVar) VariableFactory.fixed("sistemasempresariales", 1, solver);
BoolVar nuevovsexistente = (BoolVar) VariableFactory.fixed("nuevovsexistente", 1, solver);
BoolVar tercerizacion = (BoolVar) VariableFactory.fixed("tercerizacion", 1, solver);
BoolVar tipodesolucion = (BoolVar) VariableFactory.fixed("tipodesolucion", 1, solver);
BoolVar modelodedespliegue = (BoolVar) VariableFactory.fixed("modelodedespliegue", 1, solver);
BoolVar modelodeimplementacion = (BoolVar) VariableFactory.fixed("modelodeimplementacion", 1, solver);
BoolVar mantenimiento = (BoolVar) VariableFactory.fixed("mantenimiento", 1, solver);
BoolVar modelodeseleccion = (BoolVar) VariableFactory.fixed("modelodeseleccion", 1, solver);
BoolVar plataforma = (BoolVar) VariableFactory.fixed("plataforma", 1, solver);
BoolVar integracion = (BoolVar) VariableFactory.fixed("integracion", 1, solver);
BoolVar financiacion = (BoolVar) VariableFactory.fixed("financiacion", 1, solver);
BoolVar crm_customerrelationshipmanagement = VariableFactory.bool("crm_customerrelationshipmanagement", solver);
BoolVar erp_enterpriseresourceplanning = (BoolVar) VariableFactory.fixed("erp_enterpriseresourceplanning", 0, solver);
BoolVar segmentarydepurarclientes = VariableFactory.bool("segmentarydepurarclientes", solver);
BoolVar planificacionypresupuestosdemercadeo = VariableFactory.bool("planificacionypresupuestosdemercadeo", solver);
BoolVar gestiondedatosylistas = (BoolVar) VariableFactory.fixed("gestiondedatosylistas", 0, solver);
BoolVar analisisdemarketing = VariableFactory.bool("analisisdemarketing", solver);
BoolVar gestiondecampanias = VariableFactory.bool("gestiondecampanias", solver);
BoolVar facilitartareasdemercadeoypublicidad = VariableFactory.bool("facilitartareasdemercadeoypublicidad", solver);
BoolVar gestionderespuestasyclientespotenciales = VariableFactory.bool("gestionderespuestasyclientespotenciales", solver);
BoolVar reducirciclosdeventas = (BoolVar) VariableFactory.fixed("reducirciclosdeventas", 0, solver);
BoolVar aumentartasasdecierredeventas = (BoolVar) VariableFactory.fixed("aumentartasasdecierredeventas", 0, solver);
BoolVar mejorarretenciondeclientes = VariableFactory.bool("mejorarretenciondeclientes", solver);
BoolVar implementarnuevoprocesodeventas = VariableFactory.bool("implementarnuevoprocesodeventas", solver);
BoolVar gestionarinformaciondeclientes = VariableFactory.bool("gestionarinformaciondeclientes", solver);
BoolVar gestiondecasosdeclientes = VariableFactory.bool("gestiondecasosdeclientes", solver);
BoolVar historialdeserviciosdeclientes = VariableFactory.bool("historialdeserviciosdeclientes", solver);
BoolVar aumentarbasedeclientes = VariableFactory.bool("aumentarbasedeclientes", solver);
BoolVar implementarnuevoprocesodeatencionalcliente = (BoolVar) VariableFactory.fixed("implementarnuevoprocesodeatencionalcliente", 0, solver);
BoolVar mejorarconocimientodelcliente = VariableFactory.bool("mejorarconocimientodelcliente", solver);
BoolVar medirsatisfacciondelconsumidor = VariableFactory.bool("medirsatisfacciondelconsumidor", solver);
BoolVar controlsobrerecursoshumanos = (BoolVar) VariableFactory.fixed("controlsobrerecursoshumanos", 0, solver);
BoolVar nuevosprocesosderecursoshumanos = (BoolVar) VariableFactory.fixed("nuevosprocesosderecursoshumanos", 0, solver);
BoolVar reclutamiento = (BoolVar) VariableFactory.fixed("reclutamiento", 0, solver);
BoolVar biodata_hojasdevida = (BoolVar) VariableFactory.fixed("biodata_hojasdevida", 0, solver);
BoolVar analisisdecargos_estructuraorganizacional = (BoolVar) VariableFactory.fixed("analisisdecargos_estructuraorganizacional", 0, solver);
BoolVar nominayadministraciondesalarios = (BoolVar) VariableFactory.fixed("nominayadministraciondesalarios", 0, solver);
BoolVar educacionycapacitacion = (BoolVar) VariableFactory.fixed("educacionycapacitacion", 0, solver);
BoolVar saludocupacional = (BoolVar) VariableFactory.fixed("saludocupacional", 0, solver);
BoolVar modelamientodeprocesosyorganigramas = (BoolVar) VariableFactory.fixed("modelamientodeprocesosyorganigramas", 0, solver);
BoolVar nuevosprocesosfinancieros = (BoolVar) VariableFactory.fixed("nuevosprocesosfinancieros", 0, solver);
BoolVar implementarcontrolessobreprocesosfinancieros = (BoolVar) VariableFactory.fixed("implementarcontrolessobreprocesosfinancieros", 0, solver);
BoolVar gestioncontable = (BoolVar) VariableFactory.fixed("gestioncontable", 0, solver);
BoolVar manejodecuentasporpagar_proveedores = (BoolVar) VariableFactory.fixed("manejodecuentasporpagar_proveedores", 0, solver);
BoolVar sistemasdecosteo = (BoolVar) VariableFactory.fixed("sistemasdecosteo", 0, solver);
BoolVar administraciondeactivosfijos = (BoolVar) VariableFactory.fixed("administraciondeactivosfijos", 0, solver);
BoolVar manejodeconciliacionesbancarias = (BoolVar) VariableFactory.fixed("manejodeconciliacionesbancarias", 0, solver);
BoolVar controldeinversiones = (BoolVar) VariableFactory.fixed("controldeinversiones", 0, solver);
BoolVar manejodeobligacionesfinancieras = (BoolVar) VariableFactory.fixed("manejodeobligacionesfinancieras", 0, solver);
BoolVar tesoreria = (BoolVar) VariableFactory.fixed("tesoreria", 0, solver);
BoolVar contabilidadanalitica = (BoolVar) VariableFactory.fixed("contabilidadanalitica", 0, solver);
BoolVar controlyadministraciondelpresupuesto = (BoolVar) VariableFactory.fixed("controlyadministraciondelpresupuesto", 0, solver);
BoolVar manejodeactivosdecapital = (BoolVar) VariableFactory.fixed("manejodeactivosdecapital", 0, solver);
BoolVar manejodeinventarios = (BoolVar) VariableFactory.fixed("manejodeinventarios", 0, solver);
BoolVar manejodealmacen = (BoolVar) VariableFactory.fixed("manejodealmacen", 0, solver);
BoolVar gestiondecompras = (BoolVar) VariableFactory.fixed("gestiondecompras", 0, solver);
BoolVar gestiondeactivosfijos = (BoolVar) VariableFactory.fixed("gestiondeactivosfijos", 0, solver);
BoolVar comercioexterior = (BoolVar) VariableFactory.fixed("comercioexterior", 0, solver);
BoolVar seguros = (BoolVar) VariableFactory.fixed("seguros", 0, solver);
BoolVar manejodeordenesdeproduccion = (BoolVar) VariableFactory.fixed("manejodeordenesdeproduccion", 0, solver);
BoolVar manejodeordenesdecompra = (BoolVar) VariableFactory.fixed("manejodeordenesdecompra", 0, solver);
BoolVar planificaciondenecesidadesdecapacidad = (BoolVar) VariableFactory.fixed("planificaciondenecesidadesdecapacidad", 0, solver);
BoolVar planificaciondesuministros = (BoolVar) VariableFactory.fixed("planificaciondesuministros", 0, solver);
BoolVar disminuirtiemposdeentrega = (BoolVar) VariableFactory.fixed("disminuirtiemposdeentrega", 0, solver);
BoolVar integracionconproveedores = (BoolVar) VariableFactory.fixed("integracionconproveedores", 0, solver);
BoolVar gestiondeproveedores = (BoolVar) VariableFactory.fixed("gestiondeproveedores", 0, solver);
BoolVar administraciondemateriasprimas = (BoolVar) VariableFactory.fixed("administraciondemateriasprimas", 0, solver);
BoolVar gestiondebodega = (BoolVar) VariableFactory.fixed("gestiondebodega", 0, solver);
BoolVar realizarcontroldecostos = (BoolVar) VariableFactory.fixed("realizarcontroldecostos", 0, solver);
BoolVar administraciondepedidosydespachos = (BoolVar) VariableFactory.fixed("administraciondepedidosydespachos", 0, solver);
BoolVar gestiondecontactos = (BoolVar) VariableFactory.fixed("gestiondecontactos", 0, solver);
BoolVar ajustarprocesosdeflujodetrabajo = (BoolVar) VariableFactory.fixed("ajustarprocesosdeflujodetrabajo", 0, solver);
BoolVar mejorarcapacidadderespuesta = (BoolVar) VariableFactory.fixed("mejorarcapacidadderespuesta", 0, solver);
BoolVar gestionarpresupuestos = (BoolVar) VariableFactory.fixed("gestionarpresupuestos", 0, solver);
BoolVar crearyconsolidarinformes = (BoolVar) VariableFactory.fixed("crearyconsolidarinformes", 0, solver);
BoolVar buscartendenciasyrelaciones = (BoolVar) VariableFactory.fixed("buscartendenciasyrelaciones", 0, solver);
BoolVar compartirconocimiento = (BoolVar) VariableFactory.fixed("compartirconocimiento", 0, solver);
BoolVar organizarrecursosdeservicio = (BoolVar) VariableFactory.fixed("organizarrecursosdeservicio", 0, solver);
BoolVar facturacionydevolucion = (BoolVar) VariableFactory.fixed("facturacionydevolucion", 0, solver);
BoolVar cartera = (BoolVar) VariableFactory.fixed("cartera", 0, solver);
BoolVar administraciondepreciosydescuentos = (BoolVar) VariableFactory.fixed("administraciondepreciosydescuentos", 0, solver);
BoolVar administraciondepromociones = (BoolVar) VariableFactory.fixed("administraciondepromociones", 0, solver);
BoolVar administraciondecuotaseincentivos = (BoolVar) VariableFactory.fixed("administraciondecuotaseincentivos", 0, solver);
BoolVar administraciondevisitacomercial = (BoolVar) VariableFactory.fixed("administraciondevisitacomercial", 0, solver);
BoolVar importacionesyexportaciones = (BoolVar) VariableFactory.fixed("importacionesyexportaciones", 0, solver);
BoolVar gestionarcontratosdeservicio = (BoolVar) VariableFactory.fixed("gestionarcontratosdeservicio", 0, solver);
BoolVar presupuestarcostosytiempos = (BoolVar) VariableFactory.fixed("presupuestarcostosytiempos", 0, solver);
BoolVar automatizarlafacturacion = (BoolVar) VariableFactory.fixed("automatizarlafacturacion", 0, solver);
BoolVar predecirdisponibilidades = (BoolVar) VariableFactory.fixed("predecirdisponibilidades", 0, solver);
BoolVar seguimientodecostosyconsumos = (BoolVar) VariableFactory.fixed("seguimientodecostosyconsumos", 0, solver);
BoolVar planificarcapacidades = (BoolVar) VariableFactory.fixed("planificarcapacidades", 0, solver);
BoolVar planearygestionarcapacidaddebodegajeyalmacenamiento = (BoolVar) VariableFactory.fixed("planearygestionarcapacidaddebodegajeyalmacenamiento", 0, solver);
BoolVar gestiondetransportedemercancia = (BoolVar) VariableFactory.fixed("gestiondetransportedemercancia", 0, solver);
BoolVar logisticadetransporteinternacional = (BoolVar) VariableFactory.fixed("logisticadetransporteinternacional", 0, solver);
BoolVar gestionderelacionconproveedores = (BoolVar) VariableFactory.fixed("gestionderelacionconproveedores", 0, solver);
BoolVar gestiondelademanda = (BoolVar) VariableFactory.fixed("gestiondelademanda", 0, solver);
BoolVar crm_modulomarketing = VariableFactory.bool("crm_modulomarketing", solver);
BoolVar crm_moduloventas = VariableFactory.bool("crm_moduloventas", solver);
BoolVar crm_modulodeclientes = VariableFactory.bool("crm_modulodeclientes", solver);
BoolVar erp_modulorecursoshumanos = (BoolVar) VariableFactory.fixed("erp_modulorecursoshumanos", 0, solver);
BoolVar erp_modulofinanciero = (BoolVar) VariableFactory.fixed("erp_modulofinanciero", 0, solver);
BoolVar erp_moduloadministrativo = (BoolVar) VariableFactory.fixed("erp_moduloadministrativo", 0, solver);
BoolVar erp_modulodeproduccion = (BoolVar) VariableFactory.fixed("erp_modulodeproduccion", 0, solver);
BoolVar erp_modulodeclientes = (BoolVar) VariableFactory.fixed("erp_modulodeclientes", 0, solver);
BoolVar erp_modulodegestiondeabastecimiento = (BoolVar) VariableFactory.fixed("erp_modulodegestiondeabastecimiento", 0, solver);
BoolVar erp_modulodeinteligenciadenegocio = (BoolVar) VariableFactory.fixed("erp_modulodeinteligenciadenegocio", 0, solver);
BoolVar erp_marketingyventas = (BoolVar) VariableFactory.fixed("erp_marketingyventas", 0, solver);
BoolVar erp_modulodegestiondeproyectos = (BoolVar) VariableFactory.fixed("erp_modulodegestiondeproyectos", 0, solver);
BoolVar scm_sistemadegestiondeabastecimiento = (BoolVar) VariableFactory.fixed("scm_sistemadegestiondeabastecimiento", 0, solver);
BoolVar adquirirsistemanuevo = VariableFactory.bool("adquirirsistemanuevo", solver);
BoolVar adaptarsistemaexistente = VariableFactory.bool("adaptarsistemaexistente", solver);
BoolVar subcontratarpersonalizacion = VariableFactory.bool("subcontratarpersonalizacion", solver);
BoolVar subcontratarpartedeldesarrolloeintegracion = VariableFactory.bool("subcontratarpartedeldesarrolloeintegracion", solver);
BoolVar subcontratarlaadministraciondeunprocesodenegociocompleto = VariableFactory.bool("subcontratarlaadministraciondeunprocesodenegociocompleto", solver);
BoolVar subcontratargerenciadelproyectodeimplementacion = VariableFactory.bool("subcontratargerenciadelproyectodeimplementacion", solver);
BoolVar comercial = VariableFactory.bool("comercial", solver);
BoolVar opensource = VariableFactory.bool("opensource", solver);
BoolVar onpremise = VariableFactory.bool("onpremise", solver);
BoolVar softwarecomoserviciosaas = VariableFactory.bool("softwarecomoserviciosaas", solver);
BoolVar infraestructuracomoservicioiaas = VariableFactory.bool("infraestructuracomoservicioiaas", solver);
BoolVar bigbang = VariableFactory.bool("bigbang", solver);
BoolVar implementacionporfases = VariableFactory.bool("implementacionporfases", solver);
BoolVar implementacionporprocesos = VariableFactory.bool("implementacionporprocesos", solver);
BoolVar contratoconelproveedor = VariableFactory.bool("contratoconelproveedor", solver);
BoolVar contratoconunproveedorespecializado = VariableFactory.bool("contratoconunproveedorespecializado", solver);
BoolVar mantenimientoporcuentapropia = VariableFactory.bool("mantenimientoporcuentapropia", solver);
BoolVar sincontratodemantenimiento = VariableFactory.bool("sincontratodemantenimiento", solver);
BoolVar rfp_requestforproposal = VariableFactory.bool("rfp_requestforproposal", solver);
BoolVar consultoriaexterna = VariableFactory.bool("consultoriaexterna", solver);
BoolVar evaluacioninterna = VariableFactory.bool("evaluacioninterna", solver);
BoolVar sistemaempresarialbasadoenlamismaplataformatecnologica = VariableFactory.bool("sistemaempresarialbasadoenlamismaplataformatecnologica", solver);
BoolVar sistemaempresarialbasadoenunaplataformadiferente = VariableFactory.bool("sistemaempresarialbasadoenunaplataformadiferente", solver);
BoolVar middleware = VariableFactory.bool("middleware", solver);
BoolVar desarrollopropio = VariableFactory.bool("desarrollopropio", solver);
BoolVar proveedor = VariableFactory.bool("proveedor", solver);
BoolVar recursospropios = VariableFactory.bool("recursospropios", solver);
BoolVar credito = VariableFactory.bool("credito", solver);
BoolVar leasing = VariableFactory.bool("leasing", solver);

// FEATURE ATTRIBUTES (Variables & Domains)
IntVar[][] featureAttributes = new IntVar[125][4];featureAttributes[0][0] = VariableFactory.bounded("segmentarydepurarclientescostos", 0, 0, solver);
featureAttributes[0][1] = VariableFactory.bounded("segmentarydepurarclientestiempo", 0, 0, solver);
featureAttributes[0][2] = VariableFactory.bounded("segmentarydepurarclientesrecursoshumanos", 0, 0, solver);
featureAttributes[0][3] = VariableFactory.bounded("segmentarydepurarclientesriesgos", 0, 0, solver);

featureAttributes[1][0] = VariableFactory.bounded("planificacionypresupuestosdemercadeocostos", 0, 0, solver);
featureAttributes[1][1] = VariableFactory.bounded("planificacionypresupuestosdemercadeotiempo", 0, 0, solver);
featureAttributes[1][2] = VariableFactory.bounded("planificacionypresupuestosdemercadeorecursoshumanos", 0, 0, solver);
featureAttributes[1][3] = VariableFactory.bounded("planificacionypresupuestosdemercadeoriesgos", 0, 0, solver);

featureAttributes[2][0] = VariableFactory.bounded("gestiondedatosylistascostos", 0, 0, solver);
featureAttributes[2][1] = VariableFactory.bounded("gestiondedatosylistastiempo", 0, 0, solver);
featureAttributes[2][2] = VariableFactory.bounded("gestiondedatosylistasrecursoshumanos", 0, 0, solver);
featureAttributes[2][3] = VariableFactory.bounded("gestiondedatosylistasriesgos", 0, 0, solver);

featureAttributes[3][0] = VariableFactory.bounded("analisisdemarketingcostos", 0, 0, solver);
featureAttributes[3][1] = VariableFactory.bounded("analisisdemarketingtiempo", 0, 0, solver);
featureAttributes[3][2] = VariableFactory.bounded("analisisdemarketingrecursoshumanos", 0, 0, solver);
featureAttributes[3][3] = VariableFactory.bounded("analisisdemarketingriesgos", 0, 0, solver);

featureAttributes[4][0] = VariableFactory.bounded("gestiondecampaniascostos", 0, 0, solver);
featureAttributes[4][1] = VariableFactory.bounded("gestiondecampaniastiempo", 0, 0, solver);
featureAttributes[4][2] = VariableFactory.bounded("gestiondecampaniasrecursoshumanos", 0, 0, solver);
featureAttributes[4][3] = VariableFactory.bounded("gestiondecampaniasriesgos", 0, 0, solver);

featureAttributes[5][0] = VariableFactory.bounded("facilitartareasdemercadeoypublicidadcostos", 0, 0, solver);
featureAttributes[5][1] = VariableFactory.bounded("facilitartareasdemercadeoypublicidadtiempo", 0, 0, solver);
featureAttributes[5][2] = VariableFactory.bounded("facilitartareasdemercadeoypublicidadrecursoshumanos", 0, 0, solver);
featureAttributes[5][3] = VariableFactory.bounded("facilitartareasdemercadeoypublicidadriesgos", 0, 0, solver);

featureAttributes[6][0] = VariableFactory.bounded("gestionderespuestasyclientespotencialescostos", 0, 0, solver);
featureAttributes[6][1] = VariableFactory.bounded("gestionderespuestasyclientespotencialestiempo", 0, 0, solver);
featureAttributes[6][2] = VariableFactory.bounded("gestionderespuestasyclientespotencialesrecursoshumanos", 0, 0, solver);
featureAttributes[6][3] = VariableFactory.bounded("gestionderespuestasyclientespotencialesriesgos", 0, 0, solver);

featureAttributes[7][0] = VariableFactory.bounded("reducirciclosdeventascostos", 0, 0, solver);
featureAttributes[7][1] = VariableFactory.bounded("reducirciclosdeventastiempo", 0, 0, solver);
featureAttributes[7][2] = VariableFactory.bounded("reducirciclosdeventasrecursoshumanos", 0, 0, solver);
featureAttributes[7][3] = VariableFactory.bounded("reducirciclosdeventasriesgos", 0, 0, solver);

featureAttributes[8][0] = VariableFactory.bounded("aumentartasasdecierredeventascostos", 0, 0, solver);
featureAttributes[8][1] = VariableFactory.bounded("aumentartasasdecierredeventastiempo", 0, 0, solver);
featureAttributes[8][2] = VariableFactory.bounded("aumentartasasdecierredeventasrecursoshumanos", 0, 0, solver);
featureAttributes[8][3] = VariableFactory.bounded("aumentartasasdecierredeventasriesgos", 0, 0, solver);

featureAttributes[9][0] = VariableFactory.bounded("mejorarretenciondeclientescostos", 0, 0, solver);
featureAttributes[9][1] = VariableFactory.bounded("mejorarretenciondeclientestiempo", 0, 0, solver);
featureAttributes[9][2] = VariableFactory.bounded("mejorarretenciondeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[9][3] = VariableFactory.bounded("mejorarretenciondeclientesriesgos", 0, 0, solver);

featureAttributes[10][0] = VariableFactory.bounded("implementarnuevoprocesodeventascostos", 0, 0, solver);
featureAttributes[10][1] = VariableFactory.bounded("implementarnuevoprocesodeventastiempo", 0, 0, solver);
featureAttributes[10][2] = VariableFactory.bounded("implementarnuevoprocesodeventasrecursoshumanos", 0, 0, solver);
featureAttributes[10][3] = VariableFactory.bounded("implementarnuevoprocesodeventasriesgos", 0, 0, solver);

featureAttributes[11][0] = VariableFactory.bounded("gestionarinformaciondeclientescostos", 0, 0, solver);
featureAttributes[11][1] = VariableFactory.bounded("gestionarinformaciondeclientestiempo", 0, 0, solver);
featureAttributes[11][2] = VariableFactory.bounded("gestionarinformaciondeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[11][3] = VariableFactory.bounded("gestionarinformaciondeclientesriesgos", 0, 0, solver);

featureAttributes[12][0] = VariableFactory.bounded("gestiondecasosdeclientescostos", 0, 0, solver);
featureAttributes[12][1] = VariableFactory.bounded("gestiondecasosdeclientestiempo", 0, 0, solver);
featureAttributes[12][2] = VariableFactory.bounded("gestiondecasosdeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[12][3] = VariableFactory.bounded("gestiondecasosdeclientesriesgos", 0, 0, solver);

featureAttributes[13][0] = VariableFactory.bounded("historialdeserviciosdeclientescostos", 0, 0, solver);
featureAttributes[13][1] = VariableFactory.bounded("historialdeserviciosdeclientestiempo", 0, 0, solver);
featureAttributes[13][2] = VariableFactory.bounded("historialdeserviciosdeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[13][3] = VariableFactory.bounded("historialdeserviciosdeclientesriesgos", 0, 0, solver);

featureAttributes[14][0] = VariableFactory.bounded("aumentarbasedeclientescostos", 0, 0, solver);
featureAttributes[14][1] = VariableFactory.bounded("aumentarbasedeclientestiempo", 0, 0, solver);
featureAttributes[14][2] = VariableFactory.bounded("aumentarbasedeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[14][3] = VariableFactory.bounded("aumentarbasedeclientesriesgos", 0, 0, solver);

featureAttributes[15][0] = VariableFactory.bounded("implementarnuevoprocesodeatencionalclientecostos", 0, 0, solver);
featureAttributes[15][1] = VariableFactory.bounded("implementarnuevoprocesodeatencionalclientetiempo", 0, 0, solver);
featureAttributes[15][2] = VariableFactory.bounded("implementarnuevoprocesodeatencionalclienterecursoshumanos", 0, 0, solver);
featureAttributes[15][3] = VariableFactory.bounded("implementarnuevoprocesodeatencionalclienteriesgos", 0, 0, solver);

featureAttributes[16][0] = VariableFactory.bounded("mejorarconocimientodelclientecostos", 0, 0, solver);
featureAttributes[16][1] = VariableFactory.bounded("mejorarconocimientodelclientetiempo", 0, 0, solver);
featureAttributes[16][2] = VariableFactory.bounded("mejorarconocimientodelclienterecursoshumanos", 0, 0, solver);
featureAttributes[16][3] = VariableFactory.bounded("mejorarconocimientodelclienteriesgos", 0, 0, solver);

featureAttributes[17][0] = VariableFactory.bounded("medirsatisfacciondelconsumidorcostos", 0, 0, solver);
featureAttributes[17][1] = VariableFactory.bounded("medirsatisfacciondelconsumidortiempo", 0, 0, solver);
featureAttributes[17][2] = VariableFactory.bounded("medirsatisfacciondelconsumidorrecursoshumanos", 0, 0, solver);
featureAttributes[17][3] = VariableFactory.bounded("medirsatisfacciondelconsumidorriesgos", 0, 0, solver);

featureAttributes[18][0] = VariableFactory.bounded("controlsobrerecursoshumanoscostos", 0, 0, solver);
featureAttributes[18][1] = VariableFactory.bounded("controlsobrerecursoshumanostiempo", 0, 0, solver);
featureAttributes[18][2] = VariableFactory.bounded("controlsobrerecursoshumanosrecursoshumanos", 0, 0, solver);
featureAttributes[18][3] = VariableFactory.bounded("controlsobrerecursoshumanosriesgos", 0, 0, solver);

featureAttributes[19][0] = VariableFactory.bounded("nuevosprocesosderecursoshumanoscostos", 0, 0, solver);
featureAttributes[19][1] = VariableFactory.bounded("nuevosprocesosderecursoshumanostiempo", 0, 0, solver);
featureAttributes[19][2] = VariableFactory.bounded("nuevosprocesosderecursoshumanosrecursoshumanos", 0, 0, solver);
featureAttributes[19][3] = VariableFactory.bounded("nuevosprocesosderecursoshumanosriesgos", 0, 0, solver);

featureAttributes[20][0] = VariableFactory.bounded("reclutamientocostos", 0, 0, solver);
featureAttributes[20][1] = VariableFactory.bounded("reclutamientotiempo", 0, 0, solver);
featureAttributes[20][2] = VariableFactory.bounded("reclutamientorecursoshumanos", 0, 0, solver);
featureAttributes[20][3] = VariableFactory.bounded("reclutamientoriesgos", 0, 0, solver);

featureAttributes[21][0] = VariableFactory.bounded("biodata_hojasdevidacostos", 0, 0, solver);
featureAttributes[21][1] = VariableFactory.bounded("biodata_hojasdevidatiempo", 0, 0, solver);
featureAttributes[21][2] = VariableFactory.bounded("biodata_hojasdevidarecursoshumanos", 0, 0, solver);
featureAttributes[21][3] = VariableFactory.bounded("biodata_hojasdevidariesgos", 0, 0, solver);

featureAttributes[22][0] = VariableFactory.bounded("analisisdecargos_estructuraorganizacionalcostos", 0, 0, solver);
featureAttributes[22][1] = VariableFactory.bounded("analisisdecargos_estructuraorganizacionaltiempo", 0, 0, solver);
featureAttributes[22][2] = VariableFactory.bounded("analisisdecargos_estructuraorganizacionalrecursoshumanos", 0, 0, solver);
featureAttributes[22][3] = VariableFactory.bounded("analisisdecargos_estructuraorganizacionalriesgos", 0, 0, solver);

featureAttributes[23][0] = VariableFactory.bounded("nominayadministraciondesalarioscostos", 0, 0, solver);
featureAttributes[23][1] = VariableFactory.bounded("nominayadministraciondesalariostiempo", 0, 0, solver);
featureAttributes[23][2] = VariableFactory.bounded("nominayadministraciondesalariosrecursoshumanos", 0, 0, solver);
featureAttributes[23][3] = VariableFactory.bounded("nominayadministraciondesalariosriesgos", 0, 0, solver);

featureAttributes[24][0] = VariableFactory.bounded("educacionycapacitacioncostos", 0, 0, solver);
featureAttributes[24][1] = VariableFactory.bounded("educacionycapacitaciontiempo", 0, 0, solver);
featureAttributes[24][2] = VariableFactory.bounded("educacionycapacitacionrecursoshumanos", 0, 0, solver);
featureAttributes[24][3] = VariableFactory.bounded("educacionycapacitacionriesgos", 0, 0, solver);

featureAttributes[25][0] = VariableFactory.bounded("saludocupacionalcostos", 0, 0, solver);
featureAttributes[25][1] = VariableFactory.bounded("saludocupacionaltiempo", 0, 0, solver);
featureAttributes[25][2] = VariableFactory.bounded("saludocupacionalrecursoshumanos", 0, 0, solver);
featureAttributes[25][3] = VariableFactory.bounded("saludocupacionalriesgos", 0, 0, solver);

featureAttributes[26][0] = VariableFactory.bounded("modelamientodeprocesosyorganigramascostos", 0, 0, solver);
featureAttributes[26][1] = VariableFactory.bounded("modelamientodeprocesosyorganigramastiempo", 0, 0, solver);
featureAttributes[26][2] = VariableFactory.bounded("modelamientodeprocesosyorganigramasrecursoshumanos", 0, 0, solver);
featureAttributes[26][3] = VariableFactory.bounded("modelamientodeprocesosyorganigramasriesgos", 0, 0, solver);

featureAttributes[27][0] = VariableFactory.bounded("nuevosprocesosfinancieroscostos", 0, 0, solver);
featureAttributes[27][1] = VariableFactory.bounded("nuevosprocesosfinancierostiempo", 0, 0, solver);
featureAttributes[27][2] = VariableFactory.bounded("nuevosprocesosfinancierosrecursoshumanos", 0, 0, solver);
featureAttributes[27][3] = VariableFactory.bounded("nuevosprocesosfinancierosriesgos", 0, 0, solver);

featureAttributes[28][0] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancieroscostos", 0, 0, solver);
featureAttributes[28][1] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierostiempo", 0, 0, solver);
featureAttributes[28][2] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierosrecursoshumanos", 0, 0, solver);
featureAttributes[28][3] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierosriesgos", 0, 0, solver);

featureAttributes[29][0] = VariableFactory.bounded("gestioncontablecostos", 0, 0, solver);
featureAttributes[29][1] = VariableFactory.bounded("gestioncontabletiempo", 0, 0, solver);
featureAttributes[29][2] = VariableFactory.bounded("gestioncontablerecursoshumanos", 0, 0, solver);
featureAttributes[29][3] = VariableFactory.bounded("gestioncontableriesgos", 0, 0, solver);

featureAttributes[30][0] = VariableFactory.bounded("manejodecuentasporpagar_proveedorescostos", 0, 0, solver);
featureAttributes[30][1] = VariableFactory.bounded("manejodecuentasporpagar_proveedorestiempo", 0, 0, solver);
featureAttributes[30][2] = VariableFactory.bounded("manejodecuentasporpagar_proveedoresrecursoshumanos", 0, 0, solver);
featureAttributes[30][3] = VariableFactory.bounded("manejodecuentasporpagar_proveedoresriesgos", 0, 0, solver);

featureAttributes[31][0] = VariableFactory.bounded("sistemasdecosteocostos", 0, 0, solver);
featureAttributes[31][1] = VariableFactory.bounded("sistemasdecosteotiempo", 0, 0, solver);
featureAttributes[31][2] = VariableFactory.bounded("sistemasdecosteorecursoshumanos", 0, 0, solver);
featureAttributes[31][3] = VariableFactory.bounded("sistemasdecosteoriesgos", 0, 0, solver);

featureAttributes[32][0] = VariableFactory.bounded("administraciondeactivosfijoscostos", 0, 0, solver);
featureAttributes[32][1] = VariableFactory.bounded("administraciondeactivosfijostiempo", 0, 0, solver);
featureAttributes[32][2] = VariableFactory.bounded("administraciondeactivosfijosrecursoshumanos", 0, 0, solver);
featureAttributes[32][3] = VariableFactory.bounded("administraciondeactivosfijosriesgos", 0, 0, solver);

featureAttributes[33][0] = VariableFactory.bounded("manejodeconciliacionesbancariascostos", 0, 0, solver);
featureAttributes[33][1] = VariableFactory.bounded("manejodeconciliacionesbancariastiempo", 0, 0, solver);
featureAttributes[33][2] = VariableFactory.bounded("manejodeconciliacionesbancariasrecursoshumanos", 0, 0, solver);
featureAttributes[33][3] = VariableFactory.bounded("manejodeconciliacionesbancariasriesgos", 0, 0, solver);

featureAttributes[34][0] = VariableFactory.bounded("controldeinversionescostos", 0, 0, solver);
featureAttributes[34][1] = VariableFactory.bounded("controldeinversionestiempo", 0, 0, solver);
featureAttributes[34][2] = VariableFactory.bounded("controldeinversionesrecursoshumanos", 0, 0, solver);
featureAttributes[34][3] = VariableFactory.bounded("controldeinversionesriesgos", 0, 0, solver);

featureAttributes[35][0] = VariableFactory.bounded("manejodeobligacionesfinancierascostos", 0, 0, solver);
featureAttributes[35][1] = VariableFactory.bounded("manejodeobligacionesfinancierastiempo", 0, 0, solver);
featureAttributes[35][2] = VariableFactory.bounded("manejodeobligacionesfinancierasrecursoshumanos", 0, 0, solver);
featureAttributes[35][3] = VariableFactory.bounded("manejodeobligacionesfinancierasriesgos", 0, 0, solver);

featureAttributes[36][0] = VariableFactory.bounded("tesoreriacostos", 0, 0, solver);
featureAttributes[36][1] = VariableFactory.bounded("tesoreriatiempo", 0, 0, solver);
featureAttributes[36][2] = VariableFactory.bounded("tesoreriarecursoshumanos", 0, 0, solver);
featureAttributes[36][3] = VariableFactory.bounded("tesoreriariesgos", 0, 0, solver);

featureAttributes[37][0] = VariableFactory.bounded("contabilidadanaliticacostos", 0, 0, solver);
featureAttributes[37][1] = VariableFactory.bounded("contabilidadanaliticatiempo", 0, 0, solver);
featureAttributes[37][2] = VariableFactory.bounded("contabilidadanaliticarecursoshumanos", 0, 0, solver);
featureAttributes[37][3] = VariableFactory.bounded("contabilidadanaliticariesgos", 0, 0, solver);

featureAttributes[38][0] = VariableFactory.bounded("controlyadministraciondelpresupuestocostos", 0, 0, solver);
featureAttributes[38][1] = VariableFactory.bounded("controlyadministraciondelpresupuestotiempo", 0, 0, solver);
featureAttributes[38][2] = VariableFactory.bounded("controlyadministraciondelpresupuestorecursoshumanos", 0, 0, solver);
featureAttributes[38][3] = VariableFactory.bounded("controlyadministraciondelpresupuestoriesgos", 0, 0, solver);

featureAttributes[39][0] = VariableFactory.bounded("manejodeactivosdecapitalcostos", 0, 0, solver);
featureAttributes[39][1] = VariableFactory.bounded("manejodeactivosdecapitaltiempo", 0, 0, solver);
featureAttributes[39][2] = VariableFactory.bounded("manejodeactivosdecapitalrecursoshumanos", 0, 0, solver);
featureAttributes[39][3] = VariableFactory.bounded("manejodeactivosdecapitalriesgos", 0, 0, solver);

featureAttributes[40][0] = VariableFactory.bounded("manejodeinventarioscostos", 0, 0, solver);
featureAttributes[40][1] = VariableFactory.bounded("manejodeinventariostiempo", 0, 0, solver);
featureAttributes[40][2] = VariableFactory.bounded("manejodeinventariosrecursoshumanos", 0, 0, solver);
featureAttributes[40][3] = VariableFactory.bounded("manejodeinventariosriesgos", 0, 0, solver);

featureAttributes[41][0] = VariableFactory.bounded("manejodealmacencostos", 0, 0, solver);
featureAttributes[41][1] = VariableFactory.bounded("manejodealmacentiempo", 0, 0, solver);
featureAttributes[41][2] = VariableFactory.bounded("manejodealmacenrecursoshumanos", 0, 0, solver);
featureAttributes[41][3] = VariableFactory.bounded("manejodealmacenriesgos", 0, 0, solver);

featureAttributes[42][0] = VariableFactory.bounded("gestiondecomprascostos", 0, 0, solver);
featureAttributes[42][1] = VariableFactory.bounded("gestiondecomprastiempo", 0, 0, solver);
featureAttributes[42][2] = VariableFactory.bounded("gestiondecomprasrecursoshumanos", 0, 0, solver);
featureAttributes[42][3] = VariableFactory.bounded("gestiondecomprasriesgos", 0, 0, solver);

featureAttributes[43][0] = VariableFactory.bounded("gestiondeactivosfijoscostos", 0, 0, solver);
featureAttributes[43][1] = VariableFactory.bounded("gestiondeactivosfijostiempo", 0, 0, solver);
featureAttributes[43][2] = VariableFactory.bounded("gestiondeactivosfijosrecursoshumanos", 0, 0, solver);
featureAttributes[43][3] = VariableFactory.bounded("gestiondeactivosfijosriesgos", 0, 0, solver);

featureAttributes[44][0] = VariableFactory.bounded("comercioexteriorcostos", 0, 0, solver);
featureAttributes[44][1] = VariableFactory.bounded("comercioexteriortiempo", 0, 0, solver);
featureAttributes[44][2] = VariableFactory.bounded("comercioexteriorrecursoshumanos", 0, 0, solver);
featureAttributes[44][3] = VariableFactory.bounded("comercioexteriorriesgos", 0, 0, solver);

featureAttributes[45][0] = VariableFactory.bounded("seguroscostos", 0, 0, solver);
featureAttributes[45][1] = VariableFactory.bounded("segurostiempo", 0, 0, solver);
featureAttributes[45][2] = VariableFactory.bounded("segurosrecursoshumanos", 0, 0, solver);
featureAttributes[45][3] = VariableFactory.bounded("segurosriesgos", 0, 0, solver);

featureAttributes[46][0] = VariableFactory.bounded("manejodeordenesdeproduccioncostos", 0, 0, solver);
featureAttributes[46][1] = VariableFactory.bounded("manejodeordenesdeproducciontiempo", 0, 0, solver);
featureAttributes[46][2] = VariableFactory.bounded("manejodeordenesdeproduccionrecursoshumanos", 0, 0, solver);
featureAttributes[46][3] = VariableFactory.bounded("manejodeordenesdeproduccionriesgos", 0, 0, solver);

featureAttributes[47][0] = VariableFactory.bounded("manejodeordenesdecompracostos", 0, 0, solver);
featureAttributes[47][1] = VariableFactory.bounded("manejodeordenesdecompratiempo", 0, 0, solver);
featureAttributes[47][2] = VariableFactory.bounded("manejodeordenesdecomprarecursoshumanos", 0, 0, solver);
featureAttributes[47][3] = VariableFactory.bounded("manejodeordenesdecomprariesgos", 0, 0, solver);

featureAttributes[48][0] = VariableFactory.bounded("planificaciondenecesidadesdecapacidadcostos", 0, 0, solver);
featureAttributes[48][1] = VariableFactory.bounded("planificaciondenecesidadesdecapacidadtiempo", 0, 0, solver);
featureAttributes[48][2] = VariableFactory.bounded("planificaciondenecesidadesdecapacidadrecursoshumanos", 0, 0, solver);
featureAttributes[48][3] = VariableFactory.bounded("planificaciondenecesidadesdecapacidadriesgos", 0, 0, solver);

featureAttributes[49][0] = VariableFactory.bounded("planificaciondesuministroscostos", 0, 0, solver);
featureAttributes[49][1] = VariableFactory.bounded("planificaciondesuministrostiempo", 0, 0, solver);
featureAttributes[49][2] = VariableFactory.bounded("planificaciondesuministrosrecursoshumanos", 0, 0, solver);
featureAttributes[49][3] = VariableFactory.bounded("planificaciondesuministrosriesgos", 0, 0, solver);

featureAttributes[50][0] = VariableFactory.bounded("disminuirtiemposdeentregacostos", 0, 0, solver);
featureAttributes[50][1] = VariableFactory.bounded("disminuirtiemposdeentregatiempo", 0, 0, solver);
featureAttributes[50][2] = VariableFactory.bounded("disminuirtiemposdeentregarecursoshumanos", 0, 0, solver);
featureAttributes[50][3] = VariableFactory.bounded("disminuirtiemposdeentregariesgos", 0, 0, solver);

featureAttributes[51][0] = VariableFactory.bounded("integracionconproveedorescostos", 0, 0, solver);
featureAttributes[51][1] = VariableFactory.bounded("integracionconproveedorestiempo", 0, 0, solver);
featureAttributes[51][2] = VariableFactory.bounded("integracionconproveedoresrecursoshumanos", 0, 0, solver);
featureAttributes[51][3] = VariableFactory.bounded("integracionconproveedoresriesgos", 0, 0, solver);

featureAttributes[52][0] = VariableFactory.bounded("gestiondeproveedorescostos", 0, 0, solver);
featureAttributes[52][1] = VariableFactory.bounded("gestiondeproveedorestiempo", 0, 0, solver);
featureAttributes[52][2] = VariableFactory.bounded("gestiondeproveedoresrecursoshumanos", 0, 0, solver);
featureAttributes[52][3] = VariableFactory.bounded("gestiondeproveedoresriesgos", 0, 0, solver);

featureAttributes[53][0] = VariableFactory.bounded("administraciondemateriasprimascostos", 0, 0, solver);
featureAttributes[53][1] = VariableFactory.bounded("administraciondemateriasprimastiempo", 0, 0, solver);
featureAttributes[53][2] = VariableFactory.bounded("administraciondemateriasprimasrecursoshumanos", 0, 0, solver);
featureAttributes[53][3] = VariableFactory.bounded("administraciondemateriasprimasriesgos", 0, 0, solver);

featureAttributes[54][0] = VariableFactory.bounded("gestiondebodegacostos", 0, 0, solver);
featureAttributes[54][1] = VariableFactory.bounded("gestiondebodegatiempo", 0, 0, solver);
featureAttributes[54][2] = VariableFactory.bounded("gestiondebodegarecursoshumanos", 0, 0, solver);
featureAttributes[54][3] = VariableFactory.bounded("gestiondebodegariesgos", 0, 0, solver);

featureAttributes[55][0] = VariableFactory.bounded("realizarcontroldecostoscostos", 0, 0, solver);
featureAttributes[55][1] = VariableFactory.bounded("realizarcontroldecostostiempo", 0, 0, solver);
featureAttributes[55][2] = VariableFactory.bounded("realizarcontroldecostosrecursoshumanos", 0, 0, solver);
featureAttributes[55][3] = VariableFactory.bounded("realizarcontroldecostosriesgos", 0, 0, solver);

featureAttributes[56][0] = VariableFactory.bounded("administraciondepedidosydespachoscostos", 0, 0, solver);
featureAttributes[56][1] = VariableFactory.bounded("administraciondepedidosydespachostiempo", 0, 0, solver);
featureAttributes[56][2] = VariableFactory.bounded("administraciondepedidosydespachosrecursoshumanos", 0, 0, solver);
featureAttributes[56][3] = VariableFactory.bounded("administraciondepedidosydespachosriesgos", 0, 0, solver);

featureAttributes[57][0] = VariableFactory.bounded("gestiondecontactoscostos", 0, 0, solver);
featureAttributes[57][1] = VariableFactory.bounded("gestiondecontactostiempo", 0, 0, solver);
featureAttributes[57][2] = VariableFactory.bounded("gestiondecontactosrecursoshumanos", 0, 0, solver);
featureAttributes[57][3] = VariableFactory.bounded("gestiondecontactosriesgos", 0, 0, solver);

featureAttributes[58][0] = VariableFactory.bounded("ajustarprocesosdeflujodetrabajocostos", 0, 0, solver);
featureAttributes[58][1] = VariableFactory.bounded("ajustarprocesosdeflujodetrabajotiempo", 0, 0, solver);
featureAttributes[58][2] = VariableFactory.bounded("ajustarprocesosdeflujodetrabajorecursoshumanos", 0, 0, solver);
featureAttributes[58][3] = VariableFactory.bounded("ajustarprocesosdeflujodetrabajoriesgos", 0, 0, solver);

featureAttributes[59][0] = VariableFactory.bounded("mejorarcapacidadderespuestacostos", 0, 0, solver);
featureAttributes[59][1] = VariableFactory.bounded("mejorarcapacidadderespuestatiempo", 0, 0, solver);
featureAttributes[59][2] = VariableFactory.bounded("mejorarcapacidadderespuestarecursoshumanos", 0, 0, solver);
featureAttributes[59][3] = VariableFactory.bounded("mejorarcapacidadderespuestariesgos", 0, 0, solver);

featureAttributes[60][0] = VariableFactory.bounded("gestionarpresupuestoscostos", 0, 0, solver);
featureAttributes[60][1] = VariableFactory.bounded("gestionarpresupuestostiempo", 0, 0, solver);
featureAttributes[60][2] = VariableFactory.bounded("gestionarpresupuestosrecursoshumanos", 0, 0, solver);
featureAttributes[60][3] = VariableFactory.bounded("gestionarpresupuestosriesgos", 0, 0, solver);

featureAttributes[61][0] = VariableFactory.bounded("crearyconsolidarinformescostos", 0, 0, solver);
featureAttributes[61][1] = VariableFactory.bounded("crearyconsolidarinformestiempo", 0, 0, solver);
featureAttributes[61][2] = VariableFactory.bounded("crearyconsolidarinformesrecursoshumanos", 0, 0, solver);
featureAttributes[61][3] = VariableFactory.bounded("crearyconsolidarinformesriesgos", 0, 0, solver);

featureAttributes[62][0] = VariableFactory.bounded("buscartendenciasyrelacionescostos", 0, 0, solver);
featureAttributes[62][1] = VariableFactory.bounded("buscartendenciasyrelacionestiempo", 0, 0, solver);
featureAttributes[62][2] = VariableFactory.bounded("buscartendenciasyrelacionesrecursoshumanos", 0, 0, solver);
featureAttributes[62][3] = VariableFactory.bounded("buscartendenciasyrelacionesriesgos", 0, 0, solver);

featureAttributes[63][0] = VariableFactory.bounded("compartirconocimientocostos", 0, 0, solver);
featureAttributes[63][1] = VariableFactory.bounded("compartirconocimientotiempo", 0, 0, solver);
featureAttributes[63][2] = VariableFactory.bounded("compartirconocimientorecursoshumanos", 0, 0, solver);
featureAttributes[63][3] = VariableFactory.bounded("compartirconocimientoriesgos", 0, 0, solver);

featureAttributes[64][0] = VariableFactory.bounded("organizarrecursosdeserviciocostos", 0, 0, solver);
featureAttributes[64][1] = VariableFactory.bounded("organizarrecursosdeserviciotiempo", 0, 0, solver);
featureAttributes[64][2] = VariableFactory.bounded("organizarrecursosdeserviciorecursoshumanos", 0, 0, solver);
featureAttributes[64][3] = VariableFactory.bounded("organizarrecursosdeservicioriesgos", 0, 0, solver);

featureAttributes[65][0] = VariableFactory.bounded("facturacionydevolucioncostos", 0, 0, solver);
featureAttributes[65][1] = VariableFactory.bounded("facturacionydevoluciontiempo", 0, 0, solver);
featureAttributes[65][2] = VariableFactory.bounded("facturacionydevolucionrecursoshumanos", 0, 0, solver);
featureAttributes[65][3] = VariableFactory.bounded("facturacionydevolucionriesgos", 0, 0, solver);

featureAttributes[66][0] = VariableFactory.bounded("carteracostos", 0, 0, solver);
featureAttributes[66][1] = VariableFactory.bounded("carteratiempo", 0, 0, solver);
featureAttributes[66][2] = VariableFactory.bounded("carterarecursoshumanos", 0, 0, solver);
featureAttributes[66][3] = VariableFactory.bounded("carterariesgos", 0, 0, solver);

featureAttributes[67][0] = VariableFactory.bounded("administraciondepreciosydescuentoscostos", 0, 0, solver);
featureAttributes[67][1] = VariableFactory.bounded("administraciondepreciosydescuentostiempo", 0, 0, solver);
featureAttributes[67][2] = VariableFactory.bounded("administraciondepreciosydescuentosrecursoshumanos", 0, 0, solver);
featureAttributes[67][3] = VariableFactory.bounded("administraciondepreciosydescuentosriesgos", 0, 0, solver);

featureAttributes[68][0] = VariableFactory.bounded("administraciondepromocionescostos", 0, 0, solver);
featureAttributes[68][1] = VariableFactory.bounded("administraciondepromocionestiempo", 0, 0, solver);
featureAttributes[68][2] = VariableFactory.bounded("administraciondepromocionesrecursoshumanos", 0, 0, solver);
featureAttributes[68][3] = VariableFactory.bounded("administraciondepromocionesriesgos", 0, 0, solver);

featureAttributes[69][0] = VariableFactory.bounded("administraciondecuotaseincentivoscostos", 0, 0, solver);
featureAttributes[69][1] = VariableFactory.bounded("administraciondecuotaseincentivostiempo", 0, 0, solver);
featureAttributes[69][2] = VariableFactory.bounded("administraciondecuotaseincentivosrecursoshumanos", 0, 0, solver);
featureAttributes[69][3] = VariableFactory.bounded("administraciondecuotaseincentivosriesgos", 0, 0, solver);

featureAttributes[70][0] = VariableFactory.bounded("administraciondevisitacomercialcostos", 0, 0, solver);
featureAttributes[70][1] = VariableFactory.bounded("administraciondevisitacomercialtiempo", 0, 0, solver);
featureAttributes[70][2] = VariableFactory.bounded("administraciondevisitacomercialrecursoshumanos", 0, 0, solver);
featureAttributes[70][3] = VariableFactory.bounded("administraciondevisitacomercialriesgos", 0, 0, solver);

featureAttributes[71][0] = VariableFactory.bounded("importacionesyexportacionescostos", 0, 0, solver);
featureAttributes[71][1] = VariableFactory.bounded("importacionesyexportacionestiempo", 0, 0, solver);
featureAttributes[71][2] = VariableFactory.bounded("importacionesyexportacionesrecursoshumanos", 0, 0, solver);
featureAttributes[71][3] = VariableFactory.bounded("importacionesyexportacionesriesgos", 0, 0, solver);

featureAttributes[72][0] = VariableFactory.bounded("gestionarcontratosdeserviciocostos", 0, 0, solver);
featureAttributes[72][1] = VariableFactory.bounded("gestionarcontratosdeserviciotiempo", 0, 0, solver);
featureAttributes[72][2] = VariableFactory.bounded("gestionarcontratosdeserviciorecursoshumanos", 0, 0, solver);
featureAttributes[72][3] = VariableFactory.bounded("gestionarcontratosdeservicioriesgos", 0, 0, solver);

featureAttributes[73][0] = VariableFactory.bounded("presupuestarcostosytiemposcostos", 0, 0, solver);
featureAttributes[73][1] = VariableFactory.bounded("presupuestarcostosytiempostiempo", 0, 0, solver);
featureAttributes[73][2] = VariableFactory.bounded("presupuestarcostosytiemposrecursoshumanos", 0, 0, solver);
featureAttributes[73][3] = VariableFactory.bounded("presupuestarcostosytiemposriesgos", 0, 0, solver);

featureAttributes[74][0] = VariableFactory.bounded("automatizarlafacturacioncostos", 0, 0, solver);
featureAttributes[74][1] = VariableFactory.bounded("automatizarlafacturaciontiempo", 0, 0, solver);
featureAttributes[74][2] = VariableFactory.bounded("automatizarlafacturacionrecursoshumanos", 0, 0, solver);
featureAttributes[74][3] = VariableFactory.bounded("automatizarlafacturacionriesgos", 0, 0, solver);

featureAttributes[75][0] = VariableFactory.bounded("predecirdisponibilidadescostos", 0, 0, solver);
featureAttributes[75][1] = VariableFactory.bounded("predecirdisponibilidadestiempo", 0, 0, solver);
featureAttributes[75][2] = VariableFactory.bounded("predecirdisponibilidadesrecursoshumanos", 0, 0, solver);
featureAttributes[75][3] = VariableFactory.bounded("predecirdisponibilidadesriesgos", 0, 0, solver);

featureAttributes[76][0] = VariableFactory.bounded("seguimientodecostosyconsumoscostos", 0, 0, solver);
featureAttributes[76][1] = VariableFactory.bounded("seguimientodecostosyconsumostiempo", 0, 0, solver);
featureAttributes[76][2] = VariableFactory.bounded("seguimientodecostosyconsumosrecursoshumanos", 0, 0, solver);
featureAttributes[76][3] = VariableFactory.bounded("seguimientodecostosyconsumosriesgos", 0, 0, solver);

featureAttributes[77][0] = VariableFactory.bounded("planificarcapacidadescostos", 0, 0, solver);
featureAttributes[77][1] = VariableFactory.bounded("planificarcapacidadestiempo", 0, 0, solver);
featureAttributes[77][2] = VariableFactory.bounded("planificarcapacidadesrecursoshumanos", 0, 0, solver);
featureAttributes[77][3] = VariableFactory.bounded("planificarcapacidadesriesgos", 0, 0, solver);

featureAttributes[78][0] = VariableFactory.bounded("planearygestionarcapacidaddebodegajeyalmacenamientocostos", 0, 0, solver);
featureAttributes[78][1] = VariableFactory.bounded("planearygestionarcapacidaddebodegajeyalmacenamientotiempo", 0, 0, solver);
featureAttributes[78][2] = VariableFactory.bounded("planearygestionarcapacidaddebodegajeyalmacenamientorecursoshumanos", 0, 0, solver);
featureAttributes[78][3] = VariableFactory.bounded("planearygestionarcapacidaddebodegajeyalmacenamientoriesgos", 0, 0, solver);

featureAttributes[79][0] = VariableFactory.bounded("gestiondetransportedemercanciacostos", 0, 0, solver);
featureAttributes[79][1] = VariableFactory.bounded("gestiondetransportedemercanciatiempo", 0, 0, solver);
featureAttributes[79][2] = VariableFactory.bounded("gestiondetransportedemercanciarecursoshumanos", 0, 0, solver);
featureAttributes[79][3] = VariableFactory.bounded("gestiondetransportedemercanciariesgos", 0, 0, solver);

featureAttributes[80][0] = VariableFactory.bounded("logisticadetransporteinternacionalcostos", 0, 0, solver);
featureAttributes[80][1] = VariableFactory.bounded("logisticadetransporteinternacionaltiempo", 0, 0, solver);
featureAttributes[80][2] = VariableFactory.bounded("logisticadetransporteinternacionalrecursoshumanos", 0, 0, solver);
featureAttributes[80][3] = VariableFactory.bounded("logisticadetransporteinternacionalriesgos", 0, 0, solver);

featureAttributes[81][0] = VariableFactory.bounded("gestionderelacionconproveedorescostos", 0, 0, solver);
featureAttributes[81][1] = VariableFactory.bounded("gestionderelacionconproveedorestiempo", 0, 0, solver);
featureAttributes[81][2] = VariableFactory.bounded("gestionderelacionconproveedoresrecursoshumanos", 0, 0, solver);
featureAttributes[81][3] = VariableFactory.bounded("gestionderelacionconproveedoresriesgos", 0, 0, solver);

featureAttributes[82][0] = VariableFactory.bounded("gestiondelademandacostos", 0, 0, solver);
featureAttributes[82][1] = VariableFactory.bounded("gestiondelademandatiempo", 0, 0, solver);
featureAttributes[82][2] = VariableFactory.bounded("gestiondelademandarecursoshumanos", 0, 0, solver);
featureAttributes[82][3] = VariableFactory.bounded("gestiondelademandariesgos", 0, 0, solver);

featureAttributes[83][0] = VariableFactory.bounded("crm_modulomarketingcostos", 0, 0, solver);
featureAttributes[83][1] = VariableFactory.bounded("crm_modulomarketingtiempo", 0, 0, solver);
featureAttributes[83][2] = VariableFactory.bounded("crm_modulomarketingrecursoshumanos", 0, 0, solver);
featureAttributes[83][3] = VariableFactory.bounded("crm_modulomarketingriesgos", 0, 0, solver);

featureAttributes[84][0] = VariableFactory.bounded("crm_moduloventascostos", 0, 0, solver);
featureAttributes[84][1] = VariableFactory.bounded("crm_moduloventastiempo", 0, 0, solver);
featureAttributes[84][2] = VariableFactory.bounded("crm_moduloventasrecursoshumanos", 0, 0, solver);
featureAttributes[84][3] = VariableFactory.bounded("crm_moduloventasriesgos", 0, 0, solver);

featureAttributes[85][0] = VariableFactory.bounded("crm_modulodeclientescostos", 0, 0, solver);
featureAttributes[85][1] = VariableFactory.bounded("crm_modulodeclientestiempo", 0, 0, solver);
featureAttributes[85][2] = VariableFactory.bounded("crm_modulodeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[85][3] = VariableFactory.bounded("crm_modulodeclientesriesgos", 0, 0, solver);

featureAttributes[86][0] = VariableFactory.bounded("erp_modulorecursoshumanoscostos", 0, 0, solver);
featureAttributes[86][1] = VariableFactory.bounded("erp_modulorecursoshumanostiempo", 0, 0, solver);
featureAttributes[86][2] = VariableFactory.bounded("erp_modulorecursoshumanosrecursoshumanos", 0, 0, solver);
featureAttributes[86][3] = VariableFactory.bounded("erp_modulorecursoshumanosriesgos", 0, 0, solver);

featureAttributes[87][0] = VariableFactory.bounded("erp_modulofinancierocostos", 0, 0, solver);
featureAttributes[87][1] = VariableFactory.bounded("erp_modulofinancierotiempo", 0, 0, solver);
featureAttributes[87][2] = VariableFactory.bounded("erp_modulofinancierorecursoshumanos", 0, 0, solver);
featureAttributes[87][3] = VariableFactory.bounded("erp_modulofinancieroriesgos", 0, 0, solver);

featureAttributes[88][0] = VariableFactory.bounded("erp_moduloadministrativocostos", 0, 0, solver);
featureAttributes[88][1] = VariableFactory.bounded("erp_moduloadministrativotiempo", 0, 0, solver);
featureAttributes[88][2] = VariableFactory.bounded("erp_moduloadministrativorecursoshumanos", 0, 0, solver);
featureAttributes[88][3] = VariableFactory.bounded("erp_moduloadministrativoriesgos", 0, 0, solver);

featureAttributes[89][0] = VariableFactory.bounded("erp_modulodeproduccioncostos", 0, 0, solver);
featureAttributes[89][1] = VariableFactory.bounded("erp_modulodeproducciontiempo", 0, 0, solver);
featureAttributes[89][2] = VariableFactory.bounded("erp_modulodeproduccionrecursoshumanos", 0, 0, solver);
featureAttributes[89][3] = VariableFactory.bounded("erp_modulodeproduccionriesgos", 0, 0, solver);

featureAttributes[90][0] = VariableFactory.bounded("erp_modulodeclientescostos", 0, 0, solver);
featureAttributes[90][1] = VariableFactory.bounded("erp_modulodeclientestiempo", 0, 0, solver);
featureAttributes[90][2] = VariableFactory.bounded("erp_modulodeclientesrecursoshumanos", 0, 0, solver);
featureAttributes[90][3] = VariableFactory.bounded("erp_modulodeclientesriesgos", 0, 0, solver);

featureAttributes[91][0] = VariableFactory.bounded("erp_modulodegestiondeabastecimientocostos", 0, 0, solver);
featureAttributes[91][1] = VariableFactory.bounded("erp_modulodegestiondeabastecimientotiempo", 0, 0, solver);
featureAttributes[91][2] = VariableFactory.bounded("erp_modulodegestiondeabastecimientorecursoshumanos", 0, 0, solver);
featureAttributes[91][3] = VariableFactory.bounded("erp_modulodegestiondeabastecimientoriesgos", 0, 0, solver);

featureAttributes[92][0] = VariableFactory.bounded("erp_modulodeinteligenciadenegociocostos", 0, 0, solver);
featureAttributes[92][1] = VariableFactory.bounded("erp_modulodeinteligenciadenegociotiempo", 0, 0, solver);
featureAttributes[92][2] = VariableFactory.bounded("erp_modulodeinteligenciadenegociorecursoshumanos", 0, 0, solver);
featureAttributes[92][3] = VariableFactory.bounded("erp_modulodeinteligenciadenegocioriesgos", 0, 0, solver);

featureAttributes[93][0] = VariableFactory.bounded("erp_marketingyventascostos", 0, 0, solver);
featureAttributes[93][1] = VariableFactory.bounded("erp_marketingyventastiempo", 0, 0, solver);
featureAttributes[93][2] = VariableFactory.bounded("erp_marketingyventasrecursoshumanos", 0, 0, solver);
featureAttributes[93][3] = VariableFactory.bounded("erp_marketingyventasriesgos", 0, 0, solver);

featureAttributes[94][0] = VariableFactory.bounded("erp_modulodegestiondeproyectoscostos", 0, 0, solver);
featureAttributes[94][1] = VariableFactory.bounded("erp_modulodegestiondeproyectostiempo", 0, 0, solver);
featureAttributes[94][2] = VariableFactory.bounded("erp_modulodegestiondeproyectosrecursoshumanos", 0, 0, solver);
featureAttributes[94][3] = VariableFactory.bounded("erp_modulodegestiondeproyectosriesgos", 0, 0, solver);

featureAttributes[95][0] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientocostos", 0, 0, solver);
featureAttributes[95][1] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientotiempo", 0, 0, solver);
featureAttributes[95][2] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientorecursoshumanos", 0, 0, solver);
featureAttributes[95][3] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientoriesgos", 0, 0, solver);

featureAttributes[96][0] = VariableFactory.bounded("adquirirsistemanuevocostos", 0, 0, solver);
featureAttributes[96][1] = VariableFactory.bounded("adquirirsistemanuevotiempo", 0, 0, solver);
featureAttributes[96][2] = VariableFactory.bounded("adquirirsistemanuevorecursoshumanos", 0, 3, solver);
featureAttributes[96][3] = VariableFactory.bounded("adquirirsistemanuevoriesgos", 0, 109, solver);

featureAttributes[97][0] = VariableFactory.bounded("adaptarsistemaexistentecostos", 0, 0, solver);
featureAttributes[97][1] = VariableFactory.bounded("adaptarsistemaexistentetiempo", 0, 0, solver);
featureAttributes[97][2] = VariableFactory.bounded("adaptarsistemaexistenterecursoshumanos", 0, 2, solver);
featureAttributes[97][3] = VariableFactory.bounded("adaptarsistemaexistenteriesgos", 0, 74, solver);

featureAttributes[98][0] = VariableFactory.bounded("subcontratarpersonalizacioncostos", 0, 200000, solver);
featureAttributes[98][1] = VariableFactory.bounded("subcontratarpersonalizaciontiempo", 0, 0, solver);
featureAttributes[98][2] = VariableFactory.bounded("subcontratarpersonalizacionrecursoshumanos", 0, 10, solver);
featureAttributes[98][3] = VariableFactory.bounded("subcontratarpersonalizacionriesgos", 0, 113, solver);

featureAttributes[99][0] = VariableFactory.bounded("subcontratarpartedeldesarrolloeintegracioncostos", 0, 300000, solver);
featureAttributes[99][1] = VariableFactory.bounded("subcontratarpartedeldesarrolloeintegraciontiempo", 0, 0, solver);
featureAttributes[99][2] = VariableFactory.bounded("subcontratarpartedeldesarrolloeintegracionrecursoshumanos", 0, 5, solver);
featureAttributes[99][3] = VariableFactory.bounded("subcontratarpartedeldesarrolloeintegracionriesgos", 0, 113, solver);

featureAttributes[100][0] = VariableFactory.bounded("subcontratarlaadministraciondeunprocesodenegociocompletocostos", 0, 200000, solver);
featureAttributes[100][1] = VariableFactory.bounded("subcontratarlaadministraciondeunprocesodenegociocompletotiempo", 0, 0, solver);
featureAttributes[100][2] = VariableFactory.bounded("subcontratarlaadministraciondeunprocesodenegociocompletorecursoshumanos", 0, 7, solver);
featureAttributes[100][3] = VariableFactory.bounded("subcontratarlaadministraciondeunprocesodenegociocompletoriesgos", 0, 113, solver);

featureAttributes[101][0] = VariableFactory.bounded("subcontratargerenciadelproyectodeimplementacioncostos", 0, 150000, solver);
featureAttributes[101][1] = VariableFactory.bounded("subcontratargerenciadelproyectodeimplementaciontiempo", 0, 0, solver);
featureAttributes[101][2] = VariableFactory.bounded("subcontratargerenciadelproyectodeimplementacionrecursoshumanos", 0, 5, solver);
featureAttributes[101][3] = VariableFactory.bounded("subcontratargerenciadelproyectodeimplementacionriesgos", 0, 96, solver);

featureAttributes[102][0] = VariableFactory.bounded("comercialcostos", 0, 710750, solver);
featureAttributes[102][1] = VariableFactory.bounded("comercialtiempo", 0, 36, solver);
featureAttributes[102][2] = VariableFactory.bounded("comercialrecursoshumanos", 0, 0, solver);
featureAttributes[102][3] = VariableFactory.bounded("comercialriesgos", 0, 64, solver);

featureAttributes[103][0] = VariableFactory.bounded("opensourcecostos", 0, 286000, solver);
featureAttributes[103][1] = VariableFactory.bounded("opensourcetiempo", 0, 36, solver);
featureAttributes[103][2] = VariableFactory.bounded("opensourcerecursoshumanos", 0, 0, solver);
featureAttributes[103][3] = VariableFactory.bounded("opensourceriesgos", 0, 126, solver);

featureAttributes[104][0] = VariableFactory.bounded("onpremisecostos", 0, 660000, solver);
featureAttributes[104][1] = VariableFactory.bounded("onpremisetiempo", 0, 0, solver);
featureAttributes[104][2] = VariableFactory.bounded("onpremiserecursoshumanos", 0, 0, solver);
featureAttributes[104][3] = VariableFactory.bounded("onpremiseriesgos", 0, 130, solver);

featureAttributes[105][0] = VariableFactory.bounded("softwarecomoserviciosaascostos", 0, 2000, solver);
featureAttributes[105][1] = VariableFactory.bounded("softwarecomoserviciosaastiempo", 0, 0, solver);
featureAttributes[105][2] = VariableFactory.bounded("softwarecomoserviciosaasrecursoshumanos", 0, 0, solver);
featureAttributes[105][3] = VariableFactory.bounded("softwarecomoserviciosaasriesgos", 0, 251, solver);

featureAttributes[106][0] = VariableFactory.bounded("infraestructuracomoservicioiaascostos", 0, 400, solver);
featureAttributes[106][1] = VariableFactory.bounded("infraestructuracomoservicioiaastiempo", 0, 0, solver);
featureAttributes[106][2] = VariableFactory.bounded("infraestructuracomoservicioiaasrecursoshumanos", 0, 0, solver);
featureAttributes[106][3] = VariableFactory.bounded("infraestructuracomoservicioiaasriesgos", 0, 166, solver);

featureAttributes[107][0] = VariableFactory.bounded("bigbangcostos", 0, 0, solver);
featureAttributes[107][1] = VariableFactory.bounded("bigbangtiempo", 0, 0, solver);
featureAttributes[107][2] = VariableFactory.bounded("bigbangrecursoshumanos", 0, 0, solver);
featureAttributes[107][3] = VariableFactory.bounded("bigbangriesgos", 0, 55, solver);

featureAttributes[108][0] = VariableFactory.bounded("implementacionporfasescostos", 0, 0, solver);
featureAttributes[108][1] = VariableFactory.bounded("implementacionporfasestiempo", 0, 0, solver);
featureAttributes[108][2] = VariableFactory.bounded("implementacionporfasesrecursoshumanos", 0, 0, solver);
featureAttributes[108][3] = VariableFactory.bounded("implementacionporfasesriesgos", 0, 110, solver);

featureAttributes[109][0] = VariableFactory.bounded("implementacionporprocesoscostos", 0, 0, solver);
featureAttributes[109][1] = VariableFactory.bounded("implementacionporprocesostiempo", 0, 0, solver);
featureAttributes[109][2] = VariableFactory.bounded("implementacionporprocesosrecursoshumanos", 0, 0, solver);
featureAttributes[109][3] = VariableFactory.bounded("implementacionporprocesosriesgos", 0, 65, solver);

featureAttributes[110][0] = VariableFactory.bounded("contratoconelproveedorcostos", 0, 800, solver);
featureAttributes[110][1] = VariableFactory.bounded("contratoconelproveedortiempo", 0, 0, solver);
featureAttributes[110][2] = VariableFactory.bounded("contratoconelproveedorrecursoshumanos", 0, 0, solver);
featureAttributes[110][3] = VariableFactory.bounded("contratoconelproveedorriesgos", 0, 26, solver);

featureAttributes[111][0] = VariableFactory.bounded("contratoconunproveedorespecializadocostos", 0, 950, solver);
featureAttributes[111][1] = VariableFactory.bounded("contratoconunproveedorespecializadotiempo", 0, 0, solver);
featureAttributes[111][2] = VariableFactory.bounded("contratoconunproveedorespecializadorecursoshumanos", 0, 0, solver);
featureAttributes[111][3] = VariableFactory.bounded("contratoconunproveedorespecializadoriesgos", 0, 59, solver);

featureAttributes[112][0] = VariableFactory.bounded("mantenimientoporcuentapropiacostos", 0, 500, solver);
featureAttributes[112][1] = VariableFactory.bounded("mantenimientoporcuentapropiatiempo", 0, 0, solver);
featureAttributes[112][2] = VariableFactory.bounded("mantenimientoporcuentapropiarecursoshumanos", 0, 0, solver);
featureAttributes[112][3] = VariableFactory.bounded("mantenimientoporcuentapropiariesgos", 0, 27, solver);

featureAttributes[113][0] = VariableFactory.bounded("sincontratodemantenimientocostos", 0, 0, solver);
featureAttributes[113][1] = VariableFactory.bounded("sincontratodemantenimientotiempo", 0, 0, solver);
featureAttributes[113][2] = VariableFactory.bounded("sincontratodemantenimientorecursoshumanos", 0, 0, solver);
featureAttributes[113][3] = VariableFactory.bounded("sincontratodemantenimientoriesgos", 0, 82, solver);

featureAttributes[114][0] = VariableFactory.bounded("rfp_requestforproposalcostos", 0, 300, solver);
featureAttributes[114][1] = VariableFactory.bounded("rfp_requestforproposaltiempo", 0, 0, solver);
featureAttributes[114][2] = VariableFactory.bounded("rfp_requestforproposalrecursoshumanos", 0, 0, solver);
featureAttributes[114][3] = VariableFactory.bounded("rfp_requestforproposalriesgos", 0, 8, solver);

featureAttributes[115][0] = VariableFactory.bounded("consultoriaexternacostos", 0, 100000, solver);
featureAttributes[115][1] = VariableFactory.bounded("consultoriaexternatiempo", 0, 0, solver);
featureAttributes[115][2] = VariableFactory.bounded("consultoriaexternarecursoshumanos", 0, 0, solver);
featureAttributes[115][3] = VariableFactory.bounded("consultoriaexternariesgos", 0, 11, solver);

featureAttributes[116][0] = VariableFactory.bounded("evaluacioninternacostos", 0, 500, solver);
featureAttributes[116][1] = VariableFactory.bounded("evaluacioninternatiempo", 0, 0, solver);
featureAttributes[116][2] = VariableFactory.bounded("evaluacioninternarecursoshumanos", 0, 0, solver);
featureAttributes[116][3] = VariableFactory.bounded("evaluacioninternariesgos", 0, 34, solver);

featureAttributes[117][0] = VariableFactory.bounded("sistemaempresarialbasadoenlamismaplataformatecnologicacostos", 0, 0, solver);
featureAttributes[117][1] = VariableFactory.bounded("sistemaempresarialbasadoenlamismaplataformatecnologicatiempo", 0, 0, solver);
featureAttributes[117][2] = VariableFactory.bounded("sistemaempresarialbasadoenlamismaplataformatecnologicarecursoshumanos", 0, 0, solver);
featureAttributes[117][3] = VariableFactory.bounded("sistemaempresarialbasadoenlamismaplataformatecnologicariesgos", 0, 0, solver);

featureAttributes[118][0] = VariableFactory.bounded("sistemaempresarialbasadoenunaplataformadiferentecostos", 0, 0, solver);
featureAttributes[118][1] = VariableFactory.bounded("sistemaempresarialbasadoenunaplataformadiferentetiempo", 0, 0, solver);
featureAttributes[118][2] = VariableFactory.bounded("sistemaempresarialbasadoenunaplataformadiferenterecursoshumanos", 0, 0, solver);
featureAttributes[118][3] = VariableFactory.bounded("sistemaempresarialbasadoenunaplataformadiferenteriesgos", 0, 0, solver);

featureAttributes[119][0] = VariableFactory.bounded("middlewarecostos", 0, 16850, solver);
featureAttributes[119][1] = VariableFactory.bounded("middlewaretiempo", 0, 0, solver);
featureAttributes[119][2] = VariableFactory.bounded("middlewarerecursoshumanos", 0, 0, solver);
featureAttributes[119][3] = VariableFactory.bounded("middlewareriesgos", 0, 21, solver);

featureAttributes[120][0] = VariableFactory.bounded("desarrollopropiocostos", 0, 500, solver);
featureAttributes[120][1] = VariableFactory.bounded("desarrollopropiotiempo", 0, 0, solver);
featureAttributes[120][2] = VariableFactory.bounded("desarrollopropiorecursoshumanos", 0, 0, solver);
featureAttributes[120][3] = VariableFactory.bounded("desarrollopropioriesgos", 0, 51, solver);

featureAttributes[121][0] = VariableFactory.bounded("proveedorcostos", 0, 500, solver);
featureAttributes[121][1] = VariableFactory.bounded("proveedortiempo", 0, 0, solver);
featureAttributes[121][2] = VariableFactory.bounded("proveedorrecursoshumanos", 0, 0, solver);
featureAttributes[121][3] = VariableFactory.bounded("proveedorriesgos", 0, 92, solver);

featureAttributes[122][0] = VariableFactory.bounded("recursospropioscostos", 0, 0, solver);
featureAttributes[122][1] = VariableFactory.bounded("recursospropiostiempo", 0, 0, solver);
featureAttributes[122][2] = VariableFactory.bounded("recursospropiosrecursoshumanos", 0, 0, solver);
featureAttributes[122][3] = VariableFactory.bounded("recursospropiosriesgos", 0, 12, solver);

featureAttributes[123][0] = VariableFactory.bounded("creditocostos", 0, 0, solver);
featureAttributes[123][1] = VariableFactory.bounded("creditotiempo", 0, 0, solver);
featureAttributes[123][2] = VariableFactory.bounded("creditorecursoshumanos", 0, 0, solver);
featureAttributes[123][3] = VariableFactory.bounded("creditoriesgos", 0, 36, solver);

featureAttributes[124][0] = VariableFactory.bounded("leasingcostos", 0, 0, solver);
featureAttributes[124][1] = VariableFactory.bounded("leasingtiempo", 0, 0, solver);
featureAttributes[124][2] = VariableFactory.bounded("leasingrecursoshumanos", 0, 0, solver);
featureAttributes[124][3] = VariableFactory.bounded("leasingriesgos", 0, 23, solver);


// FEATURE MODEL CONSTRAINTS (Constraints
// Or constraints
BoolVar[] varsOr0 = new BoolVar[83];
varsOr0[0] = segmentarydepurarclientes;
varsOr0[1] = planificacionypresupuestosdemercadeo;
varsOr0[2] = gestiondedatosylistas;
varsOr0[3] = analisisdemarketing;
varsOr0[4] = gestiondecampanias;
varsOr0[5] = facilitartareasdemercadeoypublicidad;
varsOr0[6] = gestionderespuestasyclientespotenciales;
varsOr0[7] = reducirciclosdeventas;
varsOr0[8] = aumentartasasdecierredeventas;
varsOr0[9] = mejorarretenciondeclientes;
varsOr0[10] = implementarnuevoprocesodeventas;
varsOr0[11] = gestionarinformaciondeclientes;
varsOr0[12] = gestiondecasosdeclientes;
varsOr0[13] = historialdeserviciosdeclientes;
varsOr0[14] = aumentarbasedeclientes;
varsOr0[15] = implementarnuevoprocesodeatencionalcliente;
varsOr0[16] = mejorarconocimientodelcliente;
varsOr0[17] = medirsatisfacciondelconsumidor;
varsOr0[18] = controlsobrerecursoshumanos;
varsOr0[19] = nuevosprocesosderecursoshumanos;
varsOr0[20] = reclutamiento;
varsOr0[21] = biodata_hojasdevida;
varsOr0[22] = analisisdecargos_estructuraorganizacional;
varsOr0[23] = nominayadministraciondesalarios;
varsOr0[24] = educacionycapacitacion;
varsOr0[25] = saludocupacional;
varsOr0[26] = modelamientodeprocesosyorganigramas;
varsOr0[27] = nuevosprocesosfinancieros;
varsOr0[28] = implementarcontrolessobreprocesosfinancieros;
varsOr0[29] = gestioncontable;
varsOr0[30] = manejodecuentasporpagar_proveedores;
varsOr0[31] = sistemasdecosteo;
varsOr0[32] = administraciondeactivosfijos;
varsOr0[33] = manejodeconciliacionesbancarias;
varsOr0[34] = controldeinversiones;
varsOr0[35] = manejodeobligacionesfinancieras;
varsOr0[36] = tesoreria;
varsOr0[37] = contabilidadanalitica;
varsOr0[38] = controlyadministraciondelpresupuesto;
varsOr0[39] = manejodeactivosdecapital;
varsOr0[40] = manejodeinventarios;
varsOr0[41] = manejodealmacen;
varsOr0[42] = gestiondecompras;
varsOr0[43] = gestiondeactivosfijos;
varsOr0[44] = comercioexterior;
varsOr0[45] = seguros;
varsOr0[46] = manejodeordenesdeproduccion;
varsOr0[47] = manejodeordenesdecompra;
varsOr0[48] = planificaciondenecesidadesdecapacidad;
varsOr0[49] = planificaciondesuministros;
varsOr0[50] = disminuirtiemposdeentrega;
varsOr0[51] = integracionconproveedores;
varsOr0[52] = gestiondeproveedores;
varsOr0[53] = administraciondemateriasprimas;
varsOr0[54] = gestiondebodega;
varsOr0[55] = realizarcontroldecostos;
varsOr0[56] = administraciondepedidosydespachos;
varsOr0[57] = gestiondecontactos;
varsOr0[58] = ajustarprocesosdeflujodetrabajo;
varsOr0[59] = mejorarcapacidadderespuesta;
varsOr0[60] = gestionarpresupuestos;
varsOr0[61] = crearyconsolidarinformes;
varsOr0[62] = buscartendenciasyrelaciones;
varsOr0[63] = compartirconocimiento;
varsOr0[64] = organizarrecursosdeservicio;
varsOr0[65] = facturacionydevolucion;
varsOr0[66] = cartera;
varsOr0[67] = administraciondepreciosydescuentos;
varsOr0[68] = administraciondepromociones;
varsOr0[69] = administraciondecuotaseincentivos;
varsOr0[70] = administraciondevisitacomercial;
varsOr0[71] = importacionesyexportaciones;
varsOr0[72] = gestionarcontratosdeservicio;
varsOr0[73] = presupuestarcostosytiempos;
varsOr0[74] = automatizarlafacturacion;
varsOr0[75] = predecirdisponibilidades;
varsOr0[76] = seguimientodecostosyconsumos;
varsOr0[77] = planificarcapacidades;
varsOr0[78] = planearygestionarcapacidaddebodegajeyalmacenamiento;
varsOr0[79] = gestiondetransportedemercancia;
varsOr0[80] = logisticadetransporteinternacional;
varsOr0[81] = gestionderelacionconproveedores;
varsOr0[82] = gestiondelademanda;
SatFactory.addClauses(LogOp.or(varsOr0), solver);

BoolVar[] varsOr1 = new BoolVar[3];
varsOr1[0] = crm_modulomarketing;
varsOr1[1] = crm_moduloventas;
varsOr1[2] = crm_modulodeclientes;
SatFactory.addClauses(LogOp.or(varsOr1), solver);


// Alternative constraints
BoolVar[] varsXor0 = new BoolVar[3];
varsXor0[0] = crm_customerrelationshipmanagement;
SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, LogOp.nor(erp_enterpriseresourceplanning)), solver);
SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, LogOp.nor(scm_sistemadegestiondeabastecimiento)), solver);
varsXor0[1] = erp_enterpriseresourceplanning;
SatFactory.addClauses(LogOp.implies(erp_enterpriseresourceplanning, LogOp.nor(scm_sistemadegestiondeabastecimiento)), solver);
varsXor0[2] = scm_sistemadegestiondeabastecimiento;
SatFactory.addClauses(LogOp.or(varsXor0), solver);

BoolVar[] varsXor1 = new BoolVar[2];
varsXor1[0] = adquirirsistemanuevo;
SatFactory.addClauses(LogOp.implies(adquirirsistemanuevo, LogOp.nor(adaptarsistemaexistente)), solver);
varsXor1[1] = adaptarsistemaexistente;
SatFactory.addClauses(LogOp.or(varsXor1), solver);

BoolVar[] varsXor2 = new BoolVar[4];
varsXor2[0] = subcontratarpersonalizacion;
SatFactory.addClauses(LogOp.implies(subcontratarpersonalizacion, LogOp.nor(subcontratarpartedeldesarrolloeintegracion)), solver);
SatFactory.addClauses(LogOp.implies(subcontratarpersonalizacion, LogOp.nor(subcontratarlaadministraciondeunprocesodenegociocompleto)), solver);
SatFactory.addClauses(LogOp.implies(subcontratarpersonalizacion, LogOp.nor(subcontratargerenciadelproyectodeimplementacion)), solver);
varsXor2[1] = subcontratarpartedeldesarrolloeintegracion;
SatFactory.addClauses(LogOp.implies(subcontratarpartedeldesarrolloeintegracion, LogOp.nor(subcontratarlaadministraciondeunprocesodenegociocompleto)), solver);
SatFactory.addClauses(LogOp.implies(subcontratarpartedeldesarrolloeintegracion, LogOp.nor(subcontratargerenciadelproyectodeimplementacion)), solver);
varsXor2[2] = subcontratarlaadministraciondeunprocesodenegociocompleto;
SatFactory.addClauses(LogOp.implies(subcontratarlaadministraciondeunprocesodenegociocompleto, LogOp.nor(subcontratargerenciadelproyectodeimplementacion)), solver);
varsXor2[3] = subcontratargerenciadelproyectodeimplementacion;
SatFactory.addClauses(LogOp.or(varsXor2), solver);

BoolVar[] varsXor3 = new BoolVar[2];
varsXor3[0] = comercial;
SatFactory.addClauses(LogOp.implies(comercial, LogOp.nor(opensource)), solver);
varsXor3[1] = opensource;
SatFactory.addClauses(LogOp.or(varsXor3), solver);

BoolVar[] varsXor4 = new BoolVar[3];
varsXor4[0] = onpremise;
SatFactory.addClauses(LogOp.implies(onpremise, LogOp.nor(softwarecomoserviciosaas)), solver);
SatFactory.addClauses(LogOp.implies(onpremise, LogOp.nor(infraestructuracomoservicioiaas)), solver);
varsXor4[1] = softwarecomoserviciosaas;
SatFactory.addClauses(LogOp.implies(softwarecomoserviciosaas, LogOp.nor(infraestructuracomoservicioiaas)), solver);
varsXor4[2] = infraestructuracomoservicioiaas;
SatFactory.addClauses(LogOp.or(varsXor4), solver);

BoolVar[] varsXor5 = new BoolVar[3];
varsXor5[0] = bigbang;
SatFactory.addClauses(LogOp.implies(bigbang, LogOp.nor(implementacionporfases)), solver);
SatFactory.addClauses(LogOp.implies(bigbang, LogOp.nor(implementacionporprocesos)), solver);
varsXor5[1] = implementacionporfases;
SatFactory.addClauses(LogOp.implies(implementacionporfases, LogOp.nor(implementacionporprocesos)), solver);
varsXor5[2] = implementacionporprocesos;
SatFactory.addClauses(LogOp.or(varsXor5), solver);

BoolVar[] varsXor6 = new BoolVar[4];
varsXor6[0] = contratoconelproveedor;
SatFactory.addClauses(LogOp.implies(contratoconelproveedor, LogOp.nor(contratoconunproveedorespecializado)), solver);
SatFactory.addClauses(LogOp.implies(contratoconelproveedor, LogOp.nor(mantenimientoporcuentapropia)), solver);
SatFactory.addClauses(LogOp.implies(contratoconelproveedor, LogOp.nor(sincontratodemantenimiento)), solver);
varsXor6[1] = contratoconunproveedorespecializado;
SatFactory.addClauses(LogOp.implies(contratoconunproveedorespecializado, LogOp.nor(mantenimientoporcuentapropia)), solver);
SatFactory.addClauses(LogOp.implies(contratoconunproveedorespecializado, LogOp.nor(sincontratodemantenimiento)), solver);
varsXor6[2] = mantenimientoporcuentapropia;
SatFactory.addClauses(LogOp.implies(mantenimientoporcuentapropia, LogOp.nor(sincontratodemantenimiento)), solver);
varsXor6[3] = sincontratodemantenimiento;
SatFactory.addClauses(LogOp.or(varsXor6), solver);

BoolVar[] varsXor7 = new BoolVar[3];
varsXor7[0] = rfp_requestforproposal;
SatFactory.addClauses(LogOp.implies(rfp_requestforproposal, LogOp.nor(consultoriaexterna)), solver);
SatFactory.addClauses(LogOp.implies(rfp_requestforproposal, LogOp.nor(evaluacioninterna)), solver);
varsXor7[1] = consultoriaexterna;
SatFactory.addClauses(LogOp.implies(consultoriaexterna, LogOp.nor(evaluacioninterna)), solver);
varsXor7[2] = evaluacioninterna;
SatFactory.addClauses(LogOp.or(varsXor7), solver);

BoolVar[] varsXor8 = new BoolVar[2];
varsXor8[0] = sistemaempresarialbasadoenlamismaplataformatecnologica;
SatFactory.addClauses(LogOp.implies(sistemaempresarialbasadoenlamismaplataformatecnologica, LogOp.nor(sistemaempresarialbasadoenunaplataformadiferente)), solver);
varsXor8[1] = sistemaempresarialbasadoenunaplataformadiferente;
SatFactory.addClauses(LogOp.or(varsXor8), solver);

BoolVar[] varsXor9 = new BoolVar[3];
varsXor9[0] = middleware;
SatFactory.addClauses(LogOp.implies(middleware, LogOp.nor(desarrollopropio)), solver);
SatFactory.addClauses(LogOp.implies(middleware, LogOp.nor(proveedor)), solver);
varsXor9[1] = desarrollopropio;
SatFactory.addClauses(LogOp.implies(desarrollopropio, LogOp.nor(proveedor)), solver);
varsXor9[2] = proveedor;
SatFactory.addClauses(LogOp.or(varsXor9), solver);

BoolVar[] varsXor10 = new BoolVar[3];
varsXor10[0] = recursospropios;
SatFactory.addClauses(LogOp.implies(recursospropios, LogOp.nor(credito)), solver);
SatFactory.addClauses(LogOp.implies(recursospropios, LogOp.nor(leasing)), solver);
varsXor10[1] = credito;
SatFactory.addClauses(LogOp.implies(credito, LogOp.nor(leasing)), solver);
varsXor10[2] = leasing;
SatFactory.addClauses(LogOp.or(varsXor10), solver);


// Require constraints
SatFactory.addClauses(LogOp.implies(LogOp.and(buscartendenciasyrelaciones, compartirconocimiento), erp_modulodeinteligenciadenegocio), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(segmentarydepurarclientes, analisisdemarketing, gestiondecampanias), crm_modulomarketing), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(reducirciclosdeventas, mejorarretenciondeclientes), crm_moduloventas), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(mejorarconocimientodelcliente), crm_modulodeclientes), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(implementarcontrolessobreprocesosfinancieros, controlyadministraciondelpresupuesto), erp_modulofinanciero), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(manejodeinventarios, manejodealmacen, gestiondecompras, comercioexterior), erp_moduloadministrativo), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(disminuirtiemposdeentrega, integracionconproveedores), erp_modulodeproduccion), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(gestiondelademanda), scm_sistemadegestiondeabastecimiento), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(gestiondecampanias), erp_marketingyventas), solver);
SatFactory.addClauses(LogOp.implies(LogOp.and(predecirdisponibilidades, planificarcapacidades), erp_modulodegestiondeproyectos), solver);


// Parent-children constraints
SatFactory.addClauses(LogOp.implies(motivadoresdenegocio, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0));
SatFactory.addClauses(LogOp.implies(sistemasempresariales, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(sistemasempresariales, "=", 0));
SatFactory.addClauses(LogOp.implies(nuevovsexistente, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(nuevovsexistente, "=", 0));
SatFactory.addClauses(LogOp.implies(tercerizacion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(tercerizacion, "=", 0));
SatFactory.addClauses(LogOp.implies(tipodesolucion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(tipodesolucion, "=", 0));
SatFactory.addClauses(LogOp.implies(modelodedespliegue, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(modelodedespliegue, "=", 0));
SatFactory.addClauses(LogOp.implies(modelodeimplementacion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(modelodeimplementacion, "=", 0));
SatFactory.addClauses(LogOp.implies(mantenimiento, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(mantenimiento, "=", 0));
SatFactory.addClauses(LogOp.implies(modelodeseleccion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(modelodeseleccion, "=", 0));
SatFactory.addClauses(LogOp.implies(plataforma, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(plataforma, "=", 0));
SatFactory.addClauses(LogOp.implies(integracion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(integracion, "=", 0));
SatFactory.addClauses(LogOp.implies(financiacion, inversionti), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(financiacion, "=", 0));

// Parent-children constraints
SatFactory.addClauses(LogOp.implies(segmentarydepurarclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(planificacionypresupuestosdemercadeo, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planificacionypresupuestosdemercadeo, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondedatosylistas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondedatosylistas, "=", 0));
SatFactory.addClauses(LogOp.implies(analisisdemarketing, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(analisisdemarketing, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondecampanias, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecampanias, "=", 0));
SatFactory.addClauses(LogOp.implies(facilitartareasdemercadeoypublicidad, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(facilitartareasdemercadeoypublicidad, "=", 0));
SatFactory.addClauses(LogOp.implies(gestionderespuestasyclientespotenciales, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestionderespuestasyclientespotenciales, "=", 0));
SatFactory.addClauses(LogOp.implies(reducirciclosdeventas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0));
SatFactory.addClauses(LogOp.implies(aumentartasasdecierredeventas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(aumentartasasdecierredeventas, "=", 0));
SatFactory.addClauses(LogOp.implies(mejorarretenciondeclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(implementarnuevoprocesodeventas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(implementarnuevoprocesodeventas, "=", 0));
SatFactory.addClauses(LogOp.implies(gestionarinformaciondeclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestionarinformaciondeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondecasosdeclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecasosdeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(historialdeserviciosdeclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(historialdeserviciosdeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(aumentarbasedeclientes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(aumentarbasedeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(implementarnuevoprocesodeatencionalcliente, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(implementarnuevoprocesodeatencionalcliente, "=", 0));
SatFactory.addClauses(LogOp.implies(mejorarconocimientodelcliente, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0));
SatFactory.addClauses(LogOp.implies(medirsatisfacciondelconsumidor, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(medirsatisfacciondelconsumidor, "=", 0));
SatFactory.addClauses(LogOp.implies(controlsobrerecursoshumanos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(controlsobrerecursoshumanos, "=", 0));
SatFactory.addClauses(LogOp.implies(nuevosprocesosderecursoshumanos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(nuevosprocesosderecursoshumanos, "=", 0));
SatFactory.addClauses(LogOp.implies(reclutamiento, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(reclutamiento, "=", 0));
SatFactory.addClauses(LogOp.implies(biodata_hojasdevida, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(biodata_hojasdevida, "=", 0));
SatFactory.addClauses(LogOp.implies(analisisdecargos_estructuraorganizacional, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(analisisdecargos_estructuraorganizacional, "=", 0));
SatFactory.addClauses(LogOp.implies(nominayadministraciondesalarios, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(nominayadministraciondesalarios, "=", 0));
SatFactory.addClauses(LogOp.implies(educacionycapacitacion, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(educacionycapacitacion, "=", 0));
SatFactory.addClauses(LogOp.implies(saludocupacional, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(saludocupacional, "=", 0));
SatFactory.addClauses(LogOp.implies(modelamientodeprocesosyorganigramas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(modelamientodeprocesosyorganigramas, "=", 0));
SatFactory.addClauses(LogOp.implies(nuevosprocesosfinancieros, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(nuevosprocesosfinancieros, "=", 0));
SatFactory.addClauses(LogOp.implies(implementarcontrolessobreprocesosfinancieros, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0));
SatFactory.addClauses(LogOp.implies(gestioncontable, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestioncontable, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodecuentasporpagar_proveedores, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodecuentasporpagar_proveedores, "=", 0));
SatFactory.addClauses(LogOp.implies(sistemasdecosteo, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(sistemasdecosteo, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondeactivosfijos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondeactivosfijos, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeconciliacionesbancarias, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeconciliacionesbancarias, "=", 0));
SatFactory.addClauses(LogOp.implies(controldeinversiones, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(controldeinversiones, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeobligacionesfinancieras, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeobligacionesfinancieras, "=", 0));
SatFactory.addClauses(LogOp.implies(tesoreria, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(tesoreria, "=", 0));
SatFactory.addClauses(LogOp.implies(contabilidadanalitica, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(contabilidadanalitica, "=", 0));
SatFactory.addClauses(LogOp.implies(controlyadministraciondelpresupuesto, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeactivosdecapital, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeactivosdecapital, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeinventarios, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeinventarios, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodealmacen, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodealmacen, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondecompras, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecompras, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondeactivosfijos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondeactivosfijos, "=", 0));
SatFactory.addClauses(LogOp.implies(comercioexterior, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(comercioexterior, "=", 0));
SatFactory.addClauses(LogOp.implies(seguros, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(seguros, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeordenesdeproduccion, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeordenesdeproduccion, "=", 0));
SatFactory.addClauses(LogOp.implies(manejodeordenesdecompra, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeordenesdecompra, "=", 0));
SatFactory.addClauses(LogOp.implies(planificaciondenecesidadesdecapacidad, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planificaciondenecesidadesdecapacidad, "=", 0));
SatFactory.addClauses(LogOp.implies(planificaciondesuministros, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planificaciondesuministros, "=", 0));
SatFactory.addClauses(LogOp.implies(disminuirtiemposdeentrega, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0));
SatFactory.addClauses(LogOp.implies(integracionconproveedores, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(integracionconproveedores, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondeproveedores, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondeproveedores, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondemateriasprimas, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondemateriasprimas, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondebodega, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondebodega, "=", 0));
SatFactory.addClauses(LogOp.implies(realizarcontroldecostos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(realizarcontroldecostos, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondepedidosydespachos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondepedidosydespachos, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondecontactos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecontactos, "=", 0));
SatFactory.addClauses(LogOp.implies(ajustarprocesosdeflujodetrabajo, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(ajustarprocesosdeflujodetrabajo, "=", 0));
SatFactory.addClauses(LogOp.implies(mejorarcapacidadderespuesta, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(mejorarcapacidadderespuesta, "=", 0));
SatFactory.addClauses(LogOp.implies(gestionarpresupuestos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestionarpresupuestos, "=", 0));
SatFactory.addClauses(LogOp.implies(crearyconsolidarinformes, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(crearyconsolidarinformes, "=", 0));
SatFactory.addClauses(LogOp.implies(buscartendenciasyrelaciones, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0));
SatFactory.addClauses(LogOp.implies(compartirconocimiento, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(compartirconocimiento, "=", 0));
SatFactory.addClauses(LogOp.implies(organizarrecursosdeservicio, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(organizarrecursosdeservicio, "=", 0));
SatFactory.addClauses(LogOp.implies(facturacionydevolucion, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(facturacionydevolucion, "=", 0));
SatFactory.addClauses(LogOp.implies(cartera, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(cartera, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondepreciosydescuentos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondepreciosydescuentos, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondepromociones, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondepromociones, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondecuotaseincentivos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondecuotaseincentivos, "=", 0));
SatFactory.addClauses(LogOp.implies(administraciondevisitacomercial, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(administraciondevisitacomercial, "=", 0));
SatFactory.addClauses(LogOp.implies(importacionesyexportaciones, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(importacionesyexportaciones, "=", 0));
SatFactory.addClauses(LogOp.implies(gestionarcontratosdeservicio, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestionarcontratosdeservicio, "=", 0));
SatFactory.addClauses(LogOp.implies(presupuestarcostosytiempos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(presupuestarcostosytiempos, "=", 0));
SatFactory.addClauses(LogOp.implies(automatizarlafacturacion, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(automatizarlafacturacion, "=", 0));
SatFactory.addClauses(LogOp.implies(predecirdisponibilidades, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0));
SatFactory.addClauses(LogOp.implies(seguimientodecostosyconsumos, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(seguimientodecostosyconsumos, "=", 0));
SatFactory.addClauses(LogOp.implies(planificarcapacidades, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planificarcapacidades, "=", 0));
SatFactory.addClauses(LogOp.implies(planearygestionarcapacidaddebodegajeyalmacenamiento, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planearygestionarcapacidaddebodegajeyalmacenamiento, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondetransportedemercancia, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondetransportedemercancia, "=", 0));
SatFactory.addClauses(LogOp.implies(logisticadetransporteinternacional, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(logisticadetransporteinternacional, "=", 0));
SatFactory.addClauses(LogOp.implies(gestionderelacionconproveedores, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestionderelacionconproveedores, "=", 0));
SatFactory.addClauses(LogOp.implies(gestiondelademanda, motivadoresdenegocio), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondelademanda, "=", 0));
SatFactory.addClauses(LogOp.implies(crm_modulomarketing, crm_customerrelationshipmanagement), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_modulomarketing, "=", 0));
SatFactory.addClauses(LogOp.implies(crm_moduloventas, crm_customerrelationshipmanagement), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_moduloventas, "=", 0));
SatFactory.addClauses(LogOp.implies(crm_modulodeclientes, crm_customerrelationshipmanagement), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulorecursoshumanos, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulorecursoshumanos, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulofinanciero, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_moduloadministrativo, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulodeproduccion, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulodeclientes, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodeclientes, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulodegestiondeabastecimiento, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodegestiondeabastecimiento, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulodeinteligenciadenegocio, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_marketingyventas, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_marketingyventas, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_modulodegestiondeproyectos, erp_enterpriseresourceplanning), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0));

// Parent-children constraints
SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, sistemasempresariales), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0));
SatFactory.addClauses(LogOp.implies(erp_enterpriseresourceplanning, sistemasempresariales), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0));
SatFactory.addClauses(LogOp.implies(scm_sistemadegestiondeabastecimiento, sistemasempresariales), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0));
SatFactory.addClauses(LogOp.implies(adquirirsistemanuevo, nuevovsexistente), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevovsexistente, "=", 0), IntConstraintFactory.arithm(adquirirsistemanuevo, "=", 0));
SatFactory.addClauses(LogOp.implies(adaptarsistemaexistente, nuevovsexistente), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevovsexistente, "=", 0), IntConstraintFactory.arithm(adaptarsistemaexistente, "=", 0));
SatFactory.addClauses(LogOp.implies(subcontratarpersonalizacion, tercerizacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tercerizacion, "=", 0), IntConstraintFactory.arithm(subcontratarpersonalizacion, "=", 0));
SatFactory.addClauses(LogOp.implies(subcontratarpartedeldesarrolloeintegracion, tercerizacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tercerizacion, "=", 0), IntConstraintFactory.arithm(subcontratarpartedeldesarrolloeintegracion, "=", 0));
SatFactory.addClauses(LogOp.implies(subcontratarlaadministraciondeunprocesodenegociocompleto, tercerizacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tercerizacion, "=", 0), IntConstraintFactory.arithm(subcontratarlaadministraciondeunprocesodenegociocompleto, "=", 0));
SatFactory.addClauses(LogOp.implies(subcontratargerenciadelproyectodeimplementacion, tercerizacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tercerizacion, "=", 0), IntConstraintFactory.arithm(subcontratargerenciadelproyectodeimplementacion, "=", 0));
SatFactory.addClauses(LogOp.implies(comercial, tipodesolucion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tipodesolucion, "=", 0), IntConstraintFactory.arithm(comercial, "=", 0));
SatFactory.addClauses(LogOp.implies(opensource, tipodesolucion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tipodesolucion, "=", 0), IntConstraintFactory.arithm(opensource, "=", 0));
SatFactory.addClauses(LogOp.implies(onpremise, modelodedespliegue), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodedespliegue, "=", 0), IntConstraintFactory.arithm(onpremise, "=", 0));
SatFactory.addClauses(LogOp.implies(softwarecomoserviciosaas, modelodedespliegue), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodedespliegue, "=", 0), IntConstraintFactory.arithm(softwarecomoserviciosaas, "=", 0));
SatFactory.addClauses(LogOp.implies(infraestructuracomoservicioiaas, modelodedespliegue), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodedespliegue, "=", 0), IntConstraintFactory.arithm(infraestructuracomoservicioiaas, "=", 0));
SatFactory.addClauses(LogOp.implies(bigbang, modelodeimplementacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(bigbang, "=", 0));
SatFactory.addClauses(LogOp.implies(implementacionporfases, modelodeimplementacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(implementacionporfases, "=", 0));
SatFactory.addClauses(LogOp.implies(implementacionporprocesos, modelodeimplementacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(implementacionporprocesos, "=", 0));
SatFactory.addClauses(LogOp.implies(contratoconelproveedor, mantenimiento), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mantenimiento, "=", 0), IntConstraintFactory.arithm(contratoconelproveedor, "=", 0));
SatFactory.addClauses(LogOp.implies(contratoconunproveedorespecializado, mantenimiento), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mantenimiento, "=", 0), IntConstraintFactory.arithm(contratoconunproveedorespecializado, "=", 0));
SatFactory.addClauses(LogOp.implies(mantenimientoporcuentapropia, mantenimiento), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mantenimiento, "=", 0), IntConstraintFactory.arithm(mantenimientoporcuentapropia, "=", 0));
SatFactory.addClauses(LogOp.implies(sincontratodemantenimiento, mantenimiento), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mantenimiento, "=", 0), IntConstraintFactory.arithm(sincontratodemantenimiento, "=", 0));
SatFactory.addClauses(LogOp.implies(rfp_requestforproposal, modelodeseleccion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeseleccion, "=", 0), IntConstraintFactory.arithm(rfp_requestforproposal, "=", 0));
SatFactory.addClauses(LogOp.implies(consultoriaexterna, modelodeseleccion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeseleccion, "=", 0), IntConstraintFactory.arithm(consultoriaexterna, "=", 0));
SatFactory.addClauses(LogOp.implies(evaluacioninterna, modelodeseleccion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeseleccion, "=", 0), IntConstraintFactory.arithm(evaluacioninterna, "=", 0));
SatFactory.addClauses(LogOp.implies(sistemaempresarialbasadoenlamismaplataformatecnologica, plataforma), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(plataforma, "=", 0), IntConstraintFactory.arithm(sistemaempresarialbasadoenlamismaplataformatecnologica, "=", 0));
SatFactory.addClauses(LogOp.implies(sistemaempresarialbasadoenunaplataformadiferente, plataforma), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(plataforma, "=", 0), IntConstraintFactory.arithm(sistemaempresarialbasadoenunaplataformadiferente, "=", 0));
SatFactory.addClauses(LogOp.implies(middleware, integracion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracion, "=", 0), IntConstraintFactory.arithm(middleware, "=", 0));
SatFactory.addClauses(LogOp.implies(desarrollopropio, integracion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracion, "=", 0), IntConstraintFactory.arithm(desarrollopropio, "=", 0));
SatFactory.addClauses(LogOp.implies(proveedor, integracion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracion, "=", 0), IntConstraintFactory.arithm(proveedor, "=", 0));
SatFactory.addClauses(LogOp.implies(recursospropios, financiacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(financiacion, "=", 0), IntConstraintFactory.arithm(recursospropios, "=", 0));
SatFactory.addClauses(LogOp.implies(credito, financiacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(financiacion, "=", 0), IntConstraintFactory.arithm(credito, "=", 0));
SatFactory.addClauses(LogOp.implies(leasing, financiacion), solver);
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(financiacion, "=", 0), IntConstraintFactory.arithm(leasing, "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondedatosylistas, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondedatosylistas, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondedatosylistas, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondedatosylistas, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(aumentartasasdecierredeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[8][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(aumentartasasdecierredeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[8][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(aumentartasasdecierredeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[8][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(aumentartasasdecierredeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[8][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarnuevoprocesodeatencionalcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarnuevoprocesodeatencionalcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarnuevoprocesodeatencionalcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarnuevoprocesodeatencionalcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlsobrerecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlsobrerecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlsobrerecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlsobrerecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosderecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosderecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosderecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosderecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reclutamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reclutamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reclutamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reclutamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(biodata_hojasdevida, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(biodata_hojasdevida, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(biodata_hojasdevida, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(biodata_hojasdevida, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdecargos_estructuraorganizacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdecargos_estructuraorganizacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdecargos_estructuraorganizacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdecargos_estructuraorganizacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nominayadministraciondesalarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nominayadministraciondesalarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nominayadministraciondesalarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nominayadministraciondesalarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(educacionycapacitacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[24][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(educacionycapacitacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[24][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(educacionycapacitacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[24][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(educacionycapacitacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[24][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(saludocupacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(saludocupacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(saludocupacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(saludocupacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelamientodeprocesosyorganigramas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelamientodeprocesosyorganigramas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelamientodeprocesosyorganigramas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelamientodeprocesosyorganigramas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(nuevosprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestioncontable, "=", 0), IntConstraintFactory.arithm(featureAttributes[29][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestioncontable, "=", 0), IntConstraintFactory.arithm(featureAttributes[29][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestioncontable, "=", 0), IntConstraintFactory.arithm(featureAttributes[29][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestioncontable, "=", 0), IntConstraintFactory.arithm(featureAttributes[29][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodecuentasporpagar_proveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[30][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodecuentasporpagar_proveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[30][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodecuentasporpagar_proveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[30][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodecuentasporpagar_proveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[30][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasdecosteo, "=", 0), IntConstraintFactory.arithm(featureAttributes[31][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasdecosteo, "=", 0), IntConstraintFactory.arithm(featureAttributes[31][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasdecosteo, "=", 0), IntConstraintFactory.arithm(featureAttributes[31][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasdecosteo, "=", 0), IntConstraintFactory.arithm(featureAttributes[31][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[32][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[32][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[32][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[32][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeconciliacionesbancarias, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeconciliacionesbancarias, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeconciliacionesbancarias, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeconciliacionesbancarias, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controldeinversiones, "=", 0), IntConstraintFactory.arithm(featureAttributes[34][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controldeinversiones, "=", 0), IntConstraintFactory.arithm(featureAttributes[34][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controldeinversiones, "=", 0), IntConstraintFactory.arithm(featureAttributes[34][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controldeinversiones, "=", 0), IntConstraintFactory.arithm(featureAttributes[34][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeobligacionesfinancieras, "=", 0), IntConstraintFactory.arithm(featureAttributes[35][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeobligacionesfinancieras, "=", 0), IntConstraintFactory.arithm(featureAttributes[35][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeobligacionesfinancieras, "=", 0), IntConstraintFactory.arithm(featureAttributes[35][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeobligacionesfinancieras, "=", 0), IntConstraintFactory.arithm(featureAttributes[35][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tesoreria, "=", 0), IntConstraintFactory.arithm(featureAttributes[36][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tesoreria, "=", 0), IntConstraintFactory.arithm(featureAttributes[36][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tesoreria, "=", 0), IntConstraintFactory.arithm(featureAttributes[36][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tesoreria, "=", 0), IntConstraintFactory.arithm(featureAttributes[36][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(contabilidadanalitica, "=", 0), IntConstraintFactory.arithm(featureAttributes[37][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(contabilidadanalitica, "=", 0), IntConstraintFactory.arithm(featureAttributes[37][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(contabilidadanalitica, "=", 0), IntConstraintFactory.arithm(featureAttributes[37][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(contabilidadanalitica, "=", 0), IntConstraintFactory.arithm(featureAttributes[37][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[38][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[38][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[38][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[38][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeactivosdecapital, "=", 0), IntConstraintFactory.arithm(featureAttributes[39][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeactivosdecapital, "=", 0), IntConstraintFactory.arithm(featureAttributes[39][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeactivosdecapital, "=", 0), IntConstraintFactory.arithm(featureAttributes[39][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeactivosdecapital, "=", 0), IntConstraintFactory.arithm(featureAttributes[39][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeinventarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[40][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeinventarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[40][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeinventarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[40][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeinventarios, "=", 0), IntConstraintFactory.arithm(featureAttributes[40][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[41][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[41][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[41][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[41][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecompras, "=", 0), IntConstraintFactory.arithm(featureAttributes[42][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecompras, "=", 0), IntConstraintFactory.arithm(featureAttributes[42][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecompras, "=", 0), IntConstraintFactory.arithm(featureAttributes[42][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecompras, "=", 0), IntConstraintFactory.arithm(featureAttributes[42][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[43][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[43][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[43][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeactivosfijos, "=", 0), IntConstraintFactory.arithm(featureAttributes[43][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[44][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[44][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[44][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[44][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguros, "=", 0), IntConstraintFactory.arithm(featureAttributes[45][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguros, "=", 0), IntConstraintFactory.arithm(featureAttributes[45][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguros, "=", 0), IntConstraintFactory.arithm(featureAttributes[45][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguros, "=", 0), IntConstraintFactory.arithm(featureAttributes[45][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[46][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[46][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[46][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[46][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdecompra, "=", 0), IntConstraintFactory.arithm(featureAttributes[47][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdecompra, "=", 0), IntConstraintFactory.arithm(featureAttributes[47][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdecompra, "=", 0), IntConstraintFactory.arithm(featureAttributes[47][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodeordenesdecompra, "=", 0), IntConstraintFactory.arithm(featureAttributes[47][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondenecesidadesdecapacidad, "=", 0), IntConstraintFactory.arithm(featureAttributes[48][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondenecesidadesdecapacidad, "=", 0), IntConstraintFactory.arithm(featureAttributes[48][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondenecesidadesdecapacidad, "=", 0), IntConstraintFactory.arithm(featureAttributes[48][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondenecesidadesdecapacidad, "=", 0), IntConstraintFactory.arithm(featureAttributes[48][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondesuministros, "=", 0), IntConstraintFactory.arithm(featureAttributes[49][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondesuministros, "=", 0), IntConstraintFactory.arithm(featureAttributes[49][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondesuministros, "=", 0), IntConstraintFactory.arithm(featureAttributes[49][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificaciondesuministros, "=", 0), IntConstraintFactory.arithm(featureAttributes[49][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0), IntConstraintFactory.arithm(featureAttributes[50][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0), IntConstraintFactory.arithm(featureAttributes[50][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0), IntConstraintFactory.arithm(featureAttributes[50][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0), IntConstraintFactory.arithm(featureAttributes[50][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[51][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[51][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[51][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(integracionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[51][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[52][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[52][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[52][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondeproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[52][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondemateriasprimas, "=", 0), IntConstraintFactory.arithm(featureAttributes[53][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondemateriasprimas, "=", 0), IntConstraintFactory.arithm(featureAttributes[53][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondemateriasprimas, "=", 0), IntConstraintFactory.arithm(featureAttributes[53][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondemateriasprimas, "=", 0), IntConstraintFactory.arithm(featureAttributes[53][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondebodega, "=", 0), IntConstraintFactory.arithm(featureAttributes[54][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondebodega, "=", 0), IntConstraintFactory.arithm(featureAttributes[54][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondebodega, "=", 0), IntConstraintFactory.arithm(featureAttributes[54][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondebodega, "=", 0), IntConstraintFactory.arithm(featureAttributes[54][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(realizarcontroldecostos, "=", 0), IntConstraintFactory.arithm(featureAttributes[55][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(realizarcontroldecostos, "=", 0), IntConstraintFactory.arithm(featureAttributes[55][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(realizarcontroldecostos, "=", 0), IntConstraintFactory.arithm(featureAttributes[55][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(realizarcontroldecostos, "=", 0), IntConstraintFactory.arithm(featureAttributes[55][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepedidosydespachos, "=", 0), IntConstraintFactory.arithm(featureAttributes[56][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepedidosydespachos, "=", 0), IntConstraintFactory.arithm(featureAttributes[56][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepedidosydespachos, "=", 0), IntConstraintFactory.arithm(featureAttributes[56][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepedidosydespachos, "=", 0), IntConstraintFactory.arithm(featureAttributes[56][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecontactos, "=", 0), IntConstraintFactory.arithm(featureAttributes[57][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecontactos, "=", 0), IntConstraintFactory.arithm(featureAttributes[57][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecontactos, "=", 0), IntConstraintFactory.arithm(featureAttributes[57][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecontactos, "=", 0), IntConstraintFactory.arithm(featureAttributes[57][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(ajustarprocesosdeflujodetrabajo, "=", 0), IntConstraintFactory.arithm(featureAttributes[58][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(ajustarprocesosdeflujodetrabajo, "=", 0), IntConstraintFactory.arithm(featureAttributes[58][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(ajustarprocesosdeflujodetrabajo, "=", 0), IntConstraintFactory.arithm(featureAttributes[58][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(ajustarprocesosdeflujodetrabajo, "=", 0), IntConstraintFactory.arithm(featureAttributes[58][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarcapacidadderespuesta, "=", 0), IntConstraintFactory.arithm(featureAttributes[59][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarcapacidadderespuesta, "=", 0), IntConstraintFactory.arithm(featureAttributes[59][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarcapacidadderespuesta, "=", 0), IntConstraintFactory.arithm(featureAttributes[59][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarcapacidadderespuesta, "=", 0), IntConstraintFactory.arithm(featureAttributes[59][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarpresupuestos, "=", 0), IntConstraintFactory.arithm(featureAttributes[60][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarpresupuestos, "=", 0), IntConstraintFactory.arithm(featureAttributes[60][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarpresupuestos, "=", 0), IntConstraintFactory.arithm(featureAttributes[60][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarpresupuestos, "=", 0), IntConstraintFactory.arithm(featureAttributes[60][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crearyconsolidarinformes, "=", 0), IntConstraintFactory.arithm(featureAttributes[61][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crearyconsolidarinformes, "=", 0), IntConstraintFactory.arithm(featureAttributes[61][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crearyconsolidarinformes, "=", 0), IntConstraintFactory.arithm(featureAttributes[61][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crearyconsolidarinformes, "=", 0), IntConstraintFactory.arithm(featureAttributes[61][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[62][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[62][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[62][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[62][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[63][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[63][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[63][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[63][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(organizarrecursosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[64][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(organizarrecursosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[64][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(organizarrecursosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[64][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(organizarrecursosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[64][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(facturacionydevolucion, "=", 0), IntConstraintFactory.arithm(featureAttributes[65][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(facturacionydevolucion, "=", 0), IntConstraintFactory.arithm(featureAttributes[65][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(facturacionydevolucion, "=", 0), IntConstraintFactory.arithm(featureAttributes[65][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(facturacionydevolucion, "=", 0), IntConstraintFactory.arithm(featureAttributes[65][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(cartera, "=", 0), IntConstraintFactory.arithm(featureAttributes[66][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(cartera, "=", 0), IntConstraintFactory.arithm(featureAttributes[66][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(cartera, "=", 0), IntConstraintFactory.arithm(featureAttributes[66][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(cartera, "=", 0), IntConstraintFactory.arithm(featureAttributes[66][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepreciosydescuentos, "=", 0), IntConstraintFactory.arithm(featureAttributes[67][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepreciosydescuentos, "=", 0), IntConstraintFactory.arithm(featureAttributes[67][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepreciosydescuentos, "=", 0), IntConstraintFactory.arithm(featureAttributes[67][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepreciosydescuentos, "=", 0), IntConstraintFactory.arithm(featureAttributes[67][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepromociones, "=", 0), IntConstraintFactory.arithm(featureAttributes[68][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepromociones, "=", 0), IntConstraintFactory.arithm(featureAttributes[68][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepromociones, "=", 0), IntConstraintFactory.arithm(featureAttributes[68][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondepromociones, "=", 0), IntConstraintFactory.arithm(featureAttributes[68][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondecuotaseincentivos, "=", 0), IntConstraintFactory.arithm(featureAttributes[69][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondecuotaseincentivos, "=", 0), IntConstraintFactory.arithm(featureAttributes[69][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondecuotaseincentivos, "=", 0), IntConstraintFactory.arithm(featureAttributes[69][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondecuotaseincentivos, "=", 0), IntConstraintFactory.arithm(featureAttributes[69][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondevisitacomercial, "=", 0), IntConstraintFactory.arithm(featureAttributes[70][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondevisitacomercial, "=", 0), IntConstraintFactory.arithm(featureAttributes[70][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondevisitacomercial, "=", 0), IntConstraintFactory.arithm(featureAttributes[70][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(administraciondevisitacomercial, "=", 0), IntConstraintFactory.arithm(featureAttributes[70][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(importacionesyexportaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[71][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(importacionesyexportaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[71][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(importacionesyexportaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[71][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(importacionesyexportaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[71][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarcontratosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[72][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarcontratosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[72][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarcontratosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[72][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionarcontratosdeservicio, "=", 0), IntConstraintFactory.arithm(featureAttributes[72][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(presupuestarcostosytiempos, "=", 0), IntConstraintFactory.arithm(featureAttributes[73][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(presupuestarcostosytiempos, "=", 0), IntConstraintFactory.arithm(featureAttributes[73][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(presupuestarcostosytiempos, "=", 0), IntConstraintFactory.arithm(featureAttributes[73][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(presupuestarcostosytiempos, "=", 0), IntConstraintFactory.arithm(featureAttributes[73][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(automatizarlafacturacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[74][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(automatizarlafacturacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[74][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(automatizarlafacturacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[74][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(automatizarlafacturacion, "=", 0), IntConstraintFactory.arithm(featureAttributes[74][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[75][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[75][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[75][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[75][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguimientodecostosyconsumos, "=", 0), IntConstraintFactory.arithm(featureAttributes[76][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguimientodecostosyconsumos, "=", 0), IntConstraintFactory.arithm(featureAttributes[76][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguimientodecostosyconsumos, "=", 0), IntConstraintFactory.arithm(featureAttributes[76][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(seguimientodecostosyconsumos, "=", 0), IntConstraintFactory.arithm(featureAttributes[76][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificarcapacidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[77][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificarcapacidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[77][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificarcapacidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[77][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planificarcapacidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[77][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planearygestionarcapacidaddebodegajeyalmacenamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[78][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planearygestionarcapacidaddebodegajeyalmacenamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[78][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planearygestionarcapacidaddebodegajeyalmacenamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[78][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(planearygestionarcapacidaddebodegajeyalmacenamiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[78][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondetransportedemercancia, "=", 0), IntConstraintFactory.arithm(featureAttributes[79][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondetransportedemercancia, "=", 0), IntConstraintFactory.arithm(featureAttributes[79][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondetransportedemercancia, "=", 0), IntConstraintFactory.arithm(featureAttributes[79][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondetransportedemercancia, "=", 0), IntConstraintFactory.arithm(featureAttributes[79][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(logisticadetransporteinternacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[80][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(logisticadetransporteinternacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[80][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(logisticadetransporteinternacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[80][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(logisticadetransporteinternacional, "=", 0), IntConstraintFactory.arithm(featureAttributes[80][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionderelacionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[81][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionderelacionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[81][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionderelacionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[81][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestionderelacionconproveedores, "=", 0), IntConstraintFactory.arithm(featureAttributes[81][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[82][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[82][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[82][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[82][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulorecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[86][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulorecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[86][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulorecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[86][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulorecursoshumanos, "=", 0), IntConstraintFactory.arithm(featureAttributes[86][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[87][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[87][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[87][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[87][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[88][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[88][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[88][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[88][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[89][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[89][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[89][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0), IntConstraintFactory.arithm(featureAttributes[89][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[90][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[90][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[90][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[90][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[91][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[91][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[91][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[91][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[92][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[92][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[92][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[92][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[93][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[93][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[93][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[93][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[94][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[94][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[94][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[94][3], "=", 0));

LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[95][0], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[95][1], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[95][2], "=", 0));
LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[95][3], "=", 0));

IntVar[] varCostos = new IntVar[featureAttributes.length];
IntVar[] varTiempo = new IntVar[featureAttributes.length];
int maxCostos = 0;
int maxTiempo = 0;

for (int i = 0; i < featureAttributes.length; i ++) {
	varCostos [i] = featureAttributes[i][0];
	varTiempo [i] = featureAttributes[i][1];
	
	maxCostos += featureAttributes[i][0].getDomainSize();
	maxTiempo += featureAttributes[i][1].getDomainSize();
}

System.out.println("Max costos: " + maxCostos);
System.out.println("Max tiempo: " + maxTiempo);
IntVar totalCostos = VariableFactory.bounded("TotalCost", 0, maxCostos, solver);
IntVar totalTiempo = VariableFactory.bounded("TotalCost", 0, maxTiempo, solver);

solver.post(IntConstraintFactory.sum(varCostos, totalCostos));
solver.post(IntConstraintFactory.sum(varTiempo, totalTiempo));

Chatterbox.showSolutions(solver);
solver.findParetoFront(ResolutionPolicy.MINIMIZE, totalCostos, totalTiempo);
Chatterbox.printStatistics(solver);

List<Solution> solutions = solver.getSolutionRecorder().getSolutions();

for (int i = 0; i < solutions.size(); i++) {
	//solver.restoreSolution(solutions.get(i));
	//IntVar[] vars = solver.retrieveIntVars();
	BoolVar[] bools = solver.retrieveBoolVars();
	
	System.out.println("Solution " + i + ": ");

	for (int j = 0; j < bools.length; j++) {
		if(bools[j].getValue() == 1 && !bools[j].getName().startsWith("Reqs")) {
			
			System.out.println(bools[j].getName() + " : " + bools[j].getValue());
		}	
	}

System.out.println("Done");
} 

}
}
