/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Paramètres
 * Date : 07/04/2016 14:38:41
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

super.setPositionInitiale(34, 14);

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

super.setAncrageInitial(4, 1000, 1000, 500, 1000);

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
// Initialise la combo box du nombre de repas à 1.
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
{
super.selectionLigne();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nCompteur= new WDEntier();



// nCompteur est un entier


// SI MoiMême > ZR_Params..Occurrence ALORS
if(WDContexte.getMoiMeme().opSup(mWD_ZR_Params.getOccurrence()))
{
// 	TANTQUE ZR_Params..Occurrence <> MoiMême
while(mWD_ZR_Params.getOccurrence().opDiff(WDContexte.getMoiMeme()))
{
// 		nCompteur = ZoneRépétéeAjouteLigne(ZR_Params)
vWD_nCompteur.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Params));

// 		ZR_Params[nCompteur].SAI_Heure = Gauche(HeureSys(),4)
mWD_ZR_Params.get(vWD_nCompteur).get("SAI_Heure").setValeur(WDAPIChaine.gauche(WDAPIDate.heureSys(),4));

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

super.setPositionInitiale(202, 90);

super.setTailleInitiale(116, 63);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

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

super.setPositionInitiale(81, 448);

super.setTailleInitiale(163, 49);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

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

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\OMEGA01012.png?E5", 1, 0, 2, 1);

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


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ok= new WDBooleen();

WDObjet vWD_nTailleZR= new WDEntier();

WDObjet vWD_nTailleZRinf= new WDEntier();



// gnNbreRepas = COMBO_RepasParJour
GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.setValeur(mWD_COMBO_RepasParJour);

// ok est un booléen = vrai

vWD_ok.setValeur(true);


// nTailleZR est un entier = ZR_Params..Occurrence

vWD_nTailleZR.setValeur(mWD_ZR_Params.getOccurrence());


// nTailleZRinf est un entier = ZR_Params..Occurrence - 1

vWD_nTailleZRinf.setValeur(mWD_ZR_Params.getOccurrence().opMoins(1));


// SI gnNbreRepas = "0" ALORS
if(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal("0"))
{
// 	erreur("Merci de sélectionner un nombre de repas pour la journée")
WDAPIDialogue.erreur("Merci de sélectionner un nombre de repas pour la journée");

}
else
{
// 	POUR i = 1 A nTailleZRinf
for(WDObjet vWD_i = new WDEntier(1);vWD_i.opInfEgal(vWD_nTailleZRinf);vWD_i.opInc())
{
// 		POUR j = i + 1 A nTailleZR
for(WDObjet vWD_j = new WDEntier(vWD_i.opPlus(1));vWD_j.opInfEgal(vWD_nTailleZR);vWD_j.opInc())
{
// 			SI ZR_Params[i].SAI_Heure = ZR_Params[j].SAI_Heure et ok = Vrai ALORS
if((mWD_ZR_Params.get(vWD_i).get("SAI_Heure").opEgal(mWD_ZR_Params.get(vWD_j).get("SAI_Heure")) & vWD_ok.opEgal(true)))
{
// 				erreur("Erreur ! Saisissez des repas différents ! ")
WDAPIDialogue.erreur("Erreur ! Saisissez des repas différents ! ");

// 				ok = faux
vWD_ok.setValeur(false);

}

}

}

// SI ok = Vrai ALORS
if(vWD_ok.opEgal(true))
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

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

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

super.setPositionInitiale(19, 155);

super.setTailleInitiale(294, 281);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 500, 1000);

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
 * LIB_Horaires
 */
class GWDLIB_Horaires extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Paramètres.LIB_Horaires
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2788963380482225008l);

super.setChecksum("669752371");

super.setNom("LIB_Horaires");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Horaire(s)");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(66, 121);

super.setTailleInitiale(116, 32);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("MS Shell Dlg", -12.000000, 0), 3);

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
public GWDLIB_Horaires mWD_LIB_Horaires;

/**
 * BTN_Ajouter
 */
class GWDBTN_Ajouter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Paramètres.BTN_Ajouter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2788963689721253783l);

super.setChecksum("671136362");

super.setNom("BTN_Ajouter");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(25, 121);

super.setTailleInitiale(39, 32);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\plus.png?E5", 0, 2);

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
 * Traitement: Clic sur BTN_Ajouter
 */
public void clicSurBoutonGauche()
// Permet l'ajout de ligne dans la zone répétée si l'on a pas atteint sa taille maximum.
{
super.clicSurBoutonGauche();

// si ZR_Params..Occurrence = 5 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(5))
{
// 	Erreur("Nombre de repas maximum atteint !")
WDAPIDialogue.erreur("Nombre de repas maximum atteint !");

}
else
{
// 	ZoneRépétéeAjouteLigne(ZR_Params)
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Params);

// 	COMBO_RepasParJour++
mWD_COMBO_RepasParJour.opInc();

}

// SI ZR_Params..Occurrence = 2 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(2))
{
// 	ZR_Params[2].SAI_Heure = Gauche(HeureSys(),4)
mWD_ZR_Params.get(2).get("SAI_Heure").setValeur(WDAPIChaine.gauche(WDAPIDate.heureSys(),4));

}

// SI ZR_Params..Occurrence = 3 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(3))
{
// 	ZR_Params[3].SAI_Heure = Gauche(HeureSys(),4)
mWD_ZR_Params.get(3).get("SAI_Heure").setValeur(WDAPIChaine.gauche(WDAPIDate.heureSys(),4));

}

