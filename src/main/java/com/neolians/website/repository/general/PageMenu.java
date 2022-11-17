package com.neolians.website.repository.general;

import com.neolians.common.utils.selenium.elements.ButtonElement;
import org.openqa.selenium.By;

import com.neolians.common.utils.selenium.elements.BlockElement;

public class PageMenu {
	private PageMenu() {
		throw new IllegalStateException("Utility class");
	}

	public static final BlockElement neoliansLogo = new BlockElement("neolians Logo",
			By.xpath("//div[@data-id='216eed88']"));

	public static final BlockElement home = new BlockElement("Menu Home", By.id("menu-item-25733"));

	public static final BlockElement entreprise = new BlockElement("L'ENTREPRISE",
			By.id("menu-item-26120"));

	public static final  BlockElement nosOffres = new BlockElement("NOS OFFRES"
			,By.id("menu-item-26119"));

	//public static final  BlockElement nousRejoindre =new BlockElement("NOUS REJOINDRE",
			//By.linkText("Nous rejoindre"));

	public static final  BlockElement nousRejoindre =new BlockElement("NOUS REJOINDRE",
			By.id("menu-item-25978"));

	public static final  BlockElement contact=new BlockElement("CONTACT",
			By.xpath("//div[@data-id='210dc39']"));

	public static final BlockElement iconLinkedIn1= new BlockElement("Icone linkedin1",
			By.xpath("//div[@data-id='03a7bfc']"));



	public static final ButtonElement NosPartenairesButton =new ButtonElement("Bouton Nos partenaires",
			By.id("menu-item-25989"));


	public static final ButtonElement NeoServicesButton =new ButtonElement("Bouton Neo.services",
			By.id("menu-item-25986"));



	public static final ButtonElement NeoMobileButton =new ButtonElement("Bouton Neo.mobile",
			By.id("menu-item-25985"));

//Nada
	//Nos projets

	public static final ButtonElement nosprojets=new ButtonElement("Nos Projets",By.xpath("//li[@id='menu-item-25988']"));

	public static final ButtonElement Neoconseil =new ButtonElement("Neo conseil",By.id("menu-item-25987"));


}
