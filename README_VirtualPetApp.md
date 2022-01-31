# VirtualPet
The Virtual Pet game is a without frills application that was written as a means of practicing basic java principles: creating classes, methods, and loops.

## Introduction
Belle is an Abyssinian Guinea Pig. In this game you are trying to keep Belle's needs below a level of 8. If any one of the needs exceed 8 she will hide.

## Instructions
1 - To feed the pig\
2 - To give the pig water\
3 - To allow for a bathroom break\
4 - To play with the pig\
5 - To do nothing\
6 - To exit the game\
0 - To print instructions

## Actions
*feedMe()* - Decreases hunger by 1; increases thirst and waste by 1\
*giveMeWater()* - Decreases thirst by 1; increases hunger by 1\
*bathroomBreak()* - Sets waste to 0; increases hunger by 2\
*playWithMe()* - If greater than 2 decreases boredom by 2; otherwise, sets boredom to 0. Increases hunger and thirst by 1.\
*tick()* - Increases boredom by 1; increase hunger, thirst, waste, and boredom randomly (1 - hunger by 1, 2 - thirst by 1, 3 - waste by 1, 4 - boredom by 1)


