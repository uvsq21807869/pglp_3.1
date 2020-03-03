# pglp_3.1: Illustration du principe de responsabilité unique (SRP)

## question1:
La classe Employe ne respecte pas SRP car elle possède deux responsabilités:
```bash
calculSalaire().
afficheCoordonnees(). 
```
## question 2:
Si la méthode du salaire change le service de l'affichage sera aussi impacter et les coordonees seront changer.
## question 3 :
Si l'affichage est remplacé par le stockage dans un fichier CSV y aura aucun changement et la SRP reste toujours inrespectable.
## question 4 :
la propostion c'est de creer des sous classes contenant une pour l'affichage et l'autre pour le calcul de salaire.