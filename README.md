# Activité Pratique N°1 – Injection des dépendances



**Gestion des dépendances avec Java et Spring Framework**

| **Informations** | **Détails** |
|---|---|
| **Module** | Java avancé |
| **Réalisé par** |Mina ELBILALY |
| **Date** | Septembre / Octobre 2026 |
| **Environnement** | Java, IntelliJ IDEA, Maven, Git / GitHub |
| **Technologies** | Java, Spring Framework, XML, Annotations |

---

# Sommaire

1. Objectif du TP
2. Outils et technologies utilisés
3. Création des interfaces et des implémentations
4. Mise en place du couplage faible
5. Injection des dépendances
   - Injection par instanciation statique
   - Injection par instanciation dynamique
   - Injection avec Spring en utilisant XML
   - Injection avec Spring en utilisant les annotations
6. Dépôt du projet sur GitHub
7. Conclusion

---

# 1. Objectif du TP

L'objectif de ce TP est de comprendre et de mettre en pratique le principe de **l'injection des dépendances** en Java.

À travers ce travail, j'ai appris à créer des interfaces et leurs implémentations, à utiliser le couplage faible entre les différentes classes et à injecter les dépendances selon plusieurs méthodes.

Les principales opérations réalisées sont :

- Créer une interface `IDao` contenant une méthode `getData()`.
- Créer une implémentation de cette interface.
- Créer une interface `IMetier` contenant une méthode `calcul()`.
- Créer une implémentation de cette interface.
- Réaliser l'injection des dépendances par instanciation statique.
- Réaliser l'injection des dépendances par instanciation dynamique.
- Utiliser le Framework Spring pour réaliser l'injection avec XML et annotations.

À travers ces différentes méthodes, j'ai compris comment rendre les classes indépendantes les unes des autres et faciliter la maintenance et l'évolution d'une application Java.

# 2. Outils et technologies utilisés

Pour réaliser ce TP, j'ai utilisé les outils et technologies suivants :

| **Outil / Technologie** | **Rôle** |
|---|---|
| **Java** | Développer les différentes interfaces et classes du projet. |
| **IntelliJ IDEA** | Écrire, organiser et exécuter le code Java. |
| **Maven** | Gérer les dépendances et les bibliothèques du projet. |
| **Spring Framework** | Gérer les objets et réaliser automatiquement l'injection des dépendances. |
| **XML** | Configurer les beans et leurs dépendances. |
| **Annotations Spring** | Déclarer les composants et configurer l'injection des dépendances. |
| **Git** | Enregistrer les différentes versions du projet. |
| **GitHub** | Héberger et partager le code source du projet. |

# 3. Création des interfaces et des implémentations

### 3.1. Création de l'interface IDao

J'ai commencé par créer une interface appelée `IDao`.

Cette interface contient une méthode `getData()` qui permet de récupérer des données.

Elle définit le comportement que les classes qui l'implémentent doivent respecter.

**Explication :** Une interface permet de définir un contrat commun sans imposer directement la manière dont les méthodes doivent être réalisées.
<img width="532" height="251" alt="image" src="https://github.com/user-attachments/assets/a228a55c-6bcd-47e9-b242-a6f9b9abc808" />


**Figure 1 : Création de l'interface IDao.**


### 3.2. Création de l'implémentation de IDao

Après avoir créé l'interface `IDao`, j'ai créé une classe qui l'implémente.

Cette classe fournit le code nécessaire pour réaliser la méthode `getData()`.

**Explication :** L'implémentation permet de définir concrètement le comportement de la méthode déclarée dans l'interface.

<img width="566" height="322" alt="image" src="https://github.com/user-attachments/assets/0c2c8c34-c7e6-43b2-8910-6f7277b74ce5" />

**Figure 2 : Classe d'implémentation de IDao.**

### 3.3. Création de l'interface IMetier

Ensuite, j'ai créé une interface appelée `IMetier`.

Cette interface contient une méthode `calcul()` qui représente le traitement métier de l'application.

Elle permet de séparer le traitement métier de la récupération des données.

<img width="467" height="215" alt="image" src="https://github.com/user-attachments/assets/e4dc2a64-218a-41e2-bc4e-17e909059f65" />

**Figure 3 : Création de l'interface IMetier.**

### 3.4. Création de l'implémentation de IMetier

Après la création de l'interface `IMetier`, j'ai créé une classe qui l'implémente.

Cette classe réalise le traitement de la méthode `calcul()` en utilisant la dépendance `IDao` pour récupérer les données nécessaires.

**Explication :** Cette organisation permet de séparer les responsabilités entre la récupération des données et le traitement métier.

<img width="613" height="664" alt="image" src="https://github.com/user-attachments/assets/58c2e68d-b3c1-455f-9e65-974310790586" />

**Figure 4 : Classe d'implémentation de IMetier.**

# 4. Mise en place du couplage faible

Après avoir créé les interfaces et leurs implémentations, j'ai mis en place le principe du **couplage faible**.

Le couplage faible consiste à faire dépendre une classe d'une interface plutôt que d'une classe concrète.

Dans ce TP, la classe métier utilise l'interface `IDao` au lieu de dépendre directement de son implémentation.

**Explication :** Grâce au couplage faible, je peux remplacer l'implémentation de `IDao` par une autre sans modifier le fonctionnement général de la classe métier.

Cela rend le code plus flexible, plus évolutif et plus facile à maintenir.


# 5. Injection des dépendances

### 5.1. Présentation

Dans cette partie, j'ai réalisé l'injection des dépendances en utilisant plusieurs méthodes.

L'injection des dépendances consiste à fournir à une classe les objets dont elle a besoin pour fonctionner, au lieu de les créer directement à l'intérieur de cette classe.

J'ai testé les différentes méthodes suivantes :

