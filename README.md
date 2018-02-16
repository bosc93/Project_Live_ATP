﻿# 0 - Hardware lié au projet
**Galaxy Tab A 10.1"**
<br/>[Lien pour les specs nécessaires à la création de l'émulateur de la tablette](https://www.samsung.com/us/mobile/tablets/all-other-tablets/sm-t580nzkaxar-sm-t580nzkaxar/)

# 1 - Près-requis
[Installer Android Studio](https://developer.android.com/studio/index.html)

# 2 - Installer sdk
Tools -> Android -> Sdk Manager
<br/>Checker la checkbox "Android API 27 si non cochée"
<br/>Checker la checkbox "Android 7.1.1 (Nougat) API Level 25"
* Si erreur lancement émulateur à cause de l'HAXM (voir log), onglet SDK Tools :
 1. Décocher "Intel x86 Emulator Accelerator (HAXM installer)" et appliquer les modifs 
 2. Recochez "Intel x86 Emulator Accelerator (HAXM installer)" et appliquer les modifs

# 3 - Configuration et installation de l'émulateur
* Run l'app
* Create New Virtual Device
* New Hardware Profile
* Modifier le "screen size" (pouces de la tablette), la résolution, la ram, checker "Has Hardware Buttons" suivant les specs
* Next
* Download "Nougat API Level 25"
* Next
* Orientation Landscape
* Show advanced Settings
* Modifier la ram suivant les specs

# 4 - Commandes git de base
* Récupérer le projet et mettre à jour le dépot local :
<br/>$ git clone https://github.com/bosc93/Project_Live_ATP.git
<br/>$ git pull origin master
* Envoyer au dépot distant son dépot local modifié :
<br/>$ git add .
<br/>$ git commit - m "message"
<br/>$ git push origin master

# 5 - Enjoy