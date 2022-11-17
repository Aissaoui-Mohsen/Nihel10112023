package com.neolians.website.repository.pages;

import com.neolians.common.utils.selenium.elements.BlockElement;
import com.neolians.common.utils.selenium.elements.LinkElement;
import com.neolians.common.utils.selenium.elements.UrlElement;
import org.openqa.selenium.By;

import com.neolians.common.utils.selenium.elements.ButtonElement;

public class PageHome {
	private PageHome() {
		throw new IllegalStateException("Utility class");
	}

	public static final UrlElement url = new UrlElement("Home url", "/");
	public static final ButtonElement paragraph1 = new ButtonElement("Paragraphe1",
			By.xpath("//p[contains(text(),'Notre expertise d’industrialisation de test ']"));
   public static final BlockElement enteprise=new BlockElement("L'enteprise",By.xpath("//li[@id='menu-item-26120']"));
	public static final BlockElement Nosdernièrespublications=new BlockElement("Nos dernières publications",By.xpath("//div[@data-id='f70bbd3']//child::div//h2"));



}