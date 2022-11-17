package com.neolians.website.repository.pages;

import com.neolians.common.utils.selenium.elements.BlockElement;
import com.neolians.common.utils.selenium.elements.ButtonElement;
import com.neolians.common.utils.selenium.elements.UrlElement;
import org.openqa.selenium.By;

public class PageNeoServices {
    private PageNeoServices() {
        throw new IllegalStateException("Utility class");
    }

    public static final UrlElement url = new UrlElement("url", "/neo-services/");
    // identifier le block 1
    public static final BlockElement paragraphe1=new BlockElement("paragraphe 1", By.xpath("//div[@data-id='5f19968']"));
    // identifier le block 2
    public static final BlockElement paragraphe2=new BlockElement("paragraphe 2", By.xpath("//div[@data-id='f1a7fe9']"));
    public static final ButtonElement neoediteur=new ButtonElement("neo éditeur",By.xpath("//div[@data-id='6f8cc7d']//child::div//span"));
    public static final ButtonElement neoexternalisaton=new ButtonElement("neo externalisation",By.xpath("//div[@data-id='d34ad8f']//child::div//span"));
    public static final ButtonElement neomobile=new ButtonElement("neo mobile",By.xpath("//div[@data-id='534bbe7']//child::div//span"));
    public static final ButtonElement neoTRA=new ButtonElement("neo TRA",By.xpath("//div[@data-id='510057d']//child::div//span"));

    // identifier le block 3
 public static final BlockElement paragraphe3=new BlockElement("paragraphe 3", By.xpath("//div[@data-id='52708ad']"));


}
