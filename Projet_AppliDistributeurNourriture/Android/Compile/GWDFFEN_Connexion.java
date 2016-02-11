/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Connexion
 * Date : 11/02/2016 15:03:09
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Connexion extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Connexion
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Bienvenue
 */
class GWDLIB_Bienvenue extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Connexion.LIB_Bienvenue
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2779764505417022974l);

super.setChecksum("657635437");

super.setNom("LIB_Bienvenue");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Bienvenue");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(94, 14);

super.setTailleInitiale(122, 42);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

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
public GWDLIB_Bienvenue mWD_LIB_Bienvenue;

/**
 * LIB_IP
 */
class GWDLIB_IP extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Connexion.LIB_IP
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2779765261334195863l);

super.setChecksum("660564406");

super.setNom("LIB_IP");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Adresse IP de la box internet :");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(20, 78);

super.setTailleInitiale(273, 25);

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

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("MS Shell Dlg", -9.000000, 0), 3);

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
public GWDLIB_IP mWD_LIB_IP;

/**
 * SAI_AdresseIP
 */
class GWDSAI_AdresseIP extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Connexion.SAI_AdresseIP
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,250,40);
super.setQuid(2779768714500109343l);

super.setChecksum("672772250");

super.setNom("SAI_AdresseIP");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(15);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(20, 125);

super.setTailleInitiale(252, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("22"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -9.000000, 0), 4);

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
public GWDSAI_AdresseIP mWD_SAI_AdresseIP;

/**
 * BTN_Connexion
 */
class GWDBTN_Connexion extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Connexion.BTN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2779770690190768414l);

super.setChecksum("678476533");

super.setNom("BTN_Connexion");

super.setType(4);

super.setLibelle("Connexion");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(56, 220);

super.setTailleInitiale(200, 105);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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
 * Traitement: Clic sur BTN_Connexion
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_IP= new WDChaineU();



// IP est une chaîne = SAI_AdresseIP

vWD_IP.setValeur(mWD_SAI_AdresseIP);


// CommunicationRaspberry::Connexion(IP)
GWDCCommunicationRaspberry.fWD_connexion(vWD_IP);

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
public GWDBTN_Connexion mWD_BTN_Connexion;

/**
 * Traitement: Déclarations globales de FEN_Connexion
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
// Création des champs de la fenêtre FEN_Connexion
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Bienvenue = new GWDLIB_Bienvenue();
mWD_LIB_IP = new GWDLIB_IP();
mWD_SAI_AdresseIP = new GWDSAI_AdresseIP();
mWD_BTN_Connexion = new GWDBTN_Connexion();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2778590836887409629l);

super.setChecksum("666256203");

super.setNom("FEN_Connexion");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("Connexion");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_Hybrid_Menu_Popup.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Connexion
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Bienvenue.initialiserObjet();
super.ajouter("LIB_Bienvenue", mWD_LIB_Bienvenue);
mWD_LIB_IP.initialiserObjet();
super.ajouter("LIB_IP", mWD_LIB_IP);
mWD_SAI_AdresseIP.initialiserObjet();
super.ajouter("SAI_AdresseIP", mWD_SAI_AdresseIP);
mWD_BTN_Connexion.initialiserObjet();
super.ajouter("BTN_Connexion", mWD_BTN_Connexion);

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
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Connexion;
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
