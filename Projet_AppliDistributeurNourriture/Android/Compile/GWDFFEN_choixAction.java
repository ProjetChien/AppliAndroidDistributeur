/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_choixAction
 * Date : 17/03/2016 14:10:27
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_choixAction extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_choixAction
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Programmer_des_repas
 */
class GWDBTN_Programmer_des_repas extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_choixAction.BTN_Programmer_des_repas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2782376296526019260l);

super.setChecksum("679706204");

super.setNom("BTN_Programmer_des_repas");

super.setType(4);

super.setLibelle("Programmer des repas");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(37, 63);

super.setTailleInitiale(244, 70);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

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
 * Traitement: Clic sur BTN_Programmer_des_repas
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Paramètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Parametres);

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
public GWDBTN_Programmer_des_repas mWD_BTN_Programmer_des_repas;

/**
 * BTN_RationsMtn
 */
class GWDBTN_RationsMtn extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_choixAction.BTN_RationsMtn
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2782376296526084796l);

super.setChecksum("679771740");

super.setNom("BTN_RationsMtn");

super.setType(4);

super.setLibelle("Envoie direct de ration(s)");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(37, 161);

super.setTailleInitiale(137, 103);

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
 * Traitement: Clic sur BTN_RationsMtn
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nNbreRationMtn= new WDEntier();

WDObjet vWD_sMonDocIm= new WDChaineA();

WDObjet vWD_sSourceImXML= new WDChaineA();

WDObjet vWD_bResEnregistreIm= new WDBooleen();

WDObjet vWD_bResEnvoieIm= new WDBooleen();

WDObjet vWD_dDateMtn = new WDDate();

WDObjet vWD_hHeureMtn = new WDHeure();

WDObjet vWD_sCheminFichier= new WDChaineU();



// nNbreRationMtn est un entier = COMBO_RationActuel

vWD_nNbreRationMtn.setValeur(mWD_COMBO_RationActuel);


// sMonDocIm est une chaîne ANSI = "FichierXML"

vWD_sMonDocIm.setValeur("FichierXML");


// sSourceImXML est une chaîne ANSI


// bResEnregistreIm est un booléen


// bResEnvoieIm est un booléen


// dDateMtn est une Date = DateVersChaîne(DateSys(), "JJ/MM/AA")

vWD_dDateMtn.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateSys(),"JJ/MM/AA"));


// hHeureMtn est une Heure = HeureVersChaîne(HeureSys(), "HH:MM")

vWD_hHeureMtn.setValeur(WDAPIDate.heureVersChaine(WDAPIDate.heureSys(),"HH:MM"));


// sCheminFichier est une chaîne = "/storage/sdcard0/Download/FichierRationIm.xml"

vWD_sCheminFichier.setValeur("/storage/sdcard0/Download/FichierRationIm.xml");


// bResEnregistreIm = XMLDocument(sMonDocIm, "")
vWD_bResEnregistreIm.setValeur(WDAPIXmlClassic.xmlDocument(vWD_sMonDocIm.getString(),new WDChaineU("")));

// SI bResEnregistreIm = Vrai ALORS
if(vWD_bResEnregistreIm.opEgal(true))
{
// 	ToastAffiche("Document enregistré !")
WDAPIToast.toastAffiche("Document enregistré !");

}

// XMLAjouteFils(sMonDocIm,"PARAMETRES","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"PARAMETRES","",true);

// XMLParent(sMonDocIm)
WDAPIXmlClassic.XMLParent(vWD_sMonDocIm.getString());

// XMLAjouteFils(sMonDocIm,"DATE_MODIF","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"DATE_MODIF","",true);

// XMLAjouteFils(sMonDocIm,"Date",dDateMtn)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"Date",vWD_dDateMtn.getString());

// XMLAjouteFils(sMonDocIm,"Heure",hHeureMtn)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"Heure",vWD_hHeureMtn.getString());

// XMLParent(sMonDocIm)
WDAPIXmlClassic.XMLParent(vWD_sMonDocIm.getString());

// XMLAjouteFils(sMonDocIm,"RATION_IMMEDIATE","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"RATION_IMMEDIATE","",true);

// XMLAjouteFils(sMonDocIm,"NbreRation",NumériqueVersChaîne(nNbreRationMtn))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDocIm.getString(),"NbreRation",WDAPINum.numeriqueVersChaine(vWD_nNbreRationMtn).getString());

// sSourceImXML = XMLConstruitChaîne(sMonDocIm)
vWD_sSourceImXML.setValeur(WDAPIXml.xmlConstruitChaine(vWD_sMonDocIm));

// XMLTermine(sMonDocIm)
WDAPIXmlClassic.xmlTermine(vWD_sMonDocIm.getString());

// fSauveTexte(sCheminFichier,Remplace(sSourceImXML,"><",">"+RC+"<"))
WDAPIFichier.fSauveTexte(vWD_sCheminFichier.getString(),WDAPIChaine.remplace(vWD_sSourceImXML,new WDChaineU("><"),new WDChaineU(">\r\n<")));

