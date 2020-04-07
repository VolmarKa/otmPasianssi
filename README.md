# **Klondike-pasianssi**




## **Dokumentaatio**

[Vaatimusmäärittely](https://github.com/VolmarKa/otmPasianssi/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Tuntikirjanpito](https://github.com/VolmarKa/otmPasianssi/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/VolmarKa/otmPasianssi/blob/master/dokumentaatio/arkkitehtuuri.md)

## **Komentorivitoiminnot**

### Testaus

Testit suoritetaan komennolla

```
mvn test
```
Testikattavuusraportti luodaan komennolla

```
mvn jacoco:report
```

### Checkstyle

Tiedoston [checkstyle.xml](https://github.com/VolmarKa/otmPasianssi/blob/master/KlondikePasianssi/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla

```
 mvn jxr:jxr checkstyle:checkstyle
```

### Ohjelman suorittaminen

Ohjelman voi suorittaa komennolla

```
 mvn compile exec:java -Dexec.mainClass=klondikePasianssi.Main
```
