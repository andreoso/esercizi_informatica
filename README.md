# Esercizi Informatica
## Esercizi di informatica in java svolti nel corso di telecomunicazioni

La struttura del **repo** suddivide ogni esercizio/compito (più esercizi per compito) in un **branch** a se.

Il codice è scritto in java utilizzando l'ide Apache **NetBeans**.
Per importare il progetto è sufficiente scaricare il branch ed importare la cartella come progetto.

Ogni branch è corredato di un file README.md contenente la traccia e la descrizione dell'esercizio.

## Esercizi



| branch | descrizione                 |
| ------ | --------------------------- |
| es1    | esercizio sull'ereditarietà |



## Come scaricare il progetto

### Metodo stand alone

Recarsi sul branch desiderato utilizzando il menù in alto a **sinistra** (attualmente è *main*)
scaricare il file **zip** dal menù **Code** in alto a destra.

Su netbeans andare su *File -> Import Project -> From ZIP* e selezionare lo zip di origine (quello appena scaricato) e la cartella locale di destinazione. (funziona con NetBeans **12.1+**) 

Qualora l'importazione nativa tramite NetBeans non funzionasse, si può procedere alla copia manuale dei singoli file.

I files sono disposti nell'albero delle cartelle come segue:

```
//esempio con es1

es1
│
└───src
    └───es1
            Es1.java
            Impiegato.java
            Pensionato.java
            Persona.java
```

Sarà sufficiente copiare i files terminanti in *.java* nel proprio ambiente di lavoro.

### Metodo cli

Per scaricare il progetto tramite git da riga di comando:

```
git clone -b branch https://github.com/andreoso/esercizi_informatica.git
```

Esempio con es1:

```
git clone -b es1 https://github.com/andreoso/esercizi_informatica.git 
```

Scaricherà l'esercizio 1 (es1) in una sottocartella che si chiamerà "esercizi_informatica", verrà quindi comodo rinominarla in "es1" prima di importarla.

Potrete ora aprire la cartella come progetto dal menù *apri* dell'ide.



**Nota: i file progetto sono nella versione 12.1 dell'IDE.** Con versioni precedenti potrebbero verificarsi problemi di compatibilità.