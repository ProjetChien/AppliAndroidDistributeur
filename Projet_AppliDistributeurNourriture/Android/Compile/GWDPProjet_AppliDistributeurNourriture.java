/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Projet
 * Classe Android : Projet_AppliDistributeurNourriture
 * Date : 17/03/2016 14:10:46
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPProjet_AppliDistributeurNourriture extends WDProjet
{
/**
 * Accès au projet: Projet_AppliDistributeurNourriture
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPProjet_AppliDistributeurNourriture.ms_Project
 */
public static GWDPProjet_AppliDistributeurNourriture ms_Project;

 // FEN_Connexion
public GWDFFEN_Connexion mWD_FEN_Connexion = new GWDFFEN_Connexion();
 // accesseur de FEN_Connexion
public GWDFFEN_Connexion getFEN_Connexion()
{
mWD_FEN_Connexion.verifierOuverte();
return mWD_FEN_Connexion;
}

 // FEN_Paramètres
public GWDFFEN_Parametres mWD_FEN_Parametres = new GWDFFEN_Parametres();
 // accesseur de FEN_Paramètres
public GWDFFEN_Parametres getFEN_Parametres()
{
mWD_FEN_Parametres.verifierOuverte();
return mWD_FEN_Parametres;
}

 // FEN_RécapitulatifParamètres
public GWDFFEN_RecapitulatifParametres mWD_FEN_RecapitulatifParametres = new GWDFFEN_RecapitulatifParametres();
 // accesseur de FEN_RécapitulatifParamètres
public GWDFFEN_RecapitulatifParametres getFEN_RecapitulatifParametres()
{
mWD_FEN_RecapitulatifParametres.verifierOuverte();
return mWD_FEN_RecapitulatifParametres;
}

 // FEN_choixAction
public GWDFFEN_choixAction mWD_FEN_choixAction = new GWDFFEN_choixAction();
 // accesseur de FEN_choixAction
public GWDFFEN_choixAction getFEN_choixAction()
{
mWD_FEN_choixAction.verifierOuverte();
return mWD_FEN_choixAction;
}

 // FEN_Historique
public GWDFFEN_Historique mWD_FEN_Historique = new GWDFFEN_Historique();
 // accesseur de FEN_Historique
public GWDFFEN_Historique getFEN_Historique()
{
mWD_FEN_Historique.verifierOuverte();
return mWD_FEN_Historique;
}

 // FEN_Appel
public GWDFFEN_Appel mWD_FEN_Appel = new GWDFFEN_Appel();
 // accesseur de FEN_Appel
public GWDFFEN_Appel getFEN_Appel()
{
mWD_FEN_Appel.verifierOuverte();
return mWD_FEN_Appel;
}


 // Constructeur de la classe GWDPProjet_AppliDistributeurNourriture
public GWDPProjet_AppliDistributeurNourriture()
{
ajouterFenetre("FEN_Connexion", mWD_FEN_Connexion);
ajouterFenetre("FEN_Paramètres", mWD_FEN_Parametres);
ajouterFenetre("FEN_RécapitulatifParamètres", mWD_FEN_RecapitulatifParametres);
ajouterFenetre("FEN_choixAction", mWD_FEN_choixAction);
ajouterFenetre("FEN_Historique", mWD_FEN_Historique);
ajouterFenetre("FEN_Appel", mWD_FEN_Appel);

}

// Code de déclaration de Projet_AppliDistributeurNourriture
public void initProjet()
{
// gnNbreRepas est un entier
vWD_gnNbreRepas= new WDEntier();

super.ajouterVariableGlobale("gnNbreRepas",vWD_gnNbreRepas);



// ghHoraire1 est une heure
vWD_ghHoraire1 = new WDHeure();

super.ajouterVariableGlobale("ghHoraire1",vWD_ghHoraire1);



// ghHoraire2 est une heure
vWD_ghHoraire2 = new WDHeure();

super.ajouterVariableGlobale("ghHoraire2",vWD_ghHoraire2);



// ghHoraire3 est une heure
vWD_ghHoraire3 = new WDHeure();

super.ajouterVariableGlobale("ghHoraire3",vWD_ghHoraire3);



// ghHoraire4 est une heure
vWD_ghHoraire4 = new WDHeure();

super.ajouterVariableGlobale("ghHoraire4",vWD_ghHoraire4);



// ghHoraire5 est une heure
vWD_ghHoraire5 = new WDHeure();

super.ajouterVariableGlobale("ghHoraire5",vWD_ghHoraire5);



// gnRation1 est un entier
vWD_gnRation1= new WDEntier();

super.ajouterVariableGlobale("gnRation1",vWD_gnRation1);



// gnRation2 est un entier
vWD_gnRation2= new WDEntier();

super.ajouterVariableGlobale("gnRation2",vWD_gnRation2);



// gnRation3 est un entier
vWD_gnRation3= new WDEntier();

super.ajouterVariableGlobale("gnRation3",vWD_gnRation3);



// gnRation4 est un entier
vWD_gnRation4= new WDEntier();

super.ajouterVariableGlobale("gnRation4",vWD_gnRation4);



// gnRation5 est un entier
vWD_gnRation5= new WDEntier();

super.ajouterVariableGlobale("gnRation5",vWD_gnRation5);



// gsIP est une chaîne
vWD_gsIP= new WDChaineU();

super.ajouterVariableGlobale("gsIP",vWD_gsIP);



}




////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_gnNbreRepas = WDVarNonAllouee.ref;
static public WDObjet vWD_ghHoraire1 = WDVarNonAllouee.ref;
static public WDObjet vWD_ghHoraire2 = WDVarNonAllouee.ref;
static public WDObjet vWD_ghHoraire3 = WDVarNonAllouee.ref;
static public WDObjet vWD_ghHoraire4 = WDVarNonAllouee.ref;
static public WDObjet vWD_ghHoraire5 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnRation1 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnRation2 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnRation3 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnRation4 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnRation5 = WDVarNonAllouee.ref;
static public WDObjet vWD_gsIP = WDVarNonAllouee.ref;
static
{
// Allocation de l'objet global
GWDPProjet_AppliDistributeurNourriture.ms_Project = new GWDPProjet_AppliDistributeurNourriture();

// Définition des langues du projet
GWDPProjet_AppliDistributeurNourriture.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1);
GWDPProjet_AppliDistributeurNourriture.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.143.0";}
public String getNomAPK(){ return "Distributeur";}
public int getIdNomApplication(){return com.masociete.projet_applidistributeurnourriture.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.projet_applidistributeurnourriture";}
public int getIdIconeApplication(){ return com.masociete.projet_applidistributeurnourriture.R.drawable.i_c_o_n_e________0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 240;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 533;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\POUB.PNG?E5",com.masociete.projet_applidistributeurnourriture.R.drawable.poub_5_selector, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\PLUS.PNG?E5",com.masociete.projet_applidistributeurnourriture.R.drawable.plus_4_selector, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU_POPUP.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_popup_3_np3_1_223_1_180, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU_POPUP.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_popup_3_np3_1_223_1_180, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU_POPUP.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_popup_3_np3_1_223_1_180, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU_POPUP.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_popup_3_np3_1_223_1_180, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_2_np3_1_223_1_180, "");
super.ajouterFichierAssocie("D:\\SN1IR2016\\ARNAUD ADRIEN\\PROJET_WM\\PROJET_APPLIDISTRIBUTEURNOURRITURE\\BG_HYBRID_MENU.PNG?_3NP_1_223_1_180",com.masociete.projet_applidistributeurnourriture.R.drawable.bg_hybrid_menu_2_np3_1_223_1_180, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPProjet_AppliDistributeurNourriture_InitProjet( String [] args)
{
GWDPProjet_AppliDistributeurNourriture.ms_Project.initialiserProjet("Projet_AppliDistributeurNourriture", "Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPProjet_AppliDistributeurNourriture_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPProjet_AppliDistributeurNourriture.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPProjet_AppliDistributeurNourriture_InitProjet(null);
}
public void run()
{

GWDPProjet_AppliDistributeurNourriture.ms_Project.lancerProjet("FEN_Connexion");
}
}
}
