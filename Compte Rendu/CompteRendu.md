# Compte rendu TP Info 706
- <a href="#1">Utilisation de l'application</a>
- <a href="#2">Choix d'implémentation</a>

---

<h2 id="1">Utilisation de l'application</h2>

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

### Supprimer colis
<img src="img/Supprimer.png"/>
// todo

---

<h2 id="2">Choix d'implémentation</h2>

### Class Colis
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
	Etat etat;
  //...
}
```
