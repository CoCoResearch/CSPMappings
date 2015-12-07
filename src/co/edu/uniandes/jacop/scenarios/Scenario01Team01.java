package co.edu.uniandes.jacop.scenarios;

import org.jacop.constraints.And;
import org.jacop.constraints.IfThen;
import org.jacop.constraints.XeqC;
import org.jacop.constraints.XgteqC;
import org.jacop.core.BooleanVar;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMax;
import org.jacop.search.IndomainMiddle;
import org.jacop.search.IndomainMin;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.LargestDomain;
import org.jacop.search.LargestMax;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSelect;
import org.jacop.search.SmallestDomain;
import org.jacop.search.SmallestMin;

public class Scenario01Team01 {
	public void solveProblem() {
		Store store = new Store();

		// FEATURES (Variables & Domains)
		BooleanVar inversionti = new BooleanVar(store, "inversionti");
		BooleanVar motivadoresdenegocio = new BooleanVar(store, "motivadoresdenegocio");
		store.impose(new XeqC(motivadoresdenegocio, 1));
		BooleanVar sistemasempresariales = new BooleanVar(store, "sistemasempresariales");
		store.impose(new XeqC(sistemasempresariales, 1));
		BooleanVar nuevovsexistente = new BooleanVar(store, "nuevovsexistente");
		store.impose(new XeqC(nuevovsexistente, 1));
		BooleanVar tercerizacion = new BooleanVar(store, "tercerizacion");
		store.impose(new XeqC(tercerizacion, 1));
		BooleanVar crm_customerrelationshipmanagement = new BooleanVar(store, "crm_customerrelationshipmanagement");
		store.impose(new XeqC(crm_customerrelationshipmanagement, 0));
		BooleanVar erp_enterpriseresourceplanning = new BooleanVar(store, "erp_enterpriseresourceplanning");
		BooleanVar segmentarydepurarclientes = new BooleanVar(store, "segmentarydepurarclientes");
		store.impose(new XeqC(segmentarydepurarclientes, 0));
		BooleanVar analisisdemarketing = new BooleanVar(store, "analisisdemarketing");
		store.impose(new XeqC(analisisdemarketing, 0));
		BooleanVar gestiondecampanias = new BooleanVar(store, "gestiondecampanias");
		store.impose(new XeqC(gestiondecampanias, 0));
		BooleanVar reducirciclosdeventas = new BooleanVar(store, "reducirciclosdeventas");
		store.impose(new XeqC(reducirciclosdeventas, 0));
		BooleanVar mejorarretenciondeclientes = new BooleanVar(store, "mejorarretenciondeclientes");
		store.impose(new XeqC(mejorarretenciondeclientes, 0));
		BooleanVar mejorarconocimientodelcliente = new BooleanVar(store, "mejorarconocimientodelcliente");
		store.impose(new XeqC(mejorarconocimientodelcliente, 0));
		BooleanVar implementarcontrolessobreprocesosfinancieros = new BooleanVar(store, "implementarcontrolessobreprocesosfinancieros");
		store.impose(new XeqC(implementarcontrolessobreprocesosfinancieros, 0));
		BooleanVar controlyadministraciondelpresupuesto = new BooleanVar(store, "controlyadministraciondelpresupuesto");
		store.impose(new XeqC(controlyadministraciondelpresupuesto, 0));
		BooleanVar manejodeinventarios = new BooleanVar(store, "manejodeinventarios");
		BooleanVar manejodealmacen = new BooleanVar(store, "manejodealmacen");
		store.impose(new XeqC(manejodealmacen, 0));
		BooleanVar gestiondecompras = new BooleanVar(store, "gestiondecompras");
		BooleanVar comercioexterior = new BooleanVar(store, "comercioexterior");
		store.impose(new XeqC(comercioexterior, 0));
		BooleanVar disminuirtiemposdeentrega = new BooleanVar(store, "disminuirtiemposdeentrega");
		BooleanVar integracionconproveedores = new BooleanVar(store, "integracionconproveedores");
		BooleanVar buscartendenciasyrelaciones = new BooleanVar(store, "buscartendenciasyrelaciones");
		store.impose(new XeqC(buscartendenciasyrelaciones, 0));
		BooleanVar compartirconocimiento = new BooleanVar(store, "compartirconocimiento");
		store.impose(new XeqC(compartirconocimiento, 0));
		BooleanVar predecirdisponibilidades = new BooleanVar(store, "predecirdisponibilidades");
		BooleanVar planificarcapacidades = new BooleanVar(store, "planificarcapacidades");
		BooleanVar gestiondelademanda = new BooleanVar(store, "gestiondelademanda");
		BooleanVar crm_modulomarketing = new BooleanVar(store, "crm_modulomarketing");
		store.impose(new XeqC(crm_modulomarketing, 0));
		BooleanVar crm_moduloventas = new BooleanVar(store, "crm_moduloventas");
		store.impose(new XeqC(crm_moduloventas, 0));
		BooleanVar crm_modulodeclientes = new BooleanVar(store, "crm_modulodeclientes");
		store.impose(new XeqC(crm_modulodeclientes, 0));
		BooleanVar erp_modulofinanciero = new BooleanVar(store, "erp_modulofinanciero");
		store.impose(new XeqC(erp_modulofinanciero, 0));
		BooleanVar erp_moduloadministrativo = new BooleanVar(store, "erp_moduloadministrativo");
		store.impose(new XeqC(erp_moduloadministrativo, 0));
		BooleanVar erp_modulodeproduccion = new BooleanVar(store, "erp_modulodeproduccion");
		BooleanVar erp_modulodeinteligenciadenegocio = new BooleanVar(store, "erp_modulodeinteligenciadenegocio");
		store.impose(new XeqC(erp_modulodeinteligenciadenegocio, 0));
		BooleanVar erp_marketingyventas = new BooleanVar(store, "erp_marketingyventas");
		store.impose(new XeqC(erp_marketingyventas, 0));
		BooleanVar erp_modulodegestiondeproyectos = new BooleanVar(store, "erp_modulodegestiondeproyectos");
		BooleanVar scm_sistemadegestiondeabastecimiento = new BooleanVar(store, "scm_sistemadegestiondeabastecimiento");
		BooleanVar adquirirsistemanuevo = new BooleanVar(store, "adquirirsistemanuevo");
		store.impose(new XeqC(adquirirsistemanuevo, 0));
		BooleanVar adaptarsistemaexistente = new BooleanVar(store, "adaptarsistemaexistente");
		BooleanVar subcontratarpersonalizacion = new BooleanVar(store, "subcontratarpersonalizacion");
		BooleanVar subcontratarpartedeldesarrolloeintegracion = new BooleanVar(store, "subcontratarpartedeldesarrolloeintegracion");
		BooleanVar subcontratarlaadministraciondeunprocesodenegociocompleto = new BooleanVar(store, "subcontratarlaadministraciondeunprocesodenegociocompleto");
		store.impose(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0));
		BooleanVar subcontratargerenciadelproyectodeimplementacion = new BooleanVar(store, "subcontratargerenciadelproyectodeimplementacion");

