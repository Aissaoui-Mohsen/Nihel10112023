package com.neolians.website.repository.general;

import org.openqa.selenium.By;

import com.neolians.common.utils.selenium.elements.BlockElement;

public class PageMenu {
	private PageMenu() {
		throw new IllegalStateException("Utility class");
	}

	public static final BlockElement neoliansLogo = new BlockElement("neolians Logo",
			By.xpath("//img[@src='https://neolians.com/wp-content/uploads/2022/01/logo42-1920w-1.png']"));
	public static final BlockElement home = new BlockElement("Menu Home", By.linkText("HOME"));

}
