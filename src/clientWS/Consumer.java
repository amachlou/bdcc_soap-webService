package clientWS;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import web.services.EnumTypeOperation;
import web.services.JAXBException;
import web.services.Operation;
import web.services.Releve;
import web.services.ReleveWebServiceProxy;

public class Consumer {

	public static void main(String[] args) throws javax.xml.bind.JAXBException, IOException {
		
		DateTimeFormatter simpleDate = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

		ReleveWebServiceProxy releveProxy = new ReleveWebServiceProxy();
		Releve releve = releveProxy.releveDetails();
		
		System.out.println("/******* Releve *******/");
		System.out.println(" RIG :"+releve.getRIB());
		System.out.println(" Date :"+releve.getDateReleve());
		System.out.println(" Solde :"+releve.getSolde());
		System.out.println(" Date de debut des operation :"+releve.getRIB());
		System.out.println(" Date de fin des operation :"+releve.getRIB());
		
		System.out.println();
		
		for (Operation op : releve.getList_operation()) {
			System.out.print(op.getType() == EnumTypeOperation.CREDIT ? "+":"-");
			System.out.print(op.getType());
			System.out.println("\t Date : "+simpleDate.format(LocalDate.parse(op.getDate().toString())));
			System.out.println("\t Montant : "+op.getMontant());
			System.out.println("\t Description : "+op.getDescription());
		}
		
	}

}
