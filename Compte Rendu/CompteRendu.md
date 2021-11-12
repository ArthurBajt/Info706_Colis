# Compte rendu TP Info 706
> Lacerenza Loris & Bajt Arthur
- <a href="#1">Utilisation de l'application</a>
- <a href="#2">Choix d'implémentation</a>

---

<h2 id="1">Utilisation de l'application</h2>

Lien de l'application une fois lancée :
<a href="localhost:8080/LivraisonColis-1.0-SNAPSHOT/">localhost:8080/LivraisonColis-1.0-SNAPSHOT/</a>

> note : Le projet à été creer avec Inteliji. Ce qui donne cet Url pour l'application.

<img src="img/index.png"/>

La page d'acceuille du site vous propose de visualiser les colis en transite.

Depuis celle-ci vous pouvez également :
- Ajouter un nouveau colis, depuis *"Enregistrement"*.
- Voir le suivis d'un colis, soir en cliquant sur *"Recherche / Suivis"* ou sur le N° d'un colis.
- Modifier l'état d'un colis, un des boutons *"Modifier"* .

### Ajouter un colis
<img src="img/Enregistrement.png"/>
Depuis ce formulaire vous creez un nouveau colis.

### Voir le suivis d'un colis
<img src="img/Suivis.png"/>
Ici on peut rechercher un colis avec son numéro et voir son état et ses infosrmations.

### Changer l'état d'un colis
<img src="img/Progression.png"/>
Ici on peut modifier la progression d'un colis.

On peut aussi rechercher un colis à modifier.

Ou le supprimer.

---

<h2 id="2">Choix d'implémentation</h2>

### Classe Colis
Nous avons choisit cette implémentation pour nos colis :
```java
@Entity
public class Colis implements Serializable {

	@Id @GeneratedValue
	private long id;

    private double poid;
    private double valeur;
    private String origine;
    private String destination;

    @Embedded
    private Position acheminement;
    // ...
  }
```

Où **acheminement** est une **Position** que nous avons rendu *@Embeddable* pour y stoquer dans une base de donnée.
```java
@Embeddable
public class Position implements Serializable {

	double latitude;
	double longitude;
	String emplacement;
	Etat etat; // type énumérer pour les état
  //...
}
```


### Classe ColisEJB
Nous avons creer cette classe pour gerer nos colis dans la base de donnée :
```java
@Stateless
public class ColisEJB {

	@PersistenceContext
	private EntityManager em;

	public ColisEJB() {}


    public Colis addColis(double poid, double valeur, String origine, String destination, Position acheminement) {}

    public Colis findColis(long id){}

    public List<Colis> findAllColis(){}

    public void removeColis(long id){}

    public Colis updateColis(long id, double latitude, double longitude, String emplacement, Etat etat) {}

}
```
*voir ColisEJB.java pour le détail des fonctions*


### Les servelets
Nous avons creer 4 servelets pour :

#### L'index
- La methode get, affiche les colis et rend la page Index.jsp avec les colis.

#### L'ajout de Colis
- La méthode **get** permet simplement d'acceder au formulaire.
- Et la méthode **post** creer un colis avec les donnée du formulaire.

#### Le suivis d'un colis
- Affiche le colis à un id donnée dans la requette.

#### La modification d'un colis
- La méthode **get** permet simplement d'acceder a un formulaire pour modifier le colis à l'id donnée dans la requette.
- Et la méthode **post** modifie le colis avec les nouvelles donnée du formulaire.
