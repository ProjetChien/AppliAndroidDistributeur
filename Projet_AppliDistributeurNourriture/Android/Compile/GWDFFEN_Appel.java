/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Appel
 * Date : 10/03/2016 14:11:12
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.multimedia.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Appel extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Appel
////////////////////////////////////////////////////////////////////////////

/**
 * MM_Appel
 */
class GWDMM_Appel extends WDChampMultimedia
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Appel.MM_Appel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2801639014378771047l);

super.setChecksum("667796406");

super.setNom("MM_Appel");

super.setType(39);

super.setLibelle("Multimédia");

super.setMenuContextuelSysteme();

super.setNote("");

super.setValeurInitiale("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 27);

super.setTailleInitiale(316, 342);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setModeAffichage(6);

super.setParamControles(1);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

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
public GWDMM_Appel mWD_MM_Appel;

/**
 * BTN_Play
 */
class GWDBTN_Play extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Appel.BTN_Play
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2801639074508786077l);

super.setChecksum("668253346");

super.setNom("BTN_Play");

super.setType(4);

super.setLibelle("Lancer");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 418);

super.setTailleInitiale(143, 48);

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
 * Traitement: Clic sur BTN_Play
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sIP2= new WDChaineU();

WDObjet vWD_sAdresseWebIP= new WDChaineU();

WDObjet vWD_bResAppel= new WDBooleen();



// sIP2 est une chaîne = ChaîneInsère(gsIP,"http://",1)

vWD_sIP2.setValeur(WDAPIChaine.chaineInsere(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gsIP.getString(),"http://",1));


// sAdresseWebIP est une chaîne = ChaîneInsère(sIP2,":8090/",21)

vWD_sAdresseWebIP.setValeur(WDAPIChaine.chaineInsere(vWD_sIP2.getString(),":8090/",21));


// bResAppel est un booléen = MultimédiaJoue(MM_Appel,sAdresseWebIP)

vWD_bResAppel.setValeur(WDAPIMediaPlayer.multimediaJoue(mWD_MM_Appel,vWD_sAdresseWebIP.getString()));


// SI bResAppel = Faux ALORS
if(vWD_bResAppel.opEgal(false))
{
// 	Info("Lecture Impossible")
WDAPIDialogue.info("Lecture Impossible");

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
public GWDBTN_Play mWD_BTN_Play;

/**
 * BTN_Stop
 */
class GWDBTN_Stop extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Appel.BTN_Stop
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2801639083098919758l);

super.setChecksum("668452437");

super.setNom("BTN_Stop");

super.setType(4);

super.setLibelle("Arrêter");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(159, 418);

super.setTailleInitiale(142, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Stop mWD_BTN_Stop;

/**
 * Traitement: Déclarations globales de FEN_Appel
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
// Création des champs de la fenêtre FEN_Appel
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_MM_Appel = new GWDMM_Appel();
mWD_BTN_Play = new GWDBTN_Play();
mWD_BTN_Stop = new GWDBTN_Stop();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Appel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2801633954906380634l);

super.setChecksum("672261728");

super.setNom("FEN_Appel");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("Appel");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\BG_Hybrid_Menu.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Appel
////////////////////////////////////////////////////////////////////////////
mWD_MM_Appel.initialiserObjet();
super.ajouter("MM_Appel", mWD_MM_Appel);
mWD_BTN_Play.initialiserObjet();
super.ajouter("BTN_Play", mWD_BTN_Play);
mWD_BTN_Stop.initialiserObjet();
super.ajouter("BTN_Stop", mWD_BTN_Stop);

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
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Appel;
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
