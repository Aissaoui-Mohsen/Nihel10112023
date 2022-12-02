package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageEditeur;
import com.neolians.website.repository.pages.PagePresentation;

public class Editeur {
    private Editeur() {
        throw new IllegalStateException("Utility class");
    }
    // Ouvrir "neo.academy" depuis "Nos OFFRES/neo.services"

    public static void VerifyPageEditeur() {

        PageEditeur.paragraphe1.assertPresent();
        PageEditeur.paragraphe2.assertPresent();
        PageEditeur.paragraphe3.assertPresent();
        PageEditeur.img1.assertPresent();
        PageEditeur.img2.assertPresent();




    }



}