		// FEATURE ATTRIBUTES (Variables & Domains)
		IntVar[][] featureAttributes = new IntVar[35][4];featureAttributes[0][0] = new IntVar(store, "segmentarydepurarclientescostos", 0, 0);
		featureAttributes[0][1] = new IntVar(store, "segmentarydepurarclientestiempo", 0, 0);
		featureAttributes[0][2] = new IntVar(store, "segmentarydepurarclientesrecursoshumanos", 0, 0);
		featureAttributes[0][3] = new IntVar(store, "segmentarydepurarclientesriesgos", 0, 0);

		featureAttributes[1][0] = new IntVar(store, "analisisdemarketingcostos", 0, 0);
		featureAttributes[1][1] = new IntVar(store, "analisisdemarketingtiempo", 0, 0);
		featureAttributes[1][2] = new IntVar(store, "analisisdemarketingrecursoshumanos", 0, 0);
		featureAttributes[1][3] = new IntVar(store, "analisisdemarketingriesgos", 0, 0);

		featureAttributes[2][0] = new IntVar(store, "gestiondecampaniascostos", 0, 0);
		featureAttributes[2][1] = new IntVar(store, "gestiondecampaniastiempo", 0, 0);
		featureAttributes[2][2] = new IntVar(store, "gestiondecampaniasrecursoshumanos", 0, 0);
		featureAttributes[2][3] = new IntVar(store, "gestiondecampaniasriesgos", 0, 0);

		featureAttributes[3][0] = new IntVar(store, "reducirciclosdeventascostos", 0, 0);
		featureAttributes[3][1] = new IntVar(store, "reducirciclosdeventastiempo", 0, 0);
		featureAttributes[3][2] = new IntVar(store, "reducirciclosdeventasrecursoshumanos", 0, 0);
		featureAttributes[3][3] = new IntVar(store, "reducirciclosdeventasriesgos", 0, 0);

		featureAttributes[4][0] = new IntVar(store, "mejorarretenciondeclientescostos", 0, 0);
		featureAttributes[4][1] = new IntVar(store, "mejorarretenciondeclientestiempo", 0, 0);
		featureAttributes[4][2] = new IntVar(store, "mejorarretenciondeclientesrecursoshumanos", 0, 0);
		featureAttributes[4][3] = new IntVar(store, "mejorarretenciondeclientesriesgos", 0, 0);

		featureAttributes[5][0] = new IntVar(store, "mejorarconocimientodelclientecostos", 0, 0);
		featureAttributes[5][1] = new IntVar(store, "mejorarconocimientodelclientetiempo", 0, 0);
		featureAttributes[5][2] = new IntVar(store, "mejorarconocimientodelclienterecursoshumanos", 0, 0);
		featureAttributes[5][3] = new IntVar(store, "mejorarconocimientodelclienteriesgos", 0, 0);

		featureAttributes[6][0] = new IntVar(store, "implementarcontrolessobreprocesosfinancieroscostos", 0, 0);
		featureAttributes[6][1] = new IntVar(store, "implementarcontrolessobreprocesosfinancierostiempo", 0, 0);
		featureAttributes[6][2] = new IntVar(store, "implementarcontrolessobreprocesosfinancierosrecursoshumanos", 0, 0);
		featureAttributes[6][3] = new IntVar(store, "implementarcontrolessobreprocesosfinancierosriesgos", 0, 0);

		featureAttributes[7][0] = new IntVar(store, "controlyadministraciondelpresupuestocostos", 0, 0);
		featureAttributes[7][1] = new IntVar(store, "controlyadministraciondelpresupuestotiempo", 0, 0);
		featureAttributes[7][2] = new IntVar(store, "controlyadministraciondelpresupuestorecursoshumanos", 0, 0);
		featureAttributes[7][3] = new IntVar(store, "controlyadministraciondelpresupuestoriesgos", 0, 0);

		featureAttributes[8][0] = new IntVar(store, "manejodeinventarioscostos", 0, 0);
		featureAttributes[8][1] = new IntVar(store, "manejodeinventariostiempo", 0, 0);
		featureAttributes[8][2] = new IntVar(store, "manejodeinventariosrecursoshumanos", 0, 0);
		featureAttributes[8][3] = new IntVar(store, "manejodeinventariosriesgos", 0, 0);

