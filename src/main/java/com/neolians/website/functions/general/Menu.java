package com.neolians.website.functions.general;

import com.neolians.website.repository.general.PageMenu;

public class Menu {

    /**
     * Vérifie l'affichage du menu
     */
    public static void verifieMenu(){
        PageMenu.neoliansLogo.assertPresent();
        PageMenu.home.assertPresent();
    }
}
