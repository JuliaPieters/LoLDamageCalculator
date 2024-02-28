# League of Legends Damagecalculator

- Applicatie van Julia Pieters en Manon van Vliet.
- Software Design CU75020V2

## Inleiding

De opdracht:
Voor deze opdracht is het de bedoeling dat er een Java-consoletoepassing wordt ontwikkelt die diverse design patterns omvat. Deze patterns moeten variëren in types, zoals structurele en creatieve patterns. Het is belangrijk dat deze opdracht in tweetallen wordt uitgevoerd, zodat er samen kan worden gekeken naar verschillende design patterns en van elkaars inzichten kunt leren.

De applicatie: League of Legends Damagecalculator is een applicatie waarmee de gebruiker de totale hoeveelheid damage kan berekenen doormiddel van basedamage, magicdamage en bonusdamage. Deze applicatie werkt doormiddel van verschillende design patterns. Deze applicatie bevat de design patterns Builder, Decorator, Factory en State.

## De applicatie files

Deze applicatie bevat verschillende files die met elkaar samenwerken tot een gehele applicatie:

- `DamageCalculator.java`: Is verantwoordelijk voor het berekenen van damage. Het heeft een Builder class die helpt bij het maken van DamageCalculator objecten. Standaard wordt de schade ingesteld op een BaseDamage van 100 (Dit kan worden aangepast). De DamageCalculator klasse zelf heeft een methode genaamd calculateDamage() die de huidige damage teruggeeft.
- `Main.java`: De hoofdklasse om het programma uit te voeren.
- `DamageFactoryInterface`: Dit is een interface die dient als de basis voor het maken van Factory classes voor het maken van de verschillende soorten damage.
- `BaseDamageFactory`:  maakt gebruik van de DamageFactoryInterface en biedt een methode genaamd createDamageCalculator. Wanneer je deze methode aanroept, moet je een DamageCalculator object doorgeven. Die methode maakt een DamageCalculator die er voor zorgt om BaseDamage te berekenen.
- `BonusDamageFactory`: Doet hetzelfde als de BaseDamageFactory alleen dan voor de BonusDamage.
- `MagicDamageFactory`: Doet hetzelfde als de BaseDamageFactory alleen dan voor de Magicdamage.
- `Console`: Deze java class zorgt voor interactie met de console: writeLine() voor uitvoer naar de console, readLine() voor invoer van de gebruiker en clearConsole() om de console te wissen door lege regels af te drukken.
- `DamageDecorator.java`: Is afgeleid van de klasse damagecalculator en is de basisklasse voor de andere decoratorklassen.
- `BonusDamageDecorator`: Deze class zorgt er voor dat er een waarde van 20 damage wordt toegevoegd als de calculateDamage() wordt aangeroepen. Deze waarde kan worden aangepast.
- `MagicDamageDecorator`: Deze class doet hetzelfde als BonusDamageDecorator en voegt in dit geval 30 damage toe. Deze waarde kan worden aangepast.
- `State`: Deze State laat zien in welke verschillende toestanden het programma zich kan bevinden.

## Design Patterns

De volgende design patterns worden gebruikt in dit project:

- **Builder-patroon**: Geïmplementeerd in `DamageCalculator.java` .
- **Decorator-patroon**: Geïmplementeerd in `DamageDecorator.java`, `BonusDamageDecorator.java` en `MagicDamageDecorator.java` om functionaliteit toe te voegen aan de `DamageCalculator`.
- **Factory-patroon**: Geïmplementeerd in `DamageTypeFactory.java` om instanties van verschillende soorten damage te creëren.

Deze design patterns werken natuurlijk per type verschillende met elkaar samen.
- Creational Pattern: DamageCalculator met DamageCalculator.Builder want deze Builder maakt de base damage aan en zorgt er voor dat de calculator die er voor zorgt dat er dingen berekent kunnen worden wordt teruggegeven
- Structural Pattern: DamageDecorator en de implementaties ervan dus de MagicDamageDecorator en de BonusDamageDecorator.
- Behavioral Pattern: Het gebruik van decorators (MagicDamageDecorator en BonusDamageDecorator) wordt gedaan door de factory die er voor zorgt dat die functionaliteit kan worden aangepast voor de uiteindelijke berekening.

![classdiagram.png](src%2Fclassdiagram.png)

Dit klassendiagram laat de samenwerking tussen de verschillende design patterns zien. Hier is te zien dat DamageCalculator een builder bevat die er voor zorgt dat er basedamage en een calculator wordt teruggegeven mits hier gebruik van wordt gemaakt. De DamageDecorator dient hier als basis voor de andere gemaakte decorators namelijk MagicDamageDecorator en BonusDamageDecorator. Helemaal onderaan staat de factory die er voor zorgt dat alles bij elkaar komt. In dit geval is dat dus de verschillende soorten damage. Zo kan alles bij elkaar worden opgeteld door middel van de calculator. Main is niet bij het klassendiagram toegevoegd omdat die er buiten staat. Main zorgt er nogmaals voor dat de applicatie kan worden uitgevoerd door op het "run" icoontje te drukken

## De samenwerking
Voor deze opdracht was het de bedoeling dat we als duo zouden samenwerken. We hebben gezamenlijk besloten om pair programming te gebruiken, aangezien we dit allebei prettig vinden en elkaar op die manier kunnen ondersteunen. Doordat we beide op hetzelfde niveau zitten, kunnen we samen brainstormen en oplossingen vinden als we ergens tegenaan lopen. We hebben achter Julia's computer gezeten en af en toe gewisseld van wie de code typt, en wie probeert na te denken wat de volgende stap in de code kan zijn. We hebben hiervoor gekozen in plaats van dat we allebei achter verschillende computers zitten. Dit verklaart ook waarom wij weinig commits hebben gemaakt naar github. Een nadeel van dit was dat we niet gelijk de code hebben gepushed naar github, dus stel de computer was kapot gegaan dan was al onze code weg. Dit is een verbeterpuntje voor in de toekomst om wel tussendoor de code naar github te pushen om eventuele problemen te voorkomen.




## Gebruik van deze applicatie

1. Kloon de repository:

    ```bash
    git clone https://github.com/JuliaPieters/LoLDamageCalculator.git
    ```

2. Open het project in je favoriete Java IDE (bijvoorbeeld IntelliJ IDEA, Eclipse).

3. Voer het bestand `Main.java` uit.

4. Volg de instructies in de console om waarden in te voeren en de berekende damage te bekijken.


## Bronnen
- https://github.com/Jimmaphy/data-storage-utility/blob/SDE/src/nl/sourceassist/datastorageutility/commander/Commander.java

- https://refactoring.guru/design-patterns/behavioral-patterns

- https://github.com/Jimmaphy/data-storage-utility/blob/SDE/src/nl/sourceassist/datastorageutility/state/State.java