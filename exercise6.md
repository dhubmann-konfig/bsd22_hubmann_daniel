# Exercise 6: Documentation

## Maven Site Documentation

- Add Maven Site Plugins in pom.xml
- Add plugins for JaCoCo
- Create site.xml under src/site
- Create markdown folder under src/site for .md files
- Run mvn test, mvn clean, mvn site

## Configurations of site.xml & pom.xml

### pom.xml

The pom.xml configurations include information about the project's developers, the project's properties, the build configuration, as well as plugins for test coverage

To include the Maven Site plugin, the pom.xml should include the groupId org.apache.maven.plugins and the according artifactIds maven-surefire-plugin, maven-compiler-plugin, maven-resources-plugin and maven-site-plugin.

### site.xml

Configuring the site.xml file changes the structure and content of the Maven Site Documentation. You can change the names of the project and of the menu and its items, as well as which items to include.
