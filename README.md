# Status
[![version](https://img.shields.io/badge/version-%5B1.5%5D-red)](https://github.com/KIZAFOX/KConverter/releases)
[![license](https://img.shields.io/github/license/KIZAFOX/KConverter)](https://github.com/KIZAFOX/KConverter/blob/master/LICENSE)

# KConverter
Converter is an API which allows you to convert from a binary number to a decimal number and vice versa or even to convert a hexadecimal into a decimal number or vice versa.
Don't forget to check the latest version of KConverter [here](https://github.com/KIZAFOX/KConverter/releases) !

KConverter Version | Support
-------------------|--------
1.0                |   ✅
1.5                |   ❌

### Summary 

* [Installation](#Installation) ([Maven](#Maven)/[Gradle](#Gradle)/[Manual](#Manual))
* [Author](#Author)
* [License](#License)

# Installation

### Maven

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.2.1</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                <relocations>
                    <relocation>
                        <pattern>fr.kizafox.kconverter</pattern>
                        <!-- Replace with the package of your plugin ! -->
                        <shadedPattern>com.yourpackage.kconverter</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
        </plugin>
    </plugins>
</build>
```

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependencies>
    <dependency>
        <groupId>fr.kizafox</groupId>
        <artifactId>KConverter</artifactId>
        <version>1.5</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

### Gradle

```xml
repositories {
    maven { url 'https://jitpack.io' }
}
```

```xml
dependencies {
    compile 'fr.kizafox:KConverter:1.5'
}
```

### Manual

Just copy `KConverter.java` in your project

# Author

* [KIZAFOX](https://github.com/KIZAFOX)

# License

Distributed under the MIT License. See [License](https://github.com/KIZAFOX/KConverter/blob/master/LICENSE) for more information.
