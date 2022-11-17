package com.neolians.website.functions.pages;

import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageNeoServices;

public class NeoServices {
    private NeoServices() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * Ouvre la page Neo Services
     */

    public static void openPage() {

        PageNeoServices.url.openUrl();
        PageMenu.neoliansLogo.assertPresent();
        PageNeoServices.paragraphe1.assertPresent("Vérifier la présence de paragraphe1");
        PageNeoServices.paragraphe2.assertPresent();
        PageNeoServices.neoediteur.assertPresent();
        PageNeoServices.neoexternalisaton.assertPresent();
        PageNeoServices.neomobile.assertPresent();
        PageNeoServices.neoTRA.assertPresent();
        PageNeoServices.paragraphe3.assertPresent();

    }
}
