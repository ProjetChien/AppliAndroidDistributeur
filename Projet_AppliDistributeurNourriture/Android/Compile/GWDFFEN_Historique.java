/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Historique
 * Date : 07/04/2016 14:27:14
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
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
super.setRectCompPrincipal(0,2,316,289);
super.setQuid(2800554410584991985l);

super.setChecksum("670047385");

super.setNom("SAI_Historique");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(2, 87);

super.setTailleInitiale(316, 293);

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

super.setAncrageInitial(10, 1000, 1000, 500, 1000);

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

super.setCadreInterne(2, 0xFFFFFFFF, 0xF4000000, 0x0, 4, 4);

super.setStyleSaisie(0xFFFFFF, creerPolice("MS Shell Dlg", -11.000000, 0));

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
 * COMBO_ChoixTri
 */
class GWDCOMBO_ChoixTri extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Historique.COMBO_ChoixTri
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,79,40);
super.setRectCompPrincipal(79,2,237,40);
super.setNom("COMBO_ChoixTri");

super.setType(10002);

super.setLibelle("Choix : ");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 418);

super.setTailleInitiale(316, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Tout voir\nRepas programmés\nRations exceptionnelles\nAppels");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(1, 0, 1000, 1000, 1000);

super.setNumTab(2);

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
 * Traitement: Sélection d'une ligne de COMBO_ChoixTri
 */
public void selectionLigne()
{
super.selectionLigne();

// selon COMBO_ChoixTri
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = this;
if(_WDExpSelon0.opEgal("1"))
{
// 		SAI_Historique = ""
mWD_SAI_Historique.setValeur("");

// 		XMLPremier("DoxXML")
WDAPIXmlClassic.xmlPremier("DoxXML");

// 		TANTQUE XMLEnDehors("DoxXML") = Faux
while(WDAPIXmlClassic.xmlEnDehors("DoxXML").opEgal(false))
{
// 			SELON XMLNomElément("DoxXML")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon1 = WDAPIXmlClassic.XMLNomElement("DoxXML");
if(_WDExpSelon1.opEgal("Horaire"))
{
// 					SAI_Historique += "Repas à : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Repas à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon1.opEgal("Ration"))
{
// 					SAI_Historique += "Nombre de ration : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon1.opEgal("Ration_Im"))
{
// 					SAI_Historique += "Nombre de ration immédiate : " + XMLDonnée("DoxXML") + RC	
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration immédiate : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon1.opEgal("Appel"))
{
// 					SAI_Historique += "Appel passé à : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Appel passé à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}

}

// 			XMLSuivant("DoxXML")
WDAPIXmlClassic.xmlSuivant("DoxXML");

}

}
else if(_WDExpSelon0.opEgal("2"))
{
// 		SAI_Historique = ""
mWD_SAI_Historique.setValeur("");

// 		XMLPremier("DoxXML")
WDAPIXmlClassic.xmlPremier("DoxXML");

// 		TANTQUE XMLEnDehors("DoxXML") = Faux
while(WDAPIXmlClassic.xmlEnDehors("DoxXML").opEgal(false))
{
// 			SELON XMLNomElément("DoxXML")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon2 = WDAPIXmlClassic.XMLNomElement("DoxXML");
if(_WDExpSelon2.opEgal("Horaire"))
{
// 					SAI_Historique += "Repas à : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Repas à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon2.opEgal("Ration"))
{
// 					SAI_Historique += "Nombre de ration : " + XMLDonnée("DoxXML") + RC	
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}

}

// 			XMLSuivant("DoxXML")
WDAPIXmlClassic.xmlSuivant("DoxXML");

}

}
else if(_WDExpSelon0.opEgal("3"))
{
// 		SAI_Historique = ""
mWD_SAI_Historique.setValeur("");

// 		XMLPremier("DoxXML")
WDAPIXmlClassic.xmlPremier("DoxXML");

// 		TANTQUE XMLEnDehors("DoxXML") = Faux
while(WDAPIXmlClassic.xmlEnDehors("DoxXML").opEgal(false))
{
// 			SELON XMLNomElément("DoxXML")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon3 = WDAPIXmlClassic.XMLNomElement("DoxXML");
if(_WDExpSelon3.opEgal("Ration_Im"))
{
// 					SAI_Historique += "Nombre de ration immédiate : " + XMLDonnée("DoxXML") + RC	
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration immédiate : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}

}

// 			XMLSuivant("DoxXML")
WDAPIXmlClassic.xmlSuivant("DoxXML");

}

}
else if(_WDExpSelon0.opEgal("4"))
{
// 			SAI_Historique = ""
mWD_SAI_Historique.setValeur("");

// 			XMLPremier("DoxXML")
WDAPIXmlClassic.xmlPremier("DoxXML");

// 			TANTQUE XMLEnDehors("DoxXML") = Faux
while(WDAPIXmlClassic.xmlEnDehors("DoxXML").opEgal(false))
{
// 				SELON XMLNomElément("DoxXML")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon4 = WDAPIXmlClassic.XMLNomElement("DoxXML");
if(_WDExpSelon4.opEgal("Appel"))
{
// 					SAI_Historique += "Appel passé à : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Appel passé à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}

}

// 				XMLSuivant("DoxXML")
WDAPIXmlClassic.xmlSuivant("DoxXML");

}

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
public GWDCOMBO_ChoixTri mWD_COMBO_ChoixTri;

/**
 * Traitement: Déclarations globales de FEN_Historique
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



/**
 * Traitement: Fin d'initialisation de FEN_Historique
 */
public void init()
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bResRecoie= new WDBooleen();

WDObjet vWD_sSourceXML= new WDChaineA();

WDObjet vWD_sCheminHistorique= new WDChaineU();



// bResRecoie est un booléen


// sSourceXML est une chaîne ANSI


// sCheminHistorique est une chaîne = "/home/pi/FichierLogXML.xml"

vWD_sCheminHistorique.setValeur("/home/pi/FichierLogXML.xml");


// bResRecoie = CommunicationRaspberry::RecevoirFichier(sCheminHistorique)
vWD_bResRecoie.setValeur(GWDCCommunicationRaspberry.fWD_recevoirFichier(vWD_sCheminHistorique));

// sSourceXML = fChargeTexte("/storage/sdcard0/Download/FichierLogXML.xml")
vWD_sSourceXML.setValeur(WDAPIFichier.fChargeTexte("/storage/sdcard0/Download/FichierLogXML.xml"));

// SI bResRecoie = Faux ALORS
if(vWD_bResRecoie.opEgal(false))
{
// 	Erreur("Fichier non joignable !")
WDAPIDialogue.erreur("Fichier non joignable !");

}
else
{
// 	XMLDocument("DoxXML", sSourceXML)
WDAPIXmlClassic.xmlDocument("DoxXML",vWD_sSourceXML);

// 	XMLFils("DoxXML")
WDAPIXmlClassic.xmlFils("DoxXML");

// 	TANTQUE XMLEnDehors("DoxXML") = Faux
while(WDAPIXmlClassic.xmlEnDehors("DoxXML").opEgal(false))
{
// 		SELON XMLNomElément("DoxXML")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = WDAPIXmlClassic.XMLNomElement("DoxXML");
if(_WDExpSelon0.opEgal("Horaire"))
{
// 				SAI_Historique += "Repas à : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Repas à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon0.opEgal("Ration"))
{
// 				SAI_Historique += "Nombre de ration : " + XMLDonnée("DoxXML") + RC
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon0.opEgal("Ration_Im"))
{
// 				SAI_Historique += "Nombre de ration immédiate : " + XMLDonnée("DoxXML") + RC	
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Nombre de ration immédiate : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}
else if(_WDExpSelon0.opEgal("Appel"))
{
// 				SAI_Historique += "Appel passé à : " + XMLDonnée("DoxXML") + RC		
mWD_SAI_Historique.setValeur(mWD_SAI_Historique.opPlus(new WDChaineU("Appel passé à : ").opPlus(WDAPIXmlClassic.xmlDonnee("DoxXML")).opPlus("\r\n")));

}

}

// 	    XMLSuivant("DoxXML")
WDAPIXmlClassic.xmlSuivant("DoxXML");

}

}

}



/**
 * Traitement: Fermeture de FEN_Historique
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// XMLTermine("DoxXML")
WDAPIXmlClassic.xmlTermine("DoxXML");

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
mWD_COMBO_ChoixTri = new GWDCOMBO_ChoixTri();

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

super.setImageFond("D:\\SN1IR2016\\ARNAUD Adrien\\Projet_WM\\Projet_AppliDistributeurNourriture\\Bg_ColorSide_Orange02.png?_3NP_1_223_1_180", 1, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Historique
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Historique.initialiserObjet();
super.ajouter("SAI_Historique", mWD_SAI_Historique);
mWD_COMBO_ChoixTri.initialiserObjet();
super.ajouter("COMBO_ChoixTri", mWD_COMBO_ChoixTri);

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
