/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Classe
 * Classe Android : CommunicationRaspberry
 * Date : 07/04/2016 14:34:14
 * Version de wdjava.dll  : 20.0.143.0
 */


package com.masociete.projet_applidistributeurnourriture.wdgen;


import com.masociete.projet_applidistributeurnourriture.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCCommunicationRaspberry extends WDClasse
{
public static WDObjet mWD_mg_nNumIdentifiant= new WDEntier();
public static WDObjet mWD_mg_bResEnvoie= new WDBooleen();
public static WDObjet mWD_mg_bResRecoie= new WDBooleen();

protected WDObjet getMembreByName(String sNomMembre)
{
if(sNomMembre.equals("mg_nnumidentifiant")) return mWD_mg_nNumIdentifiant;
if(sNomMembre.equals("mg_bresenvoie")) return mWD_mg_bResEnvoie;
if(sNomMembre.equals("mg_bresrecoie")) return mWD_mg_bResRecoie;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_mg_nNumIdentifiant; membre.m_strNomMembre = "mWD_mg_nNumIdentifiant"; membre.m_bStatique = true; membre.m_strNomMembreWL = "mg_nNumIdentifiant"; membre.m_bSerialisable = true; return true;
case 1 : membre.m_refMembre = mWD_mg_bResEnvoie; membre.m_strNomMembre = "mWD_mg_bResEnvoie"; membre.m_bStatique = true; membre.m_strNomMembreWL = "mg_bResEnvoie"; membre.m_bSerialisable = true; return true;
case 2 : membre.m_refMembre = mWD_mg_bResRecoie; membre.m_strNomMembre = "mWD_mg_bResRecoie"; membre.m_bStatique = true; membre.m_strNomMembreWL = "mg_bResRecoie"; membre.m_bSerialisable = true; return true;

default: return super.getMembreByIndex(nIndice - 3, membre);
}
}
public GWDCCommunicationRaspberry()
{
initExecConstructeurClasse();

try
{
}
finally
{finExecConstructeurClasse();
}

}


protected void destructeur()
{
}


//  Résumé : Cette procédure permet la connexion au raspberry pi.
//  Syntaxe :
// Connexion (<sAdresseIP> est chaîne)
// 
//  Paramètres :
// 	sAdresseIP (chaîne UNICODE) : Récupère l'adresse IP rentrée par l'utilisateur.
//  Valeur de retour : aucune
static public void fWD_connexion( WDObjet vWD_sAdresseIP )
{
initExecMethodeStatiqueClasse("Connexion", "CommunicationRaspberry");


try
{
vWD_sAdresseIP = WDParametre.traiterParametre(vWD_sAdresseIP, 1, false, 16);


// mg_nNumIdentifiant = FTPConnecte(sAdresseIP,"pi","raspberry")
mWD_mg_nNumIdentifiant.setValeur(WDAPIFtp.ftpConnecte(vWD_sAdresseIP.getString(),"pi","raspberry"));

// SI mg_nNumIdentifiant <> -1 ALORS
if(mWD_mg_nNumIdentifiant.opDiff(-1))
{
// 	OuvreFenêtreMobile(FEN_choixAction)
WDAPIFenetre.ouvreFille(GWDPProjet_AppliDistributeurNourriture.ms_Project.mWD_FEN_choixAction);

// 	ToastAffiche("Connexion établie !",toastCourt,cvHaut)
WDAPIToast.toastAffiche("Connexion établie !",0,0);

}
else
{
// 	Erreur("Erreur lors de la connexion !")
WDAPIDialogue.erreur("Erreur lors de la connexion !");

}

}
finally
{finExecMethodeClasse();
}

}


//  Résumé : Cette procédure permet l'envoie du fichier au raspberry pi.
//  Syntaxe :
// [ <Résultat> = ] EnvoyerFichier (<sCheminFichierXML> est chaîne)
// 
//  Paramètres :
// 	sCheminFichierXML (chaîne UNICODE) : C'est le chemin où se trouve le fichier à envoyer.
//  Valeur de retour :
//  	booléen : mg_bResEnvoie permet de vérifier le bon envoie du fichier.
static public WDObjet fWD_envoyerFichier( WDObjet vWD_sCheminFichierXML )
{
initExecMethodeStatiqueClasse("EnvoyerFichier", "CommunicationRaspberry");


try
{
vWD_sCheminFichierXML = WDParametre.traiterParametre(vWD_sCheminFichierXML, 1, false, 16);


// mg_bResEnvoie = FTPEnvoie(mg_nNumIdentifiant,sCheminFichierXML,"/home/pi")
mWD_mg_bResEnvoie.setValeur(WDAPIFtp.ftpEnvoie(mWD_mg_nNumIdentifiant.getInt(),vWD_sCheminFichierXML.getString(),"/home/pi"));

// RENVOYER mg_bResEnvoie
return mWD_mg_bResEnvoie;

}
finally
{finExecMethodeClasse();
}

}


//  Résumé : Cette procédure permet la réception d'un fichier se situant sur le raspberry pi.
//  Syntaxe :
// [ <Résultat> = ] RecevoirFichier ()
// 
//  Paramètres : aucun
//  Valeur de retour :
//  	booléen : mg_bResRecoie permet de vérifier le bon transfert vers l'application mobile du fichier.
static public WDObjet fWD_recevoirFichier( WDObjet vWD_sCheminFichierXML )
{
initExecMethodeStatiqueClasse("RecevoirFichier", "CommunicationRaspberry");


try
{
vWD_sCheminFichierXML = WDParametre.traiterParametre(vWD_sCheminFichierXML, 1, false, 16);


// mg_bResRecoie = FTPRécupère(mg_nNumIdentifiant,sCheminFichierXML,"/storage/sdcard0/Download")
mWD_mg_bResRecoie.setValeur(WDAPIFtp.ftpRecupere(mWD_mg_nNumIdentifiant.getInt(),vWD_sCheminFichierXML.getString(),"/storage/sdcard0/Download"));

// renvoyer mg_bResRecoie
return mWD_mg_bResRecoie;

}
finally
{finExecMethodeClasse();
}

}


}