- Injection par instanciation statique.
- Injection par instanciation dynamique.
- Injection avec Spring en utilisant XML.
- Injection avec Spring en utilisant les annotations.

## 5.2. Injection par instanciation statique

Pour réaliser cette première méthode, j'ai créé directement les objets nécessaires dans le programme.

J'ai ensuite injecté l'objet représentant l'implémentation de `IDao` dans la classe métier.

**Explication :** Dans cette méthode, les objets sont créés manuellement à l'aide de l'opérateur `new`, puis leurs dépendances sont définies directement dans le code Java.

**Résultat :** La classe métier peut utiliser la dépendance injectée pour effectuer son traitement.

<img width="746" height="357" alt="image" src="https://github.com/user-attachments/assets/86b8bfe4-d2df-464b-9d7c-9f6ff1ddfbb4" />

**Figure 5 : Injection des dépendances par instanciation statique.**


## 5.3. Injection par instanciation dynamique

Dans cette deuxième méthode, j'ai réalisé l'injection des dépendances de manière dynamique en utilisant la réflexion Java.

Cette méthode permet de charger les classes et de créer les objets pendant l'exécution du programme.

Elle permet notamment de récupérer dynamiquement les noms des classes et de créer leurs instances.

**Explication :** Contrairement à l'instanciation statique, les classes utilisées ne sont pas nécessairement définies directement dans le code avec l'opérateur `new`. Elles peuvent être chargées dynamiquement pendant l'exécution.

**Résultat :** L'application peut créer les objets nécessaires et réaliser l'injection des dépendances de manière dynamique.

<img width="810" height="638" alt="image" src="https://github.com/user-attachments/assets/676cc4da-05f1-4141-b6b0-4d96194379fe" />

**Figure 6 : Injection des dépendances par instanciation dynamique.**


## 5.4. Injection des dépendances avec Spring – Version XML

Dans cette partie, j'ai utilisé le Framework Spring pour réaliser l'injection des dépendances à l'aide d'un fichier XML.

J'ai commencé par déclarer les objets nécessaires dans le fichier de configuration XML.

Ces objets sont appelés des **Beans** dans Spring.

Ensuite, j'ai défini les relations entre les différents Beans afin de permettre à Spring de gérer automatiquement leurs dépendances.

**Explication :** Le fichier XML permet de configurer les objets et de préciser les dépendances entre eux sans avoir besoin de créer manuellement tous les objets dans le code Java.

**Résultat :** Spring crée les objets déclarés dans le fichier XML et réalise l'injection des dépendances.

<img width="643" height="373" alt="image" src="https://github.com/user-attachments/assets/065e2ff2-ff44-4f0f-aaa7-086f32e5f617" />

**Figure 7 : Configuration des Beans dans le fichier XML.**

<img width="860" height="418" alt="image" src="https://github.com/user-attachments/assets/7b5c421f-3d31-4f74-9103-bc9ddc721f46" />


**Figure 8 : Exécution de l'application avec l'injection Spring XML.**


## 5.5. Injection des dépendances avec Spring – Version annotations

Dans cette dernière méthode, j'ai utilisé les annotations Spring pour réaliser l'injection des dépendances sans passer par un fichier XML.

J'ai utilisé les annotations nécessaires pour déclarer les composants et permettre à Spring de gérer automatiquement les objets.

Cette méthode permet de simplifier la configuration et de réduire le code nécessaire.

**Explication :** Les annotations permettent d'indiquer à Spring quelles classes doivent être gérées par le conteneur Spring et comment leurs dépendances doivent être injectées.

**Résultat :** Spring détecte les composants, crée les objets nécessaires et réalise automatiquement l'injection des dépendances.

<img width="766" height="370" alt="image" src="https://github.com/user-attachments/assets/92b00163-31d0-46d8-b028-c8eca2d37869" />

**Figure 9 : Déclaration des composants avec les annotations Spring.**

<img width="561" height="355" alt="Capture d&#39;écran 2026-11-09 115247" src="https://github.com/user-attachments/assets/31be993a-0135-40c1-885e-0dfac81e2c22" />

<img width="679" height="659" alt="image" src="https://github.com/user-attachments/assets/c1faf4a0-e3ac-433c-91d1-61385a5ba220" />

**Figure 10 : Injection des dépendances avec les annotations Spring.**

<img width="884" height="190" alt="image" src="https://github.com/user-attachments/assets/fa03e259-b420-4b52-be94-685d4c1ea3bf" />


**Figure 11 : Résultat de l'exécution avec Spring Annotations.**


### 5.6. Récapitulatif des méthodes d'injection

| **Méthode** | **Principe** | **Outil utilisé** |
|---|---|---|
| Instanciation statique | Création et injection manuelles des objets. | Java (`new`) |
| Instanciation dynamique | Création dynamique des objets pendant l'exécution. | Réflexion Java |
| Spring XML | Configuration des objets et des dépendances dans un fichier XML. | Spring XML |
| Spring Annotations | Déclaration des composants et injection avec des annotations. | Spring Framework |


# 6. Conclusion

Ce TP m'a permis de comprendre et de mettre en pratique le principe de l'injection des dépendances en Java.

J'ai appris à créer des interfaces et leurs implémentations, à utiliser le couplage faible et à séparer les responsabilités entre les différentes classes.

J'ai également découvert plusieurs méthodes d'injection des dépendances : par instanciation statique, par instanciation dynamique et avec le Framework Spring en utilisant XML et annotations.

Enfin, j'ai compris l'intérêt de l'injection des dépendances pour rendre une application plus flexible, évolutive et facile à maintenir.

**En conclusion, ce TP m'a permis de comprendre comment l'injection des dépendances facilite la gestion des objets et réduit le couplage entre les différentes classes d'une application Java.**