		featureAttributes[9][0] = new IntVar(store, "manejodealmacencostos", 0, 0);
		featureAttributes[9][1] = new IntVar(store, "manejodealmacentiempo", 0, 0);
		featureAttributes[9][2] = new IntVar(store, "manejodealmacenrecursoshumanos", 0, 0);
		featureAttributes[9][3] = new IntVar(store, "manejodealmacenriesgos", 0, 0);

		featureAttributes[10][0] = new IntVar(store, "gestiondecomprascostos", 0, 0);
		featureAttributes[10][1] = new IntVar(store, "gestiondecomprastiempo", 0, 0);
		featureAttributes[10][2] = new IntVar(store, "gestiondecomprasrecursoshumanos", 0, 0);
		featureAttributes[10][3] = new IntVar(store, "gestiondecomprasriesgos", 0, 0);

		featureAttributes[11][0] = new IntVar(store, "comercioexteriorcostos", 0, 0);
		featureAttributes[11][1] = new IntVar(store, "comercioexteriortiempo", 0, 0);
		featureAttributes[11][2] = new IntVar(store, "comercioexteriorrecursoshumanos", 0, 0);
		featureAttributes[11][3] = new IntVar(store, "comercioexteriorriesgos", 0, 0);

		featureAttributes[12][0] = new IntVar(store, "disminuirtiemposdeentregacostos", 0, 0);
		featureAttributes[12][1] = new IntVar(store, "disminuirtiemposdeentregatiempo", 0, 0);
		featureAttributes[12][2] = new IntVar(store, "disminuirtiemposdeentregarecursoshumanos", 0, 0);
		featureAttributes[12][3] = new IntVar(store, "disminuirtiemposdeentregariesgos", 0, 0);

		featureAttributes[13][0] = new IntVar(store, "integracionconproveedorescostos", 0, 0);
		featureAttributes[13][1] = new IntVar(store, "integracionconproveedorestiempo", 0, 0);
		featureAttributes[13][2] = new IntVar(store, "integracionconproveedoresrecursoshumanos", 0, 0);
		featureAttributes[13][3] = new IntVar(store, "integracionconproveedoresriesgos", 0, 0);

		featureAttributes[14][0] = new IntVar(store, "buscartendenciasyrelacionescostos", 0, 0);
		featureAttributes[14][1] = new IntVar(store, "buscartendenciasyrelacionestiempo", 0, 0);
		featureAttributes[14][2] = new IntVar(store, "buscartendenciasyrelacionesrecursoshumanos", 0, 0);
		featureAttributes[14][3] = new IntVar(store, "buscartendenciasyrelacionesriesgos", 0, 0);

		featureAttributes[15][0] = new IntVar(store, "compartirconocimientocostos", 0, 0);
		featureAttributes[15][1] = new IntVar(store, "compartirconocimientotiempo", 0, 0);
		featureAttributes[15][2] = new IntVar(store, "compartirconocimientorecursoshumanos", 0, 0);
		featureAttributes[15][3] = new IntVar(store, "compartirconocimientoriesgos", 0, 0);

		featureAttributes[16][0] = new IntVar(store, "predecirdisponibilidadescostos", 0, 0);
		featureAttributes[16][1] = new IntVar(store, "predecirdisponibilidadestiempo", 0, 0);
		featureAttributes[16][2] = new IntVar(store, "predecirdisponibilidadesrecursoshumanos", 0, 0);
		featureAttributes[16][3] = new IntVar(store, "predecirdisponibilidadesriesgos", 0, 0);

		featureAttributes[17][0] = new IntVar(store, "planificarcapacidadescostos", 0, 0);
		featureAttributes[17][1] = new IntVar(store, "planificarcapacidadestiempo", 0, 0);
		featureAttributes[17][2] = new IntVar(store, "planificarcapacidadesrecursoshumanos", 0, 0);
		featureAttributes[17][3] = new IntVar(store, "planificarcapacidadesriesgos", 0, 0);

		featureAttributes[18][0] = new IntVar(store, "gestiondelademandacostos", 0, 0);
		featureAttributes[18][1] = new IntVar(store, "gestiondelademandatiempo", 0, 0);
		featureAttributes[18][2] = new IntVar(store, "gestiondelademandarecursoshumanos", 0, 0);
		featureAttributes[18][3] = new IntVar(store, "gestiondelademandariesgos", 0, 0);

		featureAttributes[19][0] = new IntVar(store, "crm_modulomarketingcostos", 0, 0);
		featureAttributes[19][1] = new IntVar(store, "crm_modulomarketingtiempo", 0, 0);
		featureAttributes[19][2] = new IntVar(store, "crm_modulomarketingrecursoshumanos", 0, 0);
		featureAttributes[19][3] = new IntVar(store, "crm_modulomarketingriesgos", 0, 0);

		featureAttributes[20][0] = new IntVar(store, "crm_moduloventascostos", 0, 0);
		featureAttributes[20][1] = new IntVar(store, "crm_moduloventastiempo", 0, 0);
		featureAttributes[20][2] = new IntVar(store, "crm_moduloventasrecursoshumanos", 0, 0);
		featureAttributes[20][3] = new IntVar(store, "crm_moduloventasriesgos", 0, 0);

		featureAttributes[21][0] = new IntVar(store, "crm_modulodeclientescostos", 0, 0);
		featureAttributes[21][1] = new IntVar(store, "crm_modulodeclientestiempo", 0, 0);
		featureAttributes[21][2] = new IntVar(store, "crm_modulodeclientesrecursoshumanos", 0, 0);
		featureAttributes[21][3] = new IntVar(store, "crm_modulodeclientesriesgos", 0, 0);

