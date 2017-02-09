# SMCI Example

This is an example plugin to show how to create and build a Spigot mod for my dev server.

## How to do

1. Follow [this tutorial](https://www.spigotmc.org/wiki/creating-a-blank-spigot-plugin-in-intellijidea/) to get things setup.
    * Contrary to what the tutorial says, **do not put plugin.yml file in the `src` directory**. Place it in 
    `src/main/resources`. If you do not, Maven won't include it when packaging the jar file, and your mod
    will not load!
2. Make sure [Apache Maven](https://maven.apache.org/) is installed
3. Create a pom.xml file like the one in this repository for Maven
4. Write your mod and push it
5. The SMCI server should do the rest