# Schatzlabyrinth-Löser

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

Dieses Repository enthält einen Algorithmus zur Lösung des "Schatzlabyrinth" -Problems. Angesichts eines Labyrinths, das als 2D-Array dargestellt ist, in dem jede Zelle leer sein kann (0), eine Wand (1) enthalten oder einen Schatz (S) halten kann, besteht das Ziel darin, alle Schätze zu sammeln und den Ausgang mit der minimalen Anzahl von Schritten zu erreichen.

## Problemstellung

Sie erhalten eine Karte des Labyrinths, in der:
- 0 eine leere Zelle darstellt,
- 1 eine Wand darstellt,
- S einen Schatz darstellt.

Der Eingang zum Labyrinth befindet sich oben links (0,0) und der Ausgang befindet sich unten rechts (N-1, M-1).

## Aufgaben

1. Entwickeln Sie einen Algorithmus, um den kürzesten Weg zu finden, der es ermöglicht, alle Schätze zu sammeln und den Ausgang zu erreichen.
2. Bestimmen Sie die Zeitkomplexität Ihres Algorithmus.
3. (Optional) Ändern Sie den Algorithmus so, dass er den Weg durch das Labyrinth als Zeichenfolge zurückgibt, z. B. "RRDDLU" (wobei R = rechts, D = unten, L = links, U = oben).

## Beispiel

Betrachten Sie das folgende Labyrinth:

[
[0, S, 1, 0],
[0, 0, 1, S],
[1, 0, 0, 0],
[0, 1, S, 0]
]


## Verwendung

Klonen Sie das Repository und führen Sie die Datei `TreasureMaze.java` im Ordner `src` mit den Labyrinthdaten als Eingabe aus.

# Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert - weitere Informationen finden Sie in der Datei [LICENSE](/LICENSE).