		featureAttributes[22][0] = new IntVar(store, "erp_modulofinancierocostos", 0, 0);
		featureAttributes[22][1] = new IntVar(store, "erp_modulofinancierotiempo", 0, 0);
		featureAttributes[22][2] = new IntVar(store, "erp_modulofinancierorecursoshumanos", 0, 0);
		featureAttributes[22][3] = new IntVar(store, "erp_modulofinancieroriesgos", 0, 0);

		featureAttributes[23][0] = new IntVar(store, "erp_moduloadministrativocostos", 0, 0);
		featureAttributes[23][1] = new IntVar(store, "erp_moduloadministrativotiempo", 0, 0);
		featureAttributes[23][2] = new IntVar(store, "erp_moduloadministrativorecursoshumanos", 0, 0);
		featureAttributes[23][3] = new IntVar(store, "erp_moduloadministrativoriesgos", 0, 0);

		featureAttributes[24][0] = new IntVar(store, "erp_modulodeproduccioncostos", 0, 0);
		featureAttributes[24][1] = new IntVar(store, "erp_modulodeproducciontiempo", 0, 0);
		featureAttributes[24][2] = new IntVar(store, "erp_modulodeproduccionrecursoshumanos", 0, 0);
		featureAttributes[24][3] = new IntVar(store, "erp_modulodeproduccionriesgos", 0, 0);

		featureAttributes[25][0] = new IntVar(store, "erp_modulodeinteligenciadenegociocostos", 0, 0);
		featureAttributes[25][1] = new IntVar(store, "erp_modulodeinteligenciadenegociotiempo", 0, 0);
		featureAttributes[25][2] = new IntVar(store, "erp_modulodeinteligenciadenegociorecursoshumanos", 0, 0);
		featureAttributes[25][3] = new IntVar(store, "erp_modulodeinteligenciadenegocioriesgos", 0, 0);

		featureAttributes[26][0] = new IntVar(store, "erp_marketingyventascostos", 0, 0);
		featureAttributes[26][1] = new IntVar(store, "erp_marketingyventastiempo", 0, 0);
		featureAttributes[26][2] = new IntVar(store, "erp_marketingyventasrecursoshumanos", 0, 0);
		featureAttributes[26][3] = new IntVar(store, "erp_marketingyventasriesgos", 0, 0);

		featureAttributes[27][0] = new IntVar(store, "erp_modulodegestiondeproyectoscostos", 0, 0);
		featureAttributes[27][1] = new IntVar(store, "erp_modulodegestiondeproyectostiempo", 0, 0);
		featureAttributes[27][2] = new IntVar(store, "erp_modulodegestiondeproyectosrecursoshumanos", 0, 0);
		featureAttributes[27][3] = new IntVar(store, "erp_modulodegestiondeproyectosriesgos", 0, 0);

		featureAttributes[28][0] = new IntVar(store, "scm_sistemadegestiondeabastecimientocostos", 0, 0);
		featureAttributes[28][1] = new IntVar(store, "scm_sistemadegestiondeabastecimientotiempo", 0, 0);
		featureAttributes[28][2] = new IntVar(store, "scm_sistemadegestiondeabastecimientorecursoshumanos", 0, 0);
		featureAttributes[28][3] = new IntVar(store, "scm_sistemadegestiondeabastecimientoriesgos", 0, 0);

		featureAttributes[29][0] = new IntVar(store, "adquirirsistemanuevocostos", 0, 0);
		featureAttributes[29][1] = new IntVar(store, "adquirirsistemanuevotiempo", 0, 0);
		featureAttributes[29][2] = new IntVar(store, "adquirirsistemanuevorecursoshumanos", 0, 3);
		featureAttributes[29][3] = new IntVar(store, "adquirirsistemanuevoriesgos", 0, 109);

		featureAttributes[30][0] = new IntVar(store, "adaptarsistemaexistentecostos", 0, 0);
		featureAttributes[30][1] = new IntVar(store, "adaptarsistemaexistentetiempo", 0, 0);
		featureAttributes[30][2] = new IntVar(store, "adaptarsistemaexistenterecursoshumanos", 0, 2);
		featureAttributes[30][3] = new IntVar(store, "adaptarsistemaexistenteriesgos", 0, 74);

		featureAttributes[31][0] = new IntVar(store, "subcontratarpersonalizacioncostos", 0, 200000);
		featureAttributes[31][1] = new IntVar(store, "subcontratarpersonalizaciontiempo", 0, 0);
		featureAttributes[31][2] = new IntVar(store, "subcontratarpersonalizacionrecursoshumanos", 0, 10);
		featureAttributes[31][3] = new IntVar(store, "subcontratarpersonalizacionriesgos", 0, 113);

		featureAttributes[32][0] = new IntVar(store, "subcontratarpartedeldesarrolloeintegracioncostos", 0, 300000);
		featureAttributes[32][1] = new IntVar(store, "subcontratarpartedeldesarrolloeintegraciontiempo", 0, 0);
		featureAttributes[32][2] = new IntVar(store, "subcontratarpartedeldesarrolloeintegracionrecursoshumanos", 0, 5);
		featureAttributes[32][3] = new IntVar(store, "subcontratarpartedeldesarrolloeintegracionriesgos", 0, 113);

		featureAttributes[33][0] = new IntVar(store, "subcontratarlaadministraciondeunprocesodenegociocompletocostos", 0, 200000);
		featureAttributes[33][1] = new IntVar(store, "subcontratarlaadministraciondeunprocesodenegociocompletotiempo", 0, 0);
		featureAttributes[33][2] = new IntVar(store, "subcontratarlaadministraciondeunprocesodenegociocompletorecursoshumanos", 0, 7);
		featureAttributes[33][3] = new IntVar(store, "subcontratarlaadministraciondeunprocesodenegociocompletoriesgos", 0, 113);

