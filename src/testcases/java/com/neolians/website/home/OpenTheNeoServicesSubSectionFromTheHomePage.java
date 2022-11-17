package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.repository.pages.PageNeoServices;
import com.neolians.website.repository.pages.PageNosProjets;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenTheNeoServicesSubSectionFromTheHomePage extends NeoliansTestcase {
    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Neo Services From En savoir Plus")
    void checkNeoServicesPage() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "La page NeoServices");
        Home.NeoServicesviaPageHome();

        Report.newStep(3, "vérifier la présence paragraphe1");
        PageNeoServices.paragraphe1.assertPresent();

        Report.newStep(4, "vérifier la présence de paragraphe2");
        PageNeoServices.paragraphe2.assertPresent();

        Report.newStep(5, "Vérifier la présence du bouton neo éditeur");
        PageNeoServices.neoediteur.assertPresent();

        Report.newStep(6, "Vérifier la présence du bouton neo externalisation");
        PageNeoServices.neoexternalisaton.assertPresent();

        Report.newStep(7, "Vérifier la présence du bouton neo mobile");
        PageNeoServices.neomobile.assertPresent();

        Report.newStep(8, "Vérifier la présence du bouton neo TRA");
        PageNeoServices.neoTRA.assertPresent();

        Report.newStep(9, "vérifier la présence paragraphe3");
        PageNeoServices.paragraphe3.assertPresent();

    }
}
