package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.repository.general.PageFooter;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageLinkedlnFromTopBar;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class AccessTheNeoliansLinkedlnAccountFromTheBarAtTheBottomOfPage extends NeoliansTestcase {
    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Linkdeln Page From Top Bar ")
    void checkLinkdelnFromTopBarPage() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Verifie le bouton linkedln");
        PageMenu.iconLinkedIn1.click();

        Report.newStep(3, "la page de linkedln s'affiche");
        PageLinkedlnFromTopBar.linkedlnneolians.assertPresent();
    }
}