package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageHome;
import com.neolians.website.repository.pages.PageNosProjets;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenNosprojetsSubSectionFromEntepriseSection extends NeoliansTestcase {
    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Nos projets Page")

    void checkNosprojetsPage(){

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Open l'enteprise");
        PageMenu.entreprise.click();

        Report.newStep(3, "Open Nos projets via l'enteprise");
        Home.openNosprojets();

        Report.newStep(4, "Open le projet enablon");
        PageNosProjets.enablon.click();

        Report.newStep(5, "Open la description de projet enablon");
        PageNosProjets.paragraphedeenablon.assertPresent();

        Report.newStep(6, "Open le projet kpmg");
        PageNosProjets.KPMG.click();

        Report.newStep(5, "Open la description de projet kpmg");
        PageNosProjets.paragraphedekpmg.assertPresent();

        Report.newStep(6, "Open le projet sopra");
        PageNosProjets.Sopra.click();

        Report.newStep(7, "Open la description de projet sopra");
        PageNosProjets.paragraphedesopra.assertPresent();

        Report.newStep(8, "Open le projet limonetik");
        PageNosProjets.Limonetik.click();

        Report.newStep(9, "Open la description de projet limonetik");
        PageNosProjets.paragraphedelimonetik.assertPresent();

        Report.newStep(10, "Open le projet Pack Solutions");
        PageNosProjets.PackSolutions.click();

        Report.newStep(11, "Open la description de projet Pack Solution");
        PageNosProjets.paragraphedepacksolution.assertPresent();

        Report.newStep(12, "Open le projet SAP");
        PageNosProjets.SAP.click();

        Report.newStep(13, "Open la description de projet limonetik");
        PageNosProjets.paragraphedesap.assertPresent();

        Report.newStep(14, "Open le projet Novapost");
        PageNosProjets.Novapost.click();

        Report.newStep(15, "Open la description de projet Novapost");
        PageNosProjets.paragraphedenovapost.assertPresent();

        Report.newStep(16, "Open le projet Business Investigation");
        PageNosProjets.BusinessInvestigation.click();

        Report.newStep(17, "Open la description de projet Business Investigation");
        PageNosProjets.paragraphedebusinessinvestigation.assertPresent();




    }
}
