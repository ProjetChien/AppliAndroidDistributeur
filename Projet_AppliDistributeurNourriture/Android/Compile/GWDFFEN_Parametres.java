/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Paramètres
 * Date : 04/02/2016 15:57:03
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.types.tableau.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Parametres extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Paramètres
////////////////////////////////////////////////////////////////////////////

/**
 * COMBO_RepasParJour
 */
class GWDCOMBO_RepasParJour extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Paramètres.COMBO_RepasParJour
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,175,40);
super.setRectCompPrincipal(175,2,63,40);
super.setNom("COMBO_RepasParJour");

super.setType(10002);

super.setLibelle("Repas par jour : ");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(34, 15);

super.setTailleInitiale(238, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("1\r\n2\r\n3\r\n4\r\n5");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

super.setCadreInterne(2, 0xFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleElement(0x0, 0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0), 30);

super.setStyleSelection(0xF5800000, 0xF5000000, creerPolice("MS Shell Dlg", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de COMBO_RepasParJour
 */
public void init()
// Initialise la combo box du nombre de repas à 0.
{
super.init();

// COMBO_RepasParJour = 1
this.setValeur(1);

// ExécuteTraitement(COMBO_RepasParJour,trtSélection)
WDAPIVM.executeTraitement(this,33);

}



/**
 * Traitement: Sélection d'une ligne de COMBO_RepasParJour
 */
public void selectionLigne()
// Permet l'ajout de ligne 
// jusqu'à atteindre le nombre de repas désiré dans la combo box en haut de la page.
{
super.selectionLigne();

// SI MoiMême > ZR_Params..Occurrence ALORS
if(WDContexte.getMoiMeme().opSup(mWD_ZR_Params.getOccurrence()))
{
// 	TANTQUE ZR_Params..Occurrence <> MoiMême
while(mWD_ZR_Params.getOccurrence().opDiff(WDContexte.getMoiMeme()))
{
// 		ZoneRépétéeAjouteLigne(ZR_Params)
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Params);

}

}

// SI MoiMême < ZR_Params..Occurrence ALORS
if(WDContexte.getMoiMeme().opInf(mWD_ZR_Params.getOccurrence()))
{
// 	TANTQUE ZR_Params..Occurrence <> MoiMême
while(mWD_ZR_Params.getOccurrence().opDiff(WDContexte.getMoiMeme()))
{
// 		ZoneRépétéeSupprime(ZR_Params,ZR_Params..Occurrence)
WDAPIZoneRepetee.zoneRepeteeSupprime(mWD_ZR_Params,mWD_ZR_Params.getOccurrence().getInt());

}

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_RepasParJour mWD_COMBO_RepasParJour;

/**
 * LIB_Ration_s_par_repas
 */
class GWDLIB_Ration_s_par_repas extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Paramètres.LIB_Ration_s_par_repas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2780056876755624755l);

super.setChecksum("687564683");

super.setNom("LIB_Ration_s_par_repas");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ration(s) par repas");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(202, 80);

super.setTailleInitiale(116, 63);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Ration_s_par_repas mWD_LIB_Ration_s_par_repas;

/**
 * BTN_Suivant
 */
class GWDBTN_Suivant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Paramètres.BTN_Suivant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2780071608543869606l);

super.setChecksum("737988140");

super.setNom("BTN_Suivant");

super.setType(4);

super.setLibelle("Confirmer");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(85, 442);

super.setTailleInitiale(150, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleSurvol(0x808080, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleCadreRepos(2, 0xF2000000, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0xF2000000, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0x0, 0xF4000000, 0x0, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Suivant
 */
public void clicSurBoutonGauche()
// Associe la valeur de la combo box à une variable globale
{
super.clicSurBoutonGauche();

// gnNbreRepas = COMBO_RepasParJour
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.setValeur(mWD_COMBO_RepasParJour);

// SI gnNbreRepas = "0" ALORS
if(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal("0"))
{
// 	Info("Merci de sélectionner un nombre de repas pour la journée")
WDAPIDialogue.info("Merci de sélectionner un nombre de repas pour la journée");

}
else
{
// ZoneRépétéeTrie("+ZR_Params")
WDAPIZoneRepetee.zoneRepeteeTrie("+ZR_Params");

// ghHoraire1 = ZR_Params[1].SAI_Heure
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire1.setValeur(mWD_ZR_Params.get(1).get("SAI_Heure"));

// gnRation1 = ZR_Params[1].COMBO_ration
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.setValeur(mWD_ZR_Params.get(1).get("COMBO_ration"));

// si gnNbreRepas = 2 ou gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(2) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	ghHoraire2 = ZR_Params[2].SAI_Heure
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire2.setValeur(mWD_ZR_Params.get(2).get("SAI_Heure"));

// 	gnRation2 = ZR_Params[2].COMBO_ration
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.setValeur(mWD_ZR_Params.get(2).get("COMBO_ration"));

}

// si gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if(((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	ghHoraire3 = ZR_Params[3].SAI_Heure
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire3.setValeur(mWD_ZR_Params.get(3).get("SAI_Heure"));

// 	gnRation3 = ZR_Params[3].COMBO_ration
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.setValeur(mWD_ZR_Params.get(3).get("COMBO_ration"));

}

// SI gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	ghHoraire4 = ZR_Params[4].SAI_Heure
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire4.setValeur(mWD_ZR_Params.get(4).get("SAI_Heure"));

// 	gnRation4 = ZR_Params[4].COMBO_ration
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4.setValeur(mWD_ZR_Params.get(4).get("COMBO_ration"));

}

// SI gnNbreRepas = 5 ALORS
if(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5))
{
// 	ghHoraire5 = ZR_Params[5].SAI_Heure
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire5.setValeur(mWD_ZR_Params.get(5).get("SAI_Heure"));

// 	gnRation5 = ZR_Params[5].COMBO_ration
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation5.setValeur(mWD_ZR_Params.get(5).get("COMBO_ration"));

}

// si gnNbreRepas = 1 et gnRation1 = 0 ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(1) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opEgal(0)))
{
// 	Info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.")
WDAPIDialogue.info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.");

}
else if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(1) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opDiff(0)))
{
// 	OuvreFenêtreMobile(FEN_RécapitulatifParamètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres);

}

// si gnNbreRepas = 2 et (gnRation1 = 0 ou gnRation2 = 0) ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(2) & (GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opEgal(0) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opEgal(0))))
{
// 	Info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.")
WDAPIDialogue.info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.");

}
else if(((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(2) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opDiff(0)))
{
// 	OuvreFenêtreMobile(FEN_RécapitulatifParamètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres);

}

// SI gnNbreRepas = 3 ET (gnRation1 = 0 OU gnRation2 = 0  ou gnRation3 = 0) ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3) & ((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opEgal(0) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opEgal(0))))
{
// 	Info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.")
WDAPIDialogue.info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.");

}
else if((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opDiff(0)))
{
// 	OuvreFenêtreMobile(FEN_RécapitulatifParamètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres);

}

// SI gnNbreRepas = 4 ET (gnRation1 = 0 OU gnRation2 = 0  OU gnRation3 = 0 ou gnRation4 = 0) ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4) & (((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opEgal(0) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4.opEgal(0))))
{
// 	Info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.")
WDAPIDialogue.info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.");

}
else if(((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4.opDiff(0)))
{
// 	OuvreFenêtreMobile(FEN_RécapitulatifParamètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres);

}

// SI gnNbreRepas = 5 ET (gnRation1 = 0 OU gnRation2 = 0  OU gnRation3 = 0 OU gnRation4 = 0 ou gnRation5 = 0) ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5) & ((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opEgal(0) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4.opEgal(0)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation5.opEgal(0))))
{
// 	Info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.")
WDAPIDialogue.info("Erreur ! Merci de sélectionner des rations/repas pour les horaires choisis.");

}
else if((((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4.opDiff(0)) & GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation5.opDiff(0)))
{
// 	OuvreFenêtreMobile(FEN_RécapitulatifParamètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres);

}

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Suivant mWD_BTN_Suivant;

/**
 * ZR_Params
 */
class GWDZR_Params extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Paramètres.ZR_Params
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Heure
 */
class GWDSAI_Heure extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Paramètres.ZR_Params.SAI_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,1,40);
super.setRectCompPrincipal(1,2,108,40);
super.setQuid(2783754452748412205l);

super.setChecksum("681519905");

super.setNom("SAI_Heure");

super.setType(20003);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(44, 2);

super.setTailleInitiale(109, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMMSS");

super.setMasqueSaisie(new WDChaineU("UseDatePickerTimeMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0x0, 4, 4);

super.setCadreInterne(2, 0xF4800000, 0xF4000000, 0x0, 4, 4);

super.setStyleSaisie(0x0, creerPolice("MS Shell Dlg", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Heure mWD_SAI_Heure = new GWDSAI_Heure();

/**
 * COMBO_ration
 */
class GWDCOMBO_ration extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Paramètres.ZR_Params.COMBO_ration
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,63,40);
super.setNom("COMBO_ration");

super.setType(10002);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(193, 2);

super.setTailleInitiale(63, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("1\r\n2\r\n3\r\n4\r\n5");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice("MS Shell Dlg", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

super.setCadreInterne(2, 0xFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleElement(0x0, 0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0), 30);

super.setStyleSelection(0xF5800000, 0xF5000000, creerPolice("MS Shell Dlg", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_ration mWD_COMBO_ration = new GWDCOMBO_ration();

/**
 * BTN_Suprimer
 */
class GWDBTN_Suprimer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Paramètres.ZR_Params.BTN_Suprimer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787589459118572338l);

super.setChecksum("689065002");

super.setNom("BTN_Suprimer");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 2);

super.setTailleInitiale(40, 40);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\poub.png?E5", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleSurvol(0x808080, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleCadreRepos(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Suprimer ( ZR_Params )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// si ZR_Params..Occurrence = 1 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(1))
{
// 	info("Un repas minimum !")
WDAPIDialogue.info("Un repas minimum !");

}
else
{
// 	nResultat est un entier
WDObjet vWD_nResultat= new WDEntier();



// 	nResultat = OuiNon("Voulez-vous vraiment supprimer ce repas ?")
vWD_nResultat.setValeur(WDAPIDialogue.ouiNon("Voulez-vous vraiment supprimer ce repas ?"));

// 	selon nResultat
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = vWD_nResultat;
if(_WDExpSelon0.opEgal(1))
{
// 		cas oui : ZoneRépétéeSupprime(ZR_Params)
WDAPIZoneRepetee.zoneRepeteeSupprime(mWD_ZR_Params);

// 			      COMBO_RepasParJour--
mWD_COMBO_RepasParJour.opDec();

}
else if(_WDExpSelon0.opEgal(0))
{
// 		cas Non : RepriseSaisie(ZR_Params)	
WDAPIDivers.repriseSaisie(mWD_ZR_Params);

}

}

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Suprimer mWD_BTN_Suprimer = new GWDBTN_Suprimer();
/**
 * Initialise tous les champs de FEN_Paramètres.ZR_Params
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Paramètres.ZR_Params
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_SAI_Heure.initialiserObjet();
super.ajouterChamp("SAI_Heure",mWD_SAI_Heure);
mWD_COMBO_ration.initialiserObjet();
super.ajouterChamp("COMBO_ration",mWD_COMBO_ration);
mWD_BTN_Suprimer.initialiserObjet();
super.ajouterChamp("BTN_Suprimer",mWD_BTN_Suprimer);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(3,3,291,54);
super.setQuid(2783754306714509755l);

super.setChecksum("676378870");

super.setNom("ZR_Params");

super.setType(30);

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 145);

super.setTailleInitiale(294, 281);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 1, 285, 54);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(6, 0xFFFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

super.setStyleSeparateurVerticaux(true, 0x0);

super.setStyleSeparateurHorizontaux(1, 0x0);

super.setDessinerLigneVide(false);

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0xF5800000, 0xFFFFFFFF);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Params mWD_ZR_Params;

/**
 * BTN_Horaire
 */
class GWDBTN_Horaire extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Paramètres.BTN_Horaire
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787878248403365508l);

super.setChecksum("667909667");

super.setNom("BTN_Horaire");

super.setType(4);

super.setLibelle("Horaire(s)");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(60, 100);

super.setTailleInitiale(109, 31);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

super.setStyleCadreRepos(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Horaire mWD_BTN_Horaire;

/**
 * Traitement: Déclarations globales de FEN_Paramètres
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



/**
 * Traitement: Fin d'initialisation de FEN_Paramètres
 */
public void init()
//  Déclaration des variables
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_NomCheminFichier= new WDChaineU();

WDObjet vWD_IDFichier= new WDEntier();

WDObjet vWD_sLigneLue= new WDChaineU();

WDObjet vWD_tabParams = WDVarNonAllouee.ref;


// NomCheminFichier est une chaîne


// IDFichier est un entier


// sLigneLue est une chaîne


// tabParams est un tableau de chaînes
vWD_tabParams = new WDTableauSimple(1, new int[]{0}, 0, 16);

// NomCheminFichier = "/storage/sdcard0/Download/FichierParamètres.txt"
vWD_NomCheminFichier.setValeur("/storage/sdcard0/Download/FichierParamètres.txt");

// IDFichier = fOuvre(NomCheminFichier)
vWD_IDFichier.setValeur(WDAPIFichier.fOuvre(vWD_NomCheminFichier.getString()));

// SI IDFichier = -1 ALORS
if(vWD_IDFichier.opEgal(-1))
{
// 	info("Aucun fichier existant")
WDAPIDialogue.info("Aucun fichier existant");

}
else
{
// 	SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 		Info("Le fichier est vide !")
WDAPIDialogue.info("Le fichier est vide !");

// 		RETOUR
return;

}

// 	fLitLigne(IDFichier)
WDAPIFichier.fLitLigne(vWD_IDFichier.getInt());

// 	BOUCLE
while(true)
{
// 		sLigneLue = fLitLigne(IDFichier)
vWD_sLigneLue.setValeur(WDAPIFichier.fLitLigne(vWD_IDFichier.getInt()));

// 		SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 			Info("Le fichier est vide !")
WDAPIDialogue.info("Le fichier est vide !");

// 			SORTIR
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 		SI sLigneLue = EOT ALORS SORTIR
if(vWD_sLigneLue.opEgal(""))
{
// 		SI sLigneLue = EOT ALORS SORTIR
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 		Ajoute(tabParams,sLigneLue)
WDAPICollection.ajoute(vWD_tabParams,vWD_sLigneLue);

}


// 	fFerme(IDFichier)
WDAPIFichier.fFerme(vWD_IDFichier.getInt());

// 	ToastAffiche("Lecture du fichier terminée")
WDAPIToast.toastAffiche("Lecture du fichier terminée");

// 	COMBO_RepasParJour = tabParams[1]
mWD_COMBO_RepasParJour.setValeur(vWD_tabParams.get(1));

// 	ExécuteTraitement(COMBO_RepasParJour,trtSélection)
WDAPIVM.executeTraitement(mWD_COMBO_RepasParJour,33);

// 	ZR_Params[1].SAI_Heure = tabParams[2]
mWD_ZR_Params.get(1).get("SAI_Heure").setValeur(vWD_tabParams.get(2));

// 	ZR_Params[1].COMBO_ration = tabParams[3]
mWD_ZR_Params.get(1).get("COMBO_ration").setValeur(vWD_tabParams.get(3));

// 	SI COMBO_RepasParJour = 2 OU COMBO_RepasParJour = 3 OU COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if((((mWD_COMBO_RepasParJour.opEgal(2) | mWD_COMBO_RepasParJour.opEgal(3)) | mWD_COMBO_RepasParJour.opEgal(4)) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[2].SAI_Heure = tabParams[4]
mWD_ZR_Params.get(2).get("SAI_Heure").setValeur(vWD_tabParams.get(4));

// 		ZR_Params[2].COMBO_ration = tabParams[5]
mWD_ZR_Params.get(2).get("COMBO_ration").setValeur(vWD_tabParams.get(5));

}

// 	SI COMBO_RepasParJour = 3 OU COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if(((mWD_COMBO_RepasParJour.opEgal(3) | mWD_COMBO_RepasParJour.opEgal(4)) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[3].SAI_Heure = tabParams[6]
mWD_ZR_Params.get(3).get("SAI_Heure").setValeur(vWD_tabParams.get(6));

// 		ZR_Params[3].COMBO_ration = tabParams[7]
mWD_ZR_Params.get(3).get("COMBO_ration").setValeur(vWD_tabParams.get(7));

}

// 	SI COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if((mWD_COMBO_RepasParJour.opEgal(4) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[4].SAI_Heure = tabParams[8]
mWD_ZR_Params.get(4).get("SAI_Heure").setValeur(vWD_tabParams.get(8));

// 		ZR_Params[4].COMBO_ration = tabParams[9]
mWD_ZR_Params.get(4).get("COMBO_ration").setValeur(vWD_tabParams.get(9));

}

// 	SI COMBO_RepasParJour = 5 ALORS
if(mWD_COMBO_RepasParJour.opEgal(5))
{
// 		ZR_Params[5].SAI_Heure = tabParams[10]
mWD_ZR_Params.get(5).get("SAI_Heure").setValeur(vWD_tabParams.get(10));

// 		ZR_Params[5].COMBO_ration = tabParams[11]	
mWD_ZR_Params.get(5).get("COMBO_ration").setValeur(vWD_tabParams.get(11));

}

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Paramètres
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_COMBO_RepasParJour = new GWDCOMBO_RepasParJour();
mWD_LIB_Ration_s_par_repas = new GWDLIB_Ration_s_par_repas();
mWD_BTN_Suivant = new GWDBTN_Suivant();
mWD_ZR_Params = new GWDZR_Params();
mWD_BTN_Horaire = new GWDBTN_Horaire();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Paramètres
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2779775543518181222l);

super.setChecksum("698244176");

super.setNom("FEN_Paramètres");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("Paramètres");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_Hybrid_Menu_Popup.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Paramètres
////////////////////////////////////////////////////////////////////////////
mWD_COMBO_RepasParJour.initialiserObjet();
super.ajouter("COMBO_RepasParJour", mWD_COMBO_RepasParJour);
mWD_LIB_Ration_s_par_repas.initialiserObjet();
super.ajouter("LIB_Ration_s_par_repas", mWD_LIB_Ration_s_par_repas);
mWD_BTN_Suivant.initialiserObjet();
super.ajouter("BTN_Suivant", mWD_BTN_Suivant);
mWD_ZR_Params.initialiserObjet();
super.ajouter("ZR_Params", mWD_ZR_Params);
mWD_BTN_Horaire.initialiserObjet();
super.ajouter("BTN_Horaire", mWD_BTN_Horaire);

super.terminerInitialisation();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Parametres;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "";
}
}
