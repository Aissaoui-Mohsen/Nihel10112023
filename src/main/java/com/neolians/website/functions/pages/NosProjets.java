package com.neolians.website.functions.pages;

import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageNosProjets;

public class NosProjets {
    private NosProjets() {throw new IllegalStateException("Utility class");}

    /**
     * Ouvre la page Nos projets
     */

    public static void openPage() {

        PageNosProjets.url.openUrl();
       // pagenosprojets.enablan.click();
        PageNosProjets.enablon.click();
        PageNosProjets.KPMG.click();
        PageNosProjets.Sopra.click();
        PageNosProjets.Limonetik.click();
        PageNosProjets.PackSolutions.click();
        PageNosProjets.SAP.click();
        PageNosProjets.Novapost.click();
        PageNosProjets.BusinessInvestigation.click();


        //pageNosprojets.paragrapheenablan.assertpresent();
        PageNosProjets.paragraphedeenablon.assertPresent();
        PageNosProjets.paragraphedekpmg.assertPresent();
        PageNosProjets.paragraphedesopra.assertPresent();
        PageNosProjets.paragraphedelimonetik.assertPresent();
        PageNosProjets.paragraphedepacksolution.assertPresent();
        PageNosProjets.paragraphedesap.assertPresent();
        PageNosProjets.paragraphedenovapost.assertPresent();
        PageNosProjets.paragraphedebusinessinvestigation.assertPresent();
    }

}
