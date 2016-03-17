/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Historique
 * Date : 08/03/2016 10:47:15
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Historique extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Historique
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Historique
 */
class GWDSAI_Historique extends WDChampSaisieMultiLigne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Historique.SAI_Historique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,316,240);
super.setQuid(2800554410584991985l);

super.setChecksum("670047385");

super.setNom("SAI_Historique");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 88);

super.setTailleInitiale(316, 244);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

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

super.setMiseABlancSiZero(true);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -11.000000, 0), 4);

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
public GWDSAI_Historique mWD_SAI_Historique;

/**
 * BTN_RecupHistorique
 */
class GWDBTN_RecupHistorique extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Historique.BTN_RecupHistorique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800556704098258523l);

super.setChecksum("670771447");

super.setNom("BTN_RecupHistorique");

super.setType(4);

super.setLibelle("Récupérer Historique");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(75, 395);

super.setTailleInitiale(160, 66);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
 * Traitement: Clic sur BTN_RecupHistorique
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bResRecoie= new WDBooleen();

WDObjet vWD_sSourceXML= new WDChaineU();



// bResRecoie est un booléen


// bResRecoie = CommunicationRaspberry::RecevoirFichier()
vWD_bResRecoie.setValeur(GWDCCommunicationRaspberry.fWD_recevoirFichier());

// sSourceXML est une chaîne = fChargeTexte("/storage/sdcard0/Download/FichierParamètresXML.xml")

vWD_sSourceXML.setValeur(WDAPIFichier.fChargeTexte("/storage/sdcard0/Download/FichierParamètresXML.xml"));


// SI bResRecoie = Faux ALORS
if(vWD_bResRecoie.opEgal(false))
{
// 	Info("Fichier non joignable !")
WDAPIDialogue.info("Fichier non joignable !");

}
else
{
// 	ToastAffiche("Fichier téléchargé !")
WDAPIToast.toastAffiche("Fichier téléchargé !");

// 	SAI_Historique = XMLExtraitChaîne(sSourceXML,"NbreRepas") + RC
mWD_SAI_Historique.setValeur(WDAPIXmlClassic.xmlExtraitChaine(vWD_sSourceXML.getString(),"NbreRepas").opPlus("\r\n"));

// 	SAI_Historique += XMLExtraitChaîne(sSourceXML,"Horaire1") + RC 
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(WDAPIXmlClassic.xmlExtraitChaine(vWD_sSourceXML.getString(),"Horaire1").opPlus("\r\n")));

// 	SAI_Historique += XMLExtraitChaîne(sSourceXML, "Ration1") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(WDAPIXmlClassic.xmlExtraitChaine(vWD_sSourceXML.getString(),"Ration1").opPlus("\r\n")));

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
public GWDBTN_RecupHistorique mWD_BTN_RecupHistorique;

/**
 * Traitement: Déclarations globales de FEN_Historique
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Historique
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Historique = new GWDSAI_Historique();
mWD_BTN_RecupHistorique = new GWDBTN_RecupHistorique();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Historique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2800552958883676251l);

super.setChecksum("673068600");

super.setNom("FEN_Historique");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("Historique");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_Hybrid_Menu_Popup.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Historique
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Historique.initialiserObjet();
super.ajouter("SAI_Historique", mWD_SAI_Historique);
mWD_BTN_RecupHistorique.initialiserObjet();
super.ajouter("BTN_RecupHistorique", mWD_BTN_RecupHistorique);

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
return true;
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
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Historique;
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