// SI ZR_Params..Occurrence = 4 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(4))
{
// 	ZR_Params[4].SAI_Heure = Gauche(HeureSys(),4)
mWD_ZR_Params.get(4).get("SAI_Heure").setValeur(WDAPIChaine.gauche(WDAPIDate.heureSys(),4));

}

// SI ZR_Params..Occurrence = 5 ALORS
if(mWD_ZR_Params.getOccurrence().opEgal(5))
{
// 	ZR_Params[5].SAI_Heure = Gauche(HeureSys(),4)
mWD_ZR_Params.get(5).get("SAI_Heure").setValeur(WDAPIChaine.gauche(WDAPIDate.heureSys(),4));

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
public GWDBTN_Ajouter mWD_BTN_Ajouter;

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
//  Chargement du code XML
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_SourceXML= new WDChaineU();



// SourceXML est une chaîne = fChargeTexte("/storage/sdcard0/Download/FichierParametresXML.xml")

vWD_SourceXML.setValeur(WDAPIFichier.fChargeTexte("/storage/sdcard0/Download/FichierParametresXML.xml"));


// si SourceXML = "" ALORS
if(vWD_SourceXML.opEgal(""))
{
// 	erreur("Pas de fichier existant !")
WDAPIDialogue.erreur("Pas de fichier existant !");

}
else
{
// 	COMBO_RepasParJour = XMLExtraitChaîne(SourceXML, "NbreRepas")
mWD_COMBO_RepasParJour.setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"NbreRepas"));

// 	ExécuteTraitement(COMBO_RepasParJour,trtSélection)
WDAPIVM.executeTraitement(mWD_COMBO_RepasParJour,33);

// 	ZR_Params[1].SAI_Heure = XMLExtraitChaîne(SourceXML, "Horaire1")
mWD_ZR_Params.get(1).get("SAI_Heure").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Horaire1"));

// 	ZR_Params[1].COMBO_ration = XMLExtraitChaîne(SourceXML, "Ration1")
mWD_ZR_Params.get(1).get("COMBO_ration").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Ration1"));

// 	SI COMBO_RepasParJour = 2 OU COMBO_RepasParJour = 3 OU COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if((((mWD_COMBO_RepasParJour.opEgal(2) | mWD_COMBO_RepasParJour.opEgal(3)) | mWD_COMBO_RepasParJour.opEgal(4)) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[2].SAI_Heure = XMLExtraitChaîne(SourceXML, "Horaire2")
mWD_ZR_Params.get(2).get("SAI_Heure").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Horaire2"));

// 		ZR_Params[2].COMBO_ration = XMLExtraitChaîne(SourceXML, "Ration2")
mWD_ZR_Params.get(2).get("COMBO_ration").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Ration2"));

}

// 	SI COMBO_RepasParJour = 3 OU COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if(((mWD_COMBO_RepasParJour.opEgal(3) | mWD_COMBO_RepasParJour.opEgal(4)) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[3].SAI_Heure = XMLExtraitChaîne(SourceXML, "Horaire3")
mWD_ZR_Params.get(3).get("SAI_Heure").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Horaire3"));

// 		ZR_Params[3].COMBO_ration = XMLExtraitChaîne(SourceXML, "Ration3")
mWD_ZR_Params.get(3).get("COMBO_ration").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Ration3"));

}

// 	SI COMBO_RepasParJour = 4 OU COMBO_RepasParJour = 5 ALORS
if((mWD_COMBO_RepasParJour.opEgal(4) | mWD_COMBO_RepasParJour.opEgal(5)))
{
// 		ZR_Params[4].SAI_Heure = XMLExtraitChaîne(SourceXML, "Horaire4")
mWD_ZR_Params.get(4).get("SAI_Heure").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Horaire4"));

// 		ZR_Params[4].COMBO_ration = XMLExtraitChaîne(SourceXML, "Ration4")
mWD_ZR_Params.get(4).get("COMBO_ration").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Ration4"));

}

// 	SI COMBO_RepasParJour = 5 ALORS
if(mWD_COMBO_RepasParJour.opEgal(5))
{
// 		ZR_Params[5].SAI_Heure = XMLExtraitChaîne(SourceXML, "Horaire5")
mWD_ZR_Params.get(5).get("SAI_Heure").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Horaire5"));

// 		ZR_Params[5].COMBO_ration = XMLExtraitChaîne(SourceXML, "Ration5")	
mWD_ZR_Params.get(5).get("COMBO_ration").setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_SourceXML.getString(),"Ration5"));

}

// 	ToastAffiche("Fichier chargé !",toastCourt,cvHaut)
WDAPIToast.toastAffiche("Fichier chargé !",0,0);

}

}



/**
 * Traitement: Fermeture de FEN_Paramètres
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// OuvreFenêtreMobile(FEN_choixAction)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_choixAction);

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
mWD_LIB_Horaires = new GWDLIB_Horaires();
mWD_BTN_Ajouter = new GWDBTN_Ajouter();

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

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_ColorSide_Orange021.png?_3NP_1_223_1_180", 1, 0, 1);


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
mWD_LIB_Horaires.initialiserObjet();
super.ajouter("LIB_Horaires", mWD_LIB_Horaires);
mWD_BTN_Ajouter.initialiserObjet();
super.ajouter("BTN_Ajouter", mWD_BTN_Ajouter);

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
