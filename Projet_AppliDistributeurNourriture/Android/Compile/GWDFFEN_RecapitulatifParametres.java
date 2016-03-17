/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_RécapitulatifParamètres
 * Date : 11/03/2016 09:40:30
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_RecapitulatifParametres extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_RécapitulatifParamètres
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_RecapParams
 */
class GWDLIB_RecapParams extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_RécapitulatifParamètres.LIB_RecapParams
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2780071316485042359l);

super.setChecksum("736936497");

super.setNom("LIB_RecapParams");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Paramètres ");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(92, 12);

super.setTailleInitiale(137, 32);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

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
public GWDLIB_RecapParams mWD_LIB_RecapParams;

/**
 * SAI_RecapParams
 */
class GWDSAI_RecapParams extends WDChampSaisieMultiLigne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_RécapitulatifParamètres.SAI_RecapParams
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,316,276);
super.setQuid(2781162899548622571l);

super.setChecksum("682630681");

super.setNom("SAI_RecapParams");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(2, 59);

super.setTailleInitiale(316, 280);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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

super.setCadreInterne(2, 0xFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleSaisie(0x0, creerPolice("MS Shell Dlg", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de SAI_RecapParams
 */
public void init()
{
super.init();

// SAI_RecapParams = "Nombre de repas : " + gnNbreRepas + RC + rc
this.setValeur(new WDChaineU("Nombre de repas : ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas).opPlus("\r\n").opPlus("\r\n"));

// SAI_RecapParams += "Horaire(s)" + "       " + "Ration(s) / Repas" + RC
this.setValeur(this.opPlus("Horaire(s)       Ration(s) / Repas\r\n"));

// SAI_RecapParams += "    " + HeureVersChaîne(ghHoraire1,"HH:MM") + "                             " + gnRation1 + rc
this.setValeur(this.opPlus(new WDChaineU("    ").opPlus(WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire1,"HH:MM")).opPlus("                             ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1).opPlus("\r\n")));

// si gnNbreRepas = 2 ou gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 alors
if((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(2) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// SAI_RecapParams += "    " + HeureVersChaîne(ghHoraire2,"HH:MM") + "                             " + gnRation2 + rc
this.setValeur(this.opPlus(new WDChaineU("    ").opPlus(WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire2,"HH:MM")).opPlus("                             ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2).opPlus("\r\n")));

}

// SI gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if(((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// SAI_RecapParams += "    " + HeureVersChaîne(ghHoraire3,"HH:MM") + "                             " + gnRation3 + RC
this.setValeur(this.opPlus(new WDChaineU("    ").opPlus(WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire3,"HH:MM")).opPlus("                             ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3).opPlus("\r\n")));

}

// SI gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// SAI_RecapParams += "    " + HeureVersChaîne(ghHoraire4,"HH:MM") + "                             " + gnRation4 + RC
this.setValeur(this.opPlus(new WDChaineU("    ").opPlus(WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire4,"HH:MM")).opPlus("                             ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4).opPlus("\r\n")));

}

// SI gnNbreRepas = 5 ALORS
if(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5))
{
// SAI_RecapParams += "    " + HeureVersChaîne(ghHoraire5,"HH:MM") + "                             " + gnRation5 + RC
this.setValeur(this.opPlus(new WDChaineU("    ").opPlus(WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire5,"HH:MM")).opPlus("                             ").opPlus(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation5).opPlus("\r\n")));

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_RecapParams mWD_SAI_RecapParams;

/**
 * BTN_Envoyer
 */
class GWDBTN_Envoyer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_RécapitulatifParamètres.BTN_Envoyer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2790472236851296207l);

super.setChecksum("668352166");

super.setNom("BTN_Envoyer");

super.setType(4);

super.setLibelle("Envoyer");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(88, 385);

super.setTailleInitiale(146, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
 * Traitement: Clic sur BTN_Envoyer
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sMonDoc= new WDChaineA();

WDObjet vWD_sSourceXML= new WDChaineA();

WDObjet vWD_bResEnregistre= new WDBooleen();

WDObjet vWD_bResEnvoie= new WDBooleen();

WDObjet vWD_sCheminFichier= new WDChaineU();

WDObjet vWD_dDateMtn = new WDDate();

WDObjet vWD_hHeureMtn = new WDHeure();



// sMonDoc est une chaîne ANSI = "FichierXML"

vWD_sMonDoc.setValeur("FichierXML");


// sSourceXML est une chaîne ANSI


// bResEnregistre est un booléen


// bResEnvoie est un booléen


// sCheminFichier est une chaîne = "/storage/sdcard0/Download/FichierParamètresXML.xml"

vWD_sCheminFichier.setValeur("/storage/sdcard0/Download/FichierParamètresXML.xml");


// dDateMtn est une Date = DateVersChaîne(DateSys(),"JJ/MM/AA")

vWD_dDateMtn.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateSys(),"JJ/MM/AA"));


// hHeureMtn est une Heure = HeureVersChaîne(HeureSys(), "HH:MM")

vWD_hHeureMtn.setValeur(WDAPIDate.heureVersChaine(WDAPIDate.heureSys(),"HH:MM"));


// bResEnregistre = XMLDocument(sMonDoc, "")
vWD_bResEnregistre.setValeur(WDAPIXmlClassic.xmlDocument(vWD_sMonDoc.getString(),new WDChaineU("")));

// SI bResEnregistre = Vrai ALORS
if(vWD_bResEnregistre.opEgal(true))
{
// 	ToastAffiche("Document enregistré !")
WDAPIToast.toastAffiche("Document enregistré !");

}

// XMLAjouteFils(sMonDoc,"PARAMETRES","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"PARAMETRES","",true);

// XMLParent(sMonDoc)
WDAPIXmlClassic.XMLParent(vWD_sMonDoc.getString());

// XMLAjouteFils(sMonDoc,"DATE_MODIF","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"DATE_MODIF","",true);

// XMLAjouteFils(sMonDoc,"Date",dDateMtn)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Date",vWD_dDateMtn.getString());

// XMLAjouteFils(sMonDoc,"Heure",hHeureMtn)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Heure",vWD_hHeureMtn.getString());

// XMLParent(sMonDoc)
WDAPIXmlClassic.XMLParent(vWD_sMonDoc.getString());

// XMLAjouteFils(sMonDoc,"LISTE_DE_REPAS","",Vrai)
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"LISTE_DE_REPAS","",true);

// XMLAjouteFils(sMonDoc,"NbreRepas",NumériqueVersChaîne(gnNbreRepas))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"NbreRepas",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas).getString());

// XMLAjouteFils(sMonDoc,"Horaire1",HeureVersChaîne(ghHoraire1,"HHMM"))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Horaire1",WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire1,"HHMM").getString());

// XMLAjouteFils(sMonDoc,"Ration1",NumériqueVersChaîne(gnRation1))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Ration1",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation1).getString());

// SI gnNbreRepas = 2 OU gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if((((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(2) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	XMLAjouteFils(sMonDoc,"Horaire2",HeureVersChaîne(ghHoraire2,"HHMM"))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Horaire2",WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire2,"HHMM").getString());

// 	XMLAjouteFils(sMonDoc,"Ration2",NumériqueVersChaîne(gnRation2))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Ration2",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation2).getString());

}

// SI gnNbreRepas = 3 OU gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if(((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(3) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4)) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	XMLAjouteFils(sMonDoc,"Horaire3",HeureVersChaîne(ghHoraire3,"HHMM"))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Horaire3",WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire3,"HHMM").getString());

// 	XMLAjouteFils(sMonDoc,"Ration3",NumériqueVersChaîne(gnRation3))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Ration3",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation3).getString());

}

// SI gnNbreRepas = 4 OU gnNbreRepas = 5 ALORS
if((GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(4) | GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5)))
{
// 	XMLAjouteFils(sMonDoc,"Horaire4",HeureVersChaîne(ghHoraire4,"HHMM"))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Horaire4",WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire4,"HHMM").getString());

// 	XMLAjouteFils(sMonDoc,"Ration4",NumériqueVersChaîne(gnRation4))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Ration4",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation4).getString());

}

// SI gnNbreRepas = 5 ALORS
if(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnNbreRepas.opEgal(5))
{
// 	XMLAjouteFils(sMonDoc,"Horaire5",HeureVersChaîne(ghHoraire5,"HHMM"))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Horaire5",WDAPIDate.heureVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_ghHoraire5,"HHMM").getString());

// 	XMLAjouteFils(sMonDoc,"Ration5",NumériqueVersChaîne(gnRation5))
WDAPIXmlClassic.xmlAjouteFils(vWD_sMonDoc.getString(),"Ration5",WDAPINum.numeriqueVersChaine(GWDPProjet_AppliDistributeurNourriture.ms_Project.vWD_gnRation5).getString());

}

// sSourceXML = XMLConstruitChaîne(sMonDoc)
vWD_sSourceXML.setValeur(WDAPIXml.xmlConstruitChaine(vWD_sMonDoc));

// XMLTermine(sMonDoc)
WDAPIXmlClassic.xmlTermine(vWD_sMonDoc.getString());

// fSauveTexte(sCheminFichier,Remplace(sSourceXML,"><",">"+RC+"<"))
WDAPIFichier.fSauveTexte(vWD_sCheminFichier.getString(),WDAPIChaine.remplace(vWD_sSourceXML,new WDChaineU("><"),new WDChaineU(">\r\n<")));

// bResEnvoie = CommunicationRaspberry::EnvoyerFichier(sCheminFichier)
vWD_bResEnvoie.setValeur(GWDCCommunicationRaspberry.fWD_envoyerFichier(vWD_sCheminFichier));

// SI bResEnvoie = Vrai ALORS
if(vWD_bResEnvoie.opEgal(true))
{
// 	ToastAffiche("Fichier envoyé !")
WDAPIToast.toastAffiche("Fichier envoyé !");

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
public GWDBTN_Envoyer mWD_BTN_Envoyer;

/**
 * Traitement: Déclarations globales de FEN_RécapitulatifParamètres
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



/**
 * Traitement: Fermeture de FEN_RécapitulatifParamètres
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// Ferme(FEN_Paramètres)
WDAPIFenetre.ferme(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Parametres);

// OuvreFenêtreMobile(FEN_Paramètres)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_Parametres);

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_RécapitulatifParamètres
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_RecapParams = new GWDLIB_RecapParams();
mWD_SAI_RecapParams = new GWDSAI_RecapParams();
mWD_BTN_Envoyer = new GWDBTN_Envoyer();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_RécapitulatifParamètres
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2780067807496206429l);

super.setChecksum("741779223");

super.setNom("FEN_RécapitulatifParamètres");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF2000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("RécapitulatifParamètres");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_Hybrid_Menu_Popup.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_RécapitulatifParamètres
////////////////////////////////////////////////////////////////////////////
mWD_LIB_RecapParams.initialiserObjet();
super.ajouter("LIB_RecapParams", mWD_LIB_RecapParams);
mWD_SAI_RecapParams.initialiserObjet();
super.ajouter("SAI_RecapParams", mWD_SAI_RecapParams);
mWD_BTN_Envoyer.initialiserObjet();
super.ajouter("BTN_Envoyer", mWD_BTN_Envoyer);

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
return GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_RecapitulatifParametres;
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
