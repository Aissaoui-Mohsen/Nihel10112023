package com.neolians.website.repository.pages;

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

}