// bResEnvoieIm = CommunicationRaspberry::EnvoyerFichier(sCheminFichier)
vWD_bResEnvoieIm.setValeur(GWDCCommunicationRaspberry.fWD_envoyerFichier(vWD_sCheminFichier));

// BTN_RationsMtn..Etat = Grisé
this.setEtat(4);

// SI bResEnvoieIm = Vrai ALORS
if(vWD_bResEnvoieIm.opEgal(true))
{
// 	ToastAffiche("Fichier envoyé !")
WDAPIToast.toastAffiche("Fichier envoyé !");

// 	BTN_RationsMtn..Etat = Actif
this.setEtat(0);

}
else
{
// 	Info("Echec de l'envoie du fichier !")
WDAPIDialogue.info("Echec de l'envoie du fichier !");

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
public GWDBTN_RationsMtn mWD_BTN_RationsMtn;

/**
 * LIB_ChoixAction
 */
class GWDLIB_ChoixAction extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_choixAction.LIB_ChoixAction
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2782377211356822388l);

super.setChecksum("682475041");

super.setNom("LIB_ChoixAction");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Choix de l'action");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(77, 12);

super.setTailleInitiale(182, 32);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
public GWDLIB_ChoixAction mWD_LIB_ChoixAction;

/**
 * COMBO_RationActuel
 */
class GWDCOMBO_RationActuel extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_choixAction.COMBO_RationActuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,44);
super.setRectCompPrincipal(2,2,64,44);
super.setNom("COMBO_RationActuel");

super.setType(10002);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(211, 194);

super.setTailleInitiale(66, 48);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("1\r\n2\r\n3\r\n4\r\n5");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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
public GWDCOMBO_RationActuel mWD_COMBO_RationActuel;

/**
 * BTN_Consulter_l_historique
 */
class GWDBTN_Consulter_l_historique extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_choixAction.BTN_Consulter_l_historique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2782676304271627187l);

super.setChecksum("664791086");

super.setNom("BTN_Consulter_l_historique");

super.setType(4);

super.setLibelle("Consulter l'historique");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(40, 400);

super.setTailleInitiale(241, 69);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(5);

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
 * Traitement: Clic sur BTN_Consulter_l_historique
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Historique)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Historique);

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
public GWDBTN_Consulter_l_historique mWD_BTN_Consulter_l_historique;

/**
 * BTN_Appeler_votre_animal_de_compagnie
 */
class GWDBTN_Appeler_votre_animal_de_compagnie extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_choixAction.BTN_Appeler_votre_animal_de_compagnie
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2782677064486783011l);

super.setChecksum("670735695");

super.setNom("BTN_Appeler_votre_animal_de_compagnie");

super.setType(4);

super.setLibelle("Appeler votre animal de compagnie");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(40, 300);

super.setTailleInitiale(241, 73);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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
 * Traitement: Clic sur BTN_Appeler_votre_animal_de_compagnie
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Appel)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Appel);

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
public GWDBTN_Appeler_votre_animal_de_compagnie mWD_BTN_Appeler_votre_animal_de_compagnie;

/**
 * Traitement: Déclarations globales de FEN_choixAction
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
// Création des champs de la fenêtre FEN_choixAction
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Programmer_des_repas = new GWDBTN_Programmer_des_repas();
mWD_BTN_RationsMtn = new GWDBTN_RationsMtn();
mWD_LIB_ChoixAction = new GWDLIB_ChoixAction();
mWD_COMBO_RationActuel = new GWDCOMBO_RationActuel();
mWD_BTN_Consulter_l_historique = new GWDBTN_Consulter_l_historique();
mWD_BTN_Appeler_votre_animal_de_compagnie = new GWDBTN_Appeler_votre_animal_de_compagnie();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_choixAction
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2782376296525953724l);

super.setChecksum("685038853");

super.setNom("FEN_choixAction");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("choixAction");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\BG_Hybrid_Menu.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_choixAction
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Programmer_des_repas.initialiserObjet();
super.ajouter("BTN_Programmer_des_repas", mWD_BTN_Programmer_des_repas);
mWD_BTN_RationsMtn.initialiserObjet();
super.ajouter("BTN_RationsMtn", mWD_BTN_RationsMtn);
mWD_LIB_ChoixAction.initialiserObjet();
super.ajouter("LIB_ChoixAction", mWD_LIB_ChoixAction);
mWD_COMBO_RationActuel.initialiserObjet();
super.ajouter("COMBO_RationActuel", mWD_COMBO_RationActuel);
mWD_BTN_Consulter_l_historique.initialiserObjet();
super.ajouter("BTN_Consulter_l_historique", mWD_BTN_Consulter_l_historique);
mWD_BTN_Appeler_votre_animal_de_compagnie.initialiserObjet();
super.ajouter("BTN_Appeler_votre_animal_de_compagnie", mWD_BTN_Appeler_votre_animal_de_compagnie);

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
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_choixAction;
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
