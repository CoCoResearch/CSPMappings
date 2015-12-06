package co.edu.uniandes.jacop.scenarios;

import org.jacop.constraints.And;
import org.jacop.constraints.IfThen;
import org.jacop.constraints.XeqC;
import org.jacop.constraints.XgteqC;
import org.jacop.core.BooleanVar;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMiddle;
import org.jacop.search.IndomainMin;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSelect;
import org.jacop.search.SmallestDomain;
import org.jacop.search.SmallestMin;

public class Scenario02Team03 {
	public void solveProblem() {
		Store store = new Store();

		// FEATURES (Variables & Domains)
		BooleanVar inversionti = new BooleanVar(store, "inversionti");
		BooleanVar motivadoresdenegocio = new BooleanVar(store, "motivadoresdenegocio");
		store.impose(new XeqC(motivadoresdenegocio, 1));
		BooleanVar sistemasempresariales = new BooleanVar(store, "sistemasempresariales");
		store.impose(new XeqC(sistemasempresariales, 1));
		BooleanVar modelodeimplementacion = new BooleanVar(store, "modelodeimplementacion");
		store.impose(new XeqC(modelodeimplementacion, 1));
		BooleanVar financiacion = new BooleanVar(store, "financiacion");
		store.impose(new XeqC(financiacion, 1));
		BooleanVar crm_customerrelationshipmanagement = new BooleanVar(store, "crm_customerrelationshipmanagement");
		BooleanVar erp_enterpriseresourceplanning = new BooleanVar(store, "erp_enterpriseresourceplanning");
		BooleanVar segmentarydepurarclientes = new BooleanVar(store, "segmentarydepurarclientes");
		BooleanVar analisisdemarketing = new BooleanVar(store, "analisisdemarketing");
		BooleanVar gestiondecampanias = new BooleanVar(store, "gestiondecampanias");
		store.impose(new XeqC(gestiondecampanias, 1));
		BooleanVar reducirciclosdeventas = new BooleanVar(store, "reducirciclosdeventas");
		BooleanVar mejorarretenciondeclientes = new BooleanVar(store, "mejorarretenciondeclientes");
		BooleanVar mejorarconocimientodelcliente = new BooleanVar(store, "mejorarconocimientodelcliente");
		BooleanVar implementarcontrolessobreprocesosfinancieros = new BooleanVar(store, "implementarcontrolessobreprocesosfinancieros");
		store.impose(new XeqC(implementarcontrolessobreprocesosfinancieros, 0));
		BooleanVar controlyadministraciondelpresupuesto = new BooleanVar(store, "controlyadministraciondelpresupuesto");
		store.impose(new XeqC(controlyadministraciondelpresupuesto, 0));
		BooleanVar manejodeinventarios = new BooleanVar(store, "manejodeinventarios");
		store.impose(new XeqC(manejodeinventarios, 0));
		BooleanVar manejodealmacen = new BooleanVar(store, "manejodealmacen");
		store.impose(new XeqC(manejodealmacen, 0));
		BooleanVar gestiondecompras = new BooleanVar(store, "gestiondecompras");
		store.impose(new XeqC(gestiondecompras, 0));
		BooleanVar comercioexterior = new BooleanVar(store, "comercioexterior");
		store.impose(new XeqC(comercioexterior, 0));
		BooleanVar disminuirtiemposdeentrega = new BooleanVar(store, "disminuirtiemposdeentrega");
		store.impose(new XeqC(disminuirtiemposdeentrega, 0));
		BooleanVar integracionconproveedores = new BooleanVar(store, "integracionconproveedores");
		store.impose(new XeqC(integracionconproveedores, 0));
		BooleanVar buscartendenciasyrelaciones = new BooleanVar(store, "buscartendenciasyrelaciones");
		store.impose(new XeqC(buscartendenciasyrelaciones, 0));
		BooleanVar compartirconocimiento = new BooleanVar(store, "compartirconocimiento");
		store.impose(new XeqC(compartirconocimiento, 0));
		BooleanVar predecirdisponibilidades = new BooleanVar(store, "predecirdisponibilidades");
		store.impose(new XeqC(predecirdisponibilidades, 0));
		BooleanVar planificarcapacidades = new BooleanVar(store, "planificarcapacidades");
		store.impose(new XeqC(planificarcapacidades, 0));
		BooleanVar gestiondelademanda = new BooleanVar(store, "gestiondelademanda");
		store.impose(new XeqC(gestiondelademanda, 0));
		BooleanVar crm_modulomarketing = new BooleanVar(store, "crm_modulomarketing");
		BooleanVar crm_moduloventas = new BooleanVar(store, "crm_moduloventas");
		BooleanVar crm_modulodeclientes = new BooleanVar(store, "crm_modulodeclientes");
		BooleanVar erp_modulofinanciero = new BooleanVar(store, "erp_modulofinanciero");
		store.impose(new XeqC(erp_modulofinanciero, 0));
		BooleanVar erp_moduloadministrativo = new BooleanVar(store, "erp_moduloadministrativo");
		store.impose(new XeqC(erp_moduloadministrativo, 0));
		BooleanVar erp_modulodeproduccion = new BooleanVar(store, "erp_modulodeproduccion");
		store.impose(new XeqC(erp_modulodeproduccion, 0));
		BooleanVar erp_modulodeinteligenciadenegocio = new BooleanVar(store, "erp_modulodeinteligenciadenegocio");
		store.impose(new XeqC(erp_modulodeinteligenciadenegocio, 0));
		BooleanVar erp_marketingyventas = new BooleanVar(store, "erp_marketingyventas");
		BooleanVar erp_modulodegestiondeproyectos = new BooleanVar(store, "erp_modulodegestiondeproyectos");
		store.impose(new XeqC(erp_modulodegestiondeproyectos, 0));
		BooleanVar scm_sistemadegestiondeabastecimiento = new BooleanVar(store, "scm_sistemadegestiondeabastecimiento");
		store.impose(new XeqC(scm_sistemadegestiondeabastecimiento, 0));
		BooleanVar bigbang = new BooleanVar(store, "bigbang");
		BooleanVar implementacionporfases = new BooleanVar(store, "implementacionporfases");
		BooleanVar implementacionporprocesos = new BooleanVar(store, "implementacionporprocesos");
		store.impose(new XeqC(implementacionporprocesos, 0));
		BooleanVar recursospropios = new BooleanVar(store, "recursospropios");
		BooleanVar credito = new BooleanVar(store, "credito");
		store.impose(new XeqC(credito, 0));
		BooleanVar leasing = new BooleanVar(store, "leasing");
		store.impose(new XeqC(leasing, 0));

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

		featureAttributes[29][0] = new IntVar(store, "bigbangcostos", 0, 0);
		featureAttributes[29][1] = new IntVar(store, "bigbangtiempo", 0, 0);
		featureAttributes[29][2] = new IntVar(store, "bigbangrecursoshumanos", 0, 0);
		featureAttributes[29][3] = new IntVar(store, "bigbangriesgos", 0, 55);

		featureAttributes[30][0] = new IntVar(store, "implementacionporfasescostos", 0, 0);
		featureAttributes[30][1] = new IntVar(store, "implementacionporfasestiempo", 0, 0);
		featureAttributes[30][2] = new IntVar(store, "implementacionporfasesrecursoshumanos", 0, 0);
		featureAttributes[30][3] = new IntVar(store, "implementacionporfasesriesgos", 0, 110);

		featureAttributes[31][0] = new IntVar(store, "implementacionporprocesoscostos", 0, 0);
		featureAttributes[31][1] = new IntVar(store, "implementacionporprocesostiempo", 0, 0);
		featureAttributes[31][2] = new IntVar(store, "implementacionporprocesosrecursoshumanos", 0, 0);
		featureAttributes[31][3] = new IntVar(store, "implementacionporprocesosriesgos", 0, 65);

		featureAttributes[32][0] = new IntVar(store, "recursospropioscostos", 0, 0);
		featureAttributes[32][1] = new IntVar(store, "recursospropiostiempo", 0, 0);
		featureAttributes[32][2] = new IntVar(store, "recursospropiosrecursoshumanos", 0, 0);
		featureAttributes[32][3] = new IntVar(store, "recursospropiosriesgos", 0, 12);

		featureAttributes[33][0] = new IntVar(store, "creditocostos", 0, 0);
		featureAttributes[33][1] = new IntVar(store, "creditotiempo", 0, 0);
		featureAttributes[33][2] = new IntVar(store, "creditorecursoshumanos", 0, 0);
		featureAttributes[33][3] = new IntVar(store, "creditoriesgos", 0, 36);

		featureAttributes[34][0] = new IntVar(store, "leasingcostos", 0, 0);
		featureAttributes[34][1] = new IntVar(store, "leasingtiempo", 0, 0);
		featureAttributes[34][2] = new IntVar(store, "leasingrecursoshumanos", 0, 0);
		featureAttributes[34][3] = new IntVar(store, "leasingriesgos", 0, 23);


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

		/*IntVar sumOr1= new IntVar(store, "sumOr1", 0, 4);
		BooleanVar[] varsOr1 = new BooleanVar[3];
		varsOr1[0] = crm_modulomarketing;
		varsOr1[1] = crm_moduloventas;
		varsOr1[2] = crm_modulodeclientes;
		store.impose(new org.jacop.constraints.Sum(varsOr1, sumOr1));
		store.impose(new XgteqC(sumOr1, 1));

		IntVar sumOr2= new IntVar(store, "sumOr2", 0, 7);
		BooleanVar[] varsOr2 = new BooleanVar[6];
		varsOr2[0] = erp_modulofinanciero;
		varsOr2[1] = erp_moduloadministrativo;
		varsOr2[2] = erp_modulodeproduccion;
		varsOr2[3] = erp_modulodeinteligenciadenegocio;
		varsOr2[4] = erp_marketingyventas;
		varsOr2[5] = erp_modulodegestiondeproyectos;
		store.impose(new org.jacop.constraints.Sum(varsOr2, sumOr2));
		store.impose(new XgteqC(sumOr2, 1));*/


		// Alternative constraints
		BooleanVar sumAlt0= new BooleanVar(store, "sumAlt0");
		BooleanVar[] varsXor0 = new BooleanVar[3];
		varsXor0[0] = crm_customerrelationshipmanagement;
		varsXor0[1] = erp_enterpriseresourceplanning;
		varsXor0[2] = scm_sistemadegestiondeabastecimiento;
		store.impose(new org.jacop.constraints.Sum(varsXor0, sumAlt0));
		store.impose(new XeqC(sumAlt0, 1));

		BooleanVar sumAlt1= new BooleanVar(store, "sumAlt1");
		BooleanVar[] varsXor1 = new BooleanVar[3];
		varsXor1[0] = bigbang;
		varsXor1[1] = implementacionporfases;
		varsXor1[2] = implementacionporprocesos;
		store.impose(new org.jacop.constraints.Sum(varsXor1, sumAlt1));
		store.impose(new XeqC(sumAlt1, 1));

		BooleanVar sumAlt2= new BooleanVar(store, "sumAlt2");
		BooleanVar[] varsXor2 = new BooleanVar[3];
		varsXor2[0] = recursospropios;
		varsXor2[1] = credito;
		varsXor2[2] = leasing;
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
		store.impose(new IfThen(new XeqC(modelodeimplementacion, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(modelodeimplementacion, 0)));
		store.impose(new IfThen(new XeqC(financiacion, 1), new XeqC(inversionti, 1)));
		store.impose(new IfThen(new XeqC(inversionti, 0), new XeqC(financiacion, 0)));

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
		store.impose(new IfThen(new XeqC(bigbang, 1), new XeqC(modelodeimplementacion, 1)));
		store.impose(new IfThen(new XeqC(modelodeimplementacion, 0), new XeqC(bigbang, 0)));
		store.impose(new IfThen(new XeqC(implementacionporfases, 1), new XeqC(modelodeimplementacion, 1)));
		store.impose(new IfThen(new XeqC(modelodeimplementacion, 0), new XeqC(implementacionporfases, 0)));
		store.impose(new IfThen(new XeqC(implementacionporprocesos, 1), new XeqC(modelodeimplementacion, 1)));
		store.impose(new IfThen(new XeqC(modelodeimplementacion, 0), new XeqC(implementacionporprocesos, 0)));
		store.impose(new IfThen(new XeqC(recursospropios, 1), new XeqC(financiacion, 1)));
		store.impose(new IfThen(new XeqC(financiacion, 0), new XeqC(recursospropios, 0)));
		store.impose(new IfThen(new XeqC(credito, 1), new XeqC(financiacion, 1)));
		store.impose(new IfThen(new XeqC(financiacion, 0), new XeqC(credito, 0)));
		store.impose(new IfThen(new XeqC(leasing, 1), new XeqC(financiacion, 1)));
		store.impose(new IfThen(new XeqC(financiacion, 0), new XeqC(leasing, 0)));

		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][0], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][1], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][2], 0)));
		store.impose(new IfThen(new XeqC(implementarcontrolessobreprocesosfinancieros, 0), new XeqC(featureAttributes[6][3], 0)));

		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][0], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][1], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][2], 0)));
		store.impose(new IfThen(new XeqC(controlyadministraciondelpresupuesto, 0), new XeqC(featureAttributes[7][3], 0)));

		store.impose(new IfThen(new XeqC(manejodeinventarios, 0), new XeqC(featureAttributes[8][0], 0)));
		store.impose(new IfThen(new XeqC(manejodeinventarios, 0), new XeqC(featureAttributes[8][1], 0)));
		store.impose(new IfThen(new XeqC(manejodeinventarios, 0), new XeqC(featureAttributes[8][2], 0)));
		store.impose(new IfThen(new XeqC(manejodeinventarios, 0), new XeqC(featureAttributes[8][3], 0)));

		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][0], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][1], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][2], 0)));
		store.impose(new IfThen(new XeqC(manejodealmacen, 0), new XeqC(featureAttributes[9][3], 0)));

		store.impose(new IfThen(new XeqC(gestiondecompras, 0), new XeqC(featureAttributes[10][0], 0)));
		store.impose(new IfThen(new XeqC(gestiondecompras, 0), new XeqC(featureAttributes[10][1], 0)));
		store.impose(new IfThen(new XeqC(gestiondecompras, 0), new XeqC(featureAttributes[10][2], 0)));
		store.impose(new IfThen(new XeqC(gestiondecompras, 0), new XeqC(featureAttributes[10][3], 0)));

		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][0], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][1], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][2], 0)));
		store.impose(new IfThen(new XeqC(comercioexterior, 0), new XeqC(featureAttributes[11][3], 0)));

		store.impose(new IfThen(new XeqC(disminuirtiemposdeentrega, 0), new XeqC(featureAttributes[12][0], 0)));
		store.impose(new IfThen(new XeqC(disminuirtiemposdeentrega, 0), new XeqC(featureAttributes[12][1], 0)));
		store.impose(new IfThen(new XeqC(disminuirtiemposdeentrega, 0), new XeqC(featureAttributes[12][2], 0)));
		store.impose(new IfThen(new XeqC(disminuirtiemposdeentrega, 0), new XeqC(featureAttributes[12][3], 0)));

		store.impose(new IfThen(new XeqC(integracionconproveedores, 0), new XeqC(featureAttributes[13][0], 0)));
		store.impose(new IfThen(new XeqC(integracionconproveedores, 0), new XeqC(featureAttributes[13][1], 0)));
		store.impose(new IfThen(new XeqC(integracionconproveedores, 0), new XeqC(featureAttributes[13][2], 0)));
		store.impose(new IfThen(new XeqC(integracionconproveedores, 0), new XeqC(featureAttributes[13][3], 0)));

		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][0], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][1], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][2], 0)));
		store.impose(new IfThen(new XeqC(buscartendenciasyrelaciones, 0), new XeqC(featureAttributes[14][3], 0)));

		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][0], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][1], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][2], 0)));
		store.impose(new IfThen(new XeqC(compartirconocimiento, 0), new XeqC(featureAttributes[15][3], 0)));

		store.impose(new IfThen(new XeqC(predecirdisponibilidades, 0), new XeqC(featureAttributes[16][0], 0)));
		store.impose(new IfThen(new XeqC(predecirdisponibilidades, 0), new XeqC(featureAttributes[16][1], 0)));
		store.impose(new IfThen(new XeqC(predecirdisponibilidades, 0), new XeqC(featureAttributes[16][2], 0)));
		store.impose(new IfThen(new XeqC(predecirdisponibilidades, 0), new XeqC(featureAttributes[16][3], 0)));

		store.impose(new IfThen(new XeqC(planificarcapacidades, 0), new XeqC(featureAttributes[17][0], 0)));
		store.impose(new IfThen(new XeqC(planificarcapacidades, 0), new XeqC(featureAttributes[17][1], 0)));
		store.impose(new IfThen(new XeqC(planificarcapacidades, 0), new XeqC(featureAttributes[17][2], 0)));
		store.impose(new IfThen(new XeqC(planificarcapacidades, 0), new XeqC(featureAttributes[17][3], 0)));

		store.impose(new IfThen(new XeqC(gestiondelademanda, 0), new XeqC(featureAttributes[18][0], 0)));
		store.impose(new IfThen(new XeqC(gestiondelademanda, 0), new XeqC(featureAttributes[18][1], 0)));
		store.impose(new IfThen(new XeqC(gestiondelademanda, 0), new XeqC(featureAttributes[18][2], 0)));
		store.impose(new IfThen(new XeqC(gestiondelademanda, 0), new XeqC(featureAttributes[18][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulofinanciero, 0), new XeqC(featureAttributes[22][3], 0)));

		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][0], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][1], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][2], 0)));
		store.impose(new IfThen(new XeqC(erp_moduloadministrativo, 0), new XeqC(featureAttributes[23][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulodeproduccion, 0), new XeqC(featureAttributes[24][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeproduccion, 0), new XeqC(featureAttributes[24][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeproduccion, 0), new XeqC(featureAttributes[24][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeproduccion, 0), new XeqC(featureAttributes[24][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodeinteligenciadenegocio, 0), new XeqC(featureAttributes[25][3], 0)));

		store.impose(new IfThen(new XeqC(erp_modulodegestiondeproyectos, 0), new XeqC(featureAttributes[27][0], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodegestiondeproyectos, 0), new XeqC(featureAttributes[27][1], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodegestiondeproyectos, 0), new XeqC(featureAttributes[27][2], 0)));
		store.impose(new IfThen(new XeqC(erp_modulodegestiondeproyectos, 0), new XeqC(featureAttributes[27][3], 0)));

		store.impose(new IfThen(new XeqC(scm_sistemadegestiondeabastecimiento, 0), new XeqC(featureAttributes[28][0], 0)));
		store.impose(new IfThen(new XeqC(scm_sistemadegestiondeabastecimiento, 0), new XeqC(featureAttributes[28][1], 0)));
		store.impose(new IfThen(new XeqC(scm_sistemadegestiondeabastecimiento, 0), new XeqC(featureAttributes[28][2], 0)));
		store.impose(new IfThen(new XeqC(scm_sistemadegestiondeabastecimiento, 0), new XeqC(featureAttributes[28][3], 0)));

		store.impose(new IfThen(new XeqC(implementacionporprocesos, 0), new XeqC(featureAttributes[31][0], 0)));
		store.impose(new IfThen(new XeqC(implementacionporprocesos, 0), new XeqC(featureAttributes[31][1], 0)));
		store.impose(new IfThen(new XeqC(implementacionporprocesos, 0), new XeqC(featureAttributes[31][2], 0)));
		store.impose(new IfThen(new XeqC(implementacionporprocesos, 0), new XeqC(featureAttributes[31][3], 0)));

		store.impose(new IfThen(new XeqC(credito, 0), new XeqC(featureAttributes[33][0], 0)));
		store.impose(new IfThen(new XeqC(credito, 0), new XeqC(featureAttributes[33][1], 0)));
		store.impose(new IfThen(new XeqC(credito, 0), new XeqC(featureAttributes[33][2], 0)));
		store.impose(new IfThen(new XeqC(credito, 0), new XeqC(featureAttributes[33][3], 0)));

		store.impose(new IfThen(new XeqC(leasing, 0), new XeqC(featureAttributes[34][0], 0)));
		store.impose(new IfThen(new XeqC(leasing, 0), new XeqC(featureAttributes[34][1], 0)));
		store.impose(new IfThen(new XeqC(leasing, 0), new XeqC(featureAttributes[34][2], 0)));
		store.impose(new IfThen(new XeqC(leasing, 0), new XeqC(featureAttributes[34][3], 0)));

		BooleanVar[] selectVars = new BooleanVar[42];
		selectVars[0] = inversionti;
		selectVars[1] = motivadoresdenegocio;
		selectVars[2] = sistemasempresariales;
		selectVars[3] = modelodeimplementacion;
		selectVars[4] = financiacion;
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
		selectVars[36] = bigbang;
		selectVars[37] = implementacionporfases;
		selectVars[38] = implementacionporprocesos;
		selectVars[39] = recursospropios;
		selectVars[40] = credito;
		selectVars[41] = leasing;
		
		IntVar[] varRiesgos = new IntVar[featureAttributes.length];
		int maxRiesgos = 0;
		
		for (int i = 0; i < featureAttributes.length; i ++) {
			varRiesgos [i] = featureAttributes[i][3];
			maxRiesgos += featureAttributes[i][3].max();
		}
		
		IntVar totalRiesgos = new IntVar(store, "totalRiesgos", 0, maxRiesgos);
		store.impose(new org.jacop.constraints.Sum(varRiesgos, totalRiesgos));

		Search<IntVar> selectSearch = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> selectSelect = new InputOrderSelect<IntVar>(store,
			selectVars, new IndomainMiddle<IntVar>());
		selectSearch.setSelectChoicePoint(selectSelect);
		
		Search<IntVar> search = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> select = new SimpleSelect<IntVar>(varRiesgos, 
			new SmallestMin<IntVar>(), new SmallestDomain<IntVar>(), new IndomainMin<IntVar>());
		search.addChildSearch(selectSearch);
		search.setOptimize(true);
		boolean result = search.labeling(store, select);
	}
}