		featureAttributes[34][0] = new IntVar(store, "subcontratargerenciadelproyectodeimplementacioncostos", 0, 150000);
		featureAttributes[34][1] = new IntVar(store, "subcontratargerenciadelproyectodeimplementaciontiempo", 0, 0);
		featureAttributes[34][2] = new IntVar(store, "subcontratargerenciadelproyectodeimplementacionrecursoshumanos", 0, 5);
		featureAttributes[34][3] = new IntVar(store, "subcontratargerenciadelproyectodeimplementacionriesgos", 0, 96);


		// FEATURE MODEL CONSTRAINTS (Constraints
		// Or constraints
		IntVar sumOr0= new IntVar(store, "sumOr0", 0, 20);
		BooleanVar[] varsOr0 = new BooleanVar[19];
		varsOr0[0] = segmentarydepurarclientes;
		varsOr0[1] = analisisdemarketing;
		varsOr0[2] = gestiondecampanias;
		varsOr0[3] = reducirciclosdeventas;
		varsOr0[4] = mejorarretenciondeclientes;
		varsOr0[5] = mejorarconocimientodelcliente;
		varsOr0[6] = implementarcontrolessobreprocesosfinancieros;
		varsOr0[7] = controlyadministraciondelpresupuesto;
		varsOr0[8] = manejodeinventarios;
		varsOr0[9] = manejodealmacen;
		varsOr0[10] = gestiondecompras;
		varsOr0[11] = comercioexterior;
		varsOr0[12] = disminuirtiemposdeentrega;
		varsOr0[13] = integracionconproveedores;
		varsOr0[14] = buscartendenciasyrelaciones;
		varsOr0[15] = compartirconocimiento;
		varsOr0[16] = predecirdisponibilidades;
		varsOr0[17] = planificarcapacidades;
		varsOr0[18] = gestiondelademanda;
		store.impose(new org.jacop.constraints.Sum(varsOr0, sumOr0));
		store.impose(new XgteqC(sumOr0, 1));

		// Alternative constraints
		BooleanVar sumAlt0= new BooleanVar(store, "sumAlt0");
		BooleanVar[] varsXor0 = new BooleanVar[3];
		varsXor0[0] = crm_customerrelationshipmanagement;
		varsXor0[1] = erp_enterpriseresourceplanning;
		varsXor0[2] = scm_sistemadegestiondeabastecimiento;
		store.impose(new org.jacop.constraints.Sum(varsXor0, sumAlt0));
		store.impose(new XeqC(sumAlt0, 1));

		BooleanVar sumAlt1= new BooleanVar(store, "sumAlt1");
		BooleanVar[] varsXor1 = new BooleanVar[2];
		varsXor1[0] = adquirirsistemanuevo;
		varsXor1[1] = adaptarsistemaexistente;
		store.impose(new org.jacop.constraints.Sum(varsXor1, sumAlt1));
		store.impose(new XeqC(sumAlt1, 1));

		BooleanVar sumAlt2= new BooleanVar(store, "sumAlt2");
		BooleanVar[] varsXor2 = new BooleanVar[4];
		varsXor2[0] = subcontratarpersonalizacion;
		varsXor2[1] = subcontratarpartedeldesarrolloeintegracion;
		varsXor2[2] = subcontratarlaadministraciondeunprocesodenegociocompleto;
		varsXor2[3] = subcontratargerenciadelproyectodeimplementacion;
		store.impose(new org.jacop.constraints.Sum(varsXor2, sumAlt2));
		store.impose(new XeqC(sumAlt2, 1));


