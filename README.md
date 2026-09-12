# TP7

# Exercice 1 - Gestion de la rémunération des employés

* Le premier exercice consiste à mettre en place un système permettant de calculer le salaire de plusieurs catégories d'employés.
* La classe abstraite `Employe` contient les informations communes, notamment le nom et le prénom. Elle définit également la méthode abstraite `calculerSalaire()` que chaque classe dérivée doit redéfinir.
* `EmployeHoraire` représente un employé rémunéré selon son taux horaire et le nombre d'heures effectuées.
* `EmployeSalarie` correspond à un employé qui possède un salaire mensuel fixe.
* `Vendeur` est une spécialisation de `EmployeSalarie` et ajoute une commission au salaire de base.
* La classe `Entreprise` stocke les employés dans un tableau dynamique qui peut être agrandi automatiquement lorsque celui-ci est rempli. Elle permet aussi d'afficher les informations de paie et de calculer le montant total des salaires.
* Cet exercice montre l'utilisation du polymorphisme : une même méthode `calculerSalaire()` peut avoir un résultat différent selon la catégorie de l'employé.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Exercice 2 - Représentation d'un système de fichiers

* Le deuxième exercice consiste à reproduire de manière simplifiée l'organisation d'un système de fichiers.
* La classe abstraite `FsItem` représente un élément général et contient son nom ainsi que la méthode abstraite `getSize()`, utilisée pour déterminer sa taille.
* `FileItem` hérite de `FsItem` et représente un fichier dont la taille est enregistrée directement.
* `Directory` est également une sous-classe de `FsItem`. Il peut contenir plusieurs éléments, qu'il s'agisse de fichiers ou d'autres répertoires. Son tableau interne s'agrandit automatiquement lorsque cela est nécessaire.
* La taille d'un répertoire est calculée de manière récursive en additionnant les tailles de tous les éléments qu'il contient.
* La méthode `list()` permet d'afficher les différents éléments sous forme d'arborescence, avec une indentation adaptée à chaque niveau.
* `FileSystem` regroupe les éléments situés à la racine et permet d'afficher l'ensemble de l'arborescence ainsi que sa taille totale.
* Cet exercice combine principalement le polymorphisme et la récursivité, car un répertoire peut contenir aussi bien des fichiers que d'autres répertoires.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
