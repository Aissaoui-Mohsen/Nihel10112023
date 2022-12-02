package com.neolians.website.functions.general;

import com.neolians.website.repository.general.PageFooter;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageHome;

public class Footer {

    /**
     * Vérifie l'affichage de la barre en bas de la page
     */

    public static void verifieFooter(){

        PageFooter.neoliansLogo1.assertPresent();
        PageFooter.locationMap.assertPresent();
        PageFooter.testApplicationMobile.assertPresent();
        PageFooter.testLogiciel.assertPresent();
        PageFooter.supportInformatique.assertPresent();
        PageFooter.formationAuxMetiersDuTest.assertPresent();
        PageFooter.optimiserVosProcessDeTest.assertPresent();
        PageFooter.externaliserVosTests.assertPresent();
        PageFooter.NotreEngagementSocial.assertPresent();
        PageFooter.nousContacter.assertPresent();
        PageFooter.nousRejoindre.assertPresent();
        PageFooter.siteDeveloppeParAbcGroup.assertPresent();
        PageFooter.iconLinkedIn2.assertPresent();
    }

    public static void openLinkedlndfromfooterbar() {
        PageFooter.iconLinkedIn2.moveTo();
        PageFooter.iconLinkedIn2.click();


     }

    public static void openTestLogicielfromfooterbar() {
        PageHome.url.openUrl();
        PageFooter.testLogiciel.moveTo();
        PageFooter.testLogiciel.click();
    }


    public static void openOptimiservosprocessdetestfromfooterbar() {
        PageHome.url.openUrl();
        PageFooter.optimiserVosProcessDeTest.click();


    }




}
