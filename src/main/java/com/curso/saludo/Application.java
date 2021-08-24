package com.curso.saludo;

import org.apache.log4j.Logger;

public class Application
{
	static Logger log = Logger.getLogger(Application.class);
	public static void main( String[] args )
	{
		System.out.println("Ejemplo");
		log.debug("Ejemplo debug");
	}
}