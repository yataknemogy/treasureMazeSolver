# Solveur de Labyrinthe aux Trésors

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

Ce référentiel contient un algorithme pour résoudre le problème du "Labyrinthe aux Trésors". Étant donné un labyrinthe représenté sous forme de tableau 2D où chaque cellule peut être vide (0), contenir un mur (1) ou contenir un trésor (S), l'objectif est de collecter tous les trésors et d'atteindre la sortie avec le nombre minimum de pas.

## Énoncé du Problème

Vous disposez d'une carte du labyrinthe, où :
- 0 représente une cellule vide,
- 1 représente un mur,
- S représente un trésor.

L'entrée du labyrinthe se trouve dans le coin supérieur gauche (0,0), et la sortie se trouve dans le coin inférieur droit (N-1, M-1).

## Tâches

1. Développer un algorithme pour trouver le chemin le plus court permettant de collecter tous les trésors et d'atteindre la sortie.
2. Déterminer la complexité temporelle de votre algorithme.
3. (Optionnel) Modifier l'algorithme pour renvoyer le chemin à travers le labyrinthe sous forme de chaîne, par exemple, "RRDDLU" (où R = droite, D = bas, L = gauche, U = haut).

## Exemple

Considérez le labyrinthe suivant :

[
[0, S, 1, 0],
[0, 0, 1, S],
[1, 0, 0, 0],
[0, 1, S, 0]
]

## Utilisation

Clonez le référentiel et exécutez le fichier `TreasureMaze.java` situé dans le dossier `src` avec les données du labyrinthe en tant qu'entrée.

# Licence

Ce projet est sous licence MIT - voir le fichier [LICENSE](/LICENSE) pour plus de détails.
