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

    public static void openPageNeoServicedepuishome() {


        PageNeoServices.url.openUrl();
        PageMenu.neoliansLogo.assertPresent();
        PageNeoServices.paragraphe1.assertPresent("Vérifier la présence de paragraphe1");
        PageNeoServices.paragraphe2.assertPresent();
        PageNeoServices.neoediteur.assertPresent();
        PageNeoServices.neoexternalisaton.assertPresent();
        PageNeoServices.neomobile.assertPresent();
        PageNeoServices.neoTRA.assertPresent();
        PageNeoServices.paragraphe3.assertPresent();
        PageNeoServices.imageneoediteur.assertPresent();
        PageNeoServices.imageneoexternalisation.assertPresent();
        PageNeoServices.imageneomobile.assertPresent();
        PageNeoServices.imageneotra.assertPresent();
        PageNeoServices.image1.assertPresent();
        PageNeoServices.image2.assertPresent();

    }

}
