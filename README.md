# GRG-POSTHEORIE — Programmier- & Systemtechnik Theorie

Unterrichtsrepository für das Fach **POS-Theorie** (Programmier- & Systemtechnik Theorie) an der **HTL Spengergasse**, Abteilung Informatik.

## Fach & Klassen

POS-Theorie behandelt graphentheoretische und theoretisch-informatische Grundlagen der Programmierung.  
Das Repository dient als zentrale Materialiensammlung für:

| Klasse | Inhalt |
|--------|--------|
| **4BAIF** | Graphentheorie (WS), Übergang zu theoretischer Informatik (SS) |
| **6ACIF** | Vertiefung Graphentheorie, Abgabeprojekt Graphenprogramm |

## Themenübersicht

### Wintersemester — Graphentheorie

| Thema | Folien |
|-------|--------|
| Grundbegriffe & Einleitung | `Folien_WS/01_GRAPHEN_Einleitung.pdf` |
| Spezielle Graphen | `Folien_WS/02_GRAPHEN_Spezielle_Graphen.pdf` |
| Planare Graphen | `Folien_WS/03_GRAPHEN_Planare_Graphen.pdf` |
| Kantenfolgen, Euler & Hamilton | `Folien_WS/04_GRAPHEN_Kantenfolgen.pdf` |
| Eigenschaften von Graphen | `Folien_WS/05_GRAPHEN_Eigenschaften.pdf` |
| Zusammenhang | `Folien_WS/06_GRAPHEN_Zusammenhang.pdf` |
| Matrizen (Adjazenz, Inzidenz) | `Folien_WS/07_GRAPHEN_Matrizen.pdf` |
| Bäume & Gerüste (MST) | `Folien_WS/08_GRAPHEN_Baeume.pdf` |
| Kirchhoff-Regel | `Folien_WS/09_GRAPHEN_Kirchhoff.pdf` |
| Starker Zusammenhang | `Folien_WS/11_GRAPHEN_Starker_Zusammenhang.pdf` |
| Dijkstra-Algorithmus | `Folien_WS/12_GRAPHEN_Dijkstra.pdf` |
| Gesamtskriptum | `Folien_WS/Skriptum_POS-Theorie_Wintersemester.pdf` |

### Sommersemester — Theoretische Informatik & Algorithmen

| Thema | Folien |
|-------|--------|
| Traversierung (BFS/DFS) | `Folien_SS/01_T2_Traversierung_DFS_BFS.pdf` |
| Dijkstra (Wiederholung) | `Folien_SS/02_T2_Dijkstra.pdf` |
| O-Notation (Bachmann-Landau) | `Folien_SS/11_T2_O-Notation.pdf` |
| Rekursion | `Folien_SS/12_T2_Rekursion.pdf` |
| Sortierverfahren | `Folien_SS/13_T2_Sortierverfahren.pdf` |
| Datenstrukturen | `Folien_SS/14_T2_Datenstrukturen.pdf` |
| Homomorphismen | `Folien_SS/21_T2_Homomorphismen.pdf` |
| Formale Sprachen | `Folien_SS/32_T2_Formale_Sprachen.pdf` |
| Backus-Naur-Form | `Folien_SS/33_T2_Backus-Naur-Form.pdf` |
| Grammatiken | `Folien_SS/34_T2_Grammatiken.pdf` |
| Reguläre Sprachen | `Folien_SS/35_T2_Regulaere_Sprachen.pdf` |
| Reguläre Ausdrücke | `Folien_SS/36_T2_Regulaere_Ausdruecke.pdf` |
| Kontextfreie Sprachen | `Folien_SS/37_T2_Kontextfreie_Sprachen.pdf` |
| Automaten | `Folien_SS/41_T2_Automaten.pdf` |
| Komplexitätstheorie | `Folien_SS/42_T2_Komplexitaet.pdf` |
| Gesamtskriptum | `Folien_SS/POS-Theorie-Semester2_gesamt.pdf` |

## Repository-Struktur

```
├── Folien_WS/              # Vorlesungsfolien Wintersemester (Graphentheorie)
│   └── beispiele/          # Übungsbeispiele zu den Folien
├── Folien_SS/              # Vorlesungsfolien Sommersemester (Theo. Inf.)
│   ├── beispiele/          # Übungsbeispiele (Vektorrechnung, BFS/DFS, Dijkstra)
│   └── sortieren/          # Java-Projekt zu Sortierverfahren
├── Uebungen/               # Übungsblätter (Graphenkonstruktion, Euler, Hamilton, etc.)
├── Beispielgraphen/        # CSV-Dateien (z. B. dijkstra1.csv)
├── _Code-Samples/          # Code-Beispiele (Matrixmultiplikation, Potenzmatrix in JS)
│   ├── matrix_multiply/    # Matrixmultiplikation (HTML/JS)
│   └── potenzmatrix_js/    # Potenzmatrix (Deno/JS)
├── 4baif/                  # Kursordner 4BAIF (Rekursion, PLF-Termine)
│   └── 2026-04-08_Rekursion/  # Java-Projekt Rekursion
├── 6acif/                  # Kursordner 6ACIF (Rekursion, PLF, Hashcode)
│   ├── Rekursion/          # Java-Projekt Rekursion
│   ├── PLFSS/              # Java-Projekt PLF-Vorbereitung
│   └── Hashcode.java       # Beispiel Hashcode-Implementierung
├── _Archiv/                # Materialien aus vorigen Schuljahren
│   └── SJ2425/             # Schuljahr 2024/25
├── Weiterführend/          # Links und Ressourcen zum Selbststudium
│   └── Online.md           # Verweise auf Skripten und Tutorials
├── Graphenprogramm.md      # Anforderungen Abgabeprojekt (Graphenprogramm)
└── Semesterplan_grg_SS.md  # Semesterplan Sommersemester (laufend aktualisiert)
```

## Abgabeprojekt: Graphenprogramm

Im `Graphenprogramm.md` finden sich die vollständigen Anforderungen für das semesterbegleitende Projekt:

- Einlesen von Adjazenzmatrizen aus CSV
- Berechnung von Distanzen, Exzentrizitäten, Radius, Durchmesser, Zentrum
- optionale Erweiterungen (Euler, Hamilton, Dijkstra, BFS/DFS, Isomorphie, etc.)
- Abgabe als Git-Repository inkl. Erklärvideo

## Semesterplan

Der aktuelle Semesterplan (Sommersemester) wird in `Semesterplan_grg_SS.md` fortgeschrieben — inkl. Terminen für PLFs und durchgenommener Folien.

## Weiterführende Ressourcen

- [Graphen — Theoretische Informatik (Hohenauer)](https://graphen.theoretische-informatik.at/)
- [GraphSupply (Übungstools)](https://grafg1.spengergasse.at/graphsupply)
- [ZIB-Report 00-19 — Universität Würzburg](https://opus4.kobv.de/opus4-zib/files/587/ZR-00-19.pdf)
- weitere Links: `Weiterführend/Online.md`
