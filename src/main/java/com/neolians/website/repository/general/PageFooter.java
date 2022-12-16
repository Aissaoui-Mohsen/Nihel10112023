package com.neolians.website.repository.general;

import com.neolians.common.utils.selenium.elements.BlockElement;
import org.openqa.selenium.By;

public class PageFooter {
    private PageFooter() {
        throw new IllegalStateException("Utility class");
    }

    public static final BlockElement neoliansLogo1 = new BlockElement("neolianslogo1",
            By.xpath("//div[@data-id='cf5a82a']"));

    public static final BlockElement locationMap = new BlockElement("location Map",
            By.id("wpgmza_map"));

    public static final BlockElement testApplicationMobile =new BlockElement("Test application mobile",
            By.xpath("//div[@class='elementor-widget-container']//child::span//a[@href='https://neolians.com/neo-mobile/']"));

    public static final BlockElement testLogiciel = new BlockElement("Test logiciel",
            By.linkText("Test logiciel"));

    public static final BlockElement supportInformatique = new BlockElement("Support informatique",
            By.xpath("//div[@class='elementor-widget-container']//child::span//a[@href='https://neolians.com/neo-support/']"));

    public static final BlockElement formationAuxMetiersDuTest = new BlockElement("Formation aux métiers du test",
            By.xpath("//div[@class='elementor-widget-container']//child::span//a[@href='https://neolians.com/neo-academy/']"));

    public static final BlockElement optimiserVosProcessDeTest = new BlockElement("Optimiser vos process de test ! ",
            By.linkText("Optimiser vos process de test !"));

    public static final BlockElement externaliserVosTests = new BlockElement("Externaliser vos tests",
            By.linkText("Externaliser vos tests"));

    public static final BlockElement NotreEngagementSocial = new BlockElement("Notre engagement social",
            By.linkText("Notre engagement social"));

    public static final BlockElement nousContacter = new BlockElement("Nous contacter",
            By.linkText("Nous contacter"));

    public static final BlockElement nousRejoindre = new BlockElement("Nous rejoindre",
            By.linkText("Nous rejoindre"));

    public static final BlockElement siteDeveloppeParAbcGroup = new BlockElement("Site développé par ABC Group",
            By.linkText("Site développé par ABC Group"));

    public static final BlockElement iconLinkedIn2 = new BlockElement("Icone linkedin 2",
            By.xpath("//div[@data-id='bb12c4a']"));
}
