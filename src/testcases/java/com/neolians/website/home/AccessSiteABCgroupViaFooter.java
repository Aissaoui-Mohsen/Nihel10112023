package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.SiteABC;

import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class AccessSiteABCgroupViaFooter extends NeoliansTestcase {

    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check ABCgroup Site  via Footer")
    void CheckSiteABCgroupViaFooter()
    {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Verify Menu");
        Menu.verifieMenu();

        Report.newStep(3, "Verify Erreur");
        Errors.checkNoErrors();

        Report.newStep(4, "Verify Footer");
        Footer.verifieFooter();

        Report.newStep(5, "Open ABCgroup Site via Footer");
        Home.openSiteABCgroupViaFooter();

        Report.newStep(6, "verify adresse site abc");
        SiteABC.VerifySiteABC();



    }







}