		// Require constraints
		store.impose(new IfThen(new And(new XeqC(buscartendenciasyrelaciones, 1), new XeqC(compartirconocimiento, 1)), new XeqC(erp_modulodeinteligenciadenegocio, 1)));
		store.impose(new IfThen(new And(new XeqC(segmentarydepurarclientes, 1), new And(new XeqC(analisisdemarketing, 1), new XeqC(gestiondecampanias, 1))), new XeqC(crm_modulomarketing, 1)));
		store.impose(new IfThen(new And(new XeqC(reducirciclosdeventas, 1), new XeqC(mejorarretenciondeclientes, 1)), new XeqC(crm_moduloventas, 1)));
		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 1), new XeqC(crm_modulodeclientes, 1)));
		store.impose(new IfThen(new And(new XeqC(implementarcontrolessobreprocesosfinancieros, 1), new XeqC(controlyadministraciondelpresupuesto, 1)), new XeqC(erp_modulofinanciero, 1)));
		store.impose(new IfThen(new And(new XeqC(manejodeinventarios, 1), new And(new XeqC(manejodealmacen, 1), new And(new XeqC(gestiondecompras, 1), new XeqC(comercioexterior, 1)))), new XeqC(erp_moduloadministrativo, 1)));
		store.impose(new IfThen(new And(new XeqC(disminuirtiemposdeentrega, 1), new XeqC(integracionconproveedores, 1)), new XeqC(erp_modulodeproduccion, 1)));
		store.impose(new IfThen(new XeqC(gestiondelademanda, 1), new XeqC(scm_sistemadegestiondeabastecimiento, 1)));
		store.impose(new IfThen(new XeqC(gestiondecampanias, 1), new XeqC(erp_marketingyventas, 1)));
		store.impose(new IfThen(new And(new XeqC(predecirdisponibilidades, 1), new XeqC(planificarcapacidades, 1)), new XeqC(erp_modulodegestiondeproyectos, 1)));

		// Parent-children constraints
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(motivadoresdenegocio, 0)));
		store.impose(new IfThen(new XeqC(sistemasempresariales, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(sistemasempresariales, 0)));
		store.impose(new IfThen(new XeqC(nuevovsexistente, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(nuevovsexistente, 0)));
		store.impose(new IfThen(new XeqC(tercerizacion, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(tercerizacion, 0)));

		// Parent-children constraints
		store.impose(new IfThen(new XeqC(segmentarydepurarclientes, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(segmentarydepurarclientes, 0)));
		store.impose(new IfThen(new XeqC(analisisdemarketing, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(analisisdemarketing, 0)));
		store.impose(new IfThen(new XeqC(gestiondecampanias, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(gestiondecampanias, 0)));
		store.impose(new IfThen(new XeqC(reducirciclosdeventas, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(reducirciclosdeventas, 0)));
		store.impose(new IfThen(new XeqC(mejorarretenciondeclientes, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(mejorarretenciondeclientes, 0)));
		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(mejorarconocimientodelcliente, 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(implementarcontrolessobreprocesosfinancieros, 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(controlyadministraciondelpresupuesto, 0)));
		store.impose(new IfThen(new XeqC(manejodeinventarios, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(manejodeinventarios, 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(manejodealmacen, 0)));
		store.impose(new IfThen(new XeqC(gestiondecompras, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(gestiondecompras, 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(comercioexterior, 0)));
		store.impose(new IfThen(new XeqC(disminuirtiemposdeentrega, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(disminuirtiemposdeentrega, 0)));
		store.impose(new IfThen(new XeqC(integracionconproveedores, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(integracionconproveedores, 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(buscartendenciasyrelaciones, 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(compartirconocimiento, 0)));
		store.impose(new IfThen(new XeqC(predecirdisponibilidades, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(predecirdisponibilidades, 0)));
		store.impose(new IfThen(new XeqC(planificarcapacidades, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(planificarcapacidades, 0)));
		store.impose(new IfThen(new XeqC(gestiondelademanda, 1), new XeqC(motivadoresdenegocio, 1)));
		store.impose(new IfThen(new XeqC(motivadoresdenegocio, 0), new XeqC(gestiondelademanda, 0)));
		store.impose(new IfThen(new XeqC(crm_modulomarketing, 1), new XeqC(crm_customerrelationshipmanagement, 1)));
		store.impose(new IfThen(new XeqC(crm_customerrelationshipmanagement, 0), new XeqC(crm_modulomarketing, 0)));
		store.impose(new IfThen(new XeqC(crm_moduloventas, 1), new XeqC(crm_customerrelationshipmanagement, 1)));
		store.impose(new IfThen(new XeqC(crm_customerrelationshipmanagement, 0), new XeqC(crm_moduloventas, 0)));
		store.impose(new IfThen(new XeqC(crm_modulodeclientes, 1), new XeqC(crm_customerrelationshipmanagement, 1)));
		store.impose(new IfThen(new XeqC(crm_customerrelationshipmanagement, 0), new XeqC(crm_modulodeclientes, 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_modulofinanciero, 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_moduloadministrativo, 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeproduccion, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_modulodeproduccion, 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_modulodeinteligenciadenegocio, 0)));
		store.impose(new IfThen(new XeqC(erp_marketingyventas, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_marketingyventas, 0)));
		store.impose(new IfThen(new XeqC(erp_modulodegestiondeproyectos, 1), new XeqC(erp_enterpriseresourceplanning, 1)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 0), new XeqC(erp_modulodegestiondeproyectos, 0)));

		// Parent-children constraints
		store.impose(new IfThen(new XeqC(crm_customerrelationshipmanagement, 1), new XeqC(sistemasempresariales, 1)));
		store.impose(new IfThen(new XeqC(sistemasempresariales, 0), new XeqC(crm_customerrelationshipmanagement, 0)));
		store.impose(new IfThen(new XeqC(erp_enterpriseresourceplanning, 1), new XeqC(sistemasempresariales, 1)));
		store.impose(new IfThen(new XeqC(sistemasempresariales, 0), new XeqC(erp_enterpriseresourceplanning, 0)));
		store.impose(new IfThen(new XeqC(scm_sistemadegestiondeabastecimiento, 1), new XeqC(sistemasempresariales, 1)));
		store.impose(new IfThen(new XeqC(sistemasempresariales, 0), new XeqC(scm_sistemadegestiondeabastecimiento, 0)));
		store.impose(new IfThen(new XeqC(adquirirsistemanuevo, 1), new XeqC(nuevovsexistente, 1)));
		store.impose(new IfThen(new XeqC(nuevovsexistente, 0), new XeqC(adquirirsistemanuevo, 0)));
		store.impose(new IfThen(new XeqC(adaptarsistemaexistente, 1), new XeqC(nuevovsexistente, 1)));
		store.impose(new IfThen(new XeqC(nuevovsexistente, 0), new XeqC(adaptarsistemaexistente, 0)));
		store.impose(new IfThen(new XeqC(subcontratarpersonalizacion, 1), new XeqC(tercerizacion, 1)));
		store.impose(new IfThen(new XeqC(tercerizacion, 0), new XeqC(subcontratarpersonalizacion, 0)));
		store.impose(new IfThen(new XeqC(subcontratarpartedeldesarrolloeintegracion, 1), new XeqC(tercerizacion, 1)));
		store.impose(new IfThen(new XeqC(tercerizacion, 0), new XeqC(subcontratarpartedeldesarrolloeintegracion, 0)));
		store.impose(new IfThen(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 1), new XeqC(tercerizacion, 1)));
		store.impose(new IfThen(new XeqC(tercerizacion, 0), new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0)));
		store.impose(new IfThen(new XeqC(subcontratargerenciadelproyectodeimplementacion, 1), new XeqC(tercerizacion, 1)));
		store.impose(new IfThen(new XeqC(tercerizacion, 0), new XeqC(subcontratargerenciadelproyectodeimplementacion, 0)));

		store.impose(new IfThen(new XeqC(segmentarydepurarclientes, 0), new XeqC(featureAttributes[0][0], 0)));
		store.impose(new IfThen(new XeqC(segmentarydepurarclientes, 0), new XeqC(featureAttributes[0][1], 0)));
		store.impose(new IfThen(new XeqC(segmentarydepurarclientes, 0), new XeqC(featureAttributes[0][2], 0)));
		store.impose(new IfThen(new XeqC(segmentarydepurarclientes, 0), new XeqC(featureAttributes[0][3], 0)));

		store.impose(new IfThen(new XeqC(analisisdemarketing, 0), new XeqC(featureAttributes[1][0], 0)));
		store.impose(new IfThen(new XeqC(analisisdemarketing, 0), new XeqC(featureAttributes[1][1], 0)));
		store.impose(new IfThen(new XeqC(analisisdemarketing, 0), new XeqC(featureAttributes[1][2], 0)));
		store.impose(new IfThen(new XeqC(analisisdemarketing, 0), new XeqC(featureAttributes[1][3], 0)));

		store.impose(new IfThen(new XeqC(gestiondecampanias, 0), new XeqC(featureAttributes[2][0], 0)));
		store.impose(new IfThen(new XeqC(gestiondecampanias, 0), new XeqC(featureAttributes[2][1], 0)));
		store.impose(new IfThen(new XeqC(gestiondecampanias, 0), new XeqC(featureAttributes[2][2], 0)));
		store.impose(new IfThen(new XeqC(gestiondecampanias, 0), new XeqC(featureAttributes[2][3], 0)));

		store.impose(new IfThen(new XeqC(reducirciclosdeventas, 0), new XeqC(featureAttributes[3][0], 0)));
		store.impose(new IfThen(new XeqC(reducirciclosdeventas, 0), new XeqC(featureAttributes[3][1], 0)));
		store.impose(new IfThen(new XeqC(reducirciclosdeventas, 0), new XeqC(featureAttributes[3][2], 0)));
		store.impose(new IfThen(new XeqC(reducirciclosdeventas, 0), new XeqC(featureAttributes[3][3], 0)));

		store.impose(new IfThen(new XeqC(mejorarretenciondeclientes, 0), new XeqC(featureAttributes[4][0], 0)));
		store.impose(new IfThen(new XeqC(mejorarretenciondeclientes, 0), new XeqC(featureAttributes[4][1], 0)));
		store.impose(new IfThen(new XeqC(mejorarretenciondeclientes, 0), new XeqC(featureAttributes[4][2], 0)));
		store.impose(new IfThen(new XeqC(mejorarretenciondeclientes, 0), new XeqC(featureAttributes[4][3], 0)));

		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 0), new XeqC(featureAttributes[5][0], 0)));
		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 0), new XeqC(featureAttributes[5][1], 0)));
		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 0), new XeqC(featureAttributes[5][2], 0)));
		store.impose(new IfThen(new XeqC(mejorarconocimientodelcliente, 0), new XeqC(featureAttributes[5][3], 0)));

		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][0], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][1], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][2], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][3], 0)));

		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][0], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][1], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][2], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][3], 0)));

		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][0], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][1], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][2], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][3], 0)));

		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][0], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][1], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][2], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][3], 0)));

		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][0], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][1], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][2], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][3], 0)));

		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][0], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][1], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][2], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][3], 0)));

		store.impose(new IfThen(new XeqC(crm_modulomarketing, 0), new XeqC(featureAttributes[19][0], 0)));
		store.impose(new IfThen(new XeqC(crm_modulomarketing, 0), new XeqC(featureAttributes[19][1], 0)));
		store.impose(new IfThen(new XeqC(crm_modulomarketing, 0), new XeqC(featureAttributes[19][2], 0)));
		store.impose(new IfThen(new XeqC(crm_modulomarketing, 0), new XeqC(featureAttributes[19][3], 0)));

		store.impose(new IfThen(new XeqC(crm_moduloventas, 0), new XeqC(featureAttributes[20][0], 0)));
		store.impose(new IfThen(new XeqC(crm_moduloventas, 0), new XeqC(featureAttributes[20][1], 0)));
		store.impose(new IfThen(new XeqC(crm_moduloventas, 0), new XeqC(featureAttributes[20][2], 0)));
		store.impose(new IfThen(new XeqC(crm_moduloventas, 0), new XeqC(featureAttributes[20][3], 0)));

		store.impose(new IfThen(new XeqC(crm_modulodeclientes, 0), new XeqC(featureAttributes[21][0], 0)));
		store.impose(new IfThen(new XeqC(crm_modulodeclientes, 0), new XeqC(featureAttributes[21][1], 0)));
		store.impose(new IfThen(new XeqC(crm_modulodeclientes, 0), new XeqC(featureAttributes[21][2], 0)));
		store.impose(new IfThen(new XeqC(crm_modulodeclientes, 0), new XeqC(featureAttributes[21][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][3], 0)));

		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][0], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][1], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][2], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][3], 0)));

		store.impose(new IfThen(new XeqC(erp_marketingyventas, 0), new XeqC(featureAttributes[26][0], 0)));
		store.impose(new IfThen(new XeqC(erp_marketingyventas, 0), new XeqC(featureAttributes[26][1], 0)));
		store.impose(new IfThen(new XeqC(erp_marketingyventas, 0), new XeqC(featureAttributes[26][2], 0)));
		store.impose(new IfThen(new XeqC(erp_marketingyventas, 0), new XeqC(featureAttributes[26][3], 0)));

		store.impose(new IfThen(new XeqC(adquirirsistemanuevo, 0), new XeqC(featureAttributes[29][0], 0)));
		store.impose(new IfThen(new XeqC(adquirirsistemanuevo, 0), new XeqC(featureAttributes[29][1], 0)));
		store.impose(new IfThen(new XeqC(adquirirsistemanuevo, 0), new XeqC(featureAttributes[29][2], 0)));
		store.impose(new IfThen(new XeqC(adquirirsistemanuevo, 0), new XeqC(featureAttributes[29][3], 0)));

		store.impose(new IfThen(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0), new XeqC(featureAttributes[33][0], 0)));
		store.impose(new IfThen(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0), new XeqC(featureAttributes[33][1], 0)));
		store.impose(new IfThen(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0), new XeqC(featureAttributes[33][2], 0)));
		store.impose(new IfThen(new XeqC(subcontratarlaadministraciondeunprocesodenegociocompleto, 0), new XeqC(featureAttributes[33][3], 0)));

		BooleanVar[] selectVars = new BooleanVar[42];
		selectVars[0] = inversionti;
		selectVars[1] = motivadoresdenegocio;
		selectVars[2] = sistemasempresariales;
		selectVars[3] = nuevovsexistente;
		selectVars[4] = tercerizacion;
		selectVars[5] = crm_customerrelationshipmanagement;
		selectVars[6] = erp_enterpriseresourceplanning;
		selectVars[7] = segmentarydepurarclientes;
		selectVars[8] = analisisdemarketing;
		selectVars[9] = gestiondecampanias;
		selectVars[10] = reducirciclosdeventas;
		selectVars[11] = mejorarretenciondeclientes;
		selectVars[12] = mejorarconocimientodelcliente;
		selectVars[13] = implementarcontrolessobreprocesosfinancieros;
		selectVars[14] = controlyadministraciondelpresupuesto;
		selectVars[15] = manejodeinventarios;
		selectVars[16] = manejodealmacen;
		selectVars[17] = gestiondecompras;
		selectVars[18] = comercioexterior;
		selectVars[19] = disminuirtiemposdeentrega;
		selectVars[20] = integracionconproveedores;
		selectVars[21] = buscartendenciasyrelaciones;
		selectVars[22] = compartirconocimiento;
		selectVars[23] = predecirdisponibilidades;
		selectVars[24] = planificarcapacidades;
		selectVars[25] = gestiondelademanda;
		selectVars[26] = crm_modulomarketing;
		selectVars[27] = crm_moduloventas;
		selectVars[28] = crm_modulodeclientes;
		selectVars[29] = erp_modulofinanciero;
		selectVars[30] = erp_moduloadministrativo;
		selectVars[31] = erp_modulodeproduccion;
		selectVars[32] = erp_modulodeinteligenciadenegocio;
		selectVars[33] = erp_marketingyventas;
		selectVars[34] = erp_modulodegestiondeproyectos;
		selectVars[35] = scm_sistemadegestiondeabastecimiento;
		selectVars[36] = adquirirsistemanuevo;
		selectVars[37] = adaptarsistemaexistente;
		selectVars[38] = subcontratarpersonalizacion;
		selectVars[39] = subcontratarpartedeldesarrolloeintegracion;
		selectVars[40] = subcontratarlaadministraciondeunprocesodenegociocompleto;
		selectVars[41] = subcontratargerenciadelproyectodeimplementacion;
		
		IntVar[] varCostos = new IntVar[featureAttributes.length];
		IntVar[] varTiempo = new IntVar[featureAttributes.length];
		IntVar[] varRH = new IntVar[featureAttributes.length];
		int maxCostos = 0;
		int maxTiempo = 0;
		int maxRH = 0;
		
		for (int i = 0; i < featureAttributes.length; i ++) {
			varCostos [i] = featureAttributes[i][0];
			varTiempo [i] = featureAttributes[i][1];
			varRH [i] = featureAttributes[i][2];
			
			maxCostos += featureAttributes[i][0].max();
			maxTiempo += featureAttributes[i][1].max();
			maxRH += featureAttributes[i][1].max();
		}
		
		IntVar totalCostos = new IntVar(store, "totalCostos", 0, maxCostos);
		IntVar totalTiempo = new IntVar(store, "totalTiempo", 0, maxTiempo);
		IntVar totalRH = new IntVar(store, "totalRH", 0, maxRH);
		
		store.impose(new org.jacop.constraints.Sum(varCostos, totalCostos));
		store.impose(new org.jacop.constraints.Sum(varTiempo, totalTiempo));
		store.impose(new org.jacop.constraints.Sum(varTiempo, totalRH));

		Search<IntVar> selectSearch = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> selectSelect = new InputOrderSelect<IntVar>(store,
			selectVars, new IndomainMiddle<IntVar>());
		selectSearch.setSelectChoicePoint(selectSelect);
		
		Search<IntVar> costosSearch = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> costosSelect = new SimpleSelect<IntVar>(varCostos,
			new SmallestMin<IntVar>(), new SmallestDomain<IntVar>(), new IndomainMin<IntVar>());
		costosSearch.setSelectChoicePoint(costosSelect);
		costosSearch.addChildSearch(selectSearch);
		
		Search<IntVar> tiempoSearch = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> tiempoSelect = new SimpleSelect<IntVar>(varTiempo,
			new SmallestMin<IntVar>(), new SmallestDomain<IntVar>(), new IndomainMin<IntVar>());
		tiempoSearch.setSelectChoicePoint(tiempoSelect);
		tiempoSearch.addChildSearch(costosSearch);
		
		Search<IntVar> hrSearch = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> hrSelect = new SimpleSelect<IntVar>(varRH, 
			new LargestMax<IntVar>(), new LargestDomain<IntVar>(), new IndomainMax<IntVar>());
		hrSearch.addChildSearch(tiempoSearch);
		boolean result = hrSearch.labeling(store, hrSelect);
		
	}
}
