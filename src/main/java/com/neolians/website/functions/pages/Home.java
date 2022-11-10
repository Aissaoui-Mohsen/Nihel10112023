package com.neolians.website.functions.pages;


import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageHome;

public class Home {
    private Home() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Ouvre la page Home
     */
    public static void openPage() {
        PageHome.url.openUrl();
        PageMenu.neoliansLogo.assertPresent();

    }

}