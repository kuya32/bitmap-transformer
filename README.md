# Bitmap Transformer

- The app will read a bitmap in from disk, run one or more color or raster transforms and then write it out to a new file.

## Overview of my library

- grayUp() method takes in a bitmap file and changes the colors to a dark gray and then generates a new file called mario.bmp
- glowUP() method takes in a bitmap file and changes the color to look like the picture is under a black light (glowing color) and make a new file called mario2.bmp
- greenUp() method takes in a bitmap file and changes the color to green and then generates a new file called mario3.bmp

## Functionality

- User should run "./gradlew run --args 'gray'" in the command line to run the grayUp method which changes bitmap file color to gray.
- User should run "./gradlew run --args 'glow'" in the command line to run the glowUp method which changes bitmap file color to look like the picture is under a black light.
- User should run "./gradlew run --args 'green'" in the command line to run the greenUp method which changes bitmap file color to green.

## Instructions for testing

- Run ./gradlew test to test my code
- Test consist of:
  - If method is ran, does file exist
  - 
