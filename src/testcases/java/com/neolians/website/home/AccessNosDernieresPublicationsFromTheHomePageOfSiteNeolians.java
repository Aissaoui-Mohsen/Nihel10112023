package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageHome;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class AccessNosDernieresPublicationsFromTheHomePageOfSiteNeolians extends NeoliansTestcase {
    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Home Page")
    void checkHomePage() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Nos dernières publications");
        PageHome.titleNosDernierePublications.assertPresent();


    }
}
