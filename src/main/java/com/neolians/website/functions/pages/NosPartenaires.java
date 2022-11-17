package com.neolians.website.functions.pages;

import com.neolians.website.repository.pages.PageHome;
import com.neolians.website.repository.pages.PageNosPartenaires;
import com.neolians.website.repository.pages.PageNousRejoindre;

public class NosPartenaires {

    private NosPartenaires() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Verifie page Nos Partenaire
     */


    public static void verifiePageNosPartenaires(){

    //titre Nos partenaires

        PageNosPartenaires.titleNosPartenaires.assertPresent();

        String contenuTitle9 = PageNosPartenaires.titleNosPartenaires.getText();
        PageNosPartenaires.titleNosPartenaires.assertEquals("Nos partenaires",contenuTitle9);


    //verifier l'image, titre et description de 1er partenaire

        PageNosPartenaires.imgPartenaire1.assertPresent();

        PageNosPartenaires.titlePartenaire1.assertPresent();
        String contenuTitle10 = PageNosPartenaires.titlePartenaire1.getText();
        PageNosPartenaires.titlePartenaire1.assertEquals("Les tests automatiques avec Ranorex"
                ,contenuTitle10);

        PageNosPartenaires.descriptionPartenaire1.assertPresent();
        String descriptionP1 = PageNosPartenaires.descriptionPartenaire1.getText();
        PageNosPartenaires.descriptionPartenaire1.assertEquals("neolians utilise depuis 2011 les solutions Ranorex pour la réalisation des tests automatisé pour des solutions Web, HTML5, Mobile, Delphi, Windows, ... La reconnaissance des objets graphiques, une organisation en plusieurs couches, et les librairies de développement du monde .Net permettent une fiabilité et une ré-utilisabilité des tests."
                ,descriptionP1);



    //verifier l'image, titre de 2eme partenaire

        PageNosPartenaires.imgPartenaire2.assertPresent();

        PageNosPartenaires.titlePartenaire2.assertPresent();
        String contenuTitle11 = PageNosPartenaires.titlePartenaire2.getText();
        PageNosPartenaires.titlePartenaire2.assertEquals("L’optimisation des tests avec Coverity"
                ,contenuTitle11);



    //verifier l'image, titre et description de 3eme partenaire

        PageNosPartenaires.imgPartenaire3.assertPresent();

        PageNosPartenaires.titlePartenaire3.assertPresent();
        String contenuTitle12 = PageNosPartenaires.titlePartenaire3.getText();
        PageNosPartenaires.titlePartenaire3.assertEquals("Les tests de performances avec Neotys"
                ,contenuTitle12);

        PageNosPartenaires.descriptionPartenaire3.assertPresent();
        String descriptionP3 = PageNosPartenaires.descriptionPartenaire3.getText();
        PageNosPartenaires.descriptionPartenaire3.assertEquals("Un des objectifs majeurs d’une entreprise est de garantir une non régression de la performance et de la fiabilité de ses applications. neolians s’appuie sur la solution neoload pour les tests de performance et vous aide à sécuriser vos engagements en termes de SLA et d’expérience utilisateur."
                ,descriptionP3);



    //verifier l'image, titre et description de 4eme partenaire

        PageNosPartenaires.imgPartenaire4.assertPresent();

        PageNosPartenaires.titlePartenaire4.assertPresent();
        String contenuTitle13 = PageNosPartenaires.titlePartenaire4.getText();
        PageNosPartenaires.titlePartenaire4.assertEquals("SoapUI",contenuTitle13);

        PageNosPartenaires.descriptionPartenaire4.assertPresent();
        String descriptionP4 = PageNosPartenaires.descriptionPartenaire4.getText();
        PageNosPartenaires.descriptionPartenaire4.assertEquals("Pour vos tests WebService, SoapUi et LoadUi proposent un environnement de tests Facile à prendre en main et maintenable."
                ,descriptionP4);



    //verifier l'image, titre et description de 5eme partenaire

        PageNosPartenaires.imgPartenaire5.assertPresent();

        PageNosPartenaires.titlePartenaire5.assertPresent();
       // String contenuTitle14 = PageNosPartenaires.titlePartenaire5.getText();
      //  PageNosPartenaires.titlePartenaire5.assertEquals("Test Link",contenuTitle14);

       // PageNosPartenaires.descriptionPartenaire5.assertPresent();
       // String descriptionP5 = PageNosPartenaires.descriptionPartenaire5.getText();
       // PageNosPartenaires.descriptionPartenaire5.assertEquals("Le gestionnaire de test open source qui permet de gérer vos exigences, cas de tests, planifier vos campagnes d'exécution et analyser vos résultats de test."
        //        ,descriptionP5);




    //verifier l'image, titre et description de 6eme partenaire

        PageNosPartenaires.imgPartenaire6.assertPresent();

        PageNosPartenaires.titlePartenaire6.assertPresent();
        String contenuTitle15 = PageNosPartenaires.titlePartenaire6.getText();
        PageNosPartenaires.titlePartenaire6.assertEquals("HP QC",contenuTitle15);

        PageNosPartenaires.descriptionPartenaire6.assertPresent();
        String descriptionP6 = PageNosPartenaires.descriptionPartenaire6.getText();
        PageNosPartenaires.descriptionPartenaire6.assertEquals("Le leader sur le marché des framework de test, HP QC est déployé dans les plus grand groupes"
                ,descriptionP6);




    //verifier l'image, titre et description de 7eme partenaire

        PageNosPartenaires.imgPartenaire7.assertPresent();

        PageNosPartenaires.titlePartenaire7.assertPresent();
        String contenuTitle16 = PageNosPartenaires.titlePartenaire7.getText();
        PageNosPartenaires.titlePartenaire7.assertEquals("Les tests Web avec Selenium",contenuTitle16);

        //PageNosPartenaires.descriptionPartenaire7.assertPresent();
        //String descriptionP7 = PageNosPartenaires.descriptionPartenaire7.getText();
       // PageNosPartenaires.descriptionPartenaire7.assertEquals("Selenium est le moteur de reference Open source pour les tests d'interfaces Web. Couplé avec des framework de développements Junit, Nunit, MicrosoftTM, et avec des systèmes d'intégration continue tel que Jenkins, il offre une robustesse pour vos tests automatisés."
       //         ,descriptionP7);




    //verifier l'image, titre et description de 8eme partenaire

        PageNosPartenaires.imgPartenaire8.assertPresent();

        PageNosPartenaires.titlePartenaire8.assertPresent();
        String contenuTitle17 = PageNosPartenaires.titlePartenaire8.getText();
        PageNosPartenaires.titlePartenaire8.assertEquals("Microsoft Test Manager",contenuTitle17);

        //PageNosPartenaires.descriptionPartenaire8.assertPresent();
      // String descriptionP8 = PageNosPartenaires.descriptionPartenaire8.getText();
       // PageNosPartenaires.descriptionPartenaire8.assertEquals("Microsoft Test Manager est la brique test de l'environnement de développement \"Team Foundation Server\". MTM stocke vos plans de test et résultats et utilise Visual Studio pour le développement des scripts automatiques."
             //   ,descriptionP8);




    //verifier l'image, titre et description de 9eme partenaire

        PageNosPartenaires.imgPartenaire9.assertPresent();

        PageNosPartenaires.titlePartenaire9.assertPresent();
        String contenuTitle18 = PageNosPartenaires.titlePartenaire9.getText();
        PageNosPartenaires.titlePartenaire9.assertEquals("Squash Test",contenuTitle18);

        //PageNosPartenaires.descriptionPartenaire9.assertPresent();
       // String descriptionP9 = PageNosPartenaires.descriptionPartenaire9.getText();
        //PageNosPartenaires.descriptionPartenaire9.assertEquals("Squash TM est le gestionnaire de référentiel de test de la suite open source Squash. Il permet de gérer les exigences, les scénarios de tests et les campagnes d'exécution, dans un contexte nativement multi-projet. il est couplé avec Squash TA, un outillage open source d'automatisation des tests fonctionnels et d'industrialisation de leurs exécutions. Compatible avec plusieurs automates open source (exemple Selenium), il permet de gérer les tests automatisés d'applications Web, de webservice et de batchs."
              //  ,descriptionP9);











    }




}